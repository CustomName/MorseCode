package norg.nosite;

import norg.nosite.persistence.PropertiesReader;
import norg.nosite.view.AppMorsable;

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
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class appType = Class.forName(PropertiesReader.getProperty("app.class.name"));

        AppMorsable appMorsable = (AppMorsable)appType.newInstance();
        appMorsable.run();

    }

}
