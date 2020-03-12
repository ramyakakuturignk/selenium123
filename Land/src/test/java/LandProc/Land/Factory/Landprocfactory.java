package LandProc.Land.Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LandProc.Land.login.Landproclogin;
import LandProc.Land.testcases.LandProctestcases;

//import login.LoginPage;


public class Landprocfactory {
	public WebDriver driver;
	
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://3.209.13.42:8080/landproc/#/login");
			 driver.manage().window().maximize();

}

@Test
public void verifyloginpage() throws InterruptedException{
			
	Landproclogin lo= PageFactory.initElements(driver,Landproclogin.class);
	lo.verifyloginpage();

	Thread.sleep(8080);
}

@Test
public void verifyrequestsurveypage() throws InterruptedException{
			
	LandProctestcases rs=PageFactory.initElements(driver,LandProctestcases.class);
 rs.verifyrequestsurveypage();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	Thread.sleep(5000);
}

}
