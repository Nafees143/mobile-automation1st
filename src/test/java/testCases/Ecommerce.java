package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce extends Base{

	
	@Test
	public void myFirstTest() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(2000);
		
	}
	
}
