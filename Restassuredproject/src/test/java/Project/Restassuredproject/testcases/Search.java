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
public class Search extends Base {

	Response response;
	@Test
	public void SeaDetails() throws IOException,NullPointerException{
		RestAssured.baseURI="http://3.209.13.42:8080/teller/credits/users/564";
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		
		//requestParams.put("userType",userType);
		//requestParams.put("firstName",firstName);
		//requestParams.put("lastName",lastName);
		requestParams.put("creditsSearchFromStr","2019-05-01 00:00:00");
		//requestParams.put("contactNbrMob",contactNbrMob);
		requestParams.put("creditsSearchToStr","2019-05-02 23:59:59");
		//requestParams.put("orgCode",orgCode);
		//requestParams.put("appId","1");
		httpRequest.header("currentUserId","564");
		httpRequest.header("hashKey","adecb6830cb4f20f8226a3f7752ef93ed84fa5b55bef8b07d70a73bdb7818217cbc84b0942f29a8c9999def266bab57ac5c96a41072a89c829c6d542c77bdf4d");
		httpRequest.header("Accept","application/json");
			httpRequest.header("Accept-Language","te");

			
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		//Response object
				Response response=httpRequest.request(Method.POST,"/search");
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
