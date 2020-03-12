package oteller;


import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class otellerforgotpassword {

	public WebDriver driver;
	
	@Test
	public void Tellerforgotpassword()throws  InterruptedException{
		
		  WebElement forgotpassword=driver.findElement(By.xpath("//b[@class='second en-US']"));
		  forgotpassword.click();
		Thread.sleep(5000);
		
		 WebElement emailgiven=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Id']"));
		 emailgiven.click();
		 emailgiven.sendKeys("vramyagnk@gmail.com");
		Thread.sleep(5000);
		
		WebElement sendotp=driver.findElement(By.xpath("//button[@id='but1']"));
		sendotp.click();
		 Thread.sleep(5000);
		
		 WebElement enterotp=driver.findElement(By.xpath("//div[@class='input']//input[@placeholder='Enter OTP']"));
		 enterotp.click();
		 enterotp.sendKeys("854210");
			 Thread.sleep(5000);
		
			 WebElement validate=driver.findElement(By.xpath("//button[@id='but2']"));
			 enterotp.click();
			 Thread.sleep(5000);
			 
			 WebElement newpassword=driver.findElement(By.xpath("//input[@placeholder='Enter New Password']"));
			 newpassword.click();
			 newpassword.sendKeys("Ramya@1");
			 Thread.sleep(5000);
			 
			 WebElement confirmpassword=driver.findElement(By.xpath("//input[@placeholder='Confirm Your Password']"));
			 confirmpassword.click();
			 confirmpassword.sendKeys("Ramya@1");
			 Thread.sleep(5000);
			 
			 WebElement okbutton=driver.findElement(By.xpath("//button[@id='but1']"));
			 okbutton.click();
			 Thread.sleep(5000);
			 
			 
		
	}
	@BeforeTest
	public void beforeTest() {

	System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://54.91.134.60:8080/1.8.6/index.html");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
