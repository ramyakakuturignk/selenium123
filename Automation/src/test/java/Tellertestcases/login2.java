package Tellertestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login2 {
	



public WebDriver driver;

	public void login2(WebDriver driver)
	{
	
		this.driver= driver;
		
	}

	@FindBy(xpath="//*[@id='email']")WebElement Email1;


	@FindBy(xpath="//*[@id='pwd']")WebElement password2;

    //@FindBy(xpath="//*[@id='but2']")WebElement login1;
	@FindBy(xpath="//ion-button[@id='but1']")WebElement login1;
	
	 @FindBy(xpath=("//ion-ripple-effect[@class='sc-ion-alert-md hydrated']"))WebElement alt;
     
     Alert alert = driver.switchTo().alert();	
     String alertMessage= driver.switchTo().alert().getText();	
   //	System.out.println("the alert message is "+alertMessage);	

     // alert.accept();
	
	
	
	public void verifylogin(){
		
		Email1.sendKeys("teller1@gmail.com");
		
		password2.sendKeys("teller");
		
		login1.click();
		
		alt.click();
		
	}

	
	
	
}
