package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSetUp {
    public static WebDriver webDriver;
    static String browserName = System.getProperty("browserName");

    /** You can use this method if you want to use selenium non headless */
  /* public static void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }*/

    /** This method is using remoteBrowser grid/hub *//*
    public static void startBrowser() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }*/
    /** This method is using remoteBrowser grid/hub */
    /*public static void startBrowser() throws MalformedURLException {
        String browserName=System.getProperty("browserName");
        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions Firefoxoptions = new FirefoxOptions();
        InternetExplorerOptions IOptions = new InternetExplorerOptions();

        if (browserName
                .equalsIgnoreCase("Chrome")) {
            driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), chromeOptions);
        } else if (browserName
                .equalsIgnoreCase("Firefox")) {
            driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), Firefoxoptions);
            //Set gecko driver path and initiate firefox
        } else if (browserName
                .equalsIgnoreCase("IE")) {
            driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), IOptions);
        } else {
           *//* logger.debug("Error Message----> "
                    + "browser name not mentioned properly");*//*
            System.exit(0);
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
*/
    public static void startBrowser() throws MalformedURLException{
    DesiredCapabilities caps = new DesiredCapabilities();
        if (browserName.equalsIgnoreCase("chrome")) {
        caps.setCapability(browserName, "chrome");
        ChromeOptions options = new ChromeOptions();
        caps.merge(options);
//            WebDriverManager.chromedriver().setup();
        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
    }
        if (browserName.equalsIgnoreCase("firefox")) {
        caps.setCapability(browserName, "firefox");
        FirefoxOptions options = new FirefoxOptions();
        caps.merge(options);
//            WebDriverManager.firefoxdriver().setup();
        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
    }
        webDriver.manage().window().maximize();
}


    public static void quit() {

        webDriver.quit();
    }
}