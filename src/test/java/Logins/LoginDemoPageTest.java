package Logins;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserSetUp;

import java.net.MalformedURLException;


public class LoginDemoPageTest {
  @BeforeMethod
    public void startBrowser() throws MalformedURLException {
        BrowserSetUp.startBrowser();
    }

    @Test
    public void navigateAndLoginToDemoPage() {

        LoginDemoPage.openDemoPage();
        LoginDemoPage.login("standard_user", "secret_sauce");
        /*LoginDemoPage.verifyUserIsLoggedIn("Products", "User is not logged in");*/
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserSetUp.quit();
    }
}
