package tests;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.logging.Logger;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class BaseTest {
	
	private final ISettingsFile configReader = new JsonSettingsFile("config.json");
    private final String URL = configReader.getValue("/url").toString();
    public Logger logger = AqualityServices.getLogger();

    public void driverWait() throws InterruptedException {
        getBrowser().wait(5000);
    }
    public void nevigateToPage() throws InterruptedException {
        WebDriver driver = null;
        driver.get("https://demo.nopcommerce.com/");
        driver.navigate().to("https://demo.nopcommerce.com/cell-phones");
    }

    @BeforeMethod
    public void SetUp() {
        getBrowser().maximize();
        getBrowser().goTo(URL);
        getBrowser().waitForPageToLoad();
    }

    @AfterTest
    public void Teardown() {
        getBrowser().getDriver().quit();
    }

}
