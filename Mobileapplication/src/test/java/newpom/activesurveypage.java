package newpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class activesurveypage {
	
public  AppiumDriver driver;
	
	public  activesurveypage(AppiumDriver driver)
	{
	
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);	
	}	
	
	

		
	
	   @AndroidFindBy(xpath="//android.view.View[@content-desc='Pollster Survey']") 
	   public  WebElement pollster;
		
	   @AndroidFindBy(xpath="//android.view.View[@content-desc='Create']")
	   public   WebElement create1;
				
		@AndroidFindBy(xpath="//android.view.View[@content-desc='Simple Survey A Simple Survey comprises of not more than 5 questions with not more than 3-4 answers per question ']")
		public WebElement simple3;
				
		@AndroidFindBy(xpath="//*[@resource-id='sname']")
		public WebElement sname2;
				
		@AndroidFindBy(xpath="//*[@resource-id='description']")
		public WebElement desc2;

	
}
	

