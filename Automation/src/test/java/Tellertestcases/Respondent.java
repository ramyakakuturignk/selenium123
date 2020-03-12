package Tellertestcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Respondent {

	public WebDriver driver;

	public void Respondent(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	
	
		@FindBy(xpath=("//ion-segment-button[@class='hydrated segment-button-checked']"))WebElement respondent;
	
		@FindBy(xpath=("//p[contains(text(),'Pending Surveys')]"))WebElement pendingsurvey1;
		
		@FindBy(xpath=("//div[@class='main']"))WebElement survey1;

		@FindBy(xpath=("//ion-button[@id='but1']"))WebElement agree;

		@FindBy(xpath=("//b[contains(text(),'Yes')]"))WebElement question1;

		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next1;

		@FindBy(xpath=("//b[contains(text(),'Yes')]"))WebElement question2;

		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next2;

		@FindBy(xpath=("//b[contains(text(),'Yes')]"))WebElement question3;
		
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next3;

		@FindBy(xpath=("//b[contains(text(),'IoT Integration')]"))WebElement question4;

		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next4;

		
		@FindBy(xpath=("//b[contains(text(),'Yes')]"))WebElement question5;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next5;

		@FindBy(xpath=("//b[contains(text(),'More than 6 Lacs')]"))WebElement question6;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next6;

		
		@FindBy(xpath=("//b[contains(text(),'Full Pay')]"))WebElement question7;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next7;

		
		@FindBy(xpath=("//b[contains(text(),' Dec 30 , 2018')]"))WebElement question8;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next8;

		
		@FindBy(xpath=("//b[contains(text(),'Yes')]"))WebElement question9;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next9;

		
		@FindBy(xpath=("//b[contains(text(),'Need to think')]"))WebElement question10;
		@FindBy(xpath=("//ion-button[@id='but2']"))WebElement next10;

		@FindBy(xpath=("//input[@name='ion-input-2']"))WebElement comments;
		

		@FindBy(xpath=("//div[@class='box1']//ion-button[@id='but1']"))WebElement submit;
		

		@FindBy(xpath=("//ion-button[@routerlink='/home']"))WebElement home;
						
		
		@FindBy(xpath=("//p[contains(text(),'Completed Surveys')]"))WebElement closedsurvey;
		
		@FindBy(xpath=("//ion-button[@routerlink='/home']"))WebElement home1;

     	@FindBy(xpath=("//p[contains(text(),'Credits Earned')]"))WebElement creditsearned;
        
		@FindBy(xpath=("//span[contains(text(),'...')]"))WebElement more;

	
	
	public void respondent(){
		
		respondent.click();
	
		pendingsurvey1.click();
		
		survey1.click();
		
		agree.click();
		
		question1.click();
		
		next1.click();
		
		question2.click();

		next2.click();
		
		question3.click();

		next3.click();

		question4.click();

		next4.click();

		question5.click();

		next5.click();

		question6.click();

		next6.click();

		question7.click();

		next7.click();

		question8.click();

		next8.click();
		
		question9.click();

		next9.click();
				
		question10.click();

		next10.click();
		
		comments.click();
		
		comments.sendKeys("Thank you");

		submit.click();
		
		home.click();
		
		closedsurvey.click();
		
		home1.click();
		
		creditsearned.click();
		
		more.click();
}
}