package tetscase;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Tellertemplate {

	
 public  static WebDriver driver=null;
  
 public Tellertemplate(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
 
// 
 
    @FindBy(xpath="//strong[contains(text(),'More')]")WebElement more;
	
	
			
	@FindBy(xpath="//h4[contains(text(),'Manage Template')]")WebElement managetemplate;
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@FindBy(xpath="//img[@id='addtem']")WebElement addtemplate1;
	

	 //WebDriver wait1.until(ExpectedConditions.visibilityOf(Add Template));
	   
	@FindBy(xpath="//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]")WebElement simplesurvey;
	
	
		
	@FindBy(xpath="//textarea[@id='Surveyname']")WebElement surveyname4;
	
	  
	  
	  @FindBy(xpath="//textarea[@id='Surveydescription']")WebElement surveydescription4;
	  
	
	  
	  @FindBy(xpath="//img[@id='AddQuestion']")WebElement addimage4;
	 
	
	  @FindBy(xpath="//textarea[@id='question']")WebElement addquestion4;
	 
	  
	  
	  @FindBy(xpath="//div[@class='settings']//img")WebElement settings3;
	 
	 
	  
	  @FindBy(xpath="//div[@class='select none']//div[1]//img[1]")WebElement multi3;
	 
	  
	  /*
	  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
	  mandatory.click(); Thread.sleep(5000);
	  */
	  @FindBy(xpath="//div[@class='rowfooter none']//div[3]//img[1]")WebElement done3;
	 
	  
	  
	  
	  @FindBy(xpath="//textarea[@id='options']")WebElement addanswer13;
	  
	  
	  
	  
	  @FindBy(xpath="//img[@id='Addoption']")WebElement plus10;
	 
	  
	  
	  
	  @FindBy(xpath="//textarea[@id='options']")WebElement addanswer14;
	 
	  
	  
	  
	  @FindBy(xpath="//img[@id='Addoption']")WebElement plus11;
	
	  
	  @FindBy(xpath="//textarea[@id='options']")WebElement addanswer15;
	 
	  
	  
	  
	  @FindBy(xpath="//img[@id='Addoption']")WebElement plus16;
	 

	  
	  @FindBy(xpath="//img[@src='assets/images/cancel.png']")WebElement tickmark5;
	  
	  
	  
	  @FindBy(xpath="//img[@src='assets/images/correct.png']")WebElement done7;
	 
	  
	  
	  @FindBy(xpath="//img[@src='assets/images/save.png']")WebElement savetemplate; 
	  
	  

	    
	  @FindBy(xpath="//input[@placeholder='Search']")WebElement templatesearch1; 
	 
	  
	
	/*   	    
	  WebElement templatesearch =driver.findElement(By.xpath("//ion-icon[@name='search']")); 
	  templatesearch.click();
	  templatesearch.sendKeys("Ramyatemplateautomation");
	  Thread.sleep(5000);  
	
	   	*/  	  
	  @FindBy(xpath="//b[contains(text(),'Survey:Ramyatemplateautomation')]")WebElement templatecard;
	 
	  
	
	  @FindBy(xpath="//img[@id='viewtemp']")WebElement view;
	 

	 
	  @FindBy(xpath="//ion-icon[@name='create']")WebElement updatetemplate;
	 
	 
	  
	  @FindBy(xpath="//img[@src='assets/images/save.png']")WebElement saveupdate;
	
	 
	  

	  @FindBy(xpath="//img[@id='usetemplate']")WebElement usetemplate; 
	
	  
	  @FindBy(xpath="//img[@id='viewaddres']")WebElement addred; 
	 
	 
	  
	  @FindBy(xpath="//img[@id='Addcontact']")WebElement adcontact;
	 
	  
	  @FindBy(xpath="//input[@id='fname']")WebElement ffname;
	 
	
	  
	  @FindBy(xpath="//input[@id='lname']")WebElement llname;
	 
	 
	  
	  
	  @FindBy(xpath="//input[@id='mobile']")WebElement mmobile; 
	
	  
	  
	  @FindBy(xpath="//img[@id='Addresp']")WebElement aadd;
	 

	  
	  @FindBy(xpath="//img[@id='mobresp']")WebElement Ffinaldone;
	 
	 
	  
	  
	  @FindBy(xpath="//img[@src='assets/images/send.png']")WebElement Ffinallaunch; 
	 
	 	
	 
	   public void verifytemplate(){
		   
		      more.click(); 
		      managetemplate.click();
		      addtemplate1.click();
			  simplesurvey.click();
			  surveyname4.click();
			  surveyname4.sendKeys("ramyatemplateautomation");
			  surveydescription4.click();
			  surveydescription4.sendKeys("ramyatemplatedescriptionautomation");
			  addimage4.click(); 
			  addquestion4.click(); 
			  addquestion4.sendKeys("Overall,how polite were the hotel staff members ");
			  settings3.click();
			  multi3.click();
			  done3.click(); 
			  addanswer13.click(); 
			  addanswer13.sendKeys("Extremely polite");
			  plus10.click(); 
			  addanswer14.click();
			  addanswer14.sendKeys("Quite polite");
			  plus11.click(); 
			  addanswer15.click(); 
			  addanswer15.sendKeys("not at all polite");
			  plus16.click();
			  tickmark5.click();
			  done7.click();
			  savetemplate.click();
			  templatesearch1.click();
			  templatesearch1.sendKeys("Ramyatemplateautomation");
			  templatecard.click();
			  view.click();
			  updatetemplate.click();
			  saveupdate.click();
			  usetemplate.click();
			  addred.click();
			  adcontact.click();
			  ffname.click();
			  llname.click();
			  mmobile.click();
			  aadd.click();
			  Ffinaldone.click();
			  Ffinallaunch.click();
		   
		  
		   
				   
		 
		   
		  
		   
	   }
 
 
 
 
 
 
 
 
 
 
 
}
