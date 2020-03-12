package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loginpage2 {
	
 
     static WebDriver driver=null;
  
  
 
  
     public Loginpage2(WebDriver driver) {
	
    	 this.driver=driver;
     }
	static By Loginemail=By.cssSelector("input[placeholder='email']");
     static By Loginpwd=By.cssSelector("input[placeholder='password']");
     static By Loginbutton=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/"
				+ "app-login/div/form/div[1]/div/button/span");
     
     static By Mysetuplink=By.xpath("//a[@href='#/mysetup']");
     By Myhealthcenter=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5/div[2]/mat-card[1]/mat-card-content");
    static By Mattable=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[2]/button[2]");
   
    static  By Addnew=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1/div[2]/div[1]/button");
    static  By State=By.cssSelector("input[placeholder='select state']");
    static  By City1=By.cssSelector("input[placeholder='select city to display']");
    static By Search=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span");
    static  By Clear1=By.cssSelector("input[placeholder='select city to display']");
    static  By City2=By.cssSelector("input[placeholder='select city to display']");
    static By Search1=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span");
    static  By Clear=By.cssSelector("input[placeholder='select city to display']");
    static By City3=By.cssSelector("input[placeholder='select city to display']");
    static By Search2=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[1]/span");
    static  By Clearfields=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[2]");
    static By Cancel=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page5p1p1/div[2]/div[1]/div/button[3]/span");
     
	
	public static void Loginemail(WebDriver driver){
		
    	 driver.findElement(Loginemail).sendKeys("doctor@gmail.com");
	     	
	}
	
	public static void Loginpwd(WebDriver driver){
		
   	 driver.findElement(Loginpwd).sendKeys("test");

		   
	}
	
	public static void Loginbutton(WebDriver driver){
		 
			
		driver.findElement(Loginbutton).click();
					
	}	
	 public static void Mysetuplink(WebDriver driver){
			driver.findElement(Mysetuplink).click();
	 }
	 public static void Mattable(WebDriver driver){
			driver.findElement(Mattable).click();
	 }
	 
	
	
	 public static void Addnew(WebDriver driver){
			driver.findElement(Addnew).click();
	 }
	 
	 

	 public static void State(WebDriver driver){
			driver.findElement(State).click();
	 }
	 

	 public static void City1(WebDriver driver){
			driver.findElement(City1).click();
	 }
	 

	 public static void Clear1(WebDriver driver){
			driver.findElement(Clear1).click();
	 }
	 
	 public void Search(WebDriver driver) {
			driver.findElement(Search).click();
		
		}	
	 		
		
	 public static void City2(WebDriver driver){
			driver.findElement(City2).click();
	 }
	 

	 public static void Clear(WebDriver driver){
			driver.findElement(Clear).click();
	 }
	 public void Search1(WebDriver driver) {
			driver.findElement(Search1).click();
		
		}	 

	 public static void City3(WebDriver driver){
			driver.findElement(City3).click();
	 }
	 
	 public void Search2(WebDriver driver) {
			driver.findElement(Search2).click();
		
		}	
		 
	 public static void Clearfields(WebDriver driver){
			driver.findElement(Clearfields).click();
	 }
	 
	 public static void Cancel(WebDriver driver){
			driver.findElement(Cancel).click();
	 }

	 
	
	 
	
	 
	}
	
	

	
	
	
	
	

