package oteller;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DatadrivenLogin {
	
	public WebDriver driver;

	
	
	 @Test(dataProvider="Authentication")
	
	public void test(String email,String password,String qname,String qdescription,String option1,String option2,String option3,String option4,String option5) throws InterruptedException{
	 
	 System.setProperty("webdriver.chrome.driver", "E:/library/chromedriver.exe");
	 
		driver = new ChromeDriver(); 
		
		driver.get("http://3.209.13.42:8080/app/#/weblogin");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);; 
			
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);;

        driver.findElement(By.xpath("//button[@id='login']")).click();
				
			  
		 	 Thread.sleep(5000);
		 	  
		driver.findElement(By.xpath("//strong[contains(text(),'More')]")).click();
			
					
  	   driver.findElement(By.xpath("//h4[contains(text(),'Manage Template')]")).click();
			
				
			driver.findElement(By.xpath("//img[@id='addtem']")).click();
			
				
			driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]")).click();
			
			Thread.sleep(5000);
				
			 driver.findElement(By.xpath("//textarea[@id='Surveyname']")).sendKeys(qname);
			 driver.findElement(By.xpath("//textarea[@id='Surveyname']")).click();
			
			  Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).sendKeys(qdescription);
			  driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).click();
			
			  Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("//img[@id='AddQuestion']")).click(); 
			  
			  
			  driver.findElement(By.xpath("//textarea[@id='question']")).sendKeys(option1);
			  driver.findElement(By.xpath("//textarea[@id='question']")).click(); 
			  
			  
			  driver.findElement(By.xpath("//div[@class='settings']//img")).click();
			  
			 driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")).click(); 
			  
			  /*
			  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
			  mandatory.click(); Thread.sleep(5000);
			  */
			  driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")).click(); 
			  
			  driver.findElement(By.xpath("//textarea[@id='options']")).click();
			  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(option2);
			 
			 			  
			  driver.findElement(By.xpath("//img[@id='Addoption']")).click();;
			  
			 driver.findElement(By.xpath("//textarea[@id='options']")).click();
			  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(option3);
			 
			 
			  
			  
			  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
			  
			  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(option4);
			  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
			  
			  
			  
			 driver.findElement(By.xpath("//img[@id='Addoption']")).click();
			  
			  
			  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(option5);
			  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
			 
			  
			  
			  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
			  
			  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
				
			  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(option1);
			 
			  
			  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
			 
			  
			  driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']")).click();
			  
			  driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")).click(); 
			  
			 driver.findElement(By.xpath("//img[@src='assets/images/save.png']")).click(); 
			  
	          
		  
		/*
		Assert.assertEquals(driver.getTitle(),"User is not able to login invalid Credentials");
		System.out.println("user is able to login valid credentials");
		*/

}
	 /*
    @DataProvider(name="OTeller")
	public Object[][] passdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="6379039922";
		data[0][1]="Ramya@12";
		data[0][2]="Ramya@12";
		data[0][3]="Ramya@12";
		data[0][4]="Ramya@12";
		data[0][5]="Ramya@12";
		data[0][6]="Ramya@12";
		data[0][7]="Ramya@12";
		return data;
	}
	*/
	 @DataProvider(name="Authentication")
	 
	    public Object[][] Authentication() throws Exception{
	 
	         Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//ramya//Downloads//login-10.xls","Sheet1");
	 
	         return (testObjArray);
	 
	 }
	}