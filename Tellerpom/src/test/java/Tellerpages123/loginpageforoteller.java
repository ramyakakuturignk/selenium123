package Tellerpages123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageforoteller {
	
public  WebDriver driver;
	
	public  loginpageforoteller(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	//@FindBy(css="input[placeholder='email']")WebElement username1;


	@FindBy(xpath="//input[@id='email']")WebElement email123;
	
	@FindBy(xpath="//input[@id='pass']")WebElement pass123;
	
	@FindBy(xpath="//button[@id='login']")WebElement login123;





public void verifyotellerloginpage() {
	// TODO Auto-generated method stub

	email123.sendKeys("6379039922");
	pass123.sendKeys("Test@123");
	login123.click();
}






}