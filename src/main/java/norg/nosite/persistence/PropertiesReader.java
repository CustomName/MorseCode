package norg.nosite.persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Alexey Radionenko
 * 3/25/2015
 */
public class PropertiesReader {

    private static final Properties properties = new Properties();

    static {

        try {
            properties.load(new FileInputStream("target\\classes\\properties\\config.properties"));
        } catch (IOException e) {
            System.err.println("Не удалось загрузить config.properties");
            properties.setProperty("app.class.name", "norg.nosite.view.Console"); //значение по умолчанию, если конфиг не загрузится
        }

    }

    public static String getProperty(String key){

        return properties.getProperty(key);

    }

}
