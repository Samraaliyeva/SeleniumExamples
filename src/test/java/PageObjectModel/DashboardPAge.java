package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class DashboardPAge {

    private static WebElement element=null;

    public static WebElement login(WebDriver driver){
        element= driver.findElement(By.xpath("f"));
        return element;
    }
    public static WebElement text(WebDriver driver){
        element= driver.findElement(By.linkText("fg"));
        return element;
    }
}
