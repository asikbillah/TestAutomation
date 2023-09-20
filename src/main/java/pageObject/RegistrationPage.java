package pageObject;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import frameWork.BaseForm;
import org.openqa.selenium.By;

public class RegistrationPage extends BaseForm {
    public RegistrationPage() {
        super(By.xpath(" "), "homepage");
    }
     private final ICheckBox genderMale = getElementFactory().getCheckBox(By.xpath("//input[@id='gender-male']"), "Click Male");
    public void setGenderMale() {
        genderMale.click();
    }

    private final ITextBox first_name = getElementFactory().getTextBox(By.xpath("//input[@id='FirstName']"), "enter firstname");
    public void setFirst_name(String First_name) {
        first_name.clearAndType(First_name);
    }
     private final ITextBox last_name = getElementFactory().getTextBox(By.xpath("//input[@id='LastName']"), "enter lastname");
    public void setLast_name(String Last_name) {
        last_name.clearAndType(Last_name);
    }
    private final IComboBox day = getElementFactory().getComboBox(By.xpath("//select[@name='DateOfBirthDay']"), "Birth day");
    public void selectRandomDay() {
        day.state().waitForDisplayed();
        day.selectByIndex(19);
    }
   private final IComboBox month = getElementFactory().getComboBox(By.xpath("//select[@name='DateOfBirthMonth']"), "Birth month");
    public void selectRandomMonth() {
        month.state().waitForDisplayed();
        month.selectByIndex(2);
    }
    private final IComboBox year = getElementFactory().getComboBox(By.xpath("//select[@name='DateOfBirthYear']"), "Birth year");
    public void selectRandomYear() {
        year.state().waitForDisplayed();
        year.selectByIndex(15);
    }
    private final ITextBox email = getElementFactory().getTextBox(By.xpath("//input[@id='Email']"), "enter Email");
    public void setEmail(String Email) {
        email.clearAndType(Email);
    }
    private final ITextBox company_name = getElementFactory().getTextBox(By.xpath("//input[@id='Company']"), "enter company_name");
    public void setCompany_name(String Company_name) {
        company_name.clearAndType(Company_name);
    }
    private final IButton newsletter = getElementFactory().getButton(By.xpath("//input[@id='Newsletter']"), "select newsletter");
    public void clickNewsletter() {
        newsletter.getJsActions().scrollIntoView();
        newsletter.click();
    }
    private final ITextBox password = getElementFactory().getTextBox(By.xpath("//input[@id='Password']"), "Password Fields");
    public void setPassword(String Password) {
        password.clearAndType(Password);
    }
    private final ITextBox confirm_password = getElementFactory().getTextBox(By.xpath("//input[@id='ConfirmPassword']"), "Confirm_Password Fields");
    public void setConfirm_password(String Confirm_Password) {
        confirm_password.clearAndType(Confirm_Password);
    }
    private final IButton register = getElementFactory().getButton(By.xpath("//button[@id='register-button']"), "Register Button");
    public void clickedOnRegister() {
        register.click();
    }


}
