package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="checkout")
    WebElement checkoutButton;
    @FindBy(css =".inventory_item_name" )
    WebElement itemName;
    @FindBy(css =".inventory_item_price" )
    WebElement itemPrice;


    public String checkItem() {
        return itemName.getText();
    }
    public String checkPrice() {
        return itemPrice.getText();
    }

    public CheckoutPage goToCheckout() {
        checkoutButton.click();
        return new CheckoutPage(driver);
    }


}
