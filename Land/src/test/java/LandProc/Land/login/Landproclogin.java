package LandProc.Land.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Landproclogin {
public WebDriver driver;
	
	public void login(WebDriver driver)
{

this.driver= driver;
}


 
@FindBy(xpath="//input[@placeholder='Enter your Mobile#/Email Id']")WebElement email;
@FindBy(xpath="//input[@placeholder='Enter your password']")WebElement pass;
@FindBy(xpath="//input[@placeholder='Enter Org Code']")WebElement org;

@FindBy(xpath="//button[@id='login']")WebElement login;



public void verifyloginpage(){
	email.click();
	email.sendKeys("6379039922");
	
	pass.click();
	pass.sendKeys("Test@123");
	org.click();
	org.sendKeys("emp");
	login.click();
	 
		
}

}
