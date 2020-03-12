package tetscase;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;



//import pages2.Loginpage;
public class Tellertestcase {
		
	 public  static WebDriver driver=null;
	  
	 public Tellertestcase(WebDriver driver)
		{
		
			this.driver= driver;
			
		}
	 
	 /*
	 @FindBy(xpath="//input[@id='email']")WebElement email;

	    
		@FindBy(xpath="//input[@id='pass']")WebElement password;
		//*[@id="rowcontent"]/app-home/div/div[2]/div/div[1]/b
		
		@FindBy(xpath="//button[@id='login']")WebElement Login;
	*/
	
		@FindBy(xpath="//img[@src='assets/images/add-circle.png']")WebElement create;
		
		
				  		  
		//@FindBy(xpath="//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]")WebElement createnewsurvey456;
				  
			     
		 @FindBy(xpath="//span[contains(text(),'Polling Survey is a Voting Survey with only 1 ques')]")WebElement simplesurvey5;
				  
				  
				 
		        
		@FindBy(xpath="//textarea[@id='Surveyname']")WebElement surveyname;
				 
				 
				  
		@FindBy(xpath="//textarea[@id='Surveydescription']")WebElement surveydescription;
				 
				
				  /*
				  WebElement surveylogo3 =driver.findElement(By.xpath("//img[@alt='Add Logo']"));
				  surveylogo3.click(); 
				  surveylogo3.sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg ");
			      Thread.sleep(5000);
				  */
		@FindBy(xpath="//img[@id='AddQuestion']")WebElement addimage; 
				  
				 
				  
		@FindBy(xpath="//textarea[@id='question']")WebElement addquestion; 
				 
				 
		 @FindBy(xpath="//div[@class='settings']//img")WebElement settings;
				  
				
				  
		 @FindBy(xpath="//div[@class='select none']//div[1]//img[1]")WebElement multi; 
				 
				 
		 @FindBy(xpath="//div[@class='rowfooter none']//div[3]//img[1]")WebElement done;
		 
		 @FindBy(xpath="//textarea[@id='options']")WebElement addanswer1;
				  
		  	  
		 @FindBy(xpath="//img[@id='Addoption']")WebElement plus1;
				 
		 			  
		 @FindBy(xpath="//textarea[@id='options']")WebElement addanswer10;
				  
				
				  
		 @FindBy(xpath="//img[@id='Addoption']")WebElement plus2;
				 
		 @FindBy(xpath="//textarea[@id='options']")WebElement addanswer2;
				 
				  
				  
				  
		 @FindBy(xpath="//img[@id='Addoption']")WebElement plus3;
				 
			
				  
		 @FindBy(xpath="//img[@src='assets/images/cancel.png']")WebElement tickmark;
				 
				
				  
		 @FindBy(xpath="//img[@src='assets/images/correct.png']")WebElement done2;
				 
				 
		  
		 @FindBy(xpath="//img[@id='Addr']")WebElement addrespondentsurveyquestion;
				 
				  
			  
		 @FindBy(xpath="//img[@id='Addcontact']")WebElement addnewcontact;
				 
				  
		 @FindBy(xpath="//input[@id='fname']")WebElement addfirstname;
				 
		 @FindBy(xpath="//input[@id='lname']")WebElement addlastname;
				 
    	 @FindBy(xpath="//input[@id='mobile']")WebElement addmobileno;
				 
		 @FindBy(xpath="//img[@id='Addresp']")WebElement addcontactdone;
				 
				  
				  /*
				  WebElement activesurvey =driver.findElement(By.xpath("//mat-card-title[@class='mat-card-title ng-tns-c7-13 en-US']"));
				  activesurvey.click();
				  			  
				  WebElement launch =driver.findElement(By.xpath("//img[@id='directlaunch']"));
				  launch.click();
				  */
	

public void verifypollster(){
	
	//email.click();
	//email.sendKeys("6379039922");
	//password.click();
	//password.sendKeys("Ramya@12");
	//Login.click();
	create.click();
	//createnewsurvey456.click();
	simplesurvey5.click(); 
	 surveyname.click();
	 surveyname.sendKeys("ramya survey automation");
	 surveydescription.click();
	 surveydescription.sendKeys("ramya surveydescription automation");
	 addimage.click();
	 addquestion.click(); 
	 addquestion.sendKeys("where are u going");
	settings.click();
	 multi.click();
	done.click();
	addanswer1.click(); 
	 addanswer1.sendKeys("chennai");
	 plus1.click();
	addanswer10.click();
	addanswer10.sendKeys("bangalore");
	 plus2.click(); 			  
	 addanswer2.click(); 
	 addanswer2.sendKeys("tirupathi");		  
	 plus3.click();	  
	 tickmark.click();   
	 done2.click();
	 addrespondentsurveyquestion.click();
	 addnewcontact.click();
	 addfirstname.click();
	 addfirstname.sendKeys("ramya");
     addlastname.click();
	 addlastname.sendKeys("kvn");
	 addmobileno.click();
	 addmobileno.sendKeys("6379039922");
	 addcontactdone.click();
				   
}
}