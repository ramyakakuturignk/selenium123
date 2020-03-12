package Hc1010.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hclogin {
public WebDriver driver;
	
	@Test
		public void Login() throws Exception {
		

		
			driver.findElement(By.xpath(("//*[@id='mat-input-0']"))).sendKeys("doctor@gmail.com");
						
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id='mat-input-1']")).sendKeys("test");
			
			driver.findElement(By.xpath("//*[@id='black']/button")).click();

			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("//*[@id='black']/button")).click();
			} catch (Exception e) {
				
			}
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//a[contains(@href='#/home')")).click();
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page1/div[2]/mat-card[1]/div/div/div/span")).click();
			Thread.sleep(1000);
			
			try{
						
            driver.findElement(By.xpath("/html/body/app-root/div[1]/div[2]/div/app-todaysapp/div[8]/div[2]/mat-card[2]/div/div[3]/div[2]/button")).click();			
			driver.findElement(By.xpath("//*[contains(@class='tray' @tabindex='0')OR[text()='Start Diagnosis']")).click();
			driver.findElement(By.xpath("//*[contains(@class='mat-icon material-icons' @tabindex='0')and[text(),'play_arrow']")).click();

            driver.findElement(By.xpath("//*[contains(@text()='Start Diagnosis')]")).click();

			

		}catch(Exception e){}
			
			
	}
			
			@BeforeTest
			public void befortest() {
				//String projectPath=System.getProperty("user.dir");
				//System.out.println(projectPath);
				// System.setProperty("webdriver.chrome.driver","projectPath"+"/drivers/chromedriver/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
				 driver=new ChromeDriver();
				//driver=new FirefoxDriver();
				// driver=new InternetExplorerDriver();
				 driver.get("http://192.168.1.46:8080/fv12/index.html");
				 driver.manage().window().maximize();
				 
			}
		
	}

