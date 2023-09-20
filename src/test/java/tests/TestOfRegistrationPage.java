package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;

public class TestOfRegistrationPage extends BaseTest{
	
	@Test
	public void testRegistration() throws InterruptedException {
		logger.info("Go to Home Page");
		HomePage homepage = new HomePage();
		Assert.assertTrue(homepage.waitForDisplayed(),"Home is not open.");
		RegistrationPage registrationPage = new RegistrationPage();
		homepage.clickOnRegistration();
		logger.info("Navigate to registration page");
		RegistrationPage registrationPage1 = new RegistrationPage();
		registrationPage1.setGenderMale();
		registrationPage1.setFirst_name("Asik");
		registrationPage1.setLast_name("billah");
		registrationPage1.selectRandomDay();
		registrationPage1.selectRandomMonth();
		registrationPage1.selectRandomYear();
		Thread.sleep(1000);
		registrationPage1.setEmail("abtttef@gmail.com");
		registrationPage1.setCompany_name("c company");
		registrationPage1.clickNewsletter();
		registrationPage1.setPassword("pass123455");
		registrationPage1.setConfirm_password("pass123455");
		registrationPage1.clickedOnRegister();
		Thread.sleep(2000);
	}

}
