package norg.nosite;

import norg.nosite.view.Console;

import java.io.IOException;

/**
 * Created by Alexey Radionenko
 * 3/23/2015
 */
public class Main {

    /**
     * Точка входа в приложение
     * @param args
     */
    public static void main(String[] args) throws IOException {

        Console console = new Console();
        console.run();

    }

}
