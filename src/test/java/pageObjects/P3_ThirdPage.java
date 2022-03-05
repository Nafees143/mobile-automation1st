package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class P3_ThirdPage {

	public P3_ThirdPage(AndroidDriver<AndroidElement>driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath ="//*[@text='Send me e-mails on discounts related to selected products in future']")
	public WebElement sendMail;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_back")
	public WebElement backButton;
	
	
	
	
	
}
