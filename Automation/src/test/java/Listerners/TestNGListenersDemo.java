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
    public class TestNGListenersDemo {
   static  WebDriver driver=null;
     @Test
	public void login(){
    	 //Valid EmailID and Password
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/cv21/index.html");
   		 driver.manage().window().maximize();
   		 
   	  
driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
		 driver.findElement(By.xpath("//*[@id='login']")).click();
		//System.out.println("Test successful:login");
        
     }    
   
	 
     //Invalid EmailID and Password
     @Test		
     public void TestToFail1()				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/cv21/index.html");
   		 driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin1@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
		 driver.findElement(By.xpath("//*[@id='login']")).click();
       // System.out.println("Test failed:TestToFail1");	
       Assert.assertTrue(false);
         			
     }		
      //Valid EmailID and Invalid Password
     @Test		
     public void TestToFail2()				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/cv21/index.html");
   		 driver.manage().window().maximize();
   		 
driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test1");
		 driver.findElement(By.xpath("//*[@id='login']")).click();
  	  	     	    	 
       // System.out.println("Test failed:TestToFail1");	
       Assert.assertTrue(false);
         			
     }		
     //Both EmailID and Password Fields are Blank
     @Test		
     public void TestToFail3()				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.18:8080/cv21/index.html");
   		 driver.manage().window().maximize();
   		 
driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("");

		 driver.findElement(By.xpath("//*[@id='login']")).click();     	    	 
       // System.out.println("Test failed:TestToFail1");	
       Assert.assertTrue(false);
         			
     }		
}
	

