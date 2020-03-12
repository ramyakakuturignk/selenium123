package Appium.Mobileapplication;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class basics extends demo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//driver.findElementByClassName("android.webkit.WebView").click();
		//driver.findElementByClassName("android.widget.EditText").click();

		//driver.findElementByClassName("android.widget.EditText").sendKeys("9500108754");
		Thread.sleep(10000);
		//WebDriverWait driverWait = new WebDriverWait(driver, 120);
		
		
		//driverWait.until(ExpectedConditions.visibilityOfElementLocated("//android.widget.EditText[@content-desc='Enter Your Mobile #']"));
		driver.findElement(By.xpath("//android.view.View[@content-desc='Login using EmailId']")).click();

		//WebElement mobile1=driver.findElement(By.xpath("//*[@content-desc='Enter Your Mobile #']"));
		//mobile1.click();
		Thread.sleep(5000);
		//WebElement mobile2=driver.findElement(By.xpath("//*[@content-desc='Enter Your Mobile #']"));
		//mobile2.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Email Id']")).sendKeys("vramyagnk@gmail.com");
		//mobile.sendKeys();
		Thread.sleep(10000);
		
	
		
		/*
		WebElement mob=driver.findElement(By.xpath("//*[@resource-id='email']"));
		mob.click();
		mob.sendKeys(Keys.TAB);

		mob.sendKeys(Keys.INSERT);

		mob.sendKeys(Keys.ENTER);
		mob.sendKeys("6379039922");
		*/
		/*
 WebElement m=driver.findElementByClassName("(//android.widget.EditText)[1]");
		 m.sendKeys("6379039922");
		 */
//	ex.click();
	//ex.sendKeys("6379039922");
		WebDriverWait driverWait1 = new WebDriverWait(driver, 30);
		driverWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Enter Your Password']")));
		WebElement pass=driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Password']"));
		pass.click();
		WebElement pass1=driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Password']"));
		pass1.sendKeys("Test@123");
		Thread.sleep(8000);
		//WebElement pass2=driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Password']"));
		//pass2.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		//login.click();

		//driver.findElementByClassName("android.webkit.WebView").click();

		
	}

	
	
	
}
