package Tellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pollster {

	public WebDriver driver;

	public void Pollster(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	
	@FindBy(xpath=("//ion-segment-button[@value='Pollster']"))WebElement pollster;
	
	@FindBy(xpath=("//p[contains(text(),'Active Surveys')]"))WebElement active;	
   
    @FindBy(xpath=("//p[contains(text(),'Closed Surveys')]"))WebElement closed;	
     
    @FindBy(xpath=("//h1[contains(text(),'Create')]"))WebElement create;		
    
  	 @FindBy(xpath=("//h2[contains(text(),'More')]"))WebElement more;		
      
	
 

	public void pollster() {
		

		pollster.click();
		active.click();
		closed.click();
		create.click();
		more.click();
	}

	}
	
	
	
	
