package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser {

    static WebDriver driver;


//    public static void getPropertyValue(String propertyName){
//        String propertyValue = "";
//
//        try {
//            InputStream inputStream = new FileInputStream("src/main/resources/info.properties");
//            Properties properties = new Properties();
//            properties.load(inputStream);
//            propertyValue = properties.getProperty(propertyName);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

    public static WebDriver driverSetup(){
        if (Info.browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Info.browser.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (Info.browser.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;


    }


}
