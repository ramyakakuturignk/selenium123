package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class OutPatientpage {

	
	public WebDriver driver;
	
	public OutPatientpage(WebDriver driver)
{

this.driver= driver;
}

	
   //	@FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[3]/div/span[2]/a")WebElement  outpatient;
	////@FindBy(xpath="//a[@href='#/out-patients']")WebElement Outpatient;

	//@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[1]/div")WebElement  ToDay;

	//@FindBy(xpath="//a[@href='#/out-patients']")WebElement  outpatient;
	///@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[1]")WebElement Today;
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page1/div[2]/div[1]/mat-card")WebElement Today;
	
   @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card/div[2]/mat-icon")WebElement Playarrow ;
   
	

	
public void verifyoutpatientpage(){
	
	//Outpatient.click();
	 Today.click();
	
	
	
}


public void verifyStartpage(){
	
	
	 Playarrow.click();
	
	
}


}