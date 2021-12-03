package saucedemo;

import org.junit.Assert;
import org.junit.Test;

public class StorePageTests extends StorePageBase{

@Test
    public void storePageTests(){
    storePage = loginPage.login(username,password);
    storePage.selectProduct();
    cartPage = storePage.selectCartIcon();
    Assert.assertEquals(productName, cartPage.checkItem());
    Assert.assertEquals(productPrice, cartPage.checkPrice());
    checkoutPage = cartPage.goToCheckout();
    checkoutPage.fillInCustomerData(customerName,customerLastName,customerPostalCode);
    orderSummaryPage = checkoutPage.goToOrderSummary();
    orderSuccessPage = orderSummaryPage.goToPayment();
    Assert.assertEquals(expectedSuccessfulOrderText, orderSuccessPage.getSuccessMessage());

    }






}
