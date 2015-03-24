package norg.nosite.morse;

import norg.nosite.persistence.SoundResources;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alexey Radionenko
 * 3/23/2015
 */
public enum MorseSign {

    DOT{

        public void sound(){
            CLIP_DOT.setFramePosition(0);
            CLIP_DOT.start();
            try {
                TimeUnit.MILLISECONDS.sleep(2 * UNIT_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CLIP_DOT.stop();
        }

        public String display(){
            return DOT_SIGN;
        }

    },
    DASH{

        public void sound(){
            CLIP_DASH.setFramePosition(0);
            CLIP_DASH.start();
            try {
                TimeUnit.MILLISECONDS.sleep(3 * UNIT_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CLIP_DASH.stop();
        }

        public String display(){
            return DASH_SIGN;
        }

    },
    SIGN_SPACE{

        public void sound(){
            throw new NoSuchMethodError();
        }

        public String display(){
            try {
                TimeUnit.MILLISECONDS.sleep(SIGN_DELIMITER_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return SIGN_DELIMITER;
        }

    },
    WORD_SPACE{

        public void sound(){
            throw new NoSuchMethodError();
        }

        public String display(){
            try {
                TimeUnit.MILLISECONDS.sleep(WORD_DELIMITER_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return WORD_DELIMITER;
        }

    };

    private static final String SIGN_DELIMITER = "\u0020\u0020";
    private static final String WORD_DELIMITER = "\u0020\u0020\u0020\u0020\u0020\u0020";
    private static final long UNIT_DELAY = 200;
    private static final long SIGN_DELIMITER_DELAY = 3 * UNIT_DELAY;
    private static final long WORD_DELIMITER_DELAY = 7 * UNIT_DELAY;

    private static final String DOT_SIGN = "*";
    private static final String DASH_SIGN = "-";

    private static final URL SOUND_DASH = SoundResources.getInstance().SOUND_DASH;
    private static final URL SOUND_DOT = SoundResources.getInstance().SOUND_DOT;
    private static final Clip CLIP_DASH = initClip(MorseSign.DASH);
    private static final Clip CLIP_DOT = initClip(MorseSign.DOT);

    private static Clip initClip(MorseSign sign){

        AudioInputStream in = null;
        try {
            in = AudioSystem.getAudioInputStream(sign.equals(MorseSign.DASH) ? SOUND_DASH : SOUND_DOT);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip.open(in);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clip;

    }

    public void sound(){
        throw new AbstractMethodError();
    }

    public String display(){
        throw new AbstractMethodError();
    }

}
