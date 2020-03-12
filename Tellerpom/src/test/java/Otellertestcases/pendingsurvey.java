package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class pendingsurvey {
	
	
		public WebDriver driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
			public pendingsurvey(WebDriver driver)
		{

		this.driver= driver;
		}
			@FindBy(xpath="//input[@placeholder='Search']")WebElement search4;
			@FindBy(xpath="//mat-card[@id='check-1']//span")WebElement searchsurvey;
			@FindBy(xpath="//div[@id='question-0']")WebElement chooseanswer1;
			@FindBy(xpath="//ion-icon[@name='arrow-round-forward']")WebElement next1;
			@FindBy(xpath="//div[@id='question-0']")WebElement chooseanswer2;
			@FindBy(xpath="//ion-icon[@name='arrow-round-forward']")WebElement next2;
			@FindBy(xpath="//textarea[@placeholder='Enter your comment']")WebElement comment;
			@FindBy(xpath="//ion-icon[@name='checkbox-outline']")WebElement submit5;

			public void pending(){
				search4.click();
				searchsurvey.click();
				chooseanswer1.click();
				next1.click();
				chooseanswer2.click();
				next2.click();
				comment.click();
				submit5.click();
			}
	}


