package Newpackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tellerbasic.tellerbase;


public class Login  {
	
//public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
	//AndroidDriver<AndroidElement> driver=Capabilities();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//{
			//}
		
					
		public  Login(AppiumDriver driver)
		{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
			
		}
		//@FindBy(css="input[placeholder='email']")WebElement username1;
	    @AndroidFindBy(xpath="//android.view.View[@content-desc='Login using EmailId']") 
	    public WebElement emailclick;
		
		@AndroidFindBy(xpath="//*[@resource-id='email']")
		public WebElement email123;
		
		@AndroidFindBy(xpath="//*[@resource-id='pass']")
		public WebElement pass123;
		
		@AndroidFindBy(xpath="//*[@resource-id='login']")
		public WebElement login123;






	



}
