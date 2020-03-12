package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
//@FindBy(xpath="//*[@id='mat-input-89']")WebElement username1;

@FindBy(css="input[placeholder='email']")WebElement username1;


@FindBy(xpath="//*[@id='center']")WebElement center;

@FindBy(css="input[placeholder='password']")WebElement password;

@FindBy(xpath="//*[@id='login']")WebElement login;

//@FindBy(xpath="//*[@id='mat-input-90']")WebElement password;


//driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");

//driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

//driver.findElement(By.xpath("//*[@id='login']")).click();


/*@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
		+ "app-login/div/form/div[1]/div/button/span")WebElement login;
		*/


public void verifyseach(){
	
	username1.sendKeys("cadmin@gmail.com");
	center.sendKeys("Apollo Clinic");
	password.sendKeys("test");
	
	login.click();
}


}
