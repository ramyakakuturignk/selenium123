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


public class Teller {
	 
	public WebDriver driver;
	/*
  @Test
  public void Tellerregister() throws Exception {
	  
		driver.findElement(By.xpath("//span[@routerlink='/register']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 300);
		
		WebElement email=  driver.findElement(By.xpath("//ion-input[@placeholder='Enter your Email-Id']"));
		email.click();
		email.sendKeys("krishna@gmail.com");
		WebElement password=driver.findElement(By.xpath("//ion-input[@placeholder='Enter your password']"));
		password.click();
		password.sendKeys("test");
		WebElement firstname=driver.findElement(By.xpath("//ion-input[@placeholder='Enter your First Name']"));
		firstname.click();
		firstname.sendKeys("krishna");

		WebElement lastname=driver.findElement(By.xpath("//ion-input[@placeholder='Enter your Last Name']"));
		lastname.click();
		lastname.sendKeys("k");
		WebElement mobile=driver.findElement(By.xpath("//ion-input[@placeholder='Enter your Mobile No.']"));
		mobile.click();
		mobile.sendKeys("9874561236");

		//register
		WebElement bNext = driver.findElement(By.xpath("//ion-button[@class='submit button button-block button-solid hydrated']"));
		bNext.click();
		WebElement alert2=driver.findElement(By.xpath("//span[@class='alert-button-inner sc-ion-alert-md' and @text()='Ok']"));
        alert2.click();
		//WebElement alert1=driver.findElement(By.xpath("//span[contains(text(),'Ok')])"));
       //  alert1.click();
		   // Switching to Alert        
	    Alert alert = driver.switchTo().alert();		
	    		
	    // Capturing alert message.    
	   // String alertMessage= driver.switchTo().alert().getText();		
	    		
	    // Displaying alert message		
	  //  System.out.println(alertMessage);	
	    Thread.sleep(5000);
	    		
	    // Accepting alert		
	    alert.accept();	
		
}
*/
	
