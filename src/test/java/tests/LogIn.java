package tests;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TestBase;

import java.awt.*;

public class LogIn extends TestBase{


    @Test
    public void LogIn() throws AWTException, InterruptedException {
        MainPage mainPage= new MainPage();
        mainPage.logIn()
                .loginToProfile()
                .writeNameAndPassword()
                .clickLoginBtn()
                .clickSaveOnMarketingConsents();


    }

}
