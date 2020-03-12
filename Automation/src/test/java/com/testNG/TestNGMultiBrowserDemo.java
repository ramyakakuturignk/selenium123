/*package com.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

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

	@Test
	public void Login() throws NullPointerException {

		driver.get("http://192.168.1.46:8080/cv12");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin@gmail.com");

		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");

		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

		driver.findElement(By.xpath("//*[@id='login']")).click();

	}

}
*/