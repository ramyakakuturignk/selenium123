package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import testcases.Appointments;
import testcases.Diagnosispage;
import testcases.MyTime;
import testcases.OutPatientpage;

public class BrowserFactory {
	public WebDriver driver;
	
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://192.168.1.18:8080/cv21/index.html");
			 driver.manage().window().maximize();

}

@Test
public void verifyloginpage() throws InterruptedException{
			
	LoginPage lo= PageFactory.initElements(driver,LoginPage.class);
	lo.verifyseach();

	Thread.sleep(5000);
}
@Test
public void verifyoutpatientpage() throws InterruptedException{
	
	OutPatientpage ot=PageFactory.initElements(driver,OutPatientpage.class);
		ot.verifyoutpatientpage();
	Thread.sleep(15000);
	}
@Test
public void verifyoutpatientpage1() throws InterruptedException{
	
	OutPatientpage st=PageFactory.initElements(driver,OutPatientpage.class);
		st.verifyStartpage();
	Thread.sleep(5000);
	}
/*
@Test
public void verifybasicdetailspage() throws InterruptedException{
	
	Diagnosispage bd=PageFactory.initElements(driver,Diagnosispage.class);
		bd.verifybasicdetailspage();
	
	}

@Test
public void verifyprescription() throws InterruptedException{
	
	Diagnosispage pre=PageFactory.initElements(driver,Diagnosispage.class);
		pre.verifyprescription();
	Thread.sleep(5000);
	}
@Test
public void verifylabtest() throws InterruptedException{
	Diagnosispage lab=PageFactory.initElements(driver,Diagnosispage.class);
	lab.verifylabtest();
	Thread.sleep(5000);
}
*/

@Test
public void verifyappointmentpage(){
	Appointments ap=PageFactory.initElements(driver, Appointments.class);
	ap.verifyappointmentpage();
}
@Test
public void verifySearchfields(){
	MyTime time=PageFactory.initElements(driver,MyTime.class);
	time.verifySearchfields();
}

}