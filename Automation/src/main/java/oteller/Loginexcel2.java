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

	public class Loginexcel2 {
		
		public WebDriver driver;

	  @Test
	  public void Login() throws Exception,InterruptedException {
		
		  
		    	  
		  FileInputStream fi=new FileInputStream("C://Users//ramya//Downloads//login-10.xls");
				  
	      Workbook wb= Workbook.getWorkbook(fi);
		  Sheet sh= wb.getSheet(0);
		 
		 		  
			  driver.findElement(By.xpath("//input[@id='email']")).click();
			  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("6379039922");
			    driver.findElement(By.xpath("//input[@id='pass']")).click();
			 	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@123");	  
			 	 driver.findElement(By.xpath("//button[@id='login']")).click();
			 	 Thread.sleep(3000);
			 	  
			 	driver.findElement(By.xpath("//strong[contains(text(),'More')]")).click();
	        	driver.findElement(By.xpath("//h4[contains(text(),'Manage Template')]")).click();
				 
	        	Thread.sleep(3000);
					
				driver.findElement(By.xpath("//img[@id='addtem']")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[contains(text(),'A Simple Survey comprises of not more than 5 quest')]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//textarea[@id='Surveyname']")).sendKeys("Ramya Survey");
				Thread.sleep(3000);

				driver.findElement(By.xpath("//textarea[@id='Surveyname']")).click(); 
				Thread.sleep(3000);

				driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).sendKeys("Ramya Survey description");
				Thread.sleep(3000);

				driver.findElement(By.xpath("//textarea[@id='Surveydescription']")).click();
				Thread.sleep(3000);
				
				
				  for (int i = 0; i <sh.getRows(); i++)
				  {
					  for(int j=0;j<sh.getColumns();j++){
							 
						  
						  driver.findElement(By.xpath("//img[@id='AddQuestion']")).click(); 
							  driver.findElement(By.xpath("//textarea[@id='question']")).sendKeys(sh.getCell(j,i).getContents());;
							 // driver.findElement(By.xpath("//textarea[@id='question']")).click(); 
							  driver.findElement(By.xpath("//div[@class='settings']//img")).click();
							  Thread.sleep(5000);
							  driver.findElement(By.xpath("//div[@class='select none']//div[1]//img[1]")).click(); 
							  Thread.sleep(5000);
							  driver.findElement(By.xpath("//div[@class='rowfooter none']//div[3]//img[1]")).click(); 
							  Thread.sleep(5000);
							  
							  for(int k=1;k<sh.getRows();k++){
							  driver.findElement(By.xpath("//img[@id='Addoption']")).click();
							  Thread.sleep(5000);
							  driver.findElement(By.xpath("//textarea[@id='options']")).click();
							  Thread.sleep(5000);
							  driver.findElement(By.xpath("//textarea[@id='options']")).sendKeys(sh.getCell(k,i).getContents());
							  Thread.sleep(5000);

							  driver.findElement(By.xpath("//img[@src='assets/images/correct.png']")).click();
							  Thread.sleep(5000);
							  
							//  Thread.sleep(5000);
							// driver.findElement(By.xpath("//img[@src='assets/images/cancel.png']")).click();
							 
						  }
							//  WebElement tick1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
					        //   tick1.click();
							 
					  }
					  
					  
				  }
				  driver.findElement(By.xpath("//img[@src='assets/images/save.png']")).click(); 
				  Thread.sleep(5000);
		           
				  }
				  
				   
				  
		          
	       

		       
		  
		  


	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver.exe");

			  
		  driver = new ChromeDriver();

			// driver=new FirefoxDriver();
			driver.get("http://3.209.13.42:8080/app/#/weblogin");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		

				
		  
		  
	  }
	}


