package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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
    @FindBy(xpath = "//*[@id='personal-data']/div[1]/div/input")
    private WebElement phoneNUmber;



    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }



    public LoginPage loginToProfile() {
        rightLogin.click();
        //Thread.sleep(4000);
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
        name.sendKeys("15940890300");
        password.click();
        password.sendKeys("***!");
        return this;
    }

    public OnMySite clickLoginBtn() throws InterruptedException {
        loginBtn.click();
        Thread.sleep(4000);
        //Switching to new window
//        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
//        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
//                .stream()
//                .filter(handle -> !handle.equals(currentTabHandle ))
//                .findFirst()
//                .get();
//        DriverManager.getWebDriver().switchTo().window(newTabHandle);
        //DriverManager.getWebDriver().switchTo().newWindow(WindowType.WINDOW);



        return new OnMySite();
    }

    public void  clickPhoneNumber(){
        WaitForElement.waitUntilElemembtIsVisible(phoneNUmber);
        phoneNUmber.click();
    }


}
