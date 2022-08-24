package tests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testBase.TestBase;



public class DriverTest extends TestBase {
    WebDriver driver;

    @Test
    public void test(){
        Browser browser = new Browser();
        browser.driverSetup();
    }

}
