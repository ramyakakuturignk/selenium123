package factoryteller;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TellerPages.Register;
import Tellertestcases.login2;
import Tellertestcases.Pollster;
import Tellertestcases.Respondent;
//import Tellertestcases.login2;

public class BrowseFactoryTeller {

	public WebDriver driver;
	 public static DriverInit driverInit = null;
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://192.168.1.18:8080/tellerv7/index.html");
			 driver.manage().window().maximize();

}
	
	/*

	 @Test
	 public void verifyregister() throws ElementNotVisibleException, InterruptedException,NullPointerException{

		 Register re= PageFactory.initElements(driver,Register.class);
	 	re.verifyregister();
       Thread.sleep(5000);
	 	
	 }
	 */
	

	 @Test
	 public void verifylogin()throws InterruptedException{
		 
		  driver = DriverInit.getInstance().getDriver();
		  //driver = new ChromeDriver(); 
		 login2 l3= PageFactory.initElements(driver,login2.class);
	 	l3.verifylogin();

	       Thread.sleep(5000);

	 }
	
	
	 @Test
	 public void pollster()throws InterruptedException{
	 			
		  //driver = DriverInit.getInstance().getDriver();

		 Pollster poll= PageFactory.initElements(driver,Pollster.class);
	 	poll.pollster();

	       Thread.sleep(5000);

	 }
	 
	 @Test
	 public void Respondent()throws InterruptedException,NullPointerException{
	 			
		 // driver = DriverInit.getInstance().getDriver();

		 Respondent re= PageFactory.initElements(driver,Respondent.class);
	 	re.respondent();

	       Thread.sleep(5000);

	 } 
	 
	 
	 
}
