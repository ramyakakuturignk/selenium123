package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class tellertestcases123 {

public WebDriver driver;
	
	public tellertestcases123(WebDriver driver)
{

this.driver= driver;
}
	@FindBy(xpath="//small[contains(text(),'Pollster Survey')]")WebElement pollsterpage;
	
	@FindBy(xpath="//mat-icon[contains(text(),'post_add')]")WebElement createsurvey;

	@FindBy(xpath="//strong[contains(text(),'Simple Survey')]")WebElement simple;
	
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
	
	
	
	

	public void createquestions(){
		
		pollsterpage.click();
		createsurvey.click();
		simple.click();
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
	}

	

	}

