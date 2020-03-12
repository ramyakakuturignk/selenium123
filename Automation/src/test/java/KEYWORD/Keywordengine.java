package KEYWORD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Keywordengine {

	public WebDriver driver;
	public Properties prop;
	
	public static Workbook book;
	public static Sheet sheet;
	 public Base base;
	
	public final String SCENARIO_SHEET_PATH ="Users/ramya/workspace1/Automation/src/test/java/KEYWORD/logink.xls";
	
	public final   int startExcution(String sheetName) throws IOException{
		String	locatorName=null;
	String	locatorValue=null;
		
		FileInputStream file=null;
		try{
			file=new FileInputStream(SCENARIO_SHEET_PATH);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
			//book=WorkbookFactory.create(file);
		
	

	
	sheet=book.getSheet(sheetName);
	int k=0;
	for(int i=0;i<sheet.getLastRowNum();i++){
		String locatorColValue = sheet.getRow(i+1).getCell(k+1).toString().trim();
		if(!locatorColValue.equalsIgnoreCase("NA")){
			 locatorName = locatorColValue.split("=")[0].trim();
			 locatorName = locatorColValue.split("=")[1].trim();
		}
		String action=sheet.getRow(i+1).getCell(k+2).toString().trim();
		String value=sheet.getRow(i+1).getCell(k+2).toString().trim();
       
		switch (action) {
		case "open browser":
			base=new Base();
			prop=base.init_properties();
			if(value.isEmpty()||value.equals("NA")){
				driver=base.init_driver(prop.getProperty("browser"));
			}else{
				driver=base.init_driver(value);
			}
			break;

		
		case "enter url":
			if(value.isEmpty()||value.equals("NA")){
				driver.get(prop.getProperty("url"));
			}else{
				driver.get(value);
			}
			break;
		case "quit":
			driver.quit();
			break;
		default:
			break;
		}
		
		switch(locatorName){
		case "id":
			WebElement element=driver.findElement(By.id(locatorColValue));
			if(action.equalsIgnoreCase("sendkeys")){
				element.clear();
				element.sendKeys(value);
			}else if(action.equalsIgnoreCase("click")){
				element.click();
			}
			locatorName=null;
			break;
		}
		
	}
	return k;
}
}
