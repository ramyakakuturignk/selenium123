package Appium.Mobileapplication;
	
	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class demo1 {

		public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
			File f= new File("C:/Users/ramya/workspace1/Mobileapplication/src/main/java/apidemos.apk");
			//File fs=new File(f,"app-debug.apk");
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");

			cap.setCapability(MobileCapabilityType.APP,f.getAbsolutePath());
			cap.setCapability("autoAcceptAlerts", true);

			//cap.setCapability("no",true);
	        //cap.setCapability("newCommandTimeout", 100000);
	       // cap.setCapability("noReset", true);
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("HTTP://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			return driver;
		}
		
		
	}