	@Test
	public void Tellerlogin()throws  InterruptedException{

	    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
	    WebElement loginemail=driver.findElement(By.xpath("//*[@id='email']"));

	    loginemail.click();
	    loginemail.sendKeys("teller1@gmail.com");
		
			
	    WebElement loginpwd=driver.findElement(By.xpath("//*[@id='pwd']"));
	    loginpwd.click();
	    loginpwd.sendKeys("teller");
        WebElement loginbutton=driver.findElement(By.xpath("//ion-button[@id='but1']"));
        loginbutton.click();
	//	driver.findElement(By.xpath("//input[contains(@name='ion-input-1']")).sendKeys("test");
        Thread.sleep(5000);
        
        WebElement alt=driver.findElement(By.xpath("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']"));
        alt.click();
        Alert alert = driver.switchTo().alert();	
        String alertMessage= driver.switchTo().alert().getText();	
      	System.out.println("the alert message is "+alertMessage);	
        String   alert1="login successful";
        driver.switchTo().alert().accept();
        assertEquals(alertMessage, alert1);
        
	}
	/*
	@Test
	public void pollster() throws InterruptedException{
		WebElement poll=driver.findElement(By.xpath("//ion-segment-button[@value='Pollster']"));
		poll.click();
		Thread.sleep(5000);
     WebElement active=driver.findElement(By.xpath("//p[contains(text(),'Active Surveys')]"));		
	   active.click();
	   Thread.sleep(3000);
	 WebElement closed=driver.findElement(By.xpath("//p[contains(text(),'Closed Surveys')]"));		
          closed.click();
          Thread.sleep(3000);
     	 WebElement create=driver.findElement(By.xpath("//h1[contains(text(),'Create')]"));		
          create.click();
          Thread.sleep(3000);
      	 WebElement more=driver.findElement(By.xpath("//h2[contains(text(),'More')]"));		
          more.click();
	}
	*/
		@Test
		public void respondent() throws InterruptedException{
			//WebElement respondent=driver.findElement(By.xpath("//ion-segment-button[@value='Respondent']"));
			//WebElement res1=driver.findElement(By.xpath("//ion-segment-button[@class=class='hydrated segment-button-checked'"));
			//respondent.click();
			//res1.click();
			
			//WebElement alt=driver.findElement(By.xpath("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']"));
			//alt.click();
			 // Alert alert = driver.switchTo().alert();	
			  //  String alertMessage= driver.switchTo().alert().getText();	
			   	//System.out.println("the alert message is "+alertMessage);	
			
			
			Thread.sleep(3000);
			WebElement PendingSurvey=driver.findElement(By.xpath("//p[contains(text(),'Pending Surveys')]"));
			PendingSurvey.click();
			Thread.sleep(3000);
            
			WebElement survey1=driver.findElement(By.xpath("//div[@class='main']"));
			survey1.click();
			
			Thread.sleep(3000);
			WebElement agree=driver.findElement(By.xpath("//ion-button[@id='but1']"));
            agree.click();
            Thread.sleep(3000);
            WebElement question1=driver.findElement(By.xpath("//ion-card-content[@class='card-content card-content-md hydrated']"));
            question1.click();
            Thread.sleep(3000);
            WebElement next1=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next1.click();
            Thread.sleep(3000);
            WebElement question2 =driver.findElement(By.xpath("//b[contains(text(),'Yes')]"));
            question2.click();
            Thread.sleep(3000);
            WebElement next2=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next2.click();
			Thread.sleep(3000);
            WebElement question3 =driver.findElement(By.xpath("//b[contains(text(),'Yes')]"));
            question3.click();
            Thread.sleep(3000);
            WebElement next3=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next3.click();
            Thread.sleep(3000);
            WebElement question4 =driver.findElement(By.xpath("//b[contains(text(),'IoT Integration')]"));
            question4.click();
            Thread.sleep(3000);
            WebElement next4=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next4.click();
            Thread.sleep(3000);
            WebElement question5 =driver.findElement(By.xpath("//b[contains(text(),'Yes')]"));
            question5.click();
			Thread.sleep(3000);
            WebElement next5=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next5.click();
            Thread.sleep(3000);
            WebElement question6 =driver.findElement(By.xpath("//b[contains(text(),'More than 6 Lacs')]"));
            question6.click();
            Thread.sleep(3000);
            WebElement next6=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next6.click();
            Thread.sleep(3000);
            WebElement question7 =driver.findElement(By.xpath("//b[contains(text(),'Full Pay')]"));
            question7.click();
            Thread.sleep(3000);
            WebElement next7=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next7.click();
            Thread.sleep(3000);
            WebElement question8 =driver.findElement(By.xpath("//b[contains(text(),' Dec 30 , 2018')]"));
            question8.click();
            Thread.sleep(3000);
            WebElement next8=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next7.click();
            Thread.sleep(3000);
            WebElement question9 =driver.findElement(By.xpath("//b[contains(text(),'Yes')]"));
            question9.click();
            Thread.sleep(3000);
            WebElement next9=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next9.click();
            Thread.sleep(3000);
            WebElement question10 =driver.findElement(By.xpath("//b[contains(text(),'Need to think')]"));
            question10.click();
            Thread.sleep(3000);
            WebElement next10=driver.findElement(By.xpath("//ion-button[@id='but2']"));
            next10.click();
             Thread.sleep(3000);
             WebElement comments=driver.findElement(By.xpath("//input[@name='ion-input-2']"));
             comments.click();
             comments.sendKeys("Thank you");
             Thread.sleep(3000);
            WebElement submit=driver.findElement(By.xpath("//div[@class='box1']//ion-button[@id='but1']"));
            submit.click();
                    
             Thread.sleep(3000);
            
            WebElement alt=driver.findElement(By.xpath("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']"));
            alt.click();
            Alert alert = driver.switchTo().alert();	
            String alertMessage= driver.switchTo().alert().getText();	
          	System.out.println("the alert message is "+alertMessage);	
            String   alert1="login successful";
            driver.switchTo().alert().accept();
            assertEquals(alertMessage, alert1);
                                 
            Thread.sleep(5000);		
            
			WebElement home=driver.findElement(By.xpath("//ion-button[@routerlink='/home']"));
			home.click();
			Thread.sleep(5000);
			WebElement closedsurvey=driver.findElement(By.xpath("//p[contains(text(),'Completed Surveys')]"));
			closedsurvey.click();
			Thread.sleep(3000);
			WebElement home1=driver.findElement(By.xpath("//ion-button[@routerlink='/home']"));
            home1.click();
			WebElement creditsearned=driver.findElement(By.xpath("//p[contains(text(),'Credits Earned')]"));
            creditsearned.click();
            Thread.sleep(3000);
			WebElement more1=driver.findElement(By.xpath("//span[contains(text(),'...')]"));
            more1.click();
           
		}
		
		@Test
		public void settings(){
			WebElement settings=driver.findElement(By.xpath("//ion-button[@routerlink='/settings']"));
			settings.click();
			
			
		}
		
		
		@Test
		public void logout(){
			WebElement logout=driver.findElement(By.xpath("//ion-alert[@class='sc-ion-alert-md-h sc-ion-alert-md-s hydrated']"));
			logout.click();
			
			
			//WebElement log=driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
			//log.click();

			WebElement log1=driver.findElement(By.xpath("//div[@class='alert-button-group sc-ion-alert-md']//button[1]//ion-ripple-effect[1]"));
		    log1.click();
		}
@BeforeTest
public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://192.168.1.18:8080/teller8/index.html");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

}
