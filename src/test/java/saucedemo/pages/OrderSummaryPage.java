package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
    private WebDriver driver;

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="finish")
    WebElement finishButton;

    public OrderSuccessPage goToPayment() {
        finishButton.click();
        return new OrderSuccessPage(driver);
    }



}
