package pageObject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class P1_HomePage {
	public P1_HomePage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
}
