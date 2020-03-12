package Listerners;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.SearchContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

    @Listeners(Listerners.TestNGListeners.class)
    public class TestNGListenersDemo3 {
   static  WebDriver driver=null;
     @Test
	public void login(){
    	 //Valid EmailID and Password
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/fv30/index.html");
   		 driver.manage().window().maximize();
   		 driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[2]/div/span[3]/a/mat-icon"));
   	  
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
     
   
    	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();

		//System.out.println("Test successful:login");
        
     }    
   
	 
     //Invalid EmailID and Password
     @Test		
     public void Home() throws InterruptedException				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/fv30/index.html");
   		 driver.manage().window().maximize();
   		 driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[2]/div/span[3]/a/mat-icon"));

		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
           	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
  	  	     	    	 
		driver.findElement(By.xpath("//a[@href='Home']")).click();
		Thread.sleep(2000);

		//today-appointments

		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div"
				+ "[2]/app-page2/div[2]/mat-card[1]")).click();
		Thread.sleep(2000);
		//appointment card

				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
		
       
         			
     }		
      //Valid EmailID and Invalid Password
     @Test		
     public void Home1() throws InterruptedException				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/fv30/index.html");
   		 driver.manage().window().maximize();
   		 driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[2]/div/span[3]/a/mat-icon"));

		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test1");
           	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
  	  	     	    	 
		driver.findElement(By.xpath("//a[@href='#/Home']")).click();
		Thread.sleep(2000);

		//Today-follows-up

		Thread.sleep(2000);
		//appointment card
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page1/div[2]/mat-card[2]/mat-card-content")).click();

				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
		
     }		
     //Both EmailID and Password Fields are Blank
     @Test		
     public void Home2() throws InterruptedException				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/fv30/index.html");
   		 driver.manage().window().maximize();
   		 driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[2]/div/span[3]/a/mat-icon"));

		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("");
           	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
  	  	
		driver.findElement(By.xpath("//a[@href='#/Home']")).click();
		Thread.sleep(2000);

		//Review Lab Report

		Thread.sleep(2000);
		//appointment card
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page1/div[2]/mat-card[3]/mat-card-content")).click();

				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
		
		
     }		
}
	

