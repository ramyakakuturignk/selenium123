package Appium.Mobileapplication;
import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demochrome extends chromebrowser{
	


	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver=capabilities("emulator");
System.setProperty("webdriver.chrome.driver","C:/Users/ramya/workspace1/Mobileapplication/drivers/chromedriver");
	driver.get("http://www.google.com");
  driver.findElement(By.xpath("//android.widget.EditText[@text='Search or type URL']")).sendKeys("sachin");

/*
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter your Mobile#/Email Id']")).sendKeys("vramyagnk@gmail.com");
	 driver.findElementByXPath("(//android.widget.EditText)[2]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("Test@12");
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Org Code']")).sendKeys("abc");
	Thread.sleep(8000);

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login ']")).click();

	Thread.sleep(8000);
	
	driver.findElement(By.xpath("//android.view.View[@content-desc='QUE']")).click();
	Thread.sleep(8000);

	driver.findElement(By.xpath("//android.view.View[@content-desc='Patient CheckIn']")).click();

	driver.findElement(By.xpath("//*[@resource-id='refid']")).click();
	driver.findElement(By.xpath("//*[@resource-id='refid']")).sendKeys("4567845677");

	 driver.findElementByXPath("(//android.widget.EditText)[2]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("ramya");
	 driver.findElementByXPath("(//android.widget.EditText)[4]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[4]").sendKeys("fever");
	 Thread.sleep(5000);

	 driver.findElementByXPath("(//android.widget.EditText)[5]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[5]").sendKeys("254");
	 Thread.sleep(5000);

	 driver.findElementByXPath("(//android.widget.EditText)[6]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[6]").sendKeys("34");
	 Thread.sleep(5000);

	 driver.findElementByXPath("(//android.widget.EditText)[7]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[7]").sendKeys("F");
	 Thread.sleep(5000);

	 driver.findElementByXPath("(//android.widget.EditText)[8]").click();
	 driver.findElementByXPath("(//android.widget.EditText)[8]").sendKeys("5");
	 Thread.sleep(5000);
*/

	/* driver.get("http://facebook.com");
	driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
	driver.findElementByName("pass").sendKeys("12345");
	driver.findElementByXPath("//button[@value='Log In']").click();*/
	//rahulonlinetutor@gmail.com

	/*
	driver.findElementByXPath("//a[@href='#menu']").click();
	driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
	System.out.println(driver.getCurrentUrl());
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,480)", "");
	   Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
	   */
}

}
	