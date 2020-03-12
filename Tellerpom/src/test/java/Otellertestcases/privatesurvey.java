package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class privatesurvey {
	
public WebDriver driver;
	
	public privatesurvey(WebDriver driver)
{

this.driver= driver;
}
	
	@FindBy(xpath="//ion-icon[@name='person-add']")WebElement respondent;
	@FindBy(xpath="//ion-icon[@name='people']")WebElement pastrespondent;
	@FindBy(xpath="//input[@placeholder='Search']")WebElement search;
	@FindBy(xpath="//b[contains(text(),'Ramya12')]")WebElement peoplename;
	@FindBy(xpath="//ion-icon[@id='Tickrespondnet']")WebElement selectrespondent;
	@FindBy(xpath="//ion-icon[@name='add-circle-outline']")WebElement add;
	@FindBy(xpath="//ion-icon[@name='people']")WebElement pastrespondent2;
	@FindBy(xpath="//input[@placeholder='Search']")WebElement Search2;
	@FindBy(xpath="//b[contains(text(),'Akash')]")WebElement peoplename2;
	@FindBy(xpath="//ion-icon[@id='Tickrespondnet']")WebElement selectrespondent2;
	@FindBy(xpath="//ion-icon[@name='add-circle-outline']")WebElement add2;
	@FindBy(xpath="//ion-icon[@name='phone-portrait']")WebElement addbnewcontact;
	@FindBy(xpath="//input[@placeholder='First Name']")WebElement firtsname;
	@FindBy(xpath="//input[@placeholder='Last Name']")WebElement lastname;
	@FindBy(xpath="//input[@placeholder='Mobile #']")WebElement mobile;
	@FindBy(xpath="//ion-icon[@id='Addresp']")WebElement add3;
	

	

public void addrespondentflow(){
	respondent.click();
	pastrespondent.click();
	search.click();
	peoplename.sendKeys("Ramya12");
	selectrespondent.click();
	add.click();
	pastrespondent2.click();
	Search2.sendKeys("Akash");
	peoplename2.sendKeys("Akash");
	selectrespondent2.click();
	add2.click();
	addbnewcontact.click();
	firtsname.sendKeys("Ramya");
	lastname.sendKeys("kvn");
    mobile.sendKeys("6379039922");
	add3.click();
}

}