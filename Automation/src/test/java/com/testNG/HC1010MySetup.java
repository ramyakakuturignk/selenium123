package com.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class HC1010MySetup {
	

	  
		public WebDriver driver;
		@Test
	  public void Login() throws Exception {
		  
			
	driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");

	driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

	//login
	driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
			+ "app-login/div/form/div[1]/div/button/span")).click();
	Thread.sleep(2000);
		}
		@Test
		public void Mysetup()throws Exception{
	//MySetup
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
		
		@Test
		public void Mysetup2()throws Exception{
						
			
			//MySetup
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

			driver.findElement(By.id("mat-input-7")).sendKeys("Hospital");
			//*[@id="center"]
            //driver.findElement(By.xpath("//*[@id='mat-option-120']/span/span")).click();

			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Hospital");
            //driver.findElement(By.xpath("//*[@id='mat-option-120']/span/span")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Hospital");
           // driver.findElement(By.xpath("//*[@id='mat-option-120']/span/span")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
			
			//*****************
			
			//driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");
			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("chennai");
            driver.findElement(By.id("mat-input-7")).clear();
			driver.findElement(By.id("mat-input-7")).sendKeys("Clinic");
          //  driver.findElement(By.xpath("//*[@id='mat-option-121']/span/span")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Clinic");
           // driver.findElement(By.xpath("//*[@id='mat-option-121']/span/span")).click();
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Clinic");
            //driver.findElement(By.xpath("//*[@id='mat-option-121']/span/span")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
			
			
			//**********************
			
			//driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");
			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("chennai");
            driver.findElement(By.id("mat-input-7")).clear(); 
			driver.findElement(By.id("mat-input-7")).sendKeys("Pharmacy");
			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Pharmacy");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Pharmacy");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
			
           //******************
			//driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");
			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("chennai");
            driver.findElement(By.id("mat-input-7")).clear(); 

			driver.findElement(By.id("mat-input-7")).sendKeys("Lab");
			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("vellore");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Lab");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).clear();

			driver.findElement(By.cssSelector("input[placeholder='select city to display']")).sendKeys("thiruvallur");
			//driver.findElement(By.id("mat-input-7")).sendKeys("Lab");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
			
			
				}
		
		@Test
		public void Mysetup3()throws Exception{
		
		
		
			//MySetup
			driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
			Thread.sleep(2000);
			//My Hospital

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[2]/button[2]")).click();

			Thread.sleep(2000);
			//add new button

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[1]/button")).click();

			Thread.sleep(3000);

			
			driver.findElement(By.id("mat-input-10")).sendKeys("Hospital");
            //driver.findElement(By.xpath("//*[@id='mat-option-120']/span/span")).click();

			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
			driver.findElement(By.id("mat-input-10")).clear();
		
			driver.findElement(By.id("mat-input-10")).sendKeys("Clinic");
           // driver.findElement(By.xpath("//*[@id='mat-option-121']/span/span")).click();

			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
		
			driver.findElement(By.id("mat-input-10")).clear();

			driver.findElement(By.id("mat-input-10")).sendKeys("Pharmacy");
          //  driver.findElement(By.xpath("//*[@id='mat-option-122']/span/span")).click();

			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
		
			driver.findElement(By.id("mat-input-10")).clear();

			driver.findElement(By.id("mat-input-10")).sendKeys("Lab");
           // driver.findElement(By.xpath("//*[@id='mat-option-123']/span/span")).sendKeys("Lab");

			
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

			Thread.sleep(5000);
		}
			@Test
			public void Mysetup4()throws Exception{
				
				
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[4]/div/mat-card[3]/mat-card-content/div/button[1]")).click();
			//MySetup
			driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
			Thread.sleep(2000);
			//My Hospital

			//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content")).click();
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

		}
		
			
		@Test
		public void Mysetup5()throws Exception{
			
			
			//MySetup
			driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
			Thread.sleep(2000);
			//My Hospital

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content")).click();

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[2]/button[2]")).click();

			Thread.sleep(2000);
			//add new button

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[1]/button")).click();

			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("TamilNadu");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[placeholder='select state']")).clear();
			driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("AndhraPradesh");

			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[placeholder='select state']")).clear();
			driver.findElement(By.cssSelector("input[placeholder='select state']")).sendKeys("Karnataka");
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span")).click();

		}
		
		
		
		
				
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://192.168.1.46:8080/fv33/index.html");
			 driver.manage().window().maximize();
			 
	  }

	}

	//((Object) driver).refresh();
	//driver.findElement(By.xpath("#/mysetup")).sendKeys(Keys.F5);
	//Select drpState=new Select(driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[2]/div/div[1]/b")));
	//((WebElement) drpState).click();
	//drpState.selectByValue("31");
	//drpState.selectByVisibleText("TamilNadu");
	//drpState.selectByIndex(1);

	//

