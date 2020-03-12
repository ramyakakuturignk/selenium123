package tetscase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages2.Loginpage2;

public class LoginTestObject {

	
	private static  WebDriver driver=null;
	//private static WebDriver driver2 = null;
	public static void LoginTestPage(){
		 
		 System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://192.168.1.46:8080/fv24/index.html");
		 driver.manage().window().maximize();
	
		 Loginpage2 loginpageobject = new Loginpage2(driver);
		 
		  driver.get("http://192.168.1.46:8080/fv24");
		  loginpageobject.Loginemail(driver);
		  loginpageobject.Loginpwd(driver);
		  loginpageobject.Loginbutton(driver);
		  
		  //Loginpage2 loginpageobject2= new Loginpage2(driver);
		loginpageobject.Mysetuplink(driver);
		
		loginpageobject.Addnew(driver);
 
		loginpageobject.State(driver);

		loginpageobject.City1(driver);

		loginpageobject.Search(driver);

		loginpageobject.Clear1(driver);

		loginpageobject.City2(driver);

		loginpageobject.Search1(driver);

		
		loginpageobject.Clear(driver);

		loginpageobject.City3(driver);

		loginpageobject.Search2(driver);
		loginpageobject.Clearfields(driver);
		loginpageobject.Cancel(driver);

		
		
		
		
	}
	public static void main(String[] args) {
		LoginTestPage();
	}
	
	
	
}
