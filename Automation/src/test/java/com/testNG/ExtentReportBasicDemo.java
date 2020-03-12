package com.testNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	 static ExtentReports extent = null;
	// static ExtentReports extent = null;
      static WebDriver driver=null;	
    //static  ExtentReports extentReports = null;
		//static ExtentReports extentReports1 = null;
		 public static void main(String[] args) throws NullPointerException, InterruptedException {
			ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter); 
       
       
			// create ExtentReports and attach reporter(s)
             ExtentTest test=extent.createTest("MyFirstTest","login page");
    
    	   System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
  		 driver=new ChromeDriver();
  		// ExtentTest test111 = null;
  		
  		 driver.get("http://192.168.1.46:8080/fv24/index.html");
  		 driver.manage().window().maximize();
	       
			test.pass("Enter Email Id");
			 		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");	
			 		 
			 test.pass("Enter password");
			 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
	        
			test.pass("login successful");
			 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
						+ "app-login/div/form/div[1]/div/button/span")).click();
	        
	
      
		
		 /*
		 	 test111.pass("MySetup Page");
		//MySetup
		driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
		
		 	
		 driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/div/span[4]/a/mat-icon"));
		 Thread.sleep(2000);
		
		//ExtentTest test111 = null;
		//My Hospital
	 	 test111.pass("MyHospitals Page");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content")).click();

	 	 test111.pass("Mattable Page");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[2]/button[2]")).click();

		 Thread.sleep(2000);
		 //add new button
	 	 test111.pass("Add new Page");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[1]/button")).click();

		 Thread.sleep(3000);

		 //@BeforeMethod
	 	 test111.pass("Enter State Name");

		 driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");
		 
	 	 test111.pass("Enter City Name");

		 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("chennai");

	 	 test111.pass("search successful");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

		 Thread.sleep(5000);
	 	 test111.pass("clear City Name");

		 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();
	 	 test111.pass("Enter City Name");

		 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");
	 	 test111.pass("search successful");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

		 Thread.sleep(5000);
		 
	 	 test111.pass("Clear City Name");

		 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();
		 
	 	 test111.pass("Enter City Name");

		 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");
		 
	 	 test111.pass("Search Successful");

		 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();
		
		ExtentReports extent = null;
		*/
		extent.flush();

		 
	}
		 
	   
		 
	
	}


