package Appium.Mobileapplication;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class chromebrowser {
	public static  AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
	{
	AndroidDriver<AndroidElement>  driver;

	// TODO Auto-generated method stub
	//File appDir = new File("src");
	//File f= new File("C:/Users/ramya/workspace1/Mobileapplication/src/test/java/app-release.apk");

	     DesiredCapabilities capabilities = new DesiredCapabilities( );
	 	//capabilities.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
	   // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Loukya");
	     
	     capabilities.setCapability("newCommandTimeout", 10000);
	     capabilities.setCapability("noReset", true);
	     capabilities.setCapability("platformName", "Android");
	     capabilities.setCapability("platformVersion", "7.0");
	    // WebDriverWait.chromedriver().setup();
	     //cap.setCapability("chromedriverExecutable", WebDriverWait.chromedriver().getBinaryPath());
	   

	    // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi");
	     
	     if(device.equals("real")){
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi");
		     }
		     else if (device.equals("emulator")){
		         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"loukya");
		   //  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		     }
	
	     
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    //DesiredCapabilities capabilities = new DesiredCapabilities();
		     
		    
		    
		    return driver;

	     //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");
	    
	     
	  //  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	   //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	  
	}

	}

