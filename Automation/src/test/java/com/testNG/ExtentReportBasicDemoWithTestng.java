package com.testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemoWithTestng {

	ExtentHtmlReporter htmlReporter=null;
	ExtentReports extent=null;
     static WebDriver driver=null;
	@BeforeSuite
	public void Setup(){
		
 htmlReporter = new ExtentHtmlReporter("extent2.html");
	    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);       

 	   System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		
	}
	
	@BeforeTest
	public void setUpTest(){
		 driver=new ChromeDriver();
			// ExtentTest test111 = null;
			
			 driver.get("http://192.168.1.46:8080/fv24/index.html");
			 driver.manage().window().maximize();
	}
	
	@Test
	public void Test1()throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test= extent.createTest("Test the Login Page", "Login Page");


		test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        Thread.sleep(5000);

		 driver.get("http://192.168.1.46:8080/fv24/index.html");

        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        Thread.sleep(5000);
         test.pass("Enter Email ID ");
		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");	

        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        Thread.sleep(5000);
        test.pass("Enter Password");

		 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void Test2()throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test= extent.createTest("Login Page", "Test the login page");

        
		test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");

        driver.get("http://192.168.1.46:8080/fv24/index.html");
        Thread.sleep(5000);

        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Invalid Email ID");

		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor1@gmail.com");	

        Thread.sleep(5000);
        
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Password");

		 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
	        Thread.sleep(5000);

		 
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	@Test
	public void Test3()throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test= extent.createTest("Login Page", "Test the login page");

        
		test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");

        driver.get("http://192.168.1.46:8080/fv24/index.html");
        Thread.sleep(5000);

        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Email ID");

		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");	

        Thread.sleep(5000);
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Invalid Password");

		 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test1");
	        Thread.sleep(5000);

		 
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void Test4()throws IOException, InterruptedException{
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test= extent.createTest("Login Page", "Test the login page");

        
		test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");

        driver.get("http://192.168.1.46:8080/fv24/index.html");
        Thread.sleep(5000);

        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Blank Email ID");

		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("");	

        Thread.sleep(5000);
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.pass("Enter Blank Password");

		 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("");
	        Thread.sleep(5000);

		 
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	@AfterTest
	public void teardowntest(){
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
	
	
	
	
	@AfterSuite
	public void TearDown(){
		
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
