package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginmultibrowser {

	public WebDriver driver;
	
	@Test
	 public void test() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://3.209.13.42:8080/app/#/webLogin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement loginemail1 = driver.findElement(By.xpath("//input[@id='email']"));

		loginemail1.click();
		loginemail1.sendKeys("6379039922");

		WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

		loginpass.click();
		loginpass.sendKeys("Ramya@12");

		WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
		loginbutton2.click();
		
		Thread.sleep(5000);
}
	/*
	public class TestNGMultiBrowserDemo {

		public WebDriver driver = null;
		// String projectPath=System.getProperty("user.dir");

		@Parameters({ "browserName" })

		@BeforeTest

		public void setup(@Optional("firefox") String browserName) {
			System.out.println("Browser name is:" + browserName);
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");

				// System.setProperty("webdriver.chrome.driver","projectPath"+"/drivers/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();

			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				System.out.println("Browser name is:" + browserName);

				System.setProperty("webdriver.gecko.driver", "E:/library/geckodriver.exe");

				// System.setProperty("webdriver.gecko.driver","projectPath"+"/drivers/firefoxdriver/firefoxdriver.exe");
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.out.println("Browser name is:" + browserName);

				System.setProperty("webdriver.ie.driver", "E:/library/IEDriverServer.exe");

				// System.setProperty("webdriver.ie.driver","projectPath"+"/drivers/iedriver/iedriver");
				driver = new InternetExplorerDriver();

			}

		}

}*/
}
