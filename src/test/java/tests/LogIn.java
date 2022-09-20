package tests;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TestBase;

public class LogIn extends TestBase{


    @Test
    public void LogIn() throws InterruptedException {
        MainPage mainPage= new MainPage();
        mainPage.logIn()
                .loginToProfile()
                .writeNameAndPassword()
                .clickLoginBtn();


    }

}
