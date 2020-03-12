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
import io.appium.java_client.pagefactory.AndroidBy;

public class Tellertestcases extends Tellerdemo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Login using EmailId']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@resource-id='email']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@resource-id='email']")).sendKeys("vramyagnk@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='pass']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@resource-id='pass']")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='login']")).click();
		
		 WebElement poll=driver.findElement(By.xpath("//android.view.View[@content-desc='Pollster Survey']"));
		    poll.click();
		    Thread.sleep(5000);
		    
		    WebElement create=driver.findElement(By.xpath("//android.view.View[@content-desc='Create']"));
		    create.click();
		    Thread.sleep(5000);
		    
		    WebElement simple=driver.findElement(By.xpath("//android.view.View[@content-desc='Simple Survey A Simple Survey comprises of not more than 5 questions with not more than 3-4 answers per question ']"));
		    simple.click();
		    Thread.sleep(8000);
		    
		    WebElement name=driver.findElement(By.xpath("//*[@resource-id='sname']"));
		    name.sendKeys("ramyasurveynew11");
		    Thread.sleep(5000);
		    
		    WebElement description=driver.findElement(By.xpath("//*[@resource-id='description']"));
		    description.sendKeys("ramyadescription");
		    Thread.sleep(5000);
		    
		    WebDriverWait wait = new WebDriverWait(driver, 10);	    
		    WebElement addquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Image[@content-desc='help circle']")));
		    addquestion.click();
		    Thread.sleep(5000);
		    
		   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
		   
		    WebDriverWait wait1 = new WebDriverWait(driver, 10);
		    WebElement enterquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='question']")));
		    enterquestion.sendKeys("Android");
		    Thread.sleep(5000); 
		    
		    
		    WebElement settings=driver.findElement(By.xpath("//android.widget.Image[@content-desc='settings']"));
		    settings.click();
		    Thread.sleep(5000);
		    
		    WebElement multi=driver.findElement(By.xpath("//android.widget.Image[@content-desc='done all']"));
		    multi.click();
		    Thread.sleep(5000);
		    
		      
		    
		    WebElement mandatory=driver.findElement(By.xpath("//android.widget.Image[@content-desc='checkmark']"));
		    mandatory.click();
		    Thread.sleep(5000);
		    
		    WebElement ok=driver.findElement(By.xpath("//android.widget.Image[@content-desc='checkmark-circle-outline']"));
		    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
		    ok.click();
		    Thread.sleep(5000);
		    
		    WebElement answer1=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='options']"));
		    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

		    answer1.sendKeys("yes");
		    Thread.sleep(5000);
		    
		    WebElement plus=driver.findElement(By.xpath("//*[@resource-id='Addoption']"));
		    plus.click();
		    Thread.sleep(5000);
		    
		    WebElement answer2=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='options']"));
		    answer2.sendKeys("no");
		    Thread.sleep(5000);
		    
		    WebElement plus2=driver.findElement(By.xpath("//*[@resource-id='Addoption']"));
		    plus2.click();
		    Thread.sleep(5000);
		    
		    WebElement answer3=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='options']"));
		    answer3.sendKeys("ok");
		    Thread.sleep(5000);
		    
		    WebElement plus3=driver.findElement(By.xpath("//*[@resource-id='Addoption']"));
		    plus3.click();
		    Thread.sleep(5000);
		    
		    WebElement answer4=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='options']"));
		    answer4.sendKeys("ok");
		    Thread.sleep(5000);
		    	        	    
		    WebElement cross=driver.findElement(By.xpath("//android.widget.Image[@content-desc='checkmark-circle']"));
		    cross.click();
		    Thread.sleep(5000);
		    
		    WebElement select1=driver.findElement(By.xpath("//android.widget.Image[@content-desc='checkmark-circle-outline']"));
		    select1.click();
		    Thread.sleep(5000);
		
		
		
/*
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter your Mobile#/Email Id']")).sendKeys("vramyagnk@gmail.com");
		 driver.findElementByXPath("(//android.widget.EditText)[2]").click();
		 driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("Test@12");
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Org Code']")).sendKeys("abc");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login ']")).click();

		Thread.sleep(8000);
		*/
}
}