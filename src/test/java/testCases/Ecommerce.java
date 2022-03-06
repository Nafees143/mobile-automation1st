package testCases;

import java.io.IOException;


import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.P1_HomePage;
import pageObjects.P2_SecondPage;
import pageObjects.P3_ThirdPage;
import utilities.Utilities;
public class Ecommerce extends Base {

	@Test
	public void mySecondTest() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(1000);
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nafis Khan");
		
		// home page login
		P1_HomePage home = new P1_HomePage(driver);
		home.nameField.sendKeys("Ki khobor");
		Thread.sleep(1000);
		
		driver.hideKeyboard();
		
		home.femaleRadio.click();
		home.maleRadio.click();
		Thread.sleep(1000);
		
		home.dropDownClick.click();
		Thread.sleep(1000);
		
		//scrolling
		Utilities country = new Utilities(driver);
		country.scrollToText("Bangladesh");
		Thread.sleep(1000);
		home.countrySelect.click();
		
		home.letsShop.click();
		Thread.sleep(1000);
		
		
		//2nd page after login, add products
		P2_SecondPage prod = new P2_SecondPage(driver);
		
		Utilities product = new Utilities(driver);
		product.scrollToText("Nike SFB Jungle");
		Thread.sleep(1000);
		
		prod.addToCart.get(2).click();
		Thread.sleep(1000);
		
		prod.goToCart.click();
		Thread.sleep(1000);
		
		//third page 
		P3_ThirdPage three = new P3_ThirdPage(driver);
		
		three.sendMail.click();
		Thread.sleep(1000);
		
		three.sendMail.click();
		Thread.sleep(1000);
		
		three.backButton.click();
		Thread.sleep(1000);
		
		three.backButton.click();
		Thread.sleep(1000);
	}
	
}













