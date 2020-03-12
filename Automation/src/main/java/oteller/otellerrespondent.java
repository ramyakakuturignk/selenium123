package oteller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class otellerrespondent {

	public WebDriver driver;
	
	@Test
	public void Tellerrespondent()throws  InterruptedException{


	    WebElement loginemail2=driver.findElement(By.xpath("//input[@id='email']"));

	    loginemail2.click();
	    loginemail2.sendKeys("6379039922");
		
	    WebElement loginpass2=driver.findElement(By.xpath("//input[@id='pass']"));

	    loginpass2.click();
	    loginpass2.sendKeys("Ramya@12");
		
	    
	    WebElement loginbutton3=driver.findElement(By.xpath("//button[@id='login']"));
        loginbutton3.click();
        Thread.sleep(5000);

    
        WebElement respondent=driver.findElement(By.xpath("//b[@class='btn-active']"));
        respondent.click();
        Thread.sleep(5000);

        WebElement pendingsurveys=driver.findElement(By.xpath("//b[contains(text(),'Pending Surveys')]"));
        pendingsurveys.click();
        Thread.sleep(5000);
        
        WebElement surveyname2=driver.findElement(By.xpath("//div[contains(text(),'test answer override')]"));
        surveyname2.click();
        Thread.sleep(5000);
        
        WebElement surveyoption1=driver.findElement(By.xpath("//b[contains(text(),'a11')]"));
        surveyoption1.click();
        Thread.sleep(5000);
              /*  
        WebElement surveyoption2=driver.findElement(By.xpath("//b[contains(text(),'ty8y8fyft7yf')]"));
        surveyoption2.click();
        Thread.sleep(5000);
        
        WebElement surveyoption3=driver.findElement(By.xpath("//b[contains(text(),'9gu8ug9g9u9u')]"));
        surveyoption3.click();
        Thread.sleep(5000);
        */
        
        WebElement next=driver.findElement(By.xpath("//img[@src='assets/images/forward.png']"));
        next.click();
        Thread.sleep(5000);
        
        
        WebElement comment=driver.findElement(By.xpath("//textarea[@placeholder='Enter your comment']"));
        comment.click();
        comment.sendKeys("survey submitted");
        Thread.sleep(5000);
        
        WebElement submitbutton=driver.findElement(By.xpath("//img[@src='assets/images/submit.png']"));
        submitbutton.click();
        Thread.sleep(5000);
        
        WebElement completedsurveys=driver.findElement(By.xpath("//b[contains(text(),'Completed Surveys')]"));
        completedsurveys.click();
        Thread.sleep(5000);
        
        WebElement completedsearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        completedsearch.click();
        completedsearch.sendKeys("de");
        Thread.sleep(5000);
        
        WebElement pendingsurveys1=driver.findElement(By.xpath("//b[contains(text(),'Pending Surveys')]"));
        pendingsurveys1.click();
        Thread.sleep(5000);
        
        WebElement pendingsearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        pendingsearch.click();
        pendingsearch.sendKeys("df");
        Thread.sleep(5000);
        
        
        
}
@BeforeTest
public void beforeTest() {

System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://3.209.13.42:8080/app/#/webLogin");
  driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
}