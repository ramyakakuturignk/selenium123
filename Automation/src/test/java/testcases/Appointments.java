package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Appointments {

	
	public WebDriver driver;
	
	public Appointments(WebDriver driver)
{

this.driver= driver;
}


 
@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list[3]/a")WebElement appointment;

public void verifyappointmentpage(){
	

	appointment.click();
	 
		
}

}