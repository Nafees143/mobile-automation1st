package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.P1_HomePage;

public class Ecommerce extends Base {

	@Test
	public void mySecondTest() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(2000);
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nafis Khan");
		
		P1_HomePage home = new P1_HomePage(driver);
		home.nameField.sendKeys("Nafis Khan");
		Thread.sleep(2000);

	}

}
