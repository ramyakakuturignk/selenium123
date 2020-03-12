package factorypatient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Patientpages.Patientloginpage;
import Patienttestcases.DiagnosisPage;
import Patienttestcases.MyDocumentspage;
import Patienttestcases.Patientappointmentpage;
import pages.LoginPage;

public class BrowserPatientFactory {

	
	public WebDriver driver;
	
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://192.168.1.18:8080/av14/index.html");
			 driver.manage().window().maximize();

}
	 @Test
	 public void verifyloginpage() throws InterruptedException{
	 			
		 Patientloginpage plo= PageFactory.initElements(driver,Patientloginpage.class);
	 	plo.verifyseach();

	 	Thread.sleep(5000);
	 }
	 @Test
	 public void verifypatientappointmentpage() throws InterruptedException{
		 Patientappointmentpage ap= PageFactory.initElements(driver,Patientappointmentpage.class);
         ap.verifypatientappointmentpage();
         Thread.sleep(5000);
	 }
	 @Test
	 public void verifypatientappointmentpage1() throws InterruptedException{
		 Patientappointmentpage sa= PageFactory.initElements(driver,Patientappointmentpage.class);
         sa.verifypatientappointmentpage1();
         Thread.sleep(9000);
         }
	 //appointment
	 @Test 
		public void verifyscheduledfuturepage() throws InterruptedException{
			Patientappointmentpage sf=PageFactory.initElements(driver,Patientappointmentpage.class);
			sf.verifyscheduledfuturepage();
			Thread.sleep(5000);
		}
	 
	 @Test 
		public void verifyscheduledfuturepage1() throws InterruptedException{
			Patientappointmentpage sf1=PageFactory.initElements(driver,Patientappointmentpage.class);
			sf1.verifyscheduledfuturepage();
			Thread.sleep(5000);
		}
	 
	 
	 @Test 
		public void verifybookappointment() throws InterruptedException{
			Patientappointmentpage ba=PageFactory.initElements(driver,Patientappointmentpage.class);
			ba.verifybookappointment();
			Thread.sleep(5000);
		}
	 
	 
	 @Test 
		public void verifyappointment1() throws InterruptedException{
			Patientappointmentpage a1=PageFactory.initElements(driver,Patientappointmentpage.class);
			a1.verifypatientappointmentpage();
			Thread.sleep(5000);
		}
	 
	
	
	 @Test 
		public void verifypastappointment() throws InterruptedException{
			Patientappointmentpage pa=PageFactory.initElements(driver,Patientappointmentpage.class);
			pa.verifypastappointment();
			Thread.sleep(5000);
		}	
	 
	
	
	
	 
	 
	@Test 
	public void verifydiagnosisPage(){
		DiagnosisPage pd=PageFactory.initElements(driver,DiagnosisPage.class);
		pd.verifydiagnosispage();
	}
	 
	
	@Test 
	public void verifymydocumentsPage(){
		MyDocumentspage pd=PageFactory.initElements(driver,MyDocumentspage.class);
		pd.verifymydocumentspage();
	}
	 
	@Test 
	public void verifyprescriptionpage(){
		MyDocumentspage pd=PageFactory.initElements(driver,MyDocumentspage.class);
		pd.verifyprescriptionpage();
	}
	@Test 
	public void verifyviewmedicinePage(){
		MyDocumentspage pd=PageFactory.initElements(driver,MyDocumentspage.class);
		pd.verifyviewmedicinepage();
	}
	
	@Test 
	public void verifydocument1(){
		MyDocumentspage d1=PageFactory.initElements(driver,MyDocumentspage.class);
		d1.verifydocument1();
	}
	
	@Test 
	public void verifymylabreport(){
		MyDocumentspage ml=PageFactory.initElements(driver,MyDocumentspage.class);
		ml.verifymylabreport();
	}
	
	
	
	@Test 
	public void verifyviewdetails(){
		MyDocumentspage vd=PageFactory.initElements(driver,MyDocumentspage.class);
		vd.verifyviewdetails();
	}
}
