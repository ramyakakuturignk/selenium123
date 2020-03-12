package Tellerfactory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Loginpage;
import tetscase.Tellertemplate;
//import Tellerpage.pendingsurvey;
import tetscase.Tellertestcase;

public class TellerFactorycalss {
	public WebDriver driver;
	
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://3.209.13.42:8080/app/#/weblogin");
			 driver.manage().window().maximize();

}
	 @Test
	 public void verifylogin() throws InterruptedException{
	 	
		 Loginpage vl=PageFactory.initElements(driver,Loginpage.class);
	 		vl.verifylogin();
	 	Thread.sleep(10000);
	 	}
	 
	 /*
	 @Test
	 public void pendingsurvey() throws InterruptedException{
	 	
		 pendingsurvey ps=PageFactory.initElements(driver,pendingsurvey.class);
	 		ps.verifyrespondentpage();
	 	Thread.sleep(15000);
	 	}
	 */
	 /*
	 @Test
	 public void verifypollster() throws InterruptedException,NoSuchElementException{
	 	
		 Tellertestcase pl=PageFactory.initElements(driver,Tellertestcase.class);
	 		pl.verifypollster();
	 	Thread.sleep(15000);
	 	}
	 */
	 @Test
	 public void verifytemplate() throws InterruptedException,NoSuchElementException{
	 	
		 Tellertemplate pl=PageFactory.initElements(driver,Tellertemplate.class);
	 		pl.verifytemplate();
	 	Thread.sleep(15000);
	 	}
}

