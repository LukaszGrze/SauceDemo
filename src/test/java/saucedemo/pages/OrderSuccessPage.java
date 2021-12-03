package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSuccessPage {
    private WebDriver driver;

    public OrderSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="checkout_complete_container")
    WebElement checkoutCompleteContainer;

    public String getSuccessMessage() {
        return checkoutCompleteContainer.getText();
    }

}
