package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyReader {
    public static Properties properties = new Properties();

    public static void loadProperties() throws IOException {
        properties.load(new InputStreamReader(new FileInputStream(new File("src/test/resources/application.properties"))));
    }

    public static String getProp(String key) {
        if (properties.getProperty(key) == null) {
            return "Key not found";
        } else {
            return properties.getProperty(key);
        }
    }
}
