package newpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class homepage {
	
	public  AppiumDriver driver;
	
	public  homepage(AppiumDriver driver)
	{
	
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
		
	}
	//@FindBy(css="input[placeholder='email']")WebElement username1;
    @AndroidFindBy(xpath="//android.view.View[@content-desc='Login using EmailId']")
    public  WebElement emailclick;
	
	@AndroidFindBy(xpath="//*[@resource-id='email']")
	public WebElement email123;
	
	@AndroidFindBy(xpath="//*[@resource-id='pass']")
	public WebElement pass123;
	
	@AndroidFindBy(xpath="//*[@resource-id='login']")
	public WebElement login123;


}
