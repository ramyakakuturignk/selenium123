package Teller.Tellerwebapp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class schedulepublicsurvey {
	
			public WebDriver driver;
			
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		@Test
		public void Tellerlogin5()throws  InterruptedException,NullPointerException{

		    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
		    WebElement loginemail=driver.findElement(By.xpath("//input[@id='email']"));

		    loginemail.click();
		    loginemail.sendKeys("6379039922");
			
				
		    WebElement loginpwd=driver.findElement(By.xpath("//input[@id='pass']"));
		    loginpwd.click();
		    loginpwd.sendKeys("Test@123");
	      WebElement loginbutton=driver.findElement(By.xpath("//button[@id='login']"));
	      loginbutton.click();
		    Thread.sleep(5000);
	      
		    WebElement poll=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
		    poll.click();
		    Thread.sleep(5000);
		    
		    WebElement create=driver.findElement(By.xpath("//mat-icon[contains(text(),'post_add')]"));
		    create.click();
		    Thread.sleep(5000);
		    
		    WebElement simple=driver.findElement(By.xpath("//strong[contains(text(),'Simple Survey')]"));
		    simple.click();
		    Thread.sleep(5000);
		    
		    WebElement surveyexposurepublic=driver.findElement(By.xpath("//span[@class='pub']"));
		    surveyexposurepublic.click();
		    Thread.sleep(5000);
		    
		    WebElement name=driver.findElement(By.xpath("//textarea[@id='sname']"));
		    name.sendKeys("ramyaschedulepublicsurvey");
		    Thread.sleep(5000);
		    
		    WebElement description=driver.findElement(By.xpath("//textarea[@id='description']"));
		    description.sendKeys("ramyadescription");
		    Thread.sleep(5000);
		    
		    WebDriverWait wait = new WebDriverWait(driver, 10);	    
		    WebElement addquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
		    addquestion.click();
		    Thread.sleep(5000);
		    
		   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
		   
		    WebDriverWait wait1 = new WebDriverWait(driver, 10);
		    WebElement enterquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
		    enterquestion.sendKeys("Android Smart Phone - 16GB");
		    Thread.sleep(5000); 
		    
		    
		    WebElement settings=driver.findElement(By.xpath("//ion-icon[@name='settings']"));
		    settings.click();
		    Thread.sleep(5000);
		    
		    WebElement multi=driver.findElement(By.xpath("//ion-icon[@name='done-all']"));
		    multi.click();
		    Thread.sleep(5000);
		    
		      
		    
		    WebElement mandatory=driver.findElement(By.xpath("//ion-icon[@name='alert']"));
		    mandatory.click();
		    Thread.sleep(5000);
		    
		    WebElement ok=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
		    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
		    ok.click();
		    Thread.sleep(5000);
		    
		    WebElement answer1=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
		    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

		    answer1.sendKeys("yes");
		    Thread.sleep(5000);
		    
		    WebElement plus=driver.findElement(By.xpath("//img[@id='Addoption']"));
		    plus.click();
		    Thread.sleep(5000);
		    
		    WebElement answer2=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
		    answer2.sendKeys("no");
		    Thread.sleep(5000);
		    
		    WebElement plus2=driver.findElement(By.xpath("//img[@id='Addoption']"));
		    plus2.click();
		    Thread.sleep(5000);
		    
		    WebElement answer3=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
		    answer3.sendKeys("ok");
		    Thread.sleep(5000);
		    
		    WebElement plus3=driver.findElement(By.xpath("//img[@id='Addoption']"));
		    plus3.click();
		    Thread.sleep(5000);
		    
		    WebElement answer4=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
		    answer4.sendKeys("ok");
		    Thread.sleep(5000);
		    	        	    
		    WebElement cross=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
		    cross.click();
		    Thread.sleep(5000);
		    
		    WebElement select1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
		    select1.click();
		    Thread.sleep(5000);
		    
		      		   
		 		    
		    WebElement schedule=driver.findElement(By.xpath("//ion-icon[@name='time']"));
		    schedule.click();
		    Thread.sleep(5000);
		    
		    WebElement launchdate=driver.findElement(By.xpath("//input[@placeholder='Launch Date']"));
		    launchdate.click();
		    Thread.sleep(5000);
		    
		    WebElement date=driver.findElement(By.xpath("//td[@class='owl-dt-calendar-cell owl-dt-day-2 owl-dt-calendar-cell-active ng-star-inserted']"));
		    date.click();
		    Thread.sleep(5000);
		    
		    	    
		    WebElement set=driver.findElement(By.xpath("//span[contains(text(),'Set')]"));
		    set.click();
		    Thread.sleep(5000);
		    
		    WebElement saveicon4=driver.findElement(By.xpath("//ion-icon[@name='save']"));
		    saveicon4.click();
		    Thread.sleep(5000);
		  
		 
			
		
		
		    
		 
		 
		   
		
		    /*
		   // WebElement done=driver.findElement(By.xpath("//ion-label[text()='Done']"));
		    WebElement done2=driver.findElement(By.xpath("//ion-icon[@name='checkbox-outline']"));
		    done2.click();
		    Thread.sleep(5000);
		     */   	     
		    
		    
		}
		
		@BeforeTest
		public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://3.209.13.42:8080/app/#/webLogin");
			 driver.manage().window().maximize();
			 driver.navigate().refresh();
			 driver.manage().deleteAllCookies();
				//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}

	}




