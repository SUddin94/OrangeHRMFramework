package testBase;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Browser.driverSetup();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
