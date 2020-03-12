package com.testNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.NoAlertPresentException;	

public class Tellerpollster {
	
	public WebDriver driver;
	
	
	
	
	@Test
	public void Tellerlogin()throws  InterruptedException{

	    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
	    WebElement loginemail1=driver.findElement(By.xpath("//*[@id='email']"));

	    loginemail1.click();
	    loginemail1.sendKeys("jaya@gmail.com");
		
			
	    WebElement loginpwd1=driver.findElement(By.xpath("//*[@id='pass']"));
	    loginpwd1.click();
	    loginpwd1.sendKeys("test");
        WebElement loginbutton1=driver.findElement(By.xpath("/html/body/app-root/section/app-login/section/form/ion-button"));
        loginbutton1.click();
	//	driver.findElement(By.xpath("//input[contains(@name='ion-input-1']")).sendKeys("test");
        Thread.sleep(5000);
        /*
        WebElement alt=driver.findElement(By.xpath("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']"));
        alt.click();
        Alert alert = driver.switchTo().alert();	
        String alertMessage= driver.switchTo().alert().getText();	
      	System.out.println("the alert message is "+alertMessage);	
        String   alert1="login successful";
        driver.switchTo().alert().accept();
        assertEquals(alertMessage, alert1);
        */
	}
	@Test
	public void pollster() throws InterruptedException{
		
		WebElement poll=driver.findElement(By.xpath("//b[contains(text(),'Pollster')]"));
		poll.click();
		Thread.sleep(5000);
		/*
     WebElement active1=driver.findElement(By.xpath("//b[contains(text(),'Active Surveys')]"));		
	   active1.click();
	   Thread.sleep(3000);
	   
	   WebElement survey2=driver.findElement(By.xpath("//div[contains(text(),'Clinica Digital Solutions Fund Raiser - Bentonvill')]"));
	   survey2.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement agree2=driver.findElement(By.xpath("//ion-button[@id='but1']"));
	   agree2.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement Home2=driver.findElement(By.xpath("//ion-button[@routerlink='/home']"));
	   Home2.click();
	   
	   WebElement active2=driver.findElement(By.xpath("//p[contains(text(),'Active Surveys')]"));		
	   active2.click();
	   Thread.sleep(3000);
	   
	      
	   
	   WebElement survey3=driver.findElement(By.xpath("//div[contains(text(),'Clinica Digital Solutions Fund Raiser - Charlotee')]"));
	   survey3.click();
	   Thread.sleep(3000);
	   
	   
 
	    WebElement agree3=driver.findElement(By.xpath("//ion-button[@id='but1']"));
	    agree3.click();
	    Thread.sleep(3000);
	    
	   
	    
	      WebElement Home3=driver.findElement(By.xpath("//ion-button[@routerlink='/home']"));
	      Home3.click();
	      Thread.sleep(3000);
	   
    	  WebElement closed=driver.findElement(By.xpath("//p[contains(text(),'Closed Surveys')]"));		
          closed.click();
          Thread.sleep(3000);
          */
          //Create Survey
          
     	  WebElement create=driver.findElement(By.xpath("//strong[contains(text(),'Create')]"));		
          create.click();
          Thread.sleep(8000);
                    
          WebElement surveyname1=driver.findElement(By.xpath("//textarea[@class='ng-pristine ng-valid ng-touched']"));
         // surveyname1.click();
          surveyname1.sendKeys("Ramyasurvey");
          Thread.sleep(5000);
                                               	
                                          
          WebElement description=driver.findElement(By.xpath("//div[@class='rowcontent new']//div[2]//textarea[1]"));
          description.click();
          description.sendKeys("Hi");
          Thread.sleep(5000);
                                 
                    
           WebElement AddQuestions=driver.findElement(By.xpath("//ion-button[@id='add']"));
           AddQuestions.click();
           Thread.sleep(5000);


           WebElement putquestion=driver.findElement(By.xpath("//ion-textarea[@placeholder='Enter your question']"));
           putquestion.click();
           putquestion.sendKeys("hello");
           Thread.sleep(3000);

           WebElement selecttype=driver.findElement(By.xpath("//app-select-type[@class='ion-page']"));
           selecttype.click();
           
           WebElement singleselect=driver.findElement(By.xpath("//ion-ripple-effect[@class='hydrated']"));
           singleselect.click();
           
           WebElement addoptions1=driver.findElement(By.xpath("//ion-button[@class='specbtn one button button-block button-solid hydrated']"));
           addoptions1.click();
           Thread.sleep(3000);

           WebElement enteranswer1=driver.findElement(By.xpath("//input[@name='ion-input-2']"));
           enteranswer1.click();
           enteranswer1.sendKeys("hello");
           Thread.sleep(3000);
           
           
           WebElement tick1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
           tick1.click();
           
           WebElement addoptions2=driver.findElement(By.xpath("//ion-button[@class='specbtn one button button-block button-solid hydrated']"));
           addoptions2.click();
           Thread.sleep(3000);

           WebElement enteranswer2=driver.findElement(By.xpath("//input[@name='ion-input-2']"));
           enteranswer2.click();
           enteranswer2.sendKeys("hello");
           Thread.sleep(3000);
           
           WebElement tick2=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
           tick2.click();
           
           WebElement done=driver.findElement(By.xpath("//ion-ripple-effect[@class='hydrated']"));
           done.click();
           Thread.sleep(3000);

 	       WebElement Home4=driver.findElement(By.xpath("//ion-button[@routerlink='/home']"));
 	       Home4.click();
 	       Thread.sleep(3000);
           
 	        WebElement poll1=driver.findElement(By.xpath("//b[contains(text(),'Pollster')]"));
 	    	poll1.click();
 	    	Thread.sleep(5000);
 		
 		    WebElement active2=driver.findElement(By.xpath("//p[contains(text(),'Active Surveys')]"));		
 		    active2.click();
 		    Thread.sleep(3000);
 		    
 		   
 	        WebElement jayasurvey=driver.findElement(By.xpath("//div[contains(text(),'jaya6survey')]"));
 	       jayasurvey.click();
 	        
 		   
 	        WebElement share=driver.findElement(By.xpath("//img[@src='assets/share.png']"));
 	        share.click();
 	        
 	       
 	        WebElement pdf=driver.findElement(By.xpath("//img[@class='pdf']"));
 	        pdf.click();
 	        
 	       
 	        WebElement sheet=driver.findElement(By.xpath("//img[@class='sheet']"));
 	        sheet.click();
           
/*
          //edit answers
           
           WebElement editoptions=driver.findElement(By.xpath("//div[@class='tap']//ion-icon[@name='create']"));
           editoptions.click();
           Thread.sleep(3000);

          //More
      	   WebElement more=driver.findElement(By.xpath("//h2[contains(text(),'More')]"));		
           more.click();
           */
	}
	
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://54.91.134.60:8080/v1.0.9/index.html");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
}
