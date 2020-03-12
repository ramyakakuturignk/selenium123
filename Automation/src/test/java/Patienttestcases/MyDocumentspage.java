package Patienttestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyDocumentspage {
public WebDriver driver;
	
	public MyDocumentspage(WebDriver driver)
{

this.driver= driver;
}
	
    @FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[3]/div/span[4]/a")WebElement document;	
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/mat-card[1]")WebElement prescription;
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4p1/div[2]/div[1]/mat-card/mat-card/mat-card/button")WebElement Viewmedicine;
    @FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[3]/div/span[4]/a")WebElement document1;
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/mat-card[2]")WebElement mylabreport;
    @FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4p2/div[3]/mat-card[1]/button")WebElement viewdetails;
    
    public void verifymydocumentspage() {
			document.click();

	}

	public void verifyprescriptionpage() {
		prescription.click();

}

	public void verifyviewmedicinepage() {
		Viewmedicine.click();

}	
	
	public void verifydocument1(){
		document1.click();
	}
	public void verifymylabreport(){
		mylabreport.click();
	}
	public void verifyviewdetails(){
		viewdetails.click();
	}
	
}
