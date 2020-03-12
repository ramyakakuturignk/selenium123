package GoogleSearch;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
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

public class G1 {

	public WebDriver driver;

	  @Test
	  public void Login() throws Exception,InterruptedException {
		  
		    	  
		  FileInputStream fi=new FileInputStream("C://Users//ramya//Downloads//Search.xls");
				  
	      Workbook wb= Workbook.getWorkbook(fi);
		  Sheet sh= wb.getSheet(0);
		  
		  for (int i = 0; i <sh.getRows(); i++){
			  for(int j = 0; j <sh.getColumns(); j++){		  
			  driver.findElement(By.xpath("//input[@name='q']")).click();
			  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(sh.getCell(j,i).getContents());
			  
			  driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
			  Thread.sleep(2000);
			  driver.get("http://www.google.com");
			  driver.findElement(By.xpath("//input[@name='q']")).clear();	  
		     }
		 }
}
	  @BeforeTest
	  public void beforeTest() {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver.exe");

  
		  driver = new ChromeDriver();
		  driver.get("http://www.google.com");

			// driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		

				
		  
		  
	  }
	  
}