package Patienttestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class DiagnosisPage {

	public WebDriver driver;
	
	public DiagnosisPage(WebDriver driver)
{

this.driver= driver;
}
	
	@FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[3]/div/span[3]/a")WebElement diagnosis;



	public void verifydiagnosispage() {
			diagnosis.click();

	}



	
	
	
}
