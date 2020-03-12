package Appium.Mobileapplication;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.remote.DesiredCapabilities;

public class androidcloud {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// TODO Auto-generated method stub

		DesiredCapabilities dc=DesiredCapabilities.iphone();

		dc.setCapability("platformName", "Android");

		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		dc.setCapability("platformVersion", "7.1");

		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		dc.setCapability("appiumVersion", "1.3.4");

		dc.setCapability("deviceName", "android Emulator");

		dc.setCapability("browserName", "chrome");

		AndroidDriver driver=new AndroidDriver(new URL("http://sindhu12345:d95760de-7c53-494f-bfb8-663afe757041@ondemand.saucelabs.com/66.85.49.22:443/wd/hub"),dc);

		//IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		
		driver.get("http://google.com");

		Thread.sleep(8000L);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Navigating to Udemy");

		driver.get("https://udemy.com");

		System.out.println("Succesfully navigated to Udemy");

		driver.findElement(By.xpath(".//*[@id='android-splash']/a")).click();
}
}
