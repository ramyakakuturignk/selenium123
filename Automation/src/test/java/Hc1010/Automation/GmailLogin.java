package Hc1010.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogin {

	public WebDriver driver;
	
	@Test
		public void Gamil() throws Exception {
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vramyagnk@gmail.com");
			
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("ramya@sindhu");
			
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();

			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("//body[contains(@jscontroller,'Gz34U')]")).click();
			} catch (Exception e) {
				
			}
		}
		
		
			@BeforeTest
			public void befortest() {
				
				 System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
				 
				 driver=new ChromeDriver();
				 driver.get("https://mail.google.com");
				 driver.manage().window().maximize();
				 
			}
		
	}
	
	
	
	

