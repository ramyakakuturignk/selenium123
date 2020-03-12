package Teller.Tellerwebapp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class simplesurveywothdisplayorder {
	
	public WebDriver driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Test
	public void Tellerlogin6()throws  InterruptedException,NullPointerException{

	    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
	    WebElement loginemail=driver.findElement(By.xpath("//input[@id='email']"));

	    loginemail.click();
	    loginemail.sendKeys("6379039922");
		
			
	    WebElement loginpwd=driver.findElement(By.xpath("//input[@id='pass']"));
	    loginpwd.click();
	    loginpwd.sendKeys("Test@123");
	    
        WebElement loginbutton=driver.findElement(By.xpath("//button[@id='login']"));
        loginbutton.click();
	    Thread.sleep(5000);
    
	    WebElement poll=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
	    poll.click();
	    Thread.sleep(5000);
	    
	    WebElement create=driver.findElement(By.xpath("//mat-icon[contains(text(),'post_add')]"));
	    create.click();
	    Thread.sleep(5000);
	    
	    WebElement simple=driver.findElement(By.xpath("//strong[contains(text(),'Simple Survey')]"));
	    simple.click();
	    Thread.sleep(5000);
	    
	    WebElement name=driver.findElement(By.xpath("//textarea[@id='sname']"));
	    name.sendKeys("ramyasurveywithdisplayorder");
	    Thread.sleep(5000);
	    
	    WebElement description=driver.findElement(By.xpath("//textarea[@id='description']"));
	    description.sendKeys("ramyadescription");
	    Thread.sleep(5000);
	    /*
	     	 WebDriverWait wait = new WebDriverWait(driver, 10);	    
	 	    WebElement addquestion2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='help-circle']")));
	 	    addquestion2.click();
	 	    Thread.sleep(8000);
	 	    */
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);	    
	    WebElement addquestion11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
	    addquestion11.click();
	    Thread.sleep(8000);
	    
	   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
	  	    WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    WebElement enterquestion1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
	    enterquestion1.sendKeys("Android Smart Phone - 16GB");
	    Thread.sleep(5000); 
	    
	    
	    WebElement settings=driver.findElement(By.xpath("//ion-icon[@name='settings']"));
	    settings.click();
	    Thread.sleep(5000);
	    
	    WebElement multi=driver.findElement(By.xpath("//ion-icon[@name='done-all']"));
	    multi.click();
	    Thread.sleep(5000);
	    
	      
	    
	    WebElement mandatory=driver.findElement(By.xpath("//ion-icon[@name='alert']"));
	    mandatory.click();
	    Thread.sleep(5000);
	    
	    WebElement ok=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
	    ok.click();
	    Thread.sleep(5000);
	    
	    WebElement answer1=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer1.sendKeys("yes");
	    Thread.sleep(5000);
	    
	    WebElement plus=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus.click();
	    Thread.sleep(5000);
	    
	    WebElement answer2=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer2.sendKeys("no");
	    Thread.sleep(5000);
	    
	    WebElement plus2=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus2.click();
	    Thread.sleep(5000);
	    
	    WebElement answer3=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer3.sendKeys("ok");
	    Thread.sleep(5000);
	    
	    WebElement plus3=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus3.click();
	    Thread.sleep(5000);
	    
	    WebElement answer4=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer4.sendKeys("ok");
	    Thread.sleep(5000);
	    	        	    
	    WebElement cross=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
	    cross.click();
	    Thread.sleep(5000);
	    
	    WebElement select1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    select1.click();
	    Thread.sleep(5000);
	    
	    WebDriverWait wait5 = new WebDriverWait(driver, 10);	    
	    WebElement addquestion5 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@name='help-circle']")));
	    addquestion5.click();
	    Thread.sleep(8000);
	    
	    WebDriverWait wait6 = new WebDriverWait(driver, 10);
	    WebElement enterquestion21 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
	    enterquestion21.sendKeys("IOS Smart Phone - 16GB");
	    Thread.sleep(5000); 
	    
	    WebElement settings11=driver.findElement(By.xpath("//ion-icon[@name='settings']"));
	    settings11.click();
	    Thread.sleep(5000);
	    
	    WebElement multi11=driver.findElement(By.xpath("//ion-icon[@name='done-all']"));
	    multi11.click();
	    Thread.sleep(5000);
	         
	    
	    WebElement mandatory1=driver.findElement(By.xpath("//ion-icon[@name='alert']"));
	    mandatory1.click();
	    Thread.sleep(5000);
	    
	    WebElement ok1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
	    ok1.click();
	    Thread.sleep(5000);
	    
	    WebElement answer11=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer11.sendKeys("yes");
	    Thread.sleep(5000);
	    
	    WebElement plus1=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus1.click();
	    Thread.sleep(5000);
	    
	    WebElement answer21=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer21.sendKeys("no");
	    Thread.sleep(5000);
	    
	    WebElement plus21=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus21.click();
	    Thread.sleep(5000);
	    
	    WebElement answer31=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer31.sendKeys("ok");
	    Thread.sleep(5000);
	    
	    WebElement plus31=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus31.click();
	    Thread.sleep(5000);
	    
	    WebElement answer41=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer41.sendKeys("ok");
	    Thread.sleep(5000);
	    	        	    
	    WebElement cross1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
	    cross1.click();
	    Thread.sleep(5000);
	    
	    WebElement select11=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    select11.click();
	    Thread.sleep(5000);
	   
	    
	    Actions act=new Actions(driver);					
	   // act.dragAndDrop(enterquestion1,enterquestion21).build().perform();	
	    //act.dragAndDropBy(enterquestion1, 250, 150).build().perform();
	    Thread.sleep(5000);
	    act.clickAndHold(enterquestion1).moveToElement(enterquestion21).release(enterquestion21).perform();
		//Drag and Drop by Pixel.		
    
}
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://3.209.13.42:8080/app/#/webLogin");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
