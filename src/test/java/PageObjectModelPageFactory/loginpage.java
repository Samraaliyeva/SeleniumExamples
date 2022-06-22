package PageObjectModelPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

    WebDriver driver;

    public loginpage(WebDriver driver1){

        this.driver=driver1;

    }

    @FindBy (xpath ="//*[text()='Allow essential and optional cookies']")
    WebElement cookies;


    @FindBy (id="email")
    WebElement username;

    @FindBy (id="pass")
    WebElement password;

    @FindBy (id="loginbutton")
    WebElement login;

    @FindBy (linkText = "Forgot account?")
    WebElement forgot;

    @FindBy (linkText = "Sign up for Facebook")
    WebElement signup;

    public void logintoFB(String user, String pass){

        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
    }

    public void acceptcookies() throws InterruptedException {
      Thread.sleep(2000);
      cookies.click();
    }
}
