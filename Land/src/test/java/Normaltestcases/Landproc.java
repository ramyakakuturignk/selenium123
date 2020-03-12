package Normaltestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Landproc {
	private static final WebElement root1=null;
	//private static final String ""//input-class[@id='first']/ion-input = null;
	//public static final WebDriver WebdriverName=null;
	public static WebDriver driver;
	
	@Test
  public  void Login() throws InterruptedException {
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	

    	 driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile#/Email Id']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile#/Email Id']")).sendKeys("6379039922");

	
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@placeholder='Enter Org Code']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Enter Org Code']")).sendKeys("emp");

		driver.findElement(By.xpath("//button[@id='login']")).click();
		Thread.sleep(5000);
	}
	    @Test
		public  void Request() throws InterruptedException, NullPointerException {
	    	System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://3.209.13.42:8080/landproc/#/login");
			 driver.manage().window().maximize();
			 
	    	

	    	 driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile#/Email Id']")).click();
		     driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile#/Email Id']")).sendKeys("6379039922");

		
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test@123");
			driver.findElement(By.xpath("//input[@placeholder='Enter Org Code']")).click();

			driver.findElement(By.xpath("//input[@placeholder='Enter Org Code']")).sendKeys("emp");

			driver.findElement(By.xpath("//button[@id='login']")).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Request Survey')]")).click();
		Thread.sleep(9000);
/*
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("//input[@class='native-input sc-ion-input-md']")));
		Thread.sleep(5000);
		*/
		JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
		WebElement shadowAnchorElementSelector=driver.findElement(By.xpath("//ion-input[@id='first']"));
		shadowAnchorElementSelector.click();

		shadowAnchorElementSelector.sendKeys("ramya");
		WebElement shadowRootElement = null;

		//By shadowAnchorElementSelector = By.cssSelector("a");
		
		WebElement shadowRoot;
		JavascriptExecutor jsExec = null;
		shadowRoot =  (WebElement) jsExec.executeScript("return arguments[0].shadowRoot;", shadowRootElement);
		WebElement anchor = shadowRoot.findElement((By.xpath("//ion-input[@id='first']")));
		anchor.click();
		
	    }
		/*
		WebElement shadowRoot1 = expandRootElement(root1);
		
		WebElement root2 = shadowRoot1.findElement(By.xpath("//div[@class='section']"));
		WebElement shadowRoot2 = expandRootElement(root2);

		WebElement root3 = shadowRoot2.findElement(By.xpath("//body/app-root/div[@class='flexCol']/div[@class='section']/app-reqsurvey[@class='ng-star-inserted']/section[@class='ng-star-inserted']/div[1]"));
		WebElement shadowRoot3 = expandRootElement(root3);

		String actualHeading = shadowRoot3.findElement(By.xpath("//ion-input[@id='first']")).getText();
		// Verify header title
		//Assert.assertEquals("Downloads", actualHeading);
		//return actualHeading;

	}
	/*
		WebElement first=driver.findElement(By.xpath("//input-class[@id='first']/ion-input"));
		first.click();
		first.sendKeys("ramya");
		WebElement myElement = driver.findElement(By.id("first"));
		WebElement parent = myElement.findElement(By.xpath("//input[@class='_ngcontent-wlr-c9']"));
		WebElement last=driver.findElement(By.xpath("//ion-input[@id='last']"));
		last.sendKeys("k");
		/*
		driver.findElement(By.id("cantact")).sendKeys("6379039922");
		driver.findElement(By.id("address")).sendKeys("ambattur");
		driver.findElement(By.id("city")).sendKeys("chennai");
		driver.findElement(By.id("state")).sendKeys("tamilnadu");
		driver.findElement(By.id("landsurvey")).sendKeys("8985");
		return last;
	}
	*/
		/*
	Object getExtShadowRoot() throws InterruptedException {
			  int shadowHost;
			  wait (shadowHost = driver.findElement(By.xpath("//input-class[@id='first']/ion-input")));
			  return  ((RemoteWebDriver) driver).executeScript("return arguments[0].shadowRoot",                                                                 shadowHost);
			}
		
		public WebElement expandRootElement(WebElement element) {
			WebElement ele = (WebElement) ((JavascriptExecutor)driver)
		.executeScript("return arguments[1].shadowRoot", element);
			return ele;
		}
		*/
	@BeforeTest
	  public void beftoreTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://3.209.13.42:8080/landproc/#/login");
			 driver.manage().window().maximize();
			//return beforeTest();
			 
	  }

}
