package tetscase;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


import pages2.Loginpage;

public class LoginTest {
	
	public static void main(String[] args)throws IOException {
		Lanch();
		LoginTestCredentials();
	}
	 private  static WebDriver driver=null;
	 
	 public static void Lanch(){
		 
	 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://192.168.1.46:8080/fv24/index.html");
	 driver.manage().window().maximize();
	 
	 }
 
	
	public static void LoginTestCredentials(){
		
		Loginpage.Loginemail(driver).sendKeys("doctor@gmail.com");
		Loginpage.Loginpwd(driver).sendKeys("test");
		Loginpage.Loginbutton(driver).click();
		
	}
	
	
	 
	
}
