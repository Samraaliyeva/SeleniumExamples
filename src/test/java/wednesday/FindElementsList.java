package wednesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsList {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        List<WebElement> allelements=driver.findElements(By.xpath("//div/table"));
        //System.out.println(allelements.size());
        for (WebElement listOfElements : allelements) {
            System.out.println(listOfElements.getText());

        }

    }
}
