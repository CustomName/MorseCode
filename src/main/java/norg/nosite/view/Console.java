package norg.nosite.view;

import norg.nosite.morse.MorseCoder;
import norg.nosite.morse.MorseSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Консольная реализация
 * Created by Alexey Radionenko
 * 3/24/2015
 */
public class Console implements AppMorsable {

    private static final String intro = "MorseCode: console edition";

    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public Console(){}

    public void run(){

        System.out.println(intro);
        System.out.println("\"Exit\" is command to exit");

        while(true){
            String text = null;
            try {
                text = in.readLine().toUpperCase();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(text.toUpperCase().equals("EXIT"))
                break;

            try {
                doMorse(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void doMorse(String text) throws IOException {

        if(text.length() < 1)
            return;

        for(char c : text.toCharArray()) {

            if (c == ' ') {

                System.out.print(MorseSign.WORD_SPACE.display());
                continue;

            }

            for (MorseSign sign : MorseCoder.getMorseSigns(c)) {
                System.out.print(MorseCoder.doDisplay(sign));
                MorseCoder.doSound(sign);
            }

            System.out.print(MorseSign.SIGN_SPACE.display());
        }

        System.out.println();

    }

}
