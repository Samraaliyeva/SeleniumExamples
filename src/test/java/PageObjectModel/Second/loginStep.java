package PageObjectModel.Second;

import PageObjectModel.DashboardPAge;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginStep extends DashboardPAge {

    public static void main(String[] args) {

        my();
    }
    public static void  my(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize();
        DashboardPAge.login(driver).findElement(By.xpath("f"));

        //driver.manage().deleteAllCookies();
        WebElement popup= driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        popup.click();
    }
}
