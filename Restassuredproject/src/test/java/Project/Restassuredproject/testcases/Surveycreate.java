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
public class Surveycreate extends Base {
	Response response;
	/*
	//String  userType=RandomUtils.userType();
	//String firstName=RestUtils.firstName();
	//String lastName=RestUtils.lastName();
	String emailId=RestUtils.emailId();
	//String contactNbrMob=RestUtils.contactNbrMob();
	String password=RestUtils.password();
	//String orgCode=RestUtils.orgCode();
	//String appid=RestUtils.appid();
	*/

	@Test
	public void Surveycreate() throws IOException,NullPointerException{
		RestAssured.baseURI="http://3.209.13.42:8080/teller";
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		
		requestParams.put("credits","0");
		requestParams.put("surveyType","1");
		requestParams.put("surveyRespondentType","1");
		requestParams.put("surveyName","surveyName123");
		requestParams.put("surveyTypeName","Simple Survey");
		requestParams.put("lastUpdateUserid","564");
		//String description = "ramyadescription";
		requestParams.put("createdBy","564");
		requestParams.put("status","1");
		requestParams.put("description","description123");
		requestParams.put("organizationId","1");
		

	httpRequest.header("currentUserId","564");
	httpRequest.header("hashKey","faf3e8af4981950acbf0b40e25856ae59fe9d56620d14bc1b5d4f77e5eb1898be9fd86374789e0a4a953a698ee2d8673b8fd119070f777161b6d219b5b672045");
	httpRequest.header("Accept","application/json");
		httpRequest.header("Accept-Language","te");

		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
				//Response object
				Response response=httpRequest.request(Method.POST,"/surveys/");
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


