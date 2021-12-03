package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="first-name")
    WebElement firstNameField;
    @FindBy(id="last-name")
    WebElement lastNameField;
    @FindBy(id="postal-code")
    WebElement postalCodeField;
    @FindBy(id="continue")
    WebElement continueButton;


    public void fillInCustomerData(String customerName, String customerLastName, String customerPostalCode) {
        firstNameField.sendKeys(customerName);
        lastNameField.sendKeys(customerLastName);
        postalCodeField.sendKeys(customerPostalCode);

    }
    public OrderSummaryPage goToOrderSummary() {
        continueButton.click();
        return new OrderSummaryPage(driver);
    }

}
