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

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Google {
	
    public static final String path = "C://Users//ramya//Downloads//Search.xls";

    public static void main(String[] args) throws IOException, InvalidFormatException {
    
    	Workbook workbook = (Workbook) WorkbookFactory.create(new File(path));
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");


    }
}