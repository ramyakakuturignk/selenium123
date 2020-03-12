package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class activesurvey {
	
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		public activesurvey(WebDriver driver)
	{

	this.driver= driver;
	}
	
		@FindBy(xpath="//small[contains(text(),'Pollster Survey')]")WebElement poll3;
		public WebElement expandRootElement(WebElement poll3) {
			WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",poll3);
			return ele;
		}
		//@FindBy(xpath="//b[contains(text(),'ramyasurveynew1')]")WebElement content2;
		@FindBy(xpath="//mat-card[@id='check-0']//b[contains(text(),'ramyasurveynew1')]")WebElement selectsurveynm;
		@FindBy(xpath="//ion-icon[@name='paper-plane']")WebElement launch;
		@FindBy(xpath="//ion-icon[@name='podium']")WebElement results;
		@FindBy(xpath="//ion-icon[@name='more']")WebElement more;
		@FindBy(xpath="//mat-card[@id='resp-0']//small[contains(text(),'Email Id :')]")WebElement res0;
		@FindBy(xpath="//mat-card[@id='resp-1']//small[contains(text(),'Email Id :')]")WebElement res1;
		@FindBy(xpath="//textarea[@placeholder='Please Enter Your Message']")WebElement responsemsg;
		@FindBy(xpath="//button[@class='submit']")WebElement submit;
			
	
	public void resultspage(){
		poll3.click();
		selectsurveynm.click();
		launch.click();
		results.click();
		more.click();
		res0.click();
		res1.click();
		responsemsg.sendKeys("hi");
		submit.click();
	}
}
