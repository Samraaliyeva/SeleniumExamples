import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trenitalia.com/it/informazioni/acquisti_online.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }
}
