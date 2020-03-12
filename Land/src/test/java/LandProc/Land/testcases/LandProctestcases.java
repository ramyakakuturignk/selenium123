package LandProc.Land.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LandProctestcases {

public WebDriver driver;
	
	public void login(WebDriver driver)
{

this.driver= driver;
	
}
	//@FindBy(xpath="//span[contains(text(),'Request Survey')]")WebElement Survey;
	WebElement Survey  = driver.findElement(By.xpath("//span[contains(text(),'Request Survey')]"));
	
	WebElement Survey1  = driver.findElement(By.xpath("//ion-input[@id='last']"));


//@FindBy(xpath="//ion-input[@id='first']")WebElement first;

/*@FindBy(xpath="//ion-input[@id='last']")WebElement last;
@FindBy(xpath="//ion-input[@id='cantact']")WebElement cantact;
@FindBy(xpath="//ion-input[@id='address']")WebElement address;
@FindBy(xpath="//ion-input[@id='city']")WebElement city;
@FindBy(xpath="//ion-input[@id='state']")WebElement state;
@FindBy(xpath="//ion-input[@id='landsurvey']")WebElement landsurvey;
@FindBy(xpath="//select[@id='village']")WebElement village;
@FindBy(xpath="//select[@id='taluk']")WebElement taluk;
@FindBy(xpath="//button[@id='submit']")WebElement submit;



*/



//System.out.println(Survey1);



//button[@id='submit']

public void verifyrequestsurveypage(){
	Survey.click();
	
	//first.click();
	//first.sendKeys("rupa");
	Survey1.click();
	Survey1.sendKeys("ramya");
	/*
	last.click();
	last.sendKeys("k");
	cantact.click();
	cantact.sendKeys("6379039922");
	address.click();
	address.sendKeys("ambattur");

	city.click();
	city.sendKeys("chennai");

	state.click();
	state.sendKeys("TN");
	landsurvey.click();
	landsurvey.sendKeys("7845");	
	village.click();
	village.sendKeys("Kurumbagaram");
	taluk.click();
	taluk.sendKeys("Ozhukarai");
	
	submit.click();
*/
	 
		
}




}
