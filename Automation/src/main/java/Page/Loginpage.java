package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	@FindBy(xpath="//input[@id='email']")WebElement Email;


	@FindBy(xpath="//input[@id='pass']")WebElement password;

	

	@FindBy(xpath="//button[@id='login']")WebElement login;
	/*
@FindBy(xpath="//b[contains(text(),'Respondent')]")WebElement Respondent;

    
	@FindBy(xpath="//b[contains(text(),'Pending Surveys')]")WebElement pendingsurvey;
	//*[@id="rowcontent"]/app-home/div/div[2]/div/div[1]/b
	
	@FindBy(xpath="//div[contains(text(),'test answer override')]")WebElement surname1;
	
	@FindBy(xpath="//b[contains(text(),'a11')]")WebElement suroption;
	
	//@FindBy(xpath="//b[contains(text(),'ty8y8fyft7yf')]")WebElement surname2;
	
	
	//@FindBy(xpath="//b[contains(text(),'ty8y8fyft7yf')]")WebElement suroption2;
	//@FindBy(xpath="//b[contains(text(),'ty8y8fyft7yf')]")WebElement suroption3;
	@FindBy(xpath="//img[@src='assets/images/forward.png']")WebElement next;
	
	@FindBy(xpath="//textarea[@placeholder='Enter your comment']")WebElement Comment;
	@FindBy(xpath="//b[contains(text(),'Completed Surveys')]")WebElement completedsurvey;
	@FindBy(xpath="//input[@placeholder='Search']")WebElement search1;
	@FindBy(xpath="//b[contains(text(),'Pending Surveys')]")WebElement pendsurvey;
	@FindBy(xpath="//input[@placeholder='Search']")WebElement search2;
	*/
	public void verifylogin(){
		
		Email.sendKeys("6379039922");
		password.sendKeys("Ramya@12");
		login.click();
		/*
		Respondent.click();
		pendingsurvey.click();
		surname1.click();
		suroption.click();
		//surname2.click();
		//suroption2.click();
		//suroption3.click();
		next.click();
		Comment.click();
		completedsurvey.click();
		search1.click();
		pendsurvey.click();
		search2.click();
		*/	
	}
}