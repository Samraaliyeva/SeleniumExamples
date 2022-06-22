package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public class testBase {
    static WebDriver driver;



    public static WebDriver startbrowser(String browsername,String url){
       if (browsername.equalsIgnoreCase("firefox")){
           WebDriverManager.chromedriver().setup();
           driver=new FirefoxDriver();
       }else if (browsername.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
       }

       driver.manage().window().maximize();
       driver.get(url);
       return driver;
    }
}
