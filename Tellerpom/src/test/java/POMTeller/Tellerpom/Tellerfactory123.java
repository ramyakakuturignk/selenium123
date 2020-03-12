package POMTeller.Tellerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tellerpages123.loginpageforoteller;
import Otellertestcases.tellertestcases123;
import Otellertestcases.privatesurvey;
import Otellertestcases.publicapprovesurvey;
import Otellertestcases.publicrejectsurvey;
import Otellertestcases.publicsurveywithquestions;
import Otellertestcases.pendingsurvey;
import Otellertestcases.activesurveyfilter;

public class Tellerfactory123 {
	
	public WebDriver driver;
	
	tellertestcases123 cq;
	tellertestcases123 pq;


	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://app.oteller.in/app/#/weblogin");
			 driver.navigate().refresh();
			 driver.manage().window().maximize();

}

@Test
public void verifyotellerlogin() throws InterruptedException{
			
	loginpageforoteller lo1= PageFactory.initElements(driver,loginpageforoteller.class);
lo1.verifyotellerloginpage();
	Thread.sleep(5000);
}

@Test
public void createquestions() throws InterruptedException{
	tellertestcases123 cq= PageFactory.initElements(driver,tellertestcases123.class);
		cq.createquestions();
		Thread.sleep(8000);
		
}

@Test
public void addrespondentflow() throws InterruptedException{
	privatesurvey ar= PageFactory.initElements(driver,privatesurvey.class);
	cq.createquestions();
	ar.addrespondentflow();
		Thread.sleep(5000);
}
@Test
public void publicquestions() throws InterruptedException{
	publicsurveywithquestions pq= PageFactory.initElements(driver,publicsurveywithquestions.class);
		pq.publicquestions();
		Thread.sleep(5000);
}
@Test
public void publicapprove() throws InterruptedException{
	publicapprovesurvey pa= PageFactory.initElements(driver,publicapprovesurvey.class);
	
	pa.publicapprove();
	Thread.sleep(5000);
}
/*
@Test
public void publicreject() throws InterruptedException{
	publicrejectsurvey pr=PageFactory.initElements(driver,publicrejectsurvey.class);
	pr.publicreject();
	Thread.sleep(5000);

}*/
@Test
public void pending() throws InterruptedException{
	pendingsurvey ps=PageFactory.initElements(driver,pendingsurvey.class);
	ps.pending();
	Thread.sleep(5000);

}

public void filter()  throws InterruptedException{
	activesurveyfilter pf=PageFactory.initElements(driver,activesurveyfilter.class);
	pf.filter();
	Thread.sleep(5000);
}
}
