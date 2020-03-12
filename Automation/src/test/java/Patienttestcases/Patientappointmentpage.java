package Patienttestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Patientappointmentpage {

	public WebDriver driver;
	
	public Patientappointmentpage(WebDriver driver)
{

this.driver= driver;
}
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page1/div[2]/mat-card[1]/mat-card-content")WebElement Appointment;

    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[1]")WebElement Scheduled;
	
    @FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[3]/div/span[2]/a")WebElement Scheduledfuture;
    
    
    
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[3]")WebElement past;
	
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p2/div[1]/a[2]")WebElement appointment1;

    
     @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[2]")WebElement Scheduledfuture1;

    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p2/div[3]/mat-card[1]/div/mat-card-content/div[3]/button")WebElement bookappointment;
   // @FindBy(xpath="//span[text()='Book Appointment']")WebElement Bookappoint;
   // @FindBy(xpath="//div[@class='book']/span")WebElement Book;


   // @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[3]/mat-card-title")WebElement pastappontment;
    //Today appointments
	public void verifypatientappointmentpage(){
		
		//Outpatient.click();
		Appointment.click();
		
   //Scheduled appointments		
	}
	public void verifypatientappointmentpage1(){
		Scheduled.click();

}
	//appointment
	public void verifyscheduledfuturepage(){
		Scheduledfuture.click();

}
	
	
	//past appointmnet
	public void verifypastappointment(){
		past.click();

}	
	//appointment
	public void verifyappointment1(){
		appointment1.click();
		
}	
	
	//Scheduled future appointment
	public void verifyscheduledfuturepage1(){
		Scheduledfuture1.click();

}
	//book appointment
	public void verifybookappointment(){
	//	Bookappoint.click();
		bookappointment.click();
}	
	

	

}