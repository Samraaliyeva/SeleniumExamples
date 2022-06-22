package First;

import PageObjectModel.Second.properties;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class a {

    public static String browser;
    static WebDriver driver;

        public static void main(String[] args) throws InterruptedException, IOException {
            properties.Readbrowser();


        }

}
