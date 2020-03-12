package oteller;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.apache.poi.ss.usermodel.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Loginsurveyexcel {

	public WebDriver driver;

	 @Test(dataProvider="Authentication")
	  public void Login() throws Exception,InterruptedException {
		  
		    
		  
		  FileInputStream fi=new FileInputStream("C://Users//ramya//Downloads//login-10.xls");
				  
	      Workbook wb= Workbook.getWorkbook(fi);
		  Sheet sh= wb.getSheet(0);
		  
		  for (int i = 0; i <sh.getRows(); i++)
		  {
			
			  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sh.getCell(0,i++).getContents());
			  
			  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sh.getCell(0,i++).getContents());
			 	
			 	//  driver.findElement(By.xpath("//input[@id='email']")).click();
			 	 
		
			 	  
			 	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sh.getCell(1,i++).getContents());
			 	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sh.getCell(1,i++).getContents());
			 	 Thread.sleep(3000);
			 	  
			 	 // driver.findElement(By.xpath("//input[@id='pass']")).click();
			 	  
		
			 	  
			 	  driver.findElement(By.xpath("//button[@id='login']")).click();
		  
			 	 Thread.sleep(5000);
			 	 
			 	driver.findElement(By.xpath("//img[@src='assets/images/add-circle.png']")).click();
				
				 Thread.sleep(5000);
				
						  	/*	  
						  WebElement createnewsurvey3 = driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"));
						  createnewsurvey3.click(); 
						  Thread.sleep(8000);
						  /*
						  WebElement simplesurvey = driver .findElement(By.
						  xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]"
						  )); simplesurvey.click(); Thread.sleep(5000);
						  /*
						  WebElement surveylogo =
						  driver.findElement(By.xpath("//img[@alt='Add Logo']"));
						  surveylogo.click(); surveylogo.
						  sendKeys("/C:/Users/ramya/15825861_1154921291210290_5622303824032248476_n(1).jpg "
						  ); Thread.sleep(5000);
						  */
			 	
					
				driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]")).click();
				
				Thread.sleep(5000);
					
				 driver.findElement(By.xpath("//textarea[@id='Surveyname']")).sendKeys(sh.getCell(3,i++).getContents());
				 driver.findElement(By.xpath("//textarea[@id='Surveyname']")).click();
				
				  Thread.sleep(5000);
				  
				  driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).sendKeys(sh.getCell(4,i++).getContents());
				  driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).click();
				
				  Thread.sleep(5000);
				  
				  driver.findElement(By.xpath("//img[@id='AddQuestion']")).click();; 
				  
				  
				  driver.findElement(By.xpath("//textarea[@id='question']")).sendKeys(sh.getCell(5,i++).getContents());
				  driver.findElement(By.xpath("//textarea[@id='question']")).click(); 
				  
				  
				  driver.findElement(By.xpath("//div[@class='settings']//img")).click();
				  
				 driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")).click(); 
				  
				  /*
				  WebElement mandatory = driver.findElement(By.xpath("//div[@class='select none ng-star-inserted']//div[3]//img[1]"));
				  mandatory.click(); Thread.sleep(5000);
				  */
				  driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")).click(); 
				  
				  driver.findElement(By.xpath("//textarea[@id='options']")).click();
				  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(6,i++).getContents());
				 
				 			  
				  
				 driver.findElement(By.xpath("//img[@id='Addoption']")).click();
				  
				 driver.findElement(By.xpath("//textarea[@id='options']")).click();
				  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(7,i++).getContents());
				 
				 
				  
				  
				  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
				  
				  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(8,i++).getContents());
				  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
				  
				  
				  
				 driver.findElement(By.xpath("//img[@id='Addoption']")).click();
				  
				  
				  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(9,i++).getContents());
				  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
				 
				  
				  
				  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
				  
				  driver.findElement(By.xpath("//textarea[@id='options']")).click(); 
					
				  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(10,i++).getContents());
				  
				  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
				 
				  
				  driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']")).click();
				  
				  driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")).click(); 
				  
				 driver.findElement(By.xpath("//img[@src='assets/images/save.png']")).click(); 
				  
		          
	       

		       
		  }
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver.exe");

			  
		  driver = new ChromeDriver();

			// driver=new FirefoxDriver();
			driver.get("http://3.209.13.42:8080/app/#/webLogin");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		

				
		  
		  
	  }
	}

