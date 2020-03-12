package mysetup;

import org.testng.annotations.Test;
import org.apache.xpath.operations.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HC1010Login02 {
  
	public WebDriver driver;
	@Test
  public  void outpatient() throws Exception {
		
  //int medicine = 0;
		
driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("doctor@gmail.com");

driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

//login
driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
		+ "app-login/div/form/div[1]/div/button/span")).click();
Thread.sleep(2000);

//outpatient

driver.findElement(By.xpath("//a[@href='#/out-patients']")).click();
Thread.sleep(2000);

//today-appointments

driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div"
		+ "[2]/app-page2/div[2]/mat-card[1]")).click();
Thread.sleep(2000);
//appointment card

Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[4]/mat-card/div[2]/mat-icon")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[5]/mat-card/div[2]/mat-icon")).click();
//driver.findElement(By.cssSelector(".edit > mat-icon:nth-child(1)")).click();
//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card/div[2]/mat-icon")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='mat-input-19']")).sendKeys("message");

driver.findElement(By.id("bp")).sendKeys("110");
Thread.sleep(2000);
driver.findElement(By.id("height")).sendKeys("5");
Thread.sleep(2000);
driver.findElement(By.id("kgs")).sendKeys("75");
Thread.sleep(2000);
driver.findElement(By.id("issueSummary")).sendKeys("Fever");
Thread.sleep(2000);
driver.findElement(By.id("issueDetails")).sendKeys("Fever");
Thread.sleep(2000);
//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-popper1/div/div[7]/button[1]")).click();
//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[1]/div/button[1]/span")).click();

//add medicine
driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[3]/button")).click();

//driver.findElement(By.xpath("//*[@id='medi'])")).sendKeys("Amox");
    
//driver.findElement(By.xpath("//*[@id='medi'or @id='mat-option-7' ]")).sendKeys("Amox");

//driver.findElement(By.xpath("//*[@id='mat-option-7']/span")).click();
//driver.findElement(By.className("@class='mat-option-text')").name(" Amox ")).click();
driver.findElement(By.cssSelector("input[placeholder='Enter min 3 characters']")).sendKeys("Amox");


//frequency-checkbox
//driver.findElement(By.id("f1-input")).click();
driver.findElement(By.xpath("//*[@id='f1']/label/div")).click();
//*[@id="f1"]/label/div
//before food
//driver.findElement(By.id("bf-input")).click();
driver.findElement(By.xpath("//*[@id='bf']/label/div")).click();


//duration
//driver.findElement(By.id("duration")).sendKeys("3");
driver.findElement(By.xpath("//*[@id='duration']")).sendKeys("3");

//dropdown
//driver.findElement(By.id("preferPharm")).sendKeys("Swasti Pharamcy");
driver.findElement(By.xpath("//*[@id='preferPharm']")).sendKeys("Sri Aarogya Pharmacy");
//*[@id="mat-option-3"]/span/span
driver.findElement(By.xpath("//*[@id='mat-option-3']/span/span")).click();


//*[@id="preferPharm"]
//additional instructions
driver.findElement(By.xpath("//*[@id='instruction']")).sendKeys("take medicine without fail");


//add button
driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-popper1/div/div[7]/button[1]")).click();
//*[@id="mat-dialog-0"]/app-popper1/div/div[7]/button[1]/span
//Cancel button

//driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-popper1/div/div[7]/button[3]/span")).click();

//Add LabTest
//driver.findElement(By.xpath("")).click();
//driver.findElement(By.xpath("")).click();

//Search button
driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[1]/div/button[1]/span")).click();



	}
		
  
 

@BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://192.168.1.18:8080/fv35/index.html");
		 driver.manage().window().maximize();
		//return beforeTest();
		 
  }

}
