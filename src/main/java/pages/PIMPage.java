package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {

    WebDriver driver = Browser.driver;

//    @FindBy(linkText = "Recruitment") private WebElement recruitmentLink;
    @FindBy(css = "button[type='submit']") private WebElement submitButton;

//    public RecruitmentPage navigateToRecruitmentPage(){
//        recruitmentLink.click();
//
//        return PageFactory.initElements(Browser.driver,RecruitmentPage.class);
//    }

    public PIMPage searchEmployeeID(String id){
        List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
        elements.get(1).sendKeys(id);
        submitButton.click();
//        return PageFactory.initElements(driver,PIMPage.class);
        return this;
    }

    public PIMPage validateResults(String firstName, String lastName){
        List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-table-cell.oxd-padding-cell"));
        elements.get(2).getText().compareTo(firstName);
        elements.get(3).getText().compareTo(lastName);
        return this;
    }
}
