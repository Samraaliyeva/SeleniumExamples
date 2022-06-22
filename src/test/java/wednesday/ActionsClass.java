package wednesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.it/");
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions builder=new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a  '][1]"))).build().perform();
        Thread.sleep(2000);
        WebElement searchbtn= driver.findElement(By.id("nav-search-bar-form"));

        Actions seriesActions;
        seriesActions=builder.sendKeys(searchbtn, "book");

        Thread.sleep(5000);

    }
}
