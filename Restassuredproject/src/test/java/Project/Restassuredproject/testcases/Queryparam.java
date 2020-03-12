package Project.Restassuredproject.testcases;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomUtils;
//import org.apache.commons.lang3.RandomUtils;
import org.json.simple.JSONObject;
import org.junit.platform.commons.logging.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project.Restassuredproject.base.Base;
import Project.Restassuredproject.utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class Queryparam  extends Base{
	//private static final Logger logger = (Logger) LoggerFactory.getLogger(Queryparam.class);
	//int surveyId=3633;
	
	Response response;
	@Test
	public void Queryparam() throws IOException,NullPointerException{
		RestAssured.baseURI="http://3.209.13.42:8080/teller/credits/providerReferal?orgId=1";
		RequestSpecification httpRequest=RestAssured.given().params("orgId", "1");
		httpRequest.header("currentUserId","564");
		httpRequest.header("hashKey","adecb6830cb4f20f8226a3f7752ef93ed84fa5b55bef8b07d70a73bdb7818217cbc84b0942f29a8c9999def266bab57ac5c96a41072a89c829c6d542c77bdf4d");
		httpRequest.header("Accept","application/json");
			httpRequest.header("Accept-Language","te");

			
			httpRequest.header("Content-Type","application/json");
			
			
			//httpRequest.params("orgId", "1");
			
					//Response object
					Response response=httpRequest.request(Method.GET);
					//print response in console window
					String responseBody=response.getBody().asString();
					System.out.println("Response is:"+responseBody);
						
		
			
			
			
	}
		@Test
		public void checkStatusCode() throws NullPointerException{
			//logger.info("********Started Get All surveys********");
	       
	       
		int  statusCode=response.getStatusCode();
		
	        System.out.println("Status code is"+statusCode);
	        Assert.assertEquals(statusCode,200);
		}
		
		@Test
		void checkResponsetime() throws InterruptedException, NullPointerException{
			
		//logger.info("********Started Get All surveys********");
	       long responseTime=response.getTime();
	       System.out.println("Response time is"+ responseTime);
	       if(responseTime>2000)
	    	   System.out.println("Response time is greater than 2000");
	       Assert.assertEquals(responseTime<2000, true);
	       Thread.sleep(5000);
		}
	}


