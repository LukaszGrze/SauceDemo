package saucedemo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.pages.*;

import java.util.concurrent.TimeUnit;

public class StorePageBase {
    CartPage cartPage;
    CheckoutPage checkoutPage;
    LoginPage loginPage;
    OrderSuccessPage orderSuccessPage;
    OrderSummaryPage orderSummaryPage;
    StorePage storePage;

    WebDriver driver;
    String URL = "https://www.saucedemo.com/";
    String username = "standard_user";
    String password = "secret_sauce";

    String expectedSuccessfulOrderText = "THANK YOU FOR YOUR ORDER\n" +
            "Your order has been dispatched, and will " +
            "arrive just as fast as the pony can get there!\n" +
            "BACK HOME";
    String customerName = "Luke";
    String customerLastName = "Lucky";
    String customerPostalCode = "777777";
    String productName = "Sauce Labs Fleece Jacket";
    String productPrice = "$49.99";



    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
        loginPage = new LoginPage(driver);
    }

    @After
    public void driverQuit() {
        driver.quit();
    }

}
