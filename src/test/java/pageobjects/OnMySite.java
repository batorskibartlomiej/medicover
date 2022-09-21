package pageobjects;


import driver.DriverManager;
;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;


public class OnMySite {

    @FindBy(xpath="//*[@id='personal-data-update-application']/div[3]/div/div/button[2]")
    private WebElement marketingConsents;//*[@id="personal-data-update-application"]/div[3]/div/div/button[2]
   @FindBy(xpath = "//*[@id='layout-navigation']/div/article/nav/div/div/div[1]/ul/li[3]/a")
   private WebElement wizyty;
   @FindBy(id="ie8UpAndOthers")
   private WebElement test;

    public OnMySite(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void clickSaveOnMarketingConsents() throws AWTException, InterruptedException {
        //Thread.sleep(40000);




        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


//        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
//        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
//                .stream()
//                .filter(handle -> !handle.equals(currentTabHandle ))
//                .findFirst()
//                .get();
//        DriverManager.getWebDriver().switchTo().window(newTabHandle);
//        DriverManager.getWebDriver().switchTo().parentFrame();
//        // Store the current window handle
////        WebElement iFrame= DriverManager.getWebDriver().findElement(By.id("_hjSafeContext_30893774"));
////        DriverManager.getWebDriver().switchTo().frame(iFrame);
////        DriverManager.getWebDriver().switchTo().defaultContent();
////
////        System.out.println();
//
//        // Based on index position:
//        int frameIndex = 0;
//        List<WebElement> listFrames = DriverManager.getWebDriver().findElements(By.tagName("iframe"));
//        System.out.println("list frames   "+listFrames.size());
//        DriverManager.getWebDriver().switchTo().frame(listFrames.get( frameIndex ));

        //WaitForElement.waitUntilElemembtIsVisible(phoneNUmber);


//        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
//        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
//                .stream()
//                .filter(handle -> !handle.equals(currentTabHandle ))
//                .findFirst()
//                .get();
//        DriverManager.getWebDriver().switchTo().window(newTabHandle);

//        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        WaitForElement.waitUntilElemembtIsVisible(marketingConsents);

        marketingConsents.click();
    }





    public void  clickWizyty(){

        WebElement iframe_element = DriverManager.getWebDriver().findElement(name("_hjRemoteVarsFrame"));
        DriverManager.getWebDriver().switchTo().frame(iframe_element);
        String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();
        String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle ))
                .findFirst()
                .get();
        WaitForElement.waitUntilElemembtIsVisible(wizyty);
        wizyty.click();
    }






}
