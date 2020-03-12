package oteller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tellerregister {

	public WebDriver driver;
	
	

	@Test
	public void Tellerregister()throws  InterruptedException{

	
		 WebElement loginregister=driver.findElement(By.xpath("//b[@class='first en-US']"));
		 loginregister.click();
				
		    WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Id']"));

		    Email.click();
		    Email.sendKeys("vramyagnk128@gmail.com");
		    
		    WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']"));

		    pwd.click();
		    pwd.sendKeys("Ramya@124");
		    
	
		    WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']"));

		    firstname.click();
		    firstname.sendKeys("Ramya");
		    
	
		    WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']"));

		    lastname.click();
		    lastname.sendKeys("kvn");
		    
	
		    WebElement mobileno=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));

		    mobileno.click();
		    mobileno.sendKeys("9871234561");
		    
		    WebElement language=driver.findElement(By.xpath("//div[@id='rowheader']"));
		    language.click();
		    WebElement registerbutton=driver.findElement(By.xpath("//button[@class='submit en-US']"));

		    registerbutton.click();
		    //registerbutton.sendKeys("9871234561");
		    
		    
}
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://3.209.13.42:8080/app/#/webLogin");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
