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
    public class TestNGListenersDemo2 {
   static  WebDriver driver=null;
     @Test
	public void login(){
    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.46:8080/fv24/index.html");
   		 driver.manage().window().maximize();
   		 
   	  
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
     
   
    	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();

		//System.out.println("Test successful:login");
        
     }    
   
	 
     
     @Test		
     public void TestToFail1()				
     {		
    	     	    	 
    	    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.46:8080/fv24/index.html");
   		 driver.manage().window().maximize();
   		 
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor1@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
           	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
  	  	     	    	 
       // System.out.println("Test failed:TestToFail1");	
       Assert.assertTrue(false);
         			
     }		
     
     @Test 
     public void mysetup() throws Exception{
    	 
    	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.get("http://192.168.1.46:8080/fv24/index.html");
   		 driver.manage().window().maximize();
   		 
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");
           	 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
  	  	     	    	 
    	 
    	 driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
    	 Thread.sleep(2000);
    	 //My Hospital

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content")).click();

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[2]/button[2]")).click();

    	 Thread.sleep(2000);
    	 //add new button

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[1]/button")).click();

    	 Thread.sleep(3000);

    	 //@BeforeMethod
    	 driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");

    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("chennai");


    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

    	 Thread.sleep(5000);

    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

    	 Thread.sleep(5000);

    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

    	 Thread.sleep(5000);


    	 driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

    	 driver.findElement(By.cssSelector("input[placeholder='select state']")).clear();

    	 Thread.sleep(5000);

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[2]/span")).click();



    	 Thread.sleep(5000);

    	 driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[3]/span")).click();

    	 
    	 
     }
     
     
    }
	

