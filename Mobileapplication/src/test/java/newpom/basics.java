package newpom;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends demobasic {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				
		
		

	homepage h=new homepage(driver);
	h.emailclick.click();
	h.email123.click();
	h.email123.sendKeys("vramyagnk@gmail.com");
	h.pass123.click();
	h.pass123.sendKeys("Test@123");
	h.login123.click();

	activesurveypage a=new activesurveypage(driver);
	a.pollster.click();
	a.simple3.click();
	a.create1.click();
	a.sname2.click();
	a.sname2.sendKeys("appium survey name");
	a.desc2.click();
	a.desc2.sendKeys("appiumdescription");
	
	
}
}