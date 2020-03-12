	package testcases;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	
	public class MyTime {
	public WebDriver driver;
		
		public MyTime(WebDriver driver)
	{
	
	this.driver= driver;
	}
		//@FindBy(xpath="//a[@href='#/mysetup']")WebElement mysetup;
		//@FindBy(linkText=("My Setup"))WebElement mysetup;
		@FindBy(xpath="//a[contains(@href,'#/mysetup')]")WebElement mysetup;
	
		//@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list[4]/a/div")WebElement mysetup;
		
		@FindBy(xpath="//div[@class='box2']//div[2]//mat-card[1]")WebElement managetime;
		
		@FindBy(xpath="//span[contains(text(),'Search')]")WebElement search;
		
		@FindBy(xpath="//span[contains(text(),'Mon')]")WebElement days;
		
		@FindBy(xpath="//span[contains(text(),'Search')]")WebElement search1;
	
		@FindBy(xpath="//div[@class='mat-form-field-suffix ng-tns-c4-18 ng-star-inserted']//mat-icon[@class='mat-icon material-icons'][contains(text(),'access_time')]")WebElement time;
		
		@FindBy(xpath="//span[contains(text(),'19')]")WebElement timegiven;
		
		@FindBy(xpath="//span[contains(text(),'Ok')]")WebElement ok;
		
		@FindBy(xpath="//div[@class='mat-form-field-suffix ng-tns-c4-20 ng-star-inserted']//mat-icon[@class='mat-icon material-icons'][contains(text(),'access_time')]")WebElement time1;
		
		@FindBy(xpath="//span[contains(text(),'20')]")WebElement timegiven1;
		
		@FindBy(xpath="//span[contains(text(),'Ok')]")WebElement ok1;
		
		@FindBy(xpath="//span[contains(text(),'Search')]")WebElement search2;
	
		@FindBy(xpath="//input[@id='aptype']")WebElement appttype;
		
		@FindBy(xpath="//input[@id='subtype']")WebElement apptsubtype;
		
		@FindBy(xpath="//span[contains(text(),'Search')]")WebElement search3;
	
		@FindBy(xpath="//input[@id='doctor']")WebElement doctorname;
		
		public void verifySearchfields(){
			
	
			mysetup.click();
			managetime.click(); 
			search.click();
		    days.click();
		    search1.click();
		    time.click();
		    timegiven.click();
		    ok.click();
		    time1.click();
		    timegiven1.click();
		    ok1.click();
		    search2.click();
		    appttype.sendKeys("New Consults");
		    apptsubtype.sendKeys("Basic Aliments");
		    search3.click();
		    doctorname.sendKeys("Revathy Kannan");
		}
	}
