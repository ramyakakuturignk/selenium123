package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class publicrejectsurvey {
	
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		public publicrejectsurvey(WebDriver driver)
	{

	this.driver= driver;
	}
		@FindBy(xpath="//small[contains(text(),'Pollster Survey')]")WebElement pollsterpage;
		public WebElement expandRootElement(WebElement pollsterpage) {
			WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",pollsterpage);
			return ele;
		}
		
		@FindBy(xpath="//mat-icon[contains(text(),'post_add')]")WebElement createsurvey;

		@FindBy(xpath="//strong[contains(text(),'Simple Survey')]")WebElement simple;
		
		@FindBy(xpath="//span[@class='pub']")WebElement public123;
		
		@FindBy(xpath="//ion-icon[@id='sicon']")WebElement surveyname;
		
		@FindBy(xpath="//ion-icon[@id='dicon']")WebElement description;
		
		@FindBy(xpath="//ion-icon[@id='AddQuestion']")WebElement AddQuestion;
		
		@FindBy(xpath="//textarea[@placeholder='Enter your question']")WebElement question;
		
		@FindBy(xpath="//ion-icon[@name='settings']")WebElement settings;
		
		@FindBy(xpath="//ion-icon[@name='done-all']")WebElement multi;
		
		@FindBy(xpath="//ion-icon[@name='alert']")WebElement mandatory;
		
		@FindBy(xpath="//ion-icon[@name='checkmark-circle-outline']")WebElement ok;
		
		@FindBy(xpath="//textarea[@placeholder='Tap to Edit']")WebElement option1;
		
		@FindBy(xpath="//img[@id='Addoption']")WebElement plus1;
		
		@FindBy(xpath="//textarea[@placeholder='Tap to Edit']")WebElement option2;
		
		@FindBy(xpath="//img[@id='Addoption']")WebElement plus2;
		
		@FindBy(xpath="//textarea[@placeholder='Tap to Edit']")WebElement option3;
		
		@FindBy(xpath="//img[@id='Addoption']")WebElement plus3;
		
		@FindBy(xpath="//textarea[@placeholder='Tap to Edit']")WebElement option4;
		
		@FindBy(xpath="//ion-icon[@name='checkmark-circle']")WebElement cross;
		
		@FindBy(xpath="//ion-icon[@name='checkmark-circle-outline']")WebElement select;
		
		@FindBy(xpath="//ion-icon[@name='timer']")WebElement saveforlater;

		@FindBy(xpath="//mat-card[@id='check-0']//b[contains(text(),'ramyasurveypublicreject')]")WebElement survey3;

		@FindBy(xpath="//ion-icon[@name='paper-plane']")WebElement launch;

		@FindBy(xpath="//ion-icon[@id='Savedate']")WebElement Savedate;

		@FindBy(xpath="//mat-icon[contains(text(),'ballot')]")WebElement review;

		@FindBy(xpath="//mat-card[@id='check-25']//span")WebElement selectsurvey;{
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");}

		@FindBy(xpath="//ion-icon[@name='eye']")WebElement view;

		@FindBy(xpath="//ion-icon[@name='close']")WebElement reject;

		@FindBy(xpath="//input[@id='mobileotp']")WebElement reason;
		
		@FindBy(xpath="//button[@id='save']")WebElement save;
	

	public void publicapprove(){
		
		pollsterpage.click();
		createsurvey.click();
		simple.click();
		public123.click();
		surveyname.sendKeys("pomsurvey");
		description.sendKeys("pomdescription");
		AddQuestion.click();
		question.sendKeys("first question");
		settings.click(); 
		multi.click();
		mandatory.click();
		ok.click();
		option1.sendKeys("yes");
		plus1.click();
		option2.sendKeys("no");
		plus2.click();
		option3.sendKeys("ok");
		plus3.click();
		option4.sendKeys("ok");
		cross.click();
		select.click();
		saveforlater.click();
		survey3.click();
		launch.click();
		Savedate.click();
		review.click();
		selectsurvey.click();
		view.click();
		reject.click();
		reason.click();
		save.click();
	}
}
