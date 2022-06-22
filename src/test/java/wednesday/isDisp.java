package wednesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisp {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://api.freecrm.com/register/");
        driver.manage().window().maximize();
        //WebElement popup= driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        //popup.click();

        Thread.sleep(5000);
        String  pagetitle=driver.getTitle();
        System.out.println(pagetitle);
        //is applicable for all elements
        boolean b1=driver.findElement(By.name("action")).isDisplayed();
        System.out.println(b1+ " b1");

        boolean b2=driver.findElement(By.name("action")).isEnabled();
        System.out.println(b2+" b2");

        //is selected applicable  (dropdown, check box, radiobutton)
        boolean b3=driver.findElement(By.name("terms")).isSelected();
        System.out.println(b3 +" b3");

        driver.findElement(By.name("terms")).click();
        boolean b4=driver.findElement(By.name("terms")).isSelected();
        System.out.println(b4 +"b4");






    }
}
