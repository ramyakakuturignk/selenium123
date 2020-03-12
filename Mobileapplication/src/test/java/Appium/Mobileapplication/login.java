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

public class login  extends demo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		
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
		// driver.findElementByXPath("(//android.widget.LinearLayout)[2]").click();
/*
		 //driver.sendKeyEvent(AndroidBy.home);
		 driver.findElementByXPath("(//android.widget.EditText)[3]").click();
		 driver.findElementByXPath("(//android.widget.EditText)[3]").sendKeys("6379039922");
		 Thread.sleep(5000);
		 */
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

		 
			//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Search']")).click();
			// Thread.sleep(5000);
				//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Search']")).sendKeys("TESTCONSULTATION");

			//driver.findElement(By.xpath("//android.view.View[@content-desc='TEST CONSULTATION']")).click();
			//driver.findElement(By.xpath("//android.widget.Button[@content-desc='ASSIGN WORKFLOW']")).click();

		//	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Search']")).click();
			// Thread.sleep(5000);
			//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Search']")).sendKeys("NEW1");
			 Thread.sleep(5000);

			driver.findElementByXPath("(//android.widget.EditText)[10]").click();
			 //driver.findElementByXPath("(//android.widget.EditText)[9]").sendKeys("5");
			 Thread.sleep(5000);

			driver.findElementByXPath("(//android.view.View)[18]").click();

			//driver.findElementByXPath("(//android.widget.EditText)[5]").click();
		//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Sex']")).click();
		//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Sex']")).sendKeys("F");
	

		 //driver.findElementByXPath("(//android.widget.EditText)[5]").sendKeys("f");
		//driver.findElement(By.xpath("//android.widget.Spinner[@content-desc='English']")).click();
		

		/*
		 //driver.findElementByAndroidUIAutomator("content-desc(\"CHECK CONSULTATION\")").click();

		WebElement d1=driver.findElementByXPath("//android.view.View[@content-desc='Total Investigated Today']");
		d1.click();
		 Thread.sleep(8000);

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(content-desc(\"CHECK CONSULTATION\"));");
		WebElement dashboard= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(content-desc(\"Total Investigated Today\"))");
		dashboard.click();
		
		 //Thread.sleep(8000);

		// driver.findElementByXPath("//android.view.View[@content-desc='schedule']").click();
		 //driver.findElementByAndroidUIAutomator("content-desc(\"schedule\")").click();
		 Thread.sleep(8000);
		// driver.findElementByXPath("//android.view.View[@content-desc='Currently In Queue']").click();
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(content-desc(\"Currently In Queue\"))");

/*
		WebDriverWait driverWait1 = new WebDriverWait(driver, 90);
		driverWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@NAF='true']")));
		driver.findElementByClassName("(//android.widget.EditText[@NAF='true']").click();
		//pass.click();
		 driver.findElementByClassName("(//android.widget.EditText[@NAF='true']").sendKeys("Test@12");
		// m.sendKeys("Test@12");
		Thread.sleep(8000);
		*/
		/*
		driver.findElement(By.xpath("//android.view.View[@content-desc='| Forgot Password ?']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Your Email Id']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Your Email Id']")).sendKeys("vramyagnk@gmail.com ");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='SEND OTP']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Enter Your OTP']")).sendKeys("4758");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='VALIDATE']")).click();

		*/
}
}