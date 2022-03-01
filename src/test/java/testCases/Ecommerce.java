package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce extends Base {

	@Test
	public void mySecondTest() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(2000);

	}

}
