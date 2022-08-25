import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TestDriver extends TestBase {



    @Test
    public void test(){
        PageFactory.initElements(driver, LoginPage.class)
                .loginToPIMPage()
                .searchEmployeeID("0083")
                .validateResults("Joe", "Root");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
