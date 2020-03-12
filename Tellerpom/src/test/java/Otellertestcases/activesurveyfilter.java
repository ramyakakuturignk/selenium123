package Otellertestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class activesurveyfilter {
public WebDriver driver;
	
	public activesurveyfilter(WebDriver driver)
{

this.driver= driver;
}
	@FindBy(xpath="////ion-icon[@name='arrow-dropright']")WebElement pollster1page;
	
       public void filter(){
		
		pollster1page.click();
}
}