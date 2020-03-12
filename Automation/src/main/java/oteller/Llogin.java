package oteller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Llogin {

	public WebDriver driver;
	
	@Test
	 public void test() throws InterruptedException{
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

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://3.209.13.42:8080/app/#/webLogin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}