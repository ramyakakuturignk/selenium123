package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Diagnosispage {

public WebDriver driver;
	
	public Diagnosispage(WebDriver driver)
{

this.driver= driver;
}
	
	
	
	//*********************Basic Details**********************
	
	//String b="120";
	//@FindBy(id="bp")WebElement bp;
	@FindBy(xpath="//input[@id='bp']")WebElement bp;
   // @FindBy(xpath="//input[@type='number']")WebElement Bp;
	//@FindBy(xpath="//label[@id='bp']")WebElement bp;


	//@FindBy(css="input['#bp']")WebElement bp;
	//@FindBy(css="input[placeholder='bp']")WebElement Bp;
    //@FindBy(css="input[placeholder='ft/inch']")WebElement Height;
	//@FindBy(css="input[placeholder='kgs']")WebElement weight;

	
	@FindBy(xpath="//*[@id='height']")WebElement height;
   // @FindBy(xpath="//input[@type='number']")WebElement Height;

	
	@FindBy(xpath="//*[@id='kgs']")WebElement weight;
   // @FindBy(xpath="//input[@type='number']")WebElement Weight;


	@FindBy(xpath="//*[@id='issueSummary']")WebElement Issuesummary;

	
	@FindBy(xpath="//*[@id='issueDetails']")WebElement Issuedetail;

	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[1]/div/button[1]")WebElement save;
	
	//**************************Add Medicine**********************
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[3]/div/button/span")WebElement addmedicine;
	
	//@FindBy(css="input[placeholder='Enter min 3 characters']")WebElement medicine;

	@FindBy(xpath="//*[@id='medi']")WebElement medicinename;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-popper1[1]/div[1]/div[3]/div[1]/mat-checkbox[1]/label[1]/div[1]")WebElement checkbox;
	///@FindBy(xpath="//input[@class=mat-checkbox-inner-container' and @type='checkbox']")WebElement checkbox;
   ///  @FindBy(xpath="//*[@id='f1-input']/label/div")WebElement checkbox;
	//@FindBy(xpath="//input[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin' and @type='checkbox']")WebElement beforefood;

	@FindBy(xpath="//*[@id='bf']/label/div")WebElement beforefood;
 //String classAtr=@FindBy(By.cssSelector("mat-checkbox")).getAttribute("class");

			   
			//Assert(classAtr.contains("mat-checkbox-checked")).toBe(true);
	@FindBy(xpath="//*[@id='duration']")WebElement duration;
	
	//@FindBy(xpath="//*[@id='preferPharm']")WebElement prefpharmacy;
	
	@FindBy(xpath="//*[@id='instruction']")WebElement additionalInstructions;
	
	//@FindBy(xpath="//*[@id='mat-dialog-3']/app-popper1/div/div[7]/button[1]/span")WebElement add;
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-popper1[1]/div[1]/div[7]/button[1]/span[1]")WebElement add;
	@FindBy(xpath="//button[@class='save mat-flat-button mat-primary']//span[@class='mat-button-wrapper'][contains(text(),'Add')]")WebElement add;
	//@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[1]/div/button[1]")WebElement save1;

   //@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[2]/app-page2p1p2/div[2]/div[4]/div/button/span")WebElement addlabtest;
	@FindBy(xpath="//span[contains(text(),'Add Lab Test')]")WebElement addlabtest;
    
 //******************Add Lab Test*****************
    
   @FindBy(xpath="//*[@id='labTest']")WebElement LabTest;
   @FindBy(xpath="//span[contains(text(),'Head CT Scan')]")WebElement labtestname;
   // @FindBy(xpath="//*[@id='labName']")WebElement labname;

    @FindBy(xpath="//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")WebElement beforefood1;

    @FindBy(xpath="//*[@id='instuction']")WebElement additionalinstructions1;

	@FindBy(xpath="//div[@class='popper']//span[@class='mat-button-wrapper'][contains(text(),'Save')]")WebElement savebutton;
			
	
	public void verifybasicdetailspage() {
		
		bp.sendKeys("110");
		
		height.sendKeys("6");
		
		weight.sendKeys("70");
		
		Issuesummary.sendKeys("Due to vitamin deficiency body pain");
		
		Issuedetail.sendKeys("Due to vitamin deficiency body pain");
		
		save.click();

		
	}
	
	public void verifyprescription(){
		
		addmedicine.click();
		medicinename.sendKeys("Amox");
		//medicine.click();
		//medi.click();
		//popper.click();
		checkbox.click();
		beforefood.click();
		duration.sendKeys("3");
		//prefpharmacy.sendKeys("Sri Aarogya Pharmacy");
		additionalInstructions.sendKeys("Take the medicine without fail");
		add.click();
		//save1.click();
		
	}
	
	public void verifylabtest(){
		LabTest.click();
		labtestname.sendKeys("Head CT Scan");
		//labname.sendKeys("Radiant Diagnostic Centre");
		beforefood1.click();;
		additionalinstructions1.sendKeys("Test Given");
	}
	
	
	
	
}
