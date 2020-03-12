package oteller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 



public class Readdatafromexcel {

	private static final int lt = 0;


	public WebDriver driver1;

	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
		
	
    @BeforeTest
    public void initialization(){
    	 
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver.exe");

  		driver = new ChromeDriver();

  		// driver=new FirefoxDriver();
  		driver.get("http://3.209.13.42:8080/app/#/webLogin");
  		
  		
  		driver.manage().window().maximize();
  		
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

  		

    }
      
    @Test
    public void Teller() throws IOException, InterruptedException{
    // Import excel sheet.
    File src=new File("C:/Users/ramya/workspace1/Automation/src/main/java/oteller/readexcel.xlsx");   
    // Load the file.
    FileInputStream fis = new FileInputStream(src);
    // Load he workbook.
    workbook = new XSSFWorkbook(fis);
    // Load the sheet in which data is stored.
    sheet= workbook.getSheetAt(0);
    for(int i=1; i<=sheet.getLastRowNum(); i++){
    /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
    Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
    and first column (A) as 0 and second column (B) as 1 and so on*/ 
    
    // Import data for Email.
    cell = sheet.getRow(i).getCell(0);
    cell.setCellType(Cell.CELL_TYPE_STRING);
    driver.findElement(By.xpath("//input[@id='email']")).clear();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cell.getStringCellValue());
    
    // Import data for password.
    cell = sheet.getRow(i).getCell(1);
    cell.setCellType(Cell.CELL_TYPE_STRING);
    driver.findElement(By.xpath("//input[@id='pass']")).clear();  
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(cell.getStringCellValue());
    // To click on Login button
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@id='login']")).click();
    Thread.sleep(3000);
    }
    }
    
   }


