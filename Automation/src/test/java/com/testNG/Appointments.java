package com.testNG;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
  
  
public class Appointments {
	
    public static WebDriver driver=null;
	@Test
	public void Appointmentevent() throws InterruptedException{
	
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

		//login
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
		Thread.sleep(5000);

	

		driver.findElement(By.xpath("//a[@href='#/appointments']")).click();


		//week button

		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[2]/div[2]/button[2]/span")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[3]/div/mwl-calendar-week-view/div/div/div[2]/div[3]/div[1]/mwl-calendar-week-view-event/div/mwl-calendar-event-title/span")).click();

		//Day button

		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[2]/div[2]/button[1]/span")).click();
		 
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[3]/div/mwl-calendar-day-view/div/div[2]/div[1]/div[1]/mwl-calendar-day-view-event/div")).click();
			
}
			
			@BeforeTest
			  public void beforeTest() {
				  
				  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
					 driver=new ChromeDriver();
					 driver.get("http://192.168.1.46:8080/fv24/index.html");
					 driver.manage().window().maximize();
					//return beforeTest();
					 
			  }
	
}
