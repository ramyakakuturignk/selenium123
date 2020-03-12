package Project.Restassuredproject.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomUtils;
//import org.apache.commons.lang3.RandomUtils;
import org.json.simple.JSONObject;
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

public class Postmethod extends Base {
	
	
	Response response;
	//String  userType=RandomUtils.userType();
	//String firstName=RestUtils.firstName();
	//String lastName=RestUtils.lastName();
	String emailId=RestUtils.emailId();
	//String contactNbrMob=RestUtils.contactNbrMob();
	String password=RestUtils.password();
	//String orgCode=RestUtils.orgCode();
	//String appid=RestUtils.appid();
	

	@Test
	public void postcheckpointDetails() throws IOException,NullPointerException{
		RestAssured.baseURI="http://3.209.13.42:8080/userManagement/login";
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		
		//requestParams.put("userType",userType);
		//requestParams.put("firstName",firstName);
		//requestParams.put("lastName",lastName);
		requestParams.put("emailId","vramyagnk@gmail.com");
		//requestParams.put("contactNbrMob",contactNbrMob);
		requestParams.put("password","VGVzdEAxMjM=");
		//requestParams.put("orgCode",orgCode);
		requestParams.put("appId","1");
		
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		//Response object
				Response response=httpRequest.request(Method.POST,"/authenticate");
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
