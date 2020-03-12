package Teller.Tellerwebapp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class normalprivatesurvey {
	
	public WebDriver driver;
	
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	@Test
	public void Tellerlogin1()throws  InterruptedException,NullPointerException{

	    //WebElement loginemail=driver.findElement(By.xpath("//input[contains(@name,'ion-input- ']"));
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
	    name.sendKeys("ramyasurveynew11");
	    Thread.sleep(5000);
	    
	    WebElement description=driver.findElement(By.xpath("//textarea[@id='description']"));
	    description.sendKeys("ramyadescription");
	    Thread.sleep(5000);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);	    
	    WebElement addquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-icon[@id='AddQuestion']")));
	    addquestion.click();
	    Thread.sleep(5000);
	    
	   // WebElement addquestion=driver.findElement(By.xpath("//label[contains(text(),'Add Questions')]"));
	   
	    WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    WebElement enterquestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter your question']")));
	    enterquestion.sendKeys("Android Smart Phone - 16GB");
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
	    
	    WebElement answer1=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    //WebElement answer1=driver.findElement(By.xpath("//textarea[@id='options']"));

	    answer1.sendKeys("yes");
	    Thread.sleep(5000);
	    
	    WebElement plus=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus.click();
	    Thread.sleep(5000);
	    
	    WebElement answer2=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer2.sendKeys("no");
	    Thread.sleep(5000);
	    
	    WebElement plus2=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus2.click();
	    Thread.sleep(5000);
	    
	    WebElement answer3=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer3.sendKeys("ok");
	    Thread.sleep(5000);
	    
	    WebElement plus3=driver.findElement(By.xpath("//img[@id='Addoption']"));
	    plus3.click();
	    Thread.sleep(5000);
	    
	    WebElement answer4=driver.findElement(By.xpath("//textarea[@placeholder='Tap to Edit']"));
	    answer4.sendKeys("ok");
	    Thread.sleep(5000);
	    	        	    
	    WebElement cross=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle']"));
	    cross.click();
	    Thread.sleep(5000);
	    
	    WebElement select1=driver.findElement(By.xpath("//ion-icon[@name='checkmark-circle-outline']"));
	    select1.click();
	    Thread.sleep(5000);
	    
	    //add respondent
	    WebElement respondent=driver.findElement(By.xpath("//ion-icon[@name='person-add']"));
	    respondent.click();
	    Thread.sleep(5000);
	    
	    WebElement pastrespondent=driver.findElement(By.xpath("//ion-icon[@name='people']"));
	    pastrespondent.click();
	    Thread.sleep(5000);
	    
	    WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    search.sendKeys("Ramya12");
	    Thread.sleep(5000);
	    
	  
	    
	   // js.executeScript("window.scrollBy(0,1000)");
	    WebElement selectsearch2=driver.findElement(By.xpath("//b[contains(text(),'Ramya12')]"));
	    selectsearch2.click();
		Thread.sleep(8000);
			  
	    
	    WebElement tickres=driver.findElement(By.xpath("//ion-icon[@id='Tickrespondnet']"));
	    tickres.click();
	    Thread.sleep(5000);
	    
	    WebElement add=driver.findElement(By.xpath("//ion-icon[@name='add-circle-outline']"));
	    add.click();
	    Thread.sleep(5000);
		
	
	    
	    WebElement pastrespondent1=driver.findElement(By.xpath("//ion-icon[@name='people']"));
	    pastrespondent1.click();
	    Thread.sleep(5000);
	    
	    WebElement search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    search2.sendKeys("akash");
	    Thread.sleep(5000);
	    
	     
	   // js.executeScript("window.scrollBy(0,1000)");
	    WebElement selectsearch3=driver.findElement(By.xpath("//b[contains(text(),'Akash')]"));
	     selectsearch3.click();
	    Thread.sleep(5000);
	    
	    WebElement tickres1=driver.findElement(By.xpath("//ion-icon[@id='Tickrespondnet']"));
	    tickres1.click();
	    Thread.sleep(5000);
	    
	    WebElement add2=driver.findElement(By.xpath("//ion-icon[@name='add-circle-outline']"));
	    add2.click();
	    Thread.sleep(5000);
	    
	    
	    /*
	    WebElement clearsearch=driver.findElement(By.xpath("//ion-icon[@name='close-circle']"));
	    clearsearch.click();
	    Thread.sleep(5000);
	    

	    WebElement selectsearch1=driver.findElement(By.xpath("//b[contains(text(),'bakash*****16@gmail.com')]"));
	    selectsearch1.click();
	    Thread.sleep(5000);
	    js.executeScript("arguments[0].scrollIntoView();",selectsearch1 );	
	    */
	    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	    
	 
	   
	    
	    WebElement addnewcontact=driver.findElement(By.xpath("//ion-icon[@name='phone-portrait']"));
	    addnewcontact.click();
	    Thread.sleep(5000);
	    
	    WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    firstname.sendKeys("Ramya");
	    Thread.sleep(5000);
	    
	    WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    lastname.sendKeys("kvn");
	    Thread.sleep(5000);
	    
	    WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Mobile #']"));
	    mobile.sendKeys("6379039922");
	    Thread.sleep(5000);
	    
	    WebElement add1=driver.findElement(By.xpath("//ion-icon[@id='Addresp']"));
	    add1.click();
	    Thread.sleep(5000);
	    /*
	   // WebElement done=driver.findElement(By.xpath("//ion-label[text()='Done']"));
	    WebElement done2=driver.findElement(By.xpath("//ion-icon[@name='checkbox-outline']"));
	    done2.click();
	    Thread.sleep(5000);
	     */   	     
	    
	    
	    WebElement pendingsearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    pendingsearch.click();
	 	    Thread.sleep(5000);
	    
	    WebElement contentsub=driver.findElement(By.xpath("//mat-card[@id='check-51']//span"));
	    contentsub.click();
	    Thread.sleep(5000);
	    
	    WebElement ans=driver.findElement(By.xpath("//div[@id='question-0']"));
	    ans.click();
	    Thread.sleep(5000);
	    	    
	    WebElement next=driver.findElement(By.xpath("//ion-icon[@name='arrow-round-forward']"));
	    next.click();
	    Thread.sleep(5000);
	    /*
	    WebElement ans2=driver.findElement(By.xpath("//div[@id='question-0']"));
	    ans2.click();
	    Thread.sleep(5000);
	    
	    WebElement next2=driver.findElement(By.xpath("//ion-icon[@name='arrow-round-forward']"));
	    next2.click();
	    Thread.sleep(5000);
	    
	    WebElement ans3=driver.findElement(By.xpath("//div[@id='question-0']"));
	    ans3.click();
	    Thread.sleep(5000);
	    
	    WebElement next3=driver.findElement(By.xpath("//ion-icon[@name='arrow-round-forward']"));
	    next3.click();
	    Thread.sleep(5000);
	    
	    
	    
	    /*
	    WebElement ans2=driver.findElement(By.xpath("//div[@class='rowcontent']//div[1]"));
	    ans2.click();
	    Thread.sleep(5000);
	    
 	    
	    WebElement next3=driver.findElement(By.xpath("//ion-icon[@name='arrow-round-forward']"));
	    next3.click();
	    Thread.sleep(5000);
	    */
	    WebElement comment=driver.findElement(By.xpath("//textarea[@placeholder='Enter your comment']"));
	    comment.click();
	    comment.sendKeys("Good");
	    Thread.sleep(5000);

	    WebElement submit=driver.findElement(By.xpath("//ion-icon[@name='checkbox-outline'])]"));
	    submit.click();
	    Thread.sleep(5000);
	    
	    WebElement pollster2=driver.findElement(By.xpath("//small[contains(text(),'Pollster Survey')]"));
	    pollster2.click();
	    Thread.sleep(5000);
	    /*
	    WebElement sursearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    sursearch.sendKeys("ramyasurvey");
	    Thread.sleep(5000);
	    */
	    WebElement content=driver.findElement(By.xpath("//b[contains(text(),'ramyasurveynew11')]"));
	    content.click();
	    Thread.sleep(5000);
	    js.executeScript("arguments[0].scrollIntoView();",content );
	    
	    
	    WebElement survey=driver.findElement(By.xpath("//mat-card[@id='check-0']//b[contains(text(),'ramyasurveynew11')]"));
	    survey.click();
	    Thread.sleep(5000);
	    
	    
	    // WebElement launch=driver.findElement(By.xpath("//ion-label[text()='Launch']"));
	    WebElement launch=driver.findElement(By.xpath("//ion-icon[@name='paper-plane']"));
	    launch.click();
	    Thread.sleep(5000);
	    
	   // WebElement results=driver.findElement(By.xpath("//ion-label[text()='Results']]"));
	    WebElement results=driver.findElement(By.xpath("//ion-icon[@name='podium']"));
	    results.click();
	    Thread.sleep(5000);
	    WebElement more=driver.findElement(By.xpath("//ion-icon[@name='more']"));
	  //  WebElement more=driver.findElement(By.xpath("//div[@class='flex']//div//ion-icon[@name='more']"));
	    more.click();
	    Thread.sleep(5000);
	    
	    WebElement userressearch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	    userressearch.sendKeys("ramya12");
	    Thread.sleep(5000);
	    
	    WebElement content1=driver.findElement(By.xpath("//strong[contains(text(),'Ramya12 kvn')]"));
	    js.executeScript("arguments[0].scrollIntoView();",content1 );	
	    content1.click();
	    Thread.sleep(5000);
	    
	    
	    WebElement replytocustomer=driver.findElement(By.xpath("//textarea[@placeholder='Please Enter Your Message']"));
	    js.executeScript("arguments[0].scrollIntoView();",replytocustomer );	
	    replytocustomer.click();
	    replytocustomer.sendKeys("Hi");
	    Thread.sleep(5000);
	    /*
	    WebElement clear=driver.findElement(By.xpath("//button[@class='clear']"));
	    clear.click();
	    Thread.sleep(5000);
	    
	    WebElement replytocustomer1=driver.findElement(By.xpath("//textarea[@placeholder='Please Enter Your Message']"));
	    js.executeScript("arguments[0].scrollIntoView();",replytocustomer1);	
	    replytocustomer1.click();
	    replytocustomer1.sendKeys("hi");
	    Thread.sleep(5000);
*/
	    WebElement send=driver.findElement(By.xpath("//button[@class='submit']"));
	    send.click();
	    Thread.sleep(5000);
	    
	}
	
	@BeforeTest
	public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:/library/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://app.oteller.in/app/#/webLogin");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}


