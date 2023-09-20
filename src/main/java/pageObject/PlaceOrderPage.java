package pageObject;
import aquality.selenium.elements.interfaces.IButton;
import frameWork.BaseForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class PlaceOrderPage extends BaseForm {
    public PlaceOrderPage(){
        super(By.xpath("//div[@class='logo__icon']"), "homepage");
    }

    public void HoverOnElectronics() throws InterruptedException {
    }

}
