package oteller;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Logintest {
	public WebDriver driver;

	
/*	
@Test
 public void test() throws InterruptedException{
 
 System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail1 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail1.click();
	loginemail1.sendKeys("6379039922");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Ramya@12");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(5000);
	
	WebElement create =driver.findElement(By.xpath("//img[@src='assets/images/add-circle.png']"));
	 create.click();
	 Thread.sleep(5000);
	
			  		  
			  WebElement createnewsurvey = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
			  createnewsurvey.click(); 
			  Thread.sleep(8000);
		     /*
			  WebElement simplesurvey = driver .findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
			  )); simplesurvey.click(); Thread.sleep(5000);
			  */
			 
	        /*
			  WebElement surveyname = driver.findElement(By.xpath("//textarea[@id='Surveyname']"));
			  surveyname.click(); surveyname.sendKeys("ramya survey automation");
			  Thread.sleep(5000);
			  
			  WebElement surveydescription =driver.findElement(By.xpath("//textarea[@id='Surveydescription']"));
			  surveydescription.click();
			  surveydescription.sendKeys("ramya surveydescription automation");
			  Thread.sleep(5000);
			  /*
			  WebElement surveylogo3 =driver.findElement(By.xpath("//img[@alt='Add Logo']"));
			  surveylogo3.click(); 
			  surveylogo3.sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg ");
		      Thread.sleep(5000);
			  */
	/*
			  WebElement addimage =driver.findElement(By.xpath("//img[@id='AddQuestion']")); 
			  addimage.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addquestion =driver.findElement(By.xpath("//textarea[@id='question']"));
			  addquestion.click(); 
			  addquestion.sendKeys("where are u going");
			  Thread.sleep(5000);
			  
			  WebElement settings = driver.findElement(By.xpath("//div[@class='settings']//img"));
			  settings.click();
			  Thread.sleep(5000);
			  
			  WebElement multi = driver.findElement(By.
			  xpath("//div[@class='select none']//div[1]//img[1]")); 
			  multi.click();
			  Thread.sleep(5000);
			 
			  WebElement done =driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")); done.click(); Thread.sleep(5000);
			  WebElement addanswer1 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer1.click(); 
			  addanswer1.sendKeys("chennai");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus1 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus1.click(); Thread.sleep(5000);
			  
			  
			  WebElement addanswer10 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer10.click();
			  addanswer10.sendKeys("bangalore");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus2 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus2.click(); Thread.sleep(5000);
			  
			  WebElement addanswer2 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer2.click(); 
			  addanswer2.sendKeys("tirupathi");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus3 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus3.click();
			  Thread.sleep(5000);
			  
			  WebElement tickmark =driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']"));
			  tickmark.click(); 
			  Thread.sleep(5000);
			  
			  WebElement done2 =driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")); 
			  done2.click();
			  Thread.sleep(5000);
			  
			  WebElement addrespondentsurveyquestion =driver.findElement(By.xpath("//img[@id='Addr']"));
			  addrespondentsurveyquestion.click();
			  Thread.sleep(5000);
			  
			  WebElement addnewcontact =driver.findElement(By.xpath("//img[@id='Addcontact']"));
			  addnewcontact.click();
			  
			  WebElement addfirstname =driver.findElement(By.xpath("//input[@id='fname']"));
			  addfirstname.click();
			  addfirstname.sendKeys("ramya");

			  WebElement addlastname =driver.findElement(By.xpath("//input[@id='lname']"));
			  addlastname.click();
			  addlastname.sendKeys("kvn");

			  WebElement addmobileno =driver.findElement(By.xpath("//input[@id='mobile']"));
			  addmobileno.click();
			  addmobileno.sendKeys("6379039922");
			  
			  WebElement addcontactdone =driver.findElement(By.xpath("//img[@id='Addresp']"));
			  addcontactdone.click();
			  
			  /*
			  WebElement activesurvey =driver.findElement(By.xpath("//mat-card-title[@class='mat-card-title ng-tns-c7-13 en-US']"));
			  activesurvey.click();
			  			  
			  WebElement launch =driver.findElement(By.xpath("//img[@id='directlaunch']"));
			  launch.click();
			  }
			 	*/		  

/*
@Test
public void test1() throws InterruptedException{

System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail2 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail2.click();
	loginemail2.sendKeys("6379039922");

	WebElement loginpass2 = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass2.click();
	loginpass2.sendKeys("Ramya@12");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(5000);
	
	WebElement create2 =driver.findElement(By.xpath("//img[@src='assets/images/add-circle.png']"));
	 create2.click();
	 Thread.sleep(5000);
	
			  		  
			  WebElement createnewsurvey2 = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
			  createnewsurvey2.click(); 
			  Thread.sleep(8000);
			  /*
			  WebElement simplesurvey = driver .findElement(By.
			  xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
			  )); simplesurvey.click(); Thread.sleep(5000);
			  /*
			  WebElement surveylogo =
			  driver.findElement(By.xpath("//img[@alt='Add Logo']"));
			  surveylogo.click(); surveylogo.
			  sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg "
			  ); Thread.sleep(5000);
			  */
	/*
			  WebElement surveyname2 = driver.findElement(By.xpath("//textarea[@id='Surveyname']"));
			  surveyname2.click();
			  surveyname2.sendKeys("ramya survey2 automation");
			  Thread.sleep(5000);
			  
			  WebElement surveydescription2 =driver.findElement(By.xpath("//textarea[@id='Surveydescription']"));
			  surveydescription2.click();
			  surveydescription2.sendKeys("ramya surveydescription2 automation");
			  Thread.sleep(5000);
			  
			  
			  
			 	      
			  WebElement addimage2 =driver.findElement(By.xpath("//img[@id='AddQuestion']")); 
			  addimage2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addquestion2 =driver.findElement(By.xpath("//textarea[@id='question']"));
			  addquestion2.click(); 
			  addquestion2.sendKeys("where are u going");
			  Thread.sleep(5000);
			  
			  WebElement settings2 = driver.findElement(By.xpath("//div[@class='settings']//img"));
			  settings2.click();
			  Thread.sleep(5000);
			  
			  WebElement multi2 = driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")); 
			  multi2.click();
			  Thread.sleep(5000);
			  
			  /*
			  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
			  mandatory.click(); Thread.sleep(5000);
			  */
			  /*
			  WebElement done2 =driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")); 
			  done2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addanswer5 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer5.click(); 
			  addanswer5.sendKeys("chennai");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus5 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus5.click(); 
			  Thread.sleep(5000);
			  
			  
			  WebElement addanswer11 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer11.click();
			  addanswer11.sendKeys("bangalore");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus6 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus6.click(); Thread.sleep(5000);
			  
			  WebElement addanswer12 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer12.click(); 
			  addanswer12.sendKeys("tirupathi");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus7 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus7.click();
			  Thread.sleep(5000);
			  
			  WebElement tickmark2 =driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']"));
			  tickmark2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement done5 =driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")); 
			  done5.click();
			  Thread.sleep(5000);
			  
			  WebElement addrespondentsurveyquestion =driver.findElement(By.xpath("//img[@id='Addr']"));
			  addrespondentsurveyquestion.click();
			  Thread.sleep(5000);
			  
			  WebElement addrres =driver.findElement(By.xpath("//img[@id='addS']"));
			  addrres.click();
			  Thread.sleep(8000);
			  
	/*
			  WebElement searchrespondent =driver.findElement(((WebElement) By.cssSelector("//input[@placeholder='Search']")).sendKeys("ramya012"));
			  searchrespondent.click();
			  searchrespondent.sendKeys("ramya012");
			  Thread.sleep(5000);

			  		*/	
			  	/*	  
			  WebElement templatesearch2 =driver.findElement(By.xpath("//input[@placeholder='Search']")); 
			  templatesearch2.click();
			  templatesearch2.sendKeys("Ramyatemplateautomation");
			  Thread.sleep(5000);  
			
				  
			  WebElement ticck =driver.findElement(By.xpath("//ion-icon[@id='Tickrespondnet']"));
			  ticck.click();
			  			
			  WebElement addpastres =driver.findElement(By.xpath("//img[@src='src='assets/images/done.png']"));
			  addpastres.click();
			  
			  WebElement finaldone =driver.findElement(By.xpath("//img[@id='mobresp']"));
			  finaldone.click();
			  
			  WebElement finallaunch =driver.findElement(By.xpath("//img[@src='assets/images/send.png']"));
			  finallaunch.click();
			  
			  
			  WebElement activesurvey =driver.findElement(By.xpath("//mat-card-title[@class='mat-card-title ng-tns-c7-13 en-US']"));
			  activesurvey.click();
			  			  
			  WebElement launch =driver.findElement(By.xpath("//img[@id='directlaunch']"));
			  launch.click();
			  
			 			  
}

//From active survey -add question state to edit flow

@Test
public void test3() throws InterruptedException{

System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail3 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail3.click();
	loginemail3.sendKeys("6379039922");

	WebElement loginpass3 = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass3.click();
	loginpass3.sendKeys("Ramya@12");

	WebElement loginbutton3 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton3.click();
	
	Thread.sleep(5000);
	
	WebElement create3 =driver.findElement(By.xpath("//img[@src='assets/images/add-circle.png']"));
	create3.click();
	 Thread.sleep(5000);
	
			  		  
			  WebElement createnewsurvey3 = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
			  createnewsurvey3.click(); 
			  Thread.sleep(8000);
			  /*
			  WebElement simplesurvey = driver .findElement(By.
			  xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
			  )); simplesurvey.click(); Thread.sleep(5000);
			  /*
			  WebElement surveylogo =
			  driver.findElement(By.xpath("//img[@alt='Add Logo']"));
			  surveylogo.click(); surveylogo.
			  sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg "
			  ); Thread.sleep(5000);
			  */
	/*
			  WebElement surveyname3 = driver.findElement(By.xpath("//textarea[@id='Surveyname']"));
			  surveyname3.click();
			  surveyname3.sendKeys("ramyasurveyautomation");
			  Thread.sleep(5000);
			  
			  WebElement surveydescription3 =driver.findElement(By.xpath("//textarea[@id='Surveydescription']"));
			  surveydescription3.click();
			  surveydescription3.sendKeys("ramyasurveydescriptionautomation");
			  Thread.sleep(5000);
			  
			  
			  
			  WebElement addimage3 =driver.findElement(By.xpath("//img[@id='AddQuestion']")); 
			  addimage3.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addquestion3 =driver.findElement(By.xpath("//textarea[@id='question']"));
			  addquestion3.click(); 
			  addquestion3.sendKeys("where are u going");
			  Thread.sleep(5000);
			  
			  
			  WebElement closebutton =driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']")); 
			  closebutton.click(); 
			  Thread.sleep(5000);
			  
			  
			  WebElement closebuttonpopup =driver.findElement(By.xpath("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']")); 
			  closebuttonpopup.click(); 
			  Thread.sleep(5000);
			  
			  
			// Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();	
			  }
			*/ 
			  	  
	/*
@Test
public void test4() throws InterruptedException{

System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail2 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail2.click();
	loginemail2.sendKeys("6379039922");

	WebElement loginpass2 = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass2.click();
	loginpass2.sendKeys("Ramya@12");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(5000);
	
	WebElement create2 =driver.findElement(By.xpath("//img[@src='assets/images/add-circle.png']"));
	 create2.click();
	 Thread.sleep(5000);
	
			  		  
			  WebElement createnewsurvey2 = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
			  createnewsurvey2.click(); 
			  Thread.sleep(8000);
			  
			  WebElement simplesurvey = driver .findElement(By.
			  xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
			  )); simplesurvey.click(); Thread.sleep(5000);
			
	
			  WebElement surveyname2 = driver.findElement(By.xpath("//textarea[@id='Surveyname']"));
			  surveyname2.click();
			  surveyname2.sendKeys("ramyasurveyautomation");
			  Thread.sleep(5000);
			  
			  WebElement surveydescription2 =driver.findElement(By.xpath("//textarea[@id='Surveydescription']"));
			  surveydescription2.click();
			  surveydescription2.sendKeys("ramyasurveydescriptionautomation");
			  Thread.sleep(5000);
			  
			  WebElement addimage2 =driver.findElement(By.xpath("//img[@id='AddQuestion']")); 
			  addimage2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addquestion2 =driver.findElement(By.xpath("//textarea[@id='question']"));
			  addquestion2.click(); 
			  addquestion2.sendKeys("where are u going");
			  Thread.sleep(5000);
			  
			  WebElement settings2 = driver.findElement(By.xpath("//div[@class='settings']//img"));
			  settings2.click();
			  Thread.sleep(5000);
			  
			  WebElement multi2 = driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")); 
			  multi2.click();
			  Thread.sleep(5000);
			  
			  /*
			  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
			  mandatory.click(); Thread.sleep(5000);
			  */
			  /*
			  WebElement done2 =driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")); 
			  done2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement addanswer5 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer5.click(); 
			  addanswer5.sendKeys("chennai");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus5 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus5.click(); 
			  Thread.sleep(5000);
			  
			  
			  WebElement addanswer11 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer11.click();
			  addanswer11.sendKeys("bangalore");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus6 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus6.click(); Thread.sleep(5000);
			  
			  WebElement addanswer12 =driver.findElement(By.xpath("//textarea[@id='options']"));
			  addanswer12.click(); 
			  addanswer12.sendKeys("tirupathi");
			  Thread.sleep(5000);
			  
			  
			  WebElement plus7 =driver.findElement(By.xpath("//img[@id='Addoption']"));
			  plus7.click();
			  Thread.sleep(5000);
			  
			  WebElement tickmark2 =driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']"));
			  tickmark2.click(); 
			  Thread.sleep(5000);
			  
			  WebElement done5 =driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")); 
			  done5.click();
			  Thread.sleep(5000);
			  
			  
			  
			  WebElement savelater=driver.findElement(By.xpath("//img[@src='assets/images/later.png']"));
			  done5.click();
			  Thread.sleep(5000);
			  
}

*/





@Test
public void test5() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail3 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail3.click();
	loginemail3.sendKeys("6379039922");

	WebElement loginpass3 = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass3.click();
	loginpass3.sendKeys("Test@123");

	WebElement loginbutton3 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton3.click();
	Thread.sleep(5000);
	
	WebElement more = driver.findElement(By.xpath("//strong[contains(text(),'More')]"));
	more.click();
	Thread.sleep(5000);
			
	WebElement managetemplate = driver.findElement(By.xpath("//h4[contains(text(),'Manage Template')]"));
	managetemplate.click();
	Thread.sleep(5000);
		
	WebElement addtemplate = driver.findElement(By.xpath("//img[@id='addtem']"));
	addtemplate.click();
	Thread.sleep(5000);
		
	WebElement simplesurvey = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
	simplesurvey.click();
	Thread.sleep(5000);
		
	WebElement surveyname4 = driver.findElement(By.xpath("//textarea[@id='Surveyname']"));
	surveyname4.click();
	surveyname4.sendKeys("Simple overall feedback questionnaire");
	  Thread.sleep(5000);
	  
	  WebElement surveydescription4 =driver.findElement(By.xpath("//textarea[@id='Surveydescription']"));
	  surveydescription4.click();
	  surveydescription4.sendKeys("Outpatient Feedback survey");
	  Thread.sleep(5000);
	  
	  WebElement addimage4 =driver.findElement(By.xpath("//img[@id='AddQuestion']")); 
	  addimage4.click(); 
	  Thread.sleep(5000);
	  
	  WebElement addquestion4 =driver.findElement(By.xpath("//textarea[@id='question']"));
	  addquestion4.click(); 
	  addquestion4.sendKeys("Ambience");
	  Thread.sleep(5000);
	  
	  WebElement settings3 = driver.findElement(By.xpath("//div[@class='settings']//img"));
	  settings3.click();
	  Thread.sleep(5000);
	  
	  WebElement multi3 = driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")); 
	  multi3.click();
	  Thread.sleep(5000);
	  /*
	  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
	  mandatory.click(); Thread.sleep(5000);
	  */
	  WebElement done3 =driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")); 
	  done3.click(); 
	  Thread.sleep(5000);
	  
	  WebElement addanswer13 =driver.findElement(By.xpath("//textarea[@id='options']"));
	  addanswer13.click(); 
	  addanswer13.sendKeys("Excellent");
	  Thread.sleep(5000);
	  
	  
	  WebElement plus10 =driver.findElement(By.xpath("//img[@id='Addoption']"));
	  plus10.click(); 
	  Thread.sleep(5000);
	  
	  
	  WebElement addanswer14 =driver.findElement(By.xpath("//textarea[@id='options']"));
	  addanswer14.click();
	  addanswer14.sendKeys("Good");
	  Thread.sleep(5000);
	  
	  
	  WebElement plus11 =driver.findElement(By.xpath("//img[@id='Addoption']"));
	  plus11.click(); Thread.sleep(5000);
	  
	  WebElement addanswer15 =driver.findElement(By.xpath("//textarea[@id='options']"));
	  addanswer15.click(); 
	  addanswer15.sendKeys("Ok");
	  Thread.sleep(5000);
	  
	  
	  WebElement plus16 =driver.findElement(By.xpath("//img[@id='Addoption']"));
	  plus16.click();
	  Thread.sleep(5000);
	  
	  WebElement addanswer16 =driver.findElement(By.xpath("//textarea[@id='options']"));
	  addanswer15.click(); 
	  addanswer15.sendKeys("Bad");
	  Thread.sleep(5000);
	  
	  
	  WebElement plus17 =driver.findElement(By.xpath("//img[@id='Addoption']"));
	  plus16.click();
	  Thread.sleep(5000);
	  
	  WebElement addanswer17 =driver.findElement(By.xpath("//textarea[@id='options']"));
	  addanswer15.click(); 
	  addanswer15.sendKeys("Bad");
	  Thread.sleep(5000);
	  
	  
	  WebElement plus18 =driver.findElement(By.xpath("//img[@id='Addoption']"));
	  plus16.click();
	  Thread.sleep(5000);
	  
	  
	  WebElement tickmark5 =driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']"));
	  tickmark5.click(); 
	  Thread.sleep(5000);
	  
	  WebElement done7 =driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")); 
	  done7.click();
	  Thread.sleep(5000);
	  
	  WebElement savetemplate =driver.findElement(By.xpath("//img[@src='assets/images/save.png']")); 
	  savetemplate.click();
	  Thread.sleep(5000);  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
	
	   /* 
	  WebElement templatesearch1 =driver.findElement(By.xpath("//input[@placeholder='Search']")); 
	  templatesearch1.click();
	  templatesearch1.sendKeys("Ramyatemplateautomation");
	  Thread.sleep(5000);  
	
	/*   	    
	  WebElement templatesearch =driver.findElement(By.xpath("//ion-icon[@name='search']")); 
	  templatesearch.click();
	  templatesearch.sendKeys("Ramyatemplateautomation");
	  Thread.sleep(5000);  
	
	   	*/  	
	  /*
	  WebElement templatecard =driver.findElement(By.xpath("//b[contains(text(),'Survey:Ramyatemplateautomation')]")); 
	  templatecard.click();
	  Thread.sleep(5000);  
	
	  WebElement view=driver.findElement(By.xpath("//img[@id='viewtemp']")); 
	  view.click();
	  Thread.sleep(5000); 
	  
	  WebElement updatetemplate=driver.findElement(By.xpath("//ion-icon[@name='create']")); 
	  updatetemplate.click();
	  Thread.sleep(5000); 
	  
	  WebElement saveupdate=driver.findElement(By.xpath("//img[@src='assets/images/save.png']")); 
	  saveupdate.click();
	  Thread.sleep(5000); 
	  

	  WebElement usetemplate=driver.findElement(By.xpath("//img[@id='usetemplate']")); 
	  usetemplate.click();
	  Thread.sleep(9000); 
	  
	  WebElement addred=driver.findElement(By.xpath("//img[@id='viewaddres']")); 
	  addred.click();
	  Thread.sleep(5000); 
	  
	  WebElement adcontact=driver.findElement(By.xpath("//img[@id='Addcontact']")); 
	  adcontact.click();
	  Thread.sleep(5000); 
	  
	  WebElement ffname=driver.findElement(By.xpath("//input[@id='fname']")); 
	  ffname.click();
	  Thread.sleep(5000);
	  
	  WebElement llname=driver.findElement(By.xpath("//input[@id='lname']")); 
	  llname.click();
	  Thread.sleep(5000);
	  
	  
	  WebElement mmobile=driver.findElement(By.xpath("//input[@id='mobile']")); 
	  mmobile.click();
	  Thread.sleep(5000);
	  
	  
	  WebElement aadd=driver.findElement(By.xpath("//img[@id='Addresp']")); 
	  aadd.click();
	  Thread.sleep(5000);
	  
	  WebElement Ffinaldone=driver.findElement(By.xpath("//img[@id='mobresp']")); 
	  Ffinaldone.click();
	  Thread.sleep(5000);	
	  
	  
	  WebElement Ffinallaunch=driver.findElement(By.xpath("//img[@src='assets/images/send.png']")); 
	  Ffinallaunch.click();
	  Thread.sleep(5000);	
	  
	  
	  
}
	
	



/*
@Test
public void test1() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/webLogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail2 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail2.click();
	loginemail2.sendKeys("+911111111115");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Test@123");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(8000);
	
}


@Test
public void test2() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/webLogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail3 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail3.click();
	loginemail3.sendKeys("+911111111111");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Test@123");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(12000);

}

@Test
public void test3() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/webLogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail4 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail4.click();
	loginemail4.sendKeys("+911111111112");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Test@123");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	Thread.sleep(20000);

	
}


@Test
public void test4() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/webLogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail5 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail5.click();
	loginemail5.sendKeys("+911111111113");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Test@123");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(25000);

}



@Test
public void test5() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/webLogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement loginemail6 = driver.findElement(By.xpath("//input[@id='email']"));

	loginemail6.click();
	loginemail6.sendKeys("+911111111114");

	WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

	loginpass.click();
	loginpass.sendKeys("Test@123");

	WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
	loginbutton2.click();
	
	Thread.sleep(30000);
}




*/




@BeforeTest
public void beforeTest() {

	System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://3.209.13.42:8080/app/#/weblogin");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	// driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
}