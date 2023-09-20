package pageObject;

import aquality.selenium.elements.interfaces.IButton;
import frameWork.BaseForm;
import org.openqa.selenium.By;

public class HomePage extends BaseForm {
    public HomePage() {
        super(By.xpath("//h2[normalize-space()='Welcome to our store']"), "Welcome to Store");
    }
    private final IButton registrationbutton = getElementFactory().getButton(By.xpath("//a[@class='ico-register']"), "Register Button");
     public void clickOnRegistration(){
      registrationbutton.getJsActions().click();
    }

}
