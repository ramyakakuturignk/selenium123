package Patientpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Patientloginpage {

	public WebDriver driver;
	
	public void Patientloginpage(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	
	@FindBy(css="input[placeholder='email']")WebElement username1;


	@FindBy(css="input[placeholder='password']")WebElement password;

	@FindBy(xpath="//*[@id='black']/button")WebElement login;
	
	
	
	public void verifyseach(){
		
		username1.sendKeys("patient@gmail.com");
		password.sendKeys("test");
		
		login.click();
	}


}
