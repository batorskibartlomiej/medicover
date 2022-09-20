package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

import java.util.ArrayList;

public class LoginPage {


    @FindBy(id="oidc-submit")
    private WebElement rightLogin;
    @FindBy(id="UserName")
    private WebElement name;
    @FindBy(id="Password")
    private WebElement password;
    @FindBy(id="loginBtn")
    private WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }



    public LoginPage loginToProfile() throws InterruptedException {
        rightLogin.click();
        Thread.sleep(4000);
        return this;

    }

    public LoginPage writeNameAndPassword(){
        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle ))
                .findFirst()
                .get();
        DriverManager.getWebDriver().switchTo().window(newTabHandle);


        name.click();
        name.sendKeys("1594089909");
        password.click();
        password.sendKeys("****");
        return this;
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

}
