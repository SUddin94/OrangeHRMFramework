import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AdminTest extends TestBase{

    @Test
    public void adminPageTest(){
        PageFactory.initElements(driver, LoginPage.class)
                .loginToPIMPage()
                .navigateToAdmin()
                .searchUserName("Aaliyah.Haq")
                .validateResult("Aaliyah.Haq");
    }
}
