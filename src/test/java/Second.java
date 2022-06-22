import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {

    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.out.println("my browser has launched");
    }

    @Test

    public void prima() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.it/");
        driver.findElement(By.id("sp-cc-accept")).click();
        WebElement apple= driver.findElement(By.id("twotabsearchtextbox"));
        apple.click();
        apple.sendKeys("poco");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Xiaomi")).click();

        Thread.sleep(3000);

        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.navigate().back();

        String title=driver.getTitle();
        System.out.println(title+" here title");
        Thread.sleep(2000);
        System.out.println("test case1");
        driver.close();


    }
    @Test
    public void second(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("headphone");
        driver.findElement(By.cssSelector("#gh-btn")).click();

        System.out.println("test case 2");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)","");
        System.out.println("js");
    }

    @AfterTest
    public void teardown(){
        System.out.println("finished");
       // driver.quit();
    }
}
