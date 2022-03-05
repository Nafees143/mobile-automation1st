package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class P1_HomePage {
	public P1_HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
	}
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	public WebElement nameField;
	
	@AndroidFindBy(xpath="//*[@text = 'Female']")
	public WebElement femaleRadio;
	
	@AndroidFindBy(xpath="//*[@text = 'Male']")
	public WebElement maleRadio;
	
	@AndroidFindBy(id = "android:id/text1")
	public WebElement dropDownClick;
	
	@AndroidFindBy(xpath ="//*[@text='Bangladesh']")
	public WebElement countrySelect;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsShop;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
	public WebElement addToCart;

	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement goToCart;
	
	@AndroidFindBy(xpath ="//*[@text='Send me e-mails on discounts related to selected products in future']")
	public WebElement sendMail;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_back")
	public WebElement backButton;
	
}









