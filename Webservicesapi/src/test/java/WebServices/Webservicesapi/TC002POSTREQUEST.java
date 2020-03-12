package WebServices.Webservicesapi;


import java.io.FileInputStream;
import java.io.IOException;

import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import oteller.ExcelUtils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TC002POSTREQUEST  {
	@Test(dataProvider="register")
	public void GETcheckpointDetails(String usertype,String firstname,String lastname,String emailid,String contactno,String password,String orgcode,String appid) throws IOException,NullPointerException{
		RestAssured.baseURI="http://3.209.13.42:8080/userManagement/users";
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		
		requestParams.put("userType",usertype);
		requestParams.put("firstName",firstname);
		requestParams.put("lastName",lastname);
		requestParams.put("emailId",emailid);
		requestParams.put("contactNbrMob",contactno);
		requestParams.put("password",password);
		requestParams.put("orgCode",orgcode);
		requestParams.put("appId",appid);
		
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		//Response object
				Response response=httpRequest.request(Method.POST,"/signUp");
				//print response in console window
				String responseBody=response.getBody().asString();
				System.out.println("Response is:"+responseBody);
					
	
				
		
		
}
	@DataProvider(name="register")
	String [][] getEmpData() throws IOException, BiffException,NullPointerException{
		
		//String path=UtilityD2.getTableArray("C:/Users/ramya/workspace1/Webservicesapi/src/test/java/register1.xls");
		String path="C:/Users/ramya/workspace1/Webservicesapi/src/test/java/logink.xls";

		//String path="C:/Users/ramya/Desktop/register.xls";


		int rownum=UtilityD2.getRowCount(path, "Sheet1");
		int colcount=UtilityD2.getCellCount(path, "Sheet1",1);
        
		
		String empdata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++){
			for(int j=0;j<colcount;j++){
				empdata[i-1][j]=UtilityD2.getCellData(path, "Sheet1", i, j);
			}
			
		}
		return empdata;
		
		
		
		
	}
}