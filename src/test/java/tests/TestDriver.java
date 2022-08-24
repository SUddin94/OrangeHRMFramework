package tests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import testBase.TestBase;



public class TestDriver extends TestBase {



    @Test
    public void test(){
        WebDriver driver = Browser.driver;
        PageFactory.initElements(driver,LoginPage.class).login();
    }

}
