package PageObjectModel.Second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class myClass4 {

    public static Properties properties;
    private static String configPath="src/test/java/Second/config.properties";

    public static void initializeProperty(){
        properties=new Properties();
        try {
            InputStream inputs=new FileInputStream(configPath);
            properties.load(inputs);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
