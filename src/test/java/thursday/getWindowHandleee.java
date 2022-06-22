package thursday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class getWindowHandleee {

    @Test
    public void get() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/browser-windows");
        String mainwindow=driver.getWindowHandle();
        System.out.println("main window is " + mainwindow);
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,450)");

        WebElement newwindow= driver.findElement(By.id("windowButton"));
        newwindow.click();

       Set<String> allHandles= driver.getWindowHandles();
        System.out.println(allHandles.size() + " windows open after click");

        for (String windows : allHandles) {
            //System.out.println(windows);

            if (mainwindow.equals(windows)){
                System.out.println("window is " +windows + "   ==>  Url is " +driver.getCurrentUrl()+ "  -->title is "+driver.getTitle());
            } else {
                driver.switchTo().window(windows);
                System.out.println("window is " +windows + " ==> url is " +driver.getCurrentUrl()+ " ==> title is "+driver.getTitle());
            }
        }

    }
}
