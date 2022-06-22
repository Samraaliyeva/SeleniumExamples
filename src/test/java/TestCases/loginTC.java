package TestCases;

import PageObjectModelPageFactory.loginpage;
import Utilities.testBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTC {

    @Test
    public void chechkvaliduser() throws InterruptedException {
       WebDriver driver= testBase.startbrowser("chrome", "https://www.facebook.com/login.php");
        loginpage lg_page= PageFactory.initElements(driver, loginpage.class);
        //Thread.sleep(2000);

        lg_page.acceptcookies();
        lg_page.logintoFB("admin","12345");
    }
}
