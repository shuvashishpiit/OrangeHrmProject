import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class FirstTest extends TestBase {
   // WebDriver driver;

    @Test
    public void test01() {
        startLoginPage().loginToPIMPage();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test02 () {

    }
}
