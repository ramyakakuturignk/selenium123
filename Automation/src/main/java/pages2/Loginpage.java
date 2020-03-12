package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loginpage {
	
  static WebElement email=null;
     
  static  WebElement pwd=null;
     
    static  WebElement button=null;

	
	public static WebElement Loginemail(WebDriver driver){
		 		
		// driver.findElement(By.xpath("//*[@id='mat-input-22']")).sendKeys("doctor@gmail.com");
		 driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");

	     	return email;
	}
	
	public static WebElement Loginpwd(WebDriver driver){
		 	
		 //driver.findElement(By.xpath("//*[@id='mat-input-23']")).sendKeys("test");
		 driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

		   return pwd;
	}
	
	public static WebElement Loginbutton(WebDriver driver){
		 
			
		//driver.findElement(By.xpath("//*[@id='black']/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span")).click();
		
		return button;
		
	}	
		
	}
	
	

	
	
	
	
	

