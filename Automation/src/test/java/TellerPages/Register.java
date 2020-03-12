package TellerPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	
	
public WebDriver driver;
	
	public void Register(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	
	@FindBy(xpath="//span[@routerlink='/register']")WebElement register;
	// new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("/register"))).click();
	//WebDriverWait waitWait = new WebDriverWait(driver, 5);     
	//WebElement x = waitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='ion-input-2']")));     
	//x.click();
	@FindBy(xpath="//ion-input[@placeholder='Enter your Email-Id']")WebElement Email;

	@FindBy(xpath="//ion-input[@placeholder='Enter your password']")WebElement password1;

	@FindBy(xpath="//ion-input[@placeholder='Enter your First Name']")WebElement firstname;
	
	@FindBy(xpath="//ion-input[@placeholder='Enter your Last Name']")WebElement lastname;

	@FindBy(xpath="//ion-input[@placeholder='Enter your Mobile No.']")WebElement mobile;
	
	//@FindBy(xpath="/html/body/app-root/ion-app/ion-content/ion-router-outlet/app-register/ion-content/form/div[1]/div[3]/ion-input[5]//input")WebElement registerbutton;
	
	@FindBy(xpath="//ion-button[@class='submit button button-block button-solid hydrated']")WebElement registerbutton;
	
	
	@FindBy(xpath="//span[@class='alert-button-inner sc-ion-alert-md']")WebElement ok;
	@FindBy(xpath="//span[contains(text(),'Ok')]")WebElement ok1;
	public void verifyregister(){
		register.click();
		//x.click();
		Email.click();
		Email.sendKeys("vijaya8@gmail.com");
		password1.click();
		password1.sendKeys("test");
		firstname.click();
		firstname.sendKeys("vijaya");
		lastname.click();
		lastname.sendKeys("k");
		mobile.click();
		mobile.sendKeys("9845612378");
		registerbutton.click();
		ok.click();
		ok1.click();
	}
}
