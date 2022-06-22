package thursday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Robotclass {

    WebElement element;
    WebDriver driver;
  //  public static void main(String[] args) throws AWTException, InterruptedException {

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        this.driver=new ChromeDriver();
    }
        @Test
        public void Robotcc() throws AWTException, InterruptedException {
        //2. If you are using Java then you can use Java ROBOT class to perform keyboard actions.

        driver.get("https://www.edureka.co/");
        driver.findElement(By.linkText("Courses"));
        Robot myrobot=new Robot();
        Thread.sleep(2000);
        myrobot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        myrobot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(3000);
       // myrobot.keyPress(KeyEvent.VK_DOWN);
        //Thread.sleep(3000);
      //  myrobot.keyPress(KeyEvent.VK_DOWN);
      //  Thread.sleep(3000);
        myrobot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        System.out.println("test it 1");
        myrobot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        System.out.println("test it 2");
       myrobot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        System.out.println("test it 3");
        myrobot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        System.out.println("test it 4");
       // myrobot.mouseMove(50,150);
       // System.out.println("size 5");
       // driver.quit();

    }

    @Test
    public void Action2() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
      //  WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http://automationtalks.com/");

        String expected= "AutomationTalks - Learn Automation Testing";
        String actual=driver.getTitle();
        Assert.assertEquals(expected,actual);

        Thread.sleep(2000);
         element = driver.findElement(By.xpath("//input[@class='search']"));
        element.sendKeys("selenium");
        System.out.println("here");

        Actions act = new Actions(driver);

        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).build().perform();

    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
