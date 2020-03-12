package Teller.Tellerwebapp;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class publicrejectsurvey {
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Test
	public void Tellerlogin2()throws  InterruptedException,NullPointerException{

	    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
	    WebElement loginemail1=driver.findElement(By.xpath("//input[@id='email']"));
	    loginemail1.click();
	    loginemail1.sendKeys("6379039922");
		
			
	    WebElement loginpwd2=driver.findElement(By.xpath("//input[@id='pass']"));
	    loginpwd2.click();
	    loginpwd2.sendKeys("Test@123");
	    
        WebElement loginbutton2=driver.findElement(By.xpath("//button[@id='login']"));
        loginbutton2.click();
	    Thread.sleep(5000);
    
	    WebElement poll=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
	    poll.click();
	    Thread.sleep(15000);
	    /*
	    WebElement create=driver.findElement(By.xpath("//mat-icon[contains(text(),'post_add')]"));
	    create.click();
	    Thread.sleep(5000);
	    
	    WebElement simple=driver.findElement(By.xpath("//strong[contains(text(),'Simple Survey')]"));
	    simple.click();
	    Thread.sleep(5000);
	    
	    WebElement surveyexposurepublic=driver.findElement(By.xpath("//span[@class='pub']"));
	    surveyexposurepublic.click();
	    Thread.sleep(5000);
	    
	    WebElement name=driver.findElement(By.xpath("//textarea[@id='sname']"));
	    name.sendKeys("ramyasurveypublicreject");
	    Thread.sleep(5000);
	    
	    WebElement description=driver.findElement(By.xpath("//textarea[@id='description']"));
	    description.sendKeys("ramyadescription");
	    Thread.sleep(5000);
	    	  	    	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);	    
	    WebElement addquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
	    addquestion.click();
	    Thread.sleep(5000);
	    
	   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
	   
	    WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    WebElement enterquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
	    enterquestion.sendKeys("Android Smart Phone - 16GB");
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
	    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

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
	    /*
	    WebElement saveforlater=driver.findElement(By.xpath("//ion-icon[@name='timer']"));
	    saveforlater.click();
	    Thread.sleep(5000);
	    */
	    /*
	    WebElement survey2=driver.findElement(By.xpath("//mat-card[@id='check-0']//span"));
	    survey2.click();
	    Thread.sleep(5000);
	    */
	    /*
	    WebElement launch=driver.findElement(By.xpath("//ion-icon[@name='paper-plane']"));
	    launch.click();
	    Thread.sleep(5000);
	    
	    WebElement savedate=driver.findElement(By.xpath("//ion-icon[@id='Savedate']"));
	    savedate.click();
	    Thread.sleep(5000);
	   */
	    WebElement review=driver.findElement(By.xpath("//mat-icon[contains(text(),'ballot')]"));
	    review.click();
	    Thread.sleep(8000);
	    
	    WebElement selectsurvey=driver.findElement(By.xpath("//mat-card[@id='check-20']//span"));
	    //js.executeScript("window.scrollBy(0,250)");
	    //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	    //js.executeScript("window.scrollBy(0,250)");
	    selectsurvey.click();
	    Thread.sleep(5000);
	    
	    WebElement view=driver.findElement(By.xpath("//ion-icon[@name='eye']"));
	    view.click();
	    Thread.sleep(5000);
	    	 
	    WebElement approve=driver.findElement(By.xpath("//ion-icon[@name='close']"));
	    approve.click();
	    Thread.sleep(5000);
	    
	    WebElement reason=driver.findElement(By.xpath("//input[@id='mobileotp']"));
	    reason.click();
	    reason.sendKeys("nothing");
	    Thread.sleep(5000);
	    
	    WebElement reasonsave=driver.findElement(By.xpath("//button[@id='save']"));
	    reasonsave.click();
	    Thread.sleep(5000);
	}
	/*
	    @Test
	    public void Tellerlogin31()throws  InterruptedException,NullPointerException {
		    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
		    WebElement loginemail11=driver.findElement(By.xpath("//input[@id='email']"));
		    loginemail11.click();
		    loginemail11.sendKeys("6379039922");
			
				
		    WebElement loginpwd21=driver.findElement(By.xpath("//input[@id='pass']"));
		    loginpwd21.click();
		    loginpwd21.sendKeys("Test@123");
		    
	        WebElement loginbutton21=driver.findElement(By.xpath("//button[@id='login']"));
	        loginbutton21.click();
		    Thread.sleep(5000);
	    
		    WebElement poll1=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
		    poll1.click();
		    Thread.sleep(5000);
		    
		    WebElement create1=driver.findElement(By.xpath("//mat-icon[contains(text(),'post_add')]"));
		    create1.click();
		    Thread.sleep(5000);
		    
		    WebElement simple1=driver.findElement(By.xpath("//strong[contains(text(),'Simple Survey')]"));
		    simple1.click();
		    Thread.sleep(5000);
		    
		    WebElement surveyexposurepublic1=driver.findElement(By.xpath("//span[@class='pub']"));
		    surveyexposurepublic1.click();
		    Thread.sleep(5000);
		    
		    WebElement name1=driver.findElement(By.xpath("//textarea[@id='sname']"));
		    name1.sendKeys("ramyasurveypublicsurvey");
		    Thread.sleep(5000);
		    
		    WebElement description1=driver.findElement(By.xpath("//textarea[@id='description']"));
		    description1.sendKeys("ramyadescription");
		    Thread.sleep(5000);
		    
		  
		    
		    
		    WebDriverWait wait11 = new WebDriverWait(driver, 10);	    
		    WebElement addquestion1 = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
		    addquestion1.click();
		    Thread.sleep(5000);
		    
		   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
		   
		    WebDriverWait wait111 = new WebDriverWait(driver, 10);
		    WebElement enterquestion1 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
		    enterquestion1.sendKeys("Android Smart Phone - 16GB");
		    Thread.sleep(5000); 
		    
		    
		    WebElement settings1=driver.findElement(By.xpath("//ion-icon[@name='settings']"));
		    settings1.click();
		    Thread.sleep(5000);
		    
		    WebElement multi1=driver.findElement(By.xpath("//ion-icon[@name='done-all']"));
		    multi1.click();
		    Thread.sleep(5000);
		    
		      
		    
		    WebElement mandatory1=driver.findElement(By.xpath("//ion-icon[@name='alert']"));
		    mandatory1.click();
		    Thread.sleep(5000);
		    
		    WebElement ok1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
		    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
		    ok1.click();
		    Thread.sleep(5000);
		    
		    WebElement answer11=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
		    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

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
		    
		    WebElement saveforlater1=driver.findElement(By.xpath("//ion-icon[@name='timer']"));
		    saveforlater1.click();
		    Thread.sleep(5000);
		    
		    WebElement survey21=driver.findElement(By.xpath("//mat-card[@id='check-0']"));
		    survey21.click();
		    Thread.sleep(5000);
		    
		    WebElement launch1=driver.findElement(By.xpath("//ion-icon[@name='paper-plane']"));
		    launch1.click();
		    Thread.sleep(5000);
		    
		    WebElement savedate1=driver.findElement(By.xpath("//ion-icon[@id='Savedate']"));
		    savedate1.click();
		    Thread.sleep(5000);
		    
		    WebElement review1=driver.findElement(By.xpath("//mat-icon[contains(text(),'ballot')]"));
		    review1.click();
		    Thread.sleep(5000);
		    
		    WebElement selectsurvey1=driver.findElement(By.xpath("//mat-card[@id='check-20']//span"));
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		    selectsurvey1.click();
		    Thread.sleep(5000);
		    
		    WebElement view1=driver.findElement(By.xpath("//ion-icon[@name='eye']"));
		    view1.click();
		    Thread.sleep(5000);
		    
		    WebElement approve1=driver.findElement(By.xpath("//ion-icon[@name='ios-checkmark-circle']"));
		    approve1.click();
		    Thread.sleep(5000);
		   
		       	    */
		    
	
	    


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


