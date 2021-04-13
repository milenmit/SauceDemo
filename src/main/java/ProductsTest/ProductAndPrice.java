package ProductsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserSetUp;

public class ProductAndPrice<Decimal> {
    private static final By LOC_SPECIFIC_PRODUCT = By.id("item_4_img_link");
    private static final By LOC_SPECIFIC_PRODUCT_PRIZE = By.xpath("");
    String ProductName = "Sauce Labs Backpack";
    double priceOfBag = 29.99;
    String CurrencySign = "$";

    public static void getProductPriceAndName() {
        BrowserSetUp.webDriver.findElement(LOC_SPECIFIC_PRODUCT).click();
        WebElement price = BrowserSetUp.webDriver.findElement(LOC_SPECIFIC_PRODUCT_PRIZE);
       /* WebElement name = BrowserSetUp.driver.findElement(LOC_SPECIFIC_PRODUCT_PRIZE);*/

        System.out.print(price.getText());
    }

    public static void VerifyPriceAndName() {
        WebElement price = BrowserSetUp.webDriver.findElement(LOC_SPECIFIC_PRODUCT_PRIZE);
    }
}
