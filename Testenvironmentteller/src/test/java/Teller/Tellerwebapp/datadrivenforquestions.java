package Teller.Tellerwebapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class datadrivenforquestions {
	//public static final CellType CELL_TYPE_FORMULA = null;
	
	//public  final CellType CELL_TYPE_FORMULA = null;
	//public  final CellType CELL_TYPE_STRING = null;
	//public  final CellType CELL_TYPE_BLANK = null;
	//public  final CellType CELL_TYPE_NUMERIC = null;
	XSSFWorkbook excelWorkbook = null;
	XSSFSheet excelSheet = null;
	XSSFRow row = null;
	XSSFCell cell = null;
	WebDriver driver = null;
	int i=0;
	
	//dataProvider value should be equal to @DataProvider method name
	@Test
	public void Login() throws InterruptedException { //no. of parameter = no. of columns
	//if(browser.equals("firefox")){
	//driver = new FirefoxDriver();
	//System.setProperty("webdriver.firefox.driver", "C:\\Users\\ramya\\workspace1\\Testenvironmentteller\\src\\test\\java\\Drivers\\hromedriver\\firefoxdriver\\geckodriver.exe");

	//} else if(browser.equals("chrome"))
	//{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\workspace1\\Testenvironmentteller\\src\\test\\java\\Drivers\\chromedriver\\chromedriver.exe");
	//driver=new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	
	  WebElement loginemail=driver.findElement(By.xpath("//input[@id='email']"));
	   

	    loginemail.click();
	    loginemail.sendKeys("6379039922");
		
			
	    WebElement loginpwd=driver.findElement(By.xpath("//input[@id='pass']"));
	    loginpwd.click();
	    loginpwd.sendKeys("Test@123");
	   

    WebElement loginbutton=driver.findElement(By.xpath("//button[@id='login']"));
    loginbutton.click();
	    Thread.sleep(5000);
	
	
	
   
	

	    WebElement poll=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
	    poll.click();
	    Thread.sleep(5000);
	  

	    WebElement create=driver.findElement(By.xpath("//mat-icon[contains(text(),'post_add')]"));
	    create.click();
	    Thread.sleep(5000);
	   

	    WebElement simple=driver.findElement(By.xpath("//strong[contains(text(),'Simple Survey')]"));
	    simple.click();
	    Thread.sleep(5000);
	
	    
	 
	    WebElement name=driver.findElement(By.xpath("//textarea[@id='sname']"));
	    name.sendKeys("ramya2222");
	    Thread.sleep(5000);
	    
	   

	    
	    WebElement description1=driver.findElement(By.xpath("//textarea[@id='description']"));
	    description1.sendKeys("description");
	    Thread.sleep(5000);
	
   

	    WebDriverWait wait = new WebDriverWait(driver, 10);	    
	    WebElement addquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
	    addquestion.click();
	    Thread.sleep(5000);
}  
@Test(dataProvider="getData")  
	    
	    public void create(String question,String answer1,String answer2,String answer3,String answer4) throws IOException,InterruptedException{

	   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
	   
	    WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    FluentWait<WebDriver> wait = null;
		WebElement enterquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
	    enterquestion.sendKeys(question);
	    Thread.sleep(5000); 
	    

	    
	    WebElement settings=driver.findElement(By.xpath("//ion-icon[@name='settings']"));
	    settings.click();
	    Thread.sleep(5000);
	    
	    WebElement multi=driver.findElement(By.xpath("//ion-icon[@name='done-all']"));
	    multi.click();
	    Thread.sleep(5000);
	    
	      
	    
	    WebElement mandatory=driver.findElement(By.xpath("//ion-icon[@name='alert']"));
	    mandatory.click();
	    Thread.sleep(5000);
	    
	    WebElement ok=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    //WebElement ok driver.findElementByXPath("(//android.widget.EditText)[4]").click();
	    ok.click();
	    Thread.sleep(5000);
	    
	    WebElement answer11=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

	    answer11.sendKeys(answer1);
	    Thread.sleep(5000);
	    
	    WebElement plus=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus.click();
	    Thread.sleep(5000);
	    
	    WebElement answer21=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer21.sendKeys(answer2);
	    Thread.sleep(5000);
	    
	    WebElement plus2=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus2.click();
	    Thread.sleep(5000);
	    
	    WebElement answer31=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer31.sendKeys(answer3);
	    Thread.sleep(5000);
	    
	  

	    WebElement plus3=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus3.click();
	    Thread.sleep(5000);
	    
	    WebElement answer41=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer41.sendKeys(answer4);
	    Thread.sleep(5000);
	    	        	    
	    WebElement cross=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
	    cross.click();
	    Thread.sleep(5000);
	    /*
	    WebElement select1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    select1.click();
	    Thread.sleep(5000);
	    */
	     
	     
	    WebElement addotherquestion=driver.findElement(By.xpath("//ion-icon[@name='help-circle']"));
	    addotherquestion.click();
	    Thread.sleep(5000);
	    
	    
	    
	    }
	@DataProvider // supplying data for a test method.
	public Object[][] getData() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\ramya\\workspace1\\Testenvironmentteller\\src\\test\\java\\den3.xlsx"); // Your .xlsx file name along with path
	excelWorkbook = new XSSFWorkbook(fis);
	// Read sheet inside the workbook by its name
	excelSheet = excelWorkbook.getSheet("Sheet1"); //Your sheet name
	// Find number of rows in excel file
	System.out.println("First Row Number/index:"+ excelSheet.getFirstRowNum() + " *** Last Row Number/index:"
	+ excelSheet.getLastRowNum());
	int rowCount = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum()+1;
	int colCount = excelSheet.getRow(0).getLastCellNum();
	System.out.println("Row Count is: " + rowCount
	+ " *** Column count is: " + colCount);
	Object data[][] = new Object[rowCount-1][colCount];
	for (int rNum = 2; rNum <= rowCount; rNum++) {
	for (int cNum = 0; cNum < colCount; cNum++) {
	System.out.print(getCellData("Sheet1", cNum, rNum) + " "); // Your sheet name
	data[rNum - 2][cNum] = getCellData("Sheet1", cNum, rNum); //Your sheet name
	}
	System.out.println();
	}
	return data;
	}

	// Function will always used as below. It returns the data from a cell - No need to make any changes
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, int colNum, int rowNum) {
	try {
	if (rowNum <= 0)
	return "";
	int index = excelWorkbook.getSheetIndex(sheetName);
	if (index == -1)
	return "";
	excelSheet = excelWorkbook.getSheetAt(index);
	row = excelSheet.getRow(rowNum - 1);
	if (row == null)
	return "";
	cell = row.getCell(colNum);
	if (cell == null)
	return "";
	
	if (cell.getCellType() == cell.getCellTypeEnum().STRING)
	return cell.getStringCellValue();
	else if (cell.getCellType() ==cell.getCellTypeEnum().NUMERIC
			|| cell.getCellType() == cell.getCellTypeEnum().FORMULA) {
	String cellText = String.valueOf(cell.getNumericCellValue());
	return cellText;
	} else if (cell.getCellType() ==cell.getCellTypeEnum().BLANK)
	return "";
	else
	return String.valueOf(cell.getBooleanCellValue());
	} catch (Exception e) {
	e.printStackTrace();
	return "row " + rowNum + " or column " + colNum
	+ " does not exist in xls";
	}
		

	}
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://3.209.13.42:8080/app/#/webLogin");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
