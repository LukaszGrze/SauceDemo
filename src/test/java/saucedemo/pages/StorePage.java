package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage {
    private WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addFleeceJacket;
    @FindBy(id="shopping_cart_container")
    WebElement cartIconLink;

    public void selectProduct() {
        addFleeceJacket.click();
    }

    public CartPage selectCartIcon(){
        cartIconLink.click();
        return new CartPage(driver);
    }






}
