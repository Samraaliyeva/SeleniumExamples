import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {

    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://it-it.facebook.com/");
        takescren("Facebook_LoginPage");
    }
    public static void takescren(String fileName) throws IOException {
        //take screenshot and save it
       File photofile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       //now copy file to desired location
        FileUtils.copyFile(photofile, new File("C:\\Users\\SamraAliyeva\\IdeaProjects\\Demo\\target"+ fileName+".jpg"));
    }
}
