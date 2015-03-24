package norg.nosite.persistence;

import java.net.URL;

/**
 * Created by Alexey Radionenko
 * 3/23/2015
 */
public class SoundResources {

    private static final SoundResources instance = new SoundResources();

    public final URL SOUND_DASH;
    public final URL SOUND_DOT;

    private SoundResources(){

        SOUND_DASH = getClass().getResource("/dash.wav");
        SOUND_DOT = getClass().getResource("/dot.wav");

    }

    public static SoundResources getInstance(){

        return instance;

    }

}
