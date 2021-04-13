/*
package ProductsTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Logins.LoginDemoPage;
import utils.BrowserSetUp;

import java.net.MalformedURLException;

public class CheckNumberOfProductsTest {

    @BeforeMethod
    public void navigateToAvailableProducts() throws MalformedURLException {
        BrowserSetUp.startBrowser();
        LoginDemoPage.openDemoPage();
        LoginDemoPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void CheckProductsTest() {
        NumberOfProducts.checkProducts();
        NumberOfProducts.verifySizeOfProducts();
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserSetUp.quit();

    }
}
*/
