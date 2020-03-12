package mysetup;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Clinica {

	public WebDriver driver;
	@Test
  public  void outpatientdashboard() throws Exception {
		
		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

	    driver.findElement(By.xpath("//*[@id='login']")).click();
	    Thread.sleep(2000);
	    
	      
	  
	    driver.findElement(By.xpath("//a[@href='#/mysetup']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[@href='#/out-patients']")).click();
	    
       Thread.sleep(3000);

	   driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[1]")).click();
	}
	
	@Test
	public void ReviewLabReports() throws Exception{
		
        driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("cadmin@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='center']")).sendKeys("Apollo Clinic");
		
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("test");

	    driver.findElement(By.xpath("//*[@id='login']")).click();
	    Thread.sleep(2000);
	    
	      
	    driver.findElement(By.xpath("//a[@href='#/out-patients']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2/div[2]/mat-card[3]/mat-card-content")).click();
	
	    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p3/div[3]/mat-card/div[2]/mat-icon")).click();
	}
	
	//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
    @Test
    public void Appointments() throws Exception{
    	
       
	    
    	
    	driver.findElement(By.xpath("//a[@href='#/appointments']")).click();
    	driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[3]/div/mwl-calendar-month-view/div/div/div[3]/div/mwl-calendar-month-cell[3]/div[1]")).click();
    	driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page4/div[2]/div[2]/div[2]/button[2]")).click();
    }
	//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1/div[2]/div[3]/mat-card[1]/div[2]/mat-icon")).click();
	
	

	
	@BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://ec2-54-91-134-60.compute-1.amazonaws.com:8080/clinica/dist/#/login");
			 driver.manage().window().maximize();
			//return beforeTest();
			 
	  }

}