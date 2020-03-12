package Appium.Mobileapplication;

import java.net.MalformedURLException;
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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Cliniqtab extends demo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=Capabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);{
			//driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
			WebDriverWait driverWait1 = new WebDriverWait(driver, 60);
			driverWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='ALLOW']")));
			WebElement pop=driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']"));
			pop.click();
			Thread.sleep(80000);
		}
		

}
}