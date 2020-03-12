package Project.Restassuredproject.utils;
import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
			import com.aventstack.extentreports.ExtentTest;
			import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
			 
				public abstract  class Listeners implements ITestListener{
					
					public ExtentReports extent;
					//public ExtentHtmlReporter htmlReporter;
					ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:/Users/ramya/workspace1"
							+ "/Restassuredproject/Reports/extent12.html");
							
					 extent = new ExtentReports();
					 Report=extent.attachReporter(htmlReporter);


					// create ExtentReports and attach reporter(s)
				     ExtentTest test=extent.createTest("MyFirstTest","login page");
					
					public void onTestStart(TestResult result){
					      System.out.println("************ Test Started :"+result.getName());		
						
					}


					public void onTestSuccess(TestResult result) {
					      System.out.println("************ Test successful :"+result.getName());		
						
					}
					
					public void onTestFailure(TestResult result){
					      System.out.println("************ Test failed :"+result.getName());		
						
					}

					
					
					public void onTestSkipped(ITestResult result) {
					      System.out.println("************ Test skipped :"+result.getName());		
						
					}
					
					
					
					
					public void onStart(ITestContext context) {
					      System.out.println("************ Test failed :"+context.getName());		
						
					}
					public void onFinish(ITestContext context) {
					      System.out.println("************ Test completed ":"+context.getName());		
						}

				}
				}
