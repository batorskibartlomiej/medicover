package pageobjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


   // @FindBy(xpath=/html/body/div[1]/div[3]/div[3]/div[5]/div[3]/a)

    @FindBy(className = "login-widget-button-login")
    private WebElement logIn;
    @FindBy(id="ie8UpAndOthers")
    private WebElement test;




    public MainPage() {


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage logIn(){
        logIn.click();
        return new LoginPage();
    }

    public void clickTest(){
        test.click();
    }


}
