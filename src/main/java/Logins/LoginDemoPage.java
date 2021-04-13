package Logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BrowserSetUp;

public class LoginDemoPage {

    private static final By LOC_USERNAME = By.id("user-name");
    private static final By LOC_PASSWORD = By.id("password");
    private static final By LOC_SUBMIT = By.id("login-button");
    private static final By LOC_PRODUCT = By.className("product_label");

    public static void openDemoPage() {
        BrowserSetUp.webDriver.get("https://www.saucedemo.com/");
    }

    public static void login(String username, String password) {
        BrowserSetUp.webDriver.findElement(LOC_USERNAME).sendKeys(username);
        BrowserSetUp.webDriver.findElement(LOC_PASSWORD).sendKeys(password);
        BrowserSetUp.webDriver.findElement(LOC_SUBMIT).click();
    }

    public static void verifyUserIsLoggedIn(String expected, String errorMessage) {
        WebElement Products = BrowserSetUp.webDriver.findElement(LOC_PRODUCT);
        String Logged = Products.getText();
        Assert.assertEquals(Logged, expected, errorMessage);
    }
}
