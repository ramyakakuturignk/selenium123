package newpom;
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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demobasic {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		File f= new File("C:/Users/ramya/workspace1/Mobileapplication/src/test/java/app-debug.apk");
		File fs=new File(f,"app-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "teller");
       // cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "MobilePlatForm.Android");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
       // cap.setCapability (MobileCapabilityType.PLATFORM_VERSION, "7");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

		cap.setCapability(MobileCapabilityType.APP,f.getAbsolutePath());
		//cap.setCapability("autoAcceptAlerts", true);

		//cap.setCapability("no",true);
        cap.setCapability("newCommandTimeout", 100000);
       // cap.setCapability("noReset", true);
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("HTTP://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		return driver;
	}
}
