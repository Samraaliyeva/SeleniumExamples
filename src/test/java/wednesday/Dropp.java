package wednesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropp {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement Drag=driver.findElement(By.id("draggable"));
        WebElement Drop= driver.findElement(By.id("droppable"));
        Thread.sleep(2000);
        Actions myActions=new Actions(driver);
        myActions.dragAndDrop(Drag,Drop).build().perform();

    }
}
