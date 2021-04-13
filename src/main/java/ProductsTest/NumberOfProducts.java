package ProductsTest;

import utils.BrowserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class NumberOfProducts {
    private static final By LOC_PRODUCTS = By.className("inventory_item");
    private static int productsSize;


    public static void checkProducts() {
        List<WebElement> Products = BrowserSetUp.webDriver.findElements(LOC_PRODUCTS);
        for (int i = 1; i <= Products.size(); i++) {
            productsSize = Products.size();
        }

    }

    public int getProductsSize() {
        return productsSize;
    }

    public void setProductsSize(int productsSize) {
        productsSize = productsSize;
    }

    public static void verifySizeOfProducts() {
        assertEquals(6, productsSize);
    }


}
