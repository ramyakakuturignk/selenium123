package Project.Restassuredproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Project.Restassuredproject.base.Base;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;


public class Testcases extends Base {
	int surveyId=3633;
   Response response;
	@BeforeTest
	void getAllsurvey() throws InterruptedException{
		
		//logger.info("********Started Get All surveys********");
		RestAssured.baseURI="http://3.209.13.42:8080/teller";
		httpRequest=RestAssured.given();
		response=httpRequest.request(Method.GET,"/surveys/" +surveyId);
		httpRequest.header("currentUserId","564");
		httpRequest.header("hashKey","faf3e8af4981950acbf0b40e25856ae59fe9d56620d14bc1b5d4f77e5eb1898be9fd86374789e0a4a953a698ee2d8673b8fd119070f777161b6d219b5b672045");
		httpRequest.header("Accept","application/json");
			httpRequest.header("Accept-Language","te");
	}
	@Test
	public void checkResponseBody(){
		//logger.info("********Started Get All surveys********");
        String responseBody=response.getBody().asString();
        System.out.println("Response Body"+responseBody);
        Assert.assertTrue(responseBody!=null);
	}
	@Test
	public void checkStatusCode(){
		//logger.info("********Started Get All surveys********");
       
       int  statusCode=response.getStatusCode();
	
        System.out.println("Status code is"+statusCode);
        Assert.assertEquals(statusCode,"200 OK");
	}
	
	@Test
	void checkResponsetime() throws InterruptedException{
		//logger.info("********Started Get All surveys********");
       long responseTime=response.getTime();
       System.out.println("Response time is ==>"+ responseTime);
       if(responseTime>2000)
    	   System.out.println("Response time is greater than 2000");
       Assert.assertEquals(responseTime<2000, true);
       Thread.sleep(5000);
	}
	/*
	@Test
	void checkstatusLine(){
		//logger.info("********Started Get All surveys********");
		String statusLine=response.getStatusLine();
		System.out.println("Status Line is ==>"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	@Test
	void checkContenttype(){
		//logger.info("********Started Get All surveys********");
		String contentType=response.header("Content-Type");
		System.out.println("Content type is  ==>"+contentType);
		Assert.assertEquals(contentType, "application/json");

	}
	@Test
	void checkserverType(){
		//logger.info("********Started Get All surveys********");
		String serverType=response.header("Server");
		System.out.println("Content type is  ==>"+serverType);
		Assert.assertEquals(serverType, "nginx/1.14.1");

	}
	*/
	@AfterTest
	public void tearDown(){
		System.out.println("Finished get method");
	}
	
}

