import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class desktop {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        String pathh="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        DesktopOptions dop=new DesktopOptions();
        dop.setApplicationPath(pathh);
       // URL url =new URL("http://localhost:9999");
        WebDriver driver=new WiniumDriver(new URL ("http://localhost:9999"), dop);
        Thread.sleep(2000);

        driver.findElement(By.name("AmazonSponsored")).click();





   }
}



