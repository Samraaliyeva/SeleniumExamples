import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ddd {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize();

        //driver.manage().deleteAllCookies();

       WebElement popup = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
       popup.click();

       Thread.sleep(5000);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies + " all cookies here");

        }
       driver.findElement(By.xpath("//*[text()='Sign up for Facebook']")).click();
       Thread.sleep(2000);

       WebElement month=driver.findElement(By.id("month"));
        Select selectMonth=new Select(month);
        Thread.sleep(2000);
        selectMonth.selectByVisibleText("Apr");

        WebElement day= driver.findElement(By.name("birthday_day"));
        Select selectDay=new Select(day);
        selectDay.selectByIndex(2);

        WebElement year= driver.findElement(By.id("year"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("1993");


        driver.quit();
    }
}
