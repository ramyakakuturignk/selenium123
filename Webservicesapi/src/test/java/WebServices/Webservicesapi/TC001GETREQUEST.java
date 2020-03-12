package WebServices.Webservicesapi;





import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC001GETREQUEST {
	
	@Test
	public void getcheckpointDetails(){
		RestAssured.baseURI="http://3.209.13.42:8080/teller/surveys";
		RequestSpecification httpRequest=RestAssured.given();
		//Response object
		Response response=httpRequest.request(Method.GET,"/3119");
		//print response in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response is:"+ responseBody);
		/*
		//status code validation
		int statusCode=response.getStatusCode();
		System .out.println("Status Code is:"+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		/*
		String statusLine=response.getStatusLine();
		System .out.println("Status Code is:"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
				*/
		/*
		String ContentType=response.header("Content-Type");
		System .out.println("contentType:"+ContentType);
		Assert.assertEquals(ContentType, "application/json");
		
		String Accept=response.header("Accept");
		System .out.println("Accept:"+Accept);
		Assert.assertEquals(Accept, "application/json");
		
		String AcceptLanguage=response.header("Accept-Language");
		System .out.println("AcceptLanguage:"+AcceptLanguage);
		Assert.assertEquals(AcceptLanguage, "En-US");
		*/
		/*
		Headers allheaders=response.headers();//get all heasers from response
		for(Header header:allheaders){
			System.out.println(header.getName()+"  "+header.getValue());
		}
		*/
		//3119 is in response body 
		//Assert.assertEquals(responseBody.contains("3119"),true);
		/*
		//status code validation
		int statusCode=response.getStatusCode();
		System .out.println("Status Code is:"+statusCode);
		Assert.assertEquals(statusCode, 201);
		
		String success= response.jsonPath().get("Success");
		Assert.assertEquals(success, "Registered successfully");
		Assert.assertEquals(responseBody.contains("vramyagnk12531221212@gmail.com"),true);
		
		@DataProvider(name="empdata")
	String [][] getEmpData(){
		String empdata[][]={{"","",""}{"","",""};
		return(empdata);
	}
		
*/
	}

}
