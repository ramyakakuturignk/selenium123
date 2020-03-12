package oteller;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class OTellerLogin extends Thread{

	public WebDriver driver;

	@Test(threadPoolSize = 5, invocationCount = 10, timeOut = 10000) 
	/*
	class TestNG {

	    @Test(timeOut = 10000)
	    public void waitLongTime() throws Exception {
	        Thread.sleep(5000);
	    }
	}
	*/
	public void run() {

		Map<String, String> userCreds = new HashedMap();
		userCreds.put("6379039922", "Ramya@12");
		/*userCreds.put("+915896321474", "Test@123");
		userCreds.put("+919014487444", "Test@123");
		userCreds.put("+918939222996", "Test@123");
		userCreds.put("+914793128153", "Test@123");
		userCreds.put("+919159599595", "Test@123");
		userCreds.put("+918248748940", "Test@123");
		userCreds.put("+917674191630", "Test@123");
		userCreds.put("+919791036557", "Test@123");

		*/
		
		for (String userId : userCreds.keySet()) {

			new Thread().start();
			WebElement loginemail1 = driver.findElement(By.xpath("//input[@id='email']"));

			loginemail1.click();
			loginemail1.sendKeys(userId);

			WebElement loginpass = driver.findElement(By.xpath("//input[@id='pass']"));

			loginpass.click();
			loginpass.sendKeys(userCreds.get(userId));

			WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='login']"));
			loginbutton2.click();
			//Thread.sleep(5000);
		}
		
		/*
		 * 
		 * WebElement poll =
		 * driver.findElement(By.xpath("//b[contains(text(),'Pollster')]"));
		 * poll.click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement createnewsurvey = driver.findElement(By.
		 * xpath("//b[contains(text(),'Create New Survey')]"));
		 * createnewsurvey.click(); Thread.sleep(5000);
		 * 
		 * WebElement simplesurvey = driver .findElement(By.
		 * xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
		 * )); simplesurvey.click(); Thread.sleep(5000);
		 * 
		 * WebElement surveylogo =
		 * driver.findElement(By.xpath("//img[@alt='Add Logo']"));
		 * surveylogo.click(); surveylogo.
		 * sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg "
		 * ); Thread.sleep(5000);
		 * 
		 * WebElement surveyname = driver.findElement(By.
		 * xpath("//textarea[@placeholder='Enter minimum 5 char']"));
		 * surveyname.click(); surveyname.sendKeys("ramyasurveyautomation");
		 * Thread.sleep(5000);
		 * 
		 * WebElement surveydescription =
		 * driver.findElement(By.xpath("//textarea[@class='native-textarea']"));
		 * surveydescription.click();
		 * surveydescription.sendKeys("ramyasurveydescriptionautomation");
		 * Thread.sleep(5000);
		 * 
		 * WebElement addimage =
		 * driver.findElement(By.xpath("//img[@src='assets/images/quesadd.png']"
		 * )); addimage.click(); Thread.sleep(5000);
		 * 
		 * WebElement addquestion =
		 * driver.findElement(By.xpath("//input[@name='ion-input-2']"));
		 * addquestion.click(); addquestion.sendKeys("where are u going");
		 * Thread.sleep(5000);
		 * 
		 * WebElement settings = driver.findElement(By.xpath(
		 * "//img[@src='assets/images/setting2.png']")); settings.click();
		 * Thread.sleep(5000);
		 * 
		 * WebElement multi = driver.findElement(By.
		 * xpath("//div[@class='select none']//div[1]//img[1]")); multi.click();
		 * Thread.sleep(5000);
		 * 
		 * WebElement mandatory = driver.findElement(By.
		 * xpath("//div[@class='select none']//div[3]//img[1]"));
		 * mandatory.click(); Thread.sleep(5000);
		 * 
		 * WebElement done =
		 * driver.findElement(By.xpath("//img[@src='assets/images/correct.png']"
		 * )); done.click(); Thread.sleep(5000);
		 * 
		 * WebElement addanswer1 =
		 * driver.findElement(By.xpath("//input[@name='ion-input-5']"));
		 * addanswer1.click(); addanswer1.sendKeys("chennai");
		 * Thread.sleep(5000);
		 * 
		 * WebElement plus1 =
		 * driver.findElement(By.xpath("//img[@src='assets/images/plus.png']"));
		 * plus1.click(); Thread.sleep(5000);
		 * 
		 * WebElement addanswer2 =
		 * driver.findElement(By.xpath("//input[@name='ion-input-6']"));
		 * addanswer2.click(); addanswer2.sendKeys("bangalore");
		 * Thread.sleep(5000);
		 * 
		 * WebElement plus2 =
		 * driver.findElement(By.xpath("//img[@src='assets/images/plus.png']"));
		 * plus2.click(); Thread.sleep(5000);
		 * 
		 * WebElement addanswer3 =
		 * driver.findElement(By.xpath("//input[@name='ion-input-7']"));
		 * addanswer3.click(); addanswer3.sendKeys("bangalore");
		 * Thread.sleep(5000);
		 * 
		 * WebElement plus3 =
		 * driver.findElement(By.xpath("//img[@src='assets/images/plus.png']"));
		 * plus3.click(); Thread.sleep(5000);
		 * 
		 * WebElement addanswer4 =
		 * driver.findElement(By.xpath("//input[@name='ion-input-8']"));
		 * addanswer4.click(); addanswer4.sendKeys("bangalore");
		 * Thread.sleep(5000);
		 * 
		 * WebElement plus4 =
		 * driver.findElement(By.xpath("//img[@src='assets/images/plus.png']"));
		 * plus4.click(); Thread.sleep(5000);
		 * 
		 * WebElement tickmark =
		 * driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
		 * tickmark.click(); Thread.sleep(5000);
		 * 
		 * WebElement done2 =
		 * driver.findElement(By.xpath("//img[@src='assets/images/correct.png']"
		 * )); done2.click();
		 * 
		 * Thread.sleep(5000);
		 */
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
