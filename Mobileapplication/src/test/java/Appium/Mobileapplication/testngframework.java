package Appium.Mobileapplication;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class testngframework  extends demo {
 
	//AndroidDriver<AndroidElement> driver=Capabilities();
   //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	public WebDriver driver;
	
	@Test
	public void login() throws InterruptedException, MalformedURLException{
		
		  WebElement loginemail=driver.findElement(By.xpath("//input[@id='email']"));

		    loginemail.click();
		    loginemail.sendKeys("9500108754"); 
			
				
		    WebElement loginpwd=driver.findElement(By.xpath("//input[@id='pass']"));
		    loginpwd.click();
		    loginpwd.sendKeys("Test@123");
	        WebElement loginbutton=driver.findElement(By.xpath("//button[@id='login']"));
	        loginbutton.click();
		    Thread.sleep(5000);
/*
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter your Mobile#/Email Id']")).sendKeys("vramyagnk@gmail.com");
	 driver.findElement(By.xpath("(//android.widget.EditText)[2]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[2]")).sendKeys("Test@12");
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Org Code']")).sendKeys("abc");
	Thread.sleep(8000);

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login ']")).click();

	Thread.sleep(8000);
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='QUE']")).click();
	Thread.sleep(8000);

	driver.findElement(By.xpath("//android.view.View[@content-desc='Patient CheckIn']")).click();

	driver.findElement(By.xpath("//*[@resource-id='refid']")).click();
	driver.findElement(By.xpath("//*[@resource-id='refid']")).sendKeys("4567845677");

	 driver.findElement(By.xpath("(//android.widget.EditText)[2]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[2]")).sendKeys("ramya");
	 
	 driver.findElement(By.xpath("(//android.widget.EditText)[4]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[4]")).sendKeys("fever");
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("(//android.widget.EditText)[5]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[5]")).sendKeys("254");
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("(//android.widget.EditText)[6]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[6]")).sendKeys("34");
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("(//android.widget.EditText)[7]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[7]")).sendKeys("F");
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("(//android.widget.EditText)[8]")).click();
	 driver.findElement(By.xpath("(//android.widget.EditText)[8]")).sendKeys("5");
	 Thread.sleep(5000);
	 
	 Thread.sleep(5000);

		driver.findElement(By.xpath("(//android.widget.EditText)[10]")).click();
		 //driver.findElementByXPath("(//android.widget.EditText)[9]").sendKeys("5");
		 Thread.sleep(5000);

		driver.findElement(By.xpath("(//android.view.View)[18]")).click();
		
           */ 
}
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://3.92.99.29:8080/cliniq/#/webLogin");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}