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


public class testcases  {
	//public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
	//	AndroidDriver<AndroidElement> driver=Capabilities();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	//	{

     //   }

		
		public  testcases(AppiumDriver driver)
		{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
			
		}
		
		
		
		    @AndroidFindBy(xpath="//android.view.View[@content-desc='Pollster Survey']") 
		    public WebElement pollster;
			
			@AndroidFindBy(xpath="//android.view.View[@content-desc='Create']")
			public WebElement create1;
			
			@AndroidFindBy(xpath="//android.view.View[@content-desc='Simple Survey A Simple Survey comprises of not more than 5 questions with not more than 3-4 answers per question ']")
			public WebElement simple3;
			
			@AndroidFindBy(xpath="//*[@resource-id='sname']")
			public WebElement sname2;
			
			@AndroidFindBy(xpath="//*[@resource-id='description']")
			public WebElement desc2;

			
		
		   
	


		
}
	