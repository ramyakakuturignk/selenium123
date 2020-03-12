package com.testNG;

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

public class facebook {

	public WebDriver driver;
	
	
	@Test
	public void facebook(){
		WebElement firstname=driver.findElement(By.xpath("//input[@id='u_0_j']"));
		firstname.sendKeys("ramya");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='u_0_l']"));
		lastname.sendKeys("k");
				
		WebElement Email=driver.findElement(By.xpath("//input[@id='u_0_o']"));
		Email.sendKeys("ramya@gmail.com");
		
		WebElement confirmemail=driver.findElement(By.cssSelector("input[placeholder='Re-enter email address']"));
		confirmemail.sendKeys("ramya@gmail.com");
		
		
		WebElement password=driver.findElement(By.xpath("//input[@id='u_0_v']"));
		password.sendKeys("ramya@123");
		
		

		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		day.click();
		day.sendKeys("9");
		
	

		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		month.sendKeys("October");
		//WebElement monthselect=driver.findElement(By.xpath("//font[contains(text(),'Instagram')]"));
		//monthselect.click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		year.click();
		year.sendKeys("1991");
					
		WebElement gender=driver.findElement(By.xpath("//input[@type='radio' and @name='sex']"));
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath("//button[@type='submit' and @id='u_0_11']"));
		signup.click();
		
		
	}
	
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	
	
}
