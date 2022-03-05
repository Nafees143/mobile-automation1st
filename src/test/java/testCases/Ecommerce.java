package testCases;

import java.io.IOException;


import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.P1_HomePage;
import utilities.Utilities;
public class Ecommerce extends Base {

	@Test
	public void mySecondTest() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(2000);
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nafis Khan");
		
		P1_HomePage home = new P1_HomePage(driver);
		home.nameField.sendKeys("Ki khobor");
		Thread.sleep(2000);
		
		driver.hideKeyboard();
		
		home.femaleRadio.click();
		home.maleRadio.click();
		Thread.sleep(2000);
		
		home.dropDownClick.click();
		Thread.sleep(2000);
		
		Utilities country = new Utilities(driver);
		country.scrollToText("Bangladesh");
		Thread.sleep(2000);
		home.countrySelect.click();
		
		home.letsShop.click();
		Thread.sleep(2000);
		
		Utilities product = new Utilities(driver);
		product.scrollToText("Nike SFB Jungle");
		Thread.sleep(2000);
		
		home.addToCart.click();
		Thread.sleep(2000);
		home.goToCart.click();
		Thread.sleep(2000);
		home.sendMail.click();
		Thread.sleep(2000);
		home.backButton.click();
		Thread.sleep(2000);
	}
	
}













