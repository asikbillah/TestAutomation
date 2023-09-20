package pageObject;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.bouncycastle.asn1.x509.DisplayText;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getElementFactory;
import static dev.failsafe.internal.util.Assert.state;

public class MixCellphonePage extends Serializers.Base {
    private final IButton electronics = getElementFactory().getButton(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"), "hover electronics");
    public void Electronics() {
        electronics.getMouseActions().moveMouseToElement();
        electronics.click();
    }
    private final IButton cellphone = getElementFactory().getButton(By.xpath("//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']"), "cellphones");
    public void Cellphone(){
        cellphone.getMouseActions().moveMouseToElement();
        cellphone.click();
    }
    private final IButton nokiaLumia = getElementFactory().getButton(By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']"), "nokiaLumia1020");
    public void NokiaLumia(){
        nokiaLumia.getMouseActions().moveMouseToElement();
        nokiaLumia.click();
    }
    private final IButton quantity = getElementFactory().getButton(By.xpath("//input[@id='product_enteredQuantity_20']"), "quantity set");
    public void QuantitySet(){
        quantity.getMouseActions().moveMouseToElement();
        quantity.getElement().clear();
        quantity.sendKeys("2");
        quantity.click();
    }
    private final IButton addTocart = getElementFactory().getButton(By.xpath("//button[@id='add-to-cart-button-20']"), "Add to Cart");
    public void AddToCart(){
        addTocart.getMouseActions().moveMouseToElement();
        addTocart.click();
    }
    private final IButton shoppingCart = getElementFactory().getButton(By.xpath("//a[normalize-space()='shopping cart']"), "Shopping Cart");
    public void ShoppingCart(){
        shoppingCart.getMouseActions().moveMouseToElement();
        shoppingCart.click();
    }
    private final IButton termsOfService = getElementFactory().getButton(By.xpath("//input[@id='termsofservice']"), "Terms of service");
    public void TermsOfService(){
        termsOfService.getJsActions().scrollIntoView();
        termsOfService.click();
    }
    private final IButton checkout = getElementFactory().getButton(By.xpath("//button[@id='checkout']"), "Checkout");
    public void CheckOut(){
        checkout.getMouseActions().moveMouseToElement();
        checkout.click();
    }
    private final IButton checkoutAsGuest = getElementFactory().getButton(By.xpath("//button[normalize-space()='Checkout as Guest']"), "Checkout");
    public void CheckOutAsGuest(){
        checkoutAsGuest.getMouseActions().moveMouseToElement();
        checkoutAsGuest.click();
    }
    private final ITextBox first_name = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "enter firstname");
    public void setFirst_name(String First_name) {
        first_name.clearAndType(First_name);
    }
    private final ITextBox last_name = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_LastName']"), "Last Name");
    public void  setLast_Name(String Last_Name) {
        last_name.clearAndType(Last_Name);
    }
    private final ITextBox email = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_Email']"), "Email Field");
    public void  Email(String Email) {
        email.clearAndType(Email);
    }
    private final ITextBox company = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_Company']"), "Company field");
    public void Company(String Company){
        company.getJsActions().scrollIntoView();
        company.clearAndType(Company);
    }
    private final IComboBox country = getElementFactory().getComboBox(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "Select Country");
    public void selectRandomCountry(){
        country.selectByIndex(9);
    }
    private final IComboBox state = getElementFactory().getComboBox(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"), "Select State");
    public void selectRandomState() {
        state.state().waitForDisplayed();
        state.selectByIndex(0);
    }
    private final ITextBox city = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_City']"), "City field");
    public void City(String City){
        city.clearAndType(City);
    }
    private final ITextBox address1 = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Address1 field");
    public void Address1(String Address1){
        address1.clearAndType(Address1);
    }
    private final ITextBox address2 = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_Address2']"), "Address2 field");
    public void Address2(String Address2){
        address2.clearAndType(Address2);
    }
    private final ITextBox postal_code = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "Postal_code field");
    public void Postal_code(String Postal_code){
        postal_code.clearAndType(Postal_code);
    }
    private final ITextBox phone_number = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "Phone_number field");
    public void Phone_number(String Phone_number){
        phone_number.clearAndType(Phone_number);
    }
    private final ITextBox fax_number = getElementFactory().getTextBox(By.xpath("//input[@id='BillingNewAddress_FaxNumber']"), "Fax_number field");
    public void Fax_number(String Fax_number){
        fax_number.clearAndType(Fax_number);
    }
    private final IButton continueButton = getElementFactory().getButton(By.xpath("//button[@onclick='Billing.save()']"), "Continue");
    public void ContinueButton(){
        continueButton.click();
    }
    private final IButton nextDayAir = getElementFactory().getButton(By.xpath("//input[@id='shippingoption_1']"), "Next day Air");
    public void NextDayAir(){
        nextDayAir.click();
    }
    private final IButton continueButton2 = getElementFactory().getButton(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"), "Continue");
    public void ContinueButton2(){
        continueButton2.click();
    }
    private final IButton creditCard = getElementFactory().getButton(By.xpath("//input[@id='paymentmethod_1']"), "Credit Card");
    public void CreditCard(){
        creditCard.click();
    }
    private final IButton continueButton3 = getElementFactory().getButton(By.xpath("//button[@class='button-1 payment-method-next-step-button']"), "Continue");
    public void ContinueButton3(){
        continueButton3.click();
    }
    private final ITextBox cardholderName = getElementFactory().getTextBox(By.xpath("//input[@id='CardholderName']"), "Card Holder Name");
    public void  setCardholderName(String CardholderName) {
        cardholderName.clearAndType(CardholderName);
    }
    private final ITextBox card_number = getElementFactory().getTextBox(By.xpath("//input[@id='CardNumber']"), "Card Number");
    public void Card_number(String Card_number){
        card_number.clearAndType(Card_number);
    }
    private final IComboBox expiryMonth = getElementFactory().getComboBox(By.xpath("//select[@id='ExpireMonth']"), "Expiry Month");
    public void selectExpiryMonth() {
        expiryMonth.state().waitForDisplayed();
        expiryMonth.selectByIndex(3);
    }
    private final IComboBox expiryYear = getElementFactory().getComboBox(By.xpath("//select[@id='ExpireYear']"), "Expiry Year");
    public void selectExpiryYear() {
        expiryYear.state().waitForDisplayed();
        expiryYear.selectByIndex(3);
    }
    private final ITextBox card_code = getElementFactory().getTextBox(By.xpath("//input[@id='CardCode']"), "Card Code");
    public void Card_code(String Card_code){
        card_code.clearAndType(Card_code);
    }
    private final IButton continueButton4 = getElementFactory().getButton(By.xpath("//button[@class='button-1 payment-info-next-step-button']"), "Continue");
    public void ContinueButton4(){
        continueButton4.click();
    }
    private final IButton continueButton5 = getElementFactory().getButton(By.xpath("//button[normalize-space()='Confirm']"), "Continue");
    public void ContinueButton5(){
        continueButton5.click();
    }
    private final ILabel displaytext = getElementFactory().getLabel(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"),"Successfull Order");
    public String getSuccessfullOrderMessage(){
        return displaytext.getText();
    }







}
