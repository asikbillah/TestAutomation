package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.MixCellphonePage;
import pageObject.PlaceOrderPage;

public class TestPlaceOrder extends BaseTest{
    PlaceOrderPage placeOrderPage = new PlaceOrderPage();
    BaseTest baseTest= new BaseTest();
    MixCellphonePage mixCellphonePage = new MixCellphonePage();
    @Test
    public void testPlaceOrder() throws InterruptedException {
        logger.info("Go to Home Page");
        HomePage homepage = new HomePage();
        Assert.assertTrue(homepage.waitForDisplayed(),"Home is not open.");
        mixCellphonePage.Electronics();
        mixCellphonePage.Cellphone();
        mixCellphonePage.NokiaLumia();
        mixCellphonePage.QuantitySet();
        mixCellphonePage.AddToCart();
        mixCellphonePage.ShoppingCart();
        mixCellphonePage.TermsOfService();
        mixCellphonePage.CheckOut();
        mixCellphonePage.CheckOutAsGuest();
        mixCellphonePage.setFirst_name("asik");
        mixCellphonePage.setLast_Name("billah");
        mixCellphonePage.Email("abcdg@gmail.com");
        mixCellphonePage.Company("C COMPANY");
        mixCellphonePage.selectRandomCountry();
        mixCellphonePage.selectRandomState();
        mixCellphonePage.City("New york");
        mixCellphonePage.Address1("2N,new york");
        mixCellphonePage.Address2("4W, new york");
        mixCellphonePage.Postal_code("202");
        mixCellphonePage.Phone_number("+68418915645");
        mixCellphonePage.Fax_number("+251587411");
        mixCellphonePage.ContinueButton();
        mixCellphonePage.NextDayAir();
        mixCellphonePage.ContinueButton2();
        mixCellphonePage.CreditCard();
        mixCellphonePage.ContinueButton3();
        mixCellphonePage.setCardholderName("John");
        mixCellphonePage.Card_number("4263982640269299");
        mixCellphonePage.selectExpiryMonth();
        mixCellphonePage.selectExpiryYear();
        mixCellphonePage.Card_code("738");
        mixCellphonePage.ContinueButton4();
        mixCellphonePage.ContinueButton5();
        String Successfull_Place_order_message = "Your order has been successfully processed!";
        Assert.assertEquals(mixCellphonePage.getSuccessfullOrderMessage(),Successfull_Place_order_message,"Order is not placed");
        Thread.sleep(5000);





    }

}
