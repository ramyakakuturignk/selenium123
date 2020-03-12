package Newpackage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Appium.Mobileapplication.Tellerdemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


public class factory  extends basepackage{
	public static	AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
	
	AndroidDriver<AndroidElement> driver=Capabilities("emulator");
	
	//DesiredCapabilities cap=new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "teller");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	//	{
			
		//}
		
	
	Login l2=new Login(driver);
	l2.emailclick.click();
	l2.email123.sendKeys("vramyagnk@gmail.com");
	l2.pass123.click();
	l2.pass123.sendKeys("Test@123");
	l2.login123.click();
	
	testcases t6=new testcases(driver);
	t6.pollster.click();
	t6.simple3.click();
	t6.create1.click();
	t6.sname2.sendKeys("ramya appium");
	t6.desc2.sendKeys("ramya desc");

}
	
}