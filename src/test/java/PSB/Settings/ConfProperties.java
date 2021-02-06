package PSB.Settings;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;


    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/conf.properties");
            InputStreamReader isr = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
            PROPERTIES = new Properties();
            PROPERTIES.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}