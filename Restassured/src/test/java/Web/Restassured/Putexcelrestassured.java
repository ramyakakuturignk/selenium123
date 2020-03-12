package Web.Restassured;



	import java.io.FileInputStream;
	import java.io.IOException;

    import org.json.simple.JSONObject;
    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;

    import io.restassured.RestAssured;
	import io.restassured.http.Headers;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.response.ResponseBodyExtractionOptions;
	import io.restassured.response.ResponseOptions;
	import io.restassured.specification.RequestSpecification;
	
	public class Putexcelrestassured {
		
		@Test(dataProvider="survey")
		public void Putexcelrestassureddetails(String surveyName,String description) throws IOException,NullPointerException{
			RestAssured.baseURI="http://3.209.13.42:8080/teller/surveys";
			RequestSpecification httpRequest=RestAssured.given();
			
			JSONObject requestParams=new JSONObject();
			
			requestParams.put("surveyName",surveyName);
			requestParams.put("description",description);
			
			
			
			httpRequest.header("Content-Type","application/json");
			httpRequest.body(requestParams.toJSONString());
			//Response object
					Response response=httpRequest.request(Method.PUT,"/2315");
					//print response in console window
					String responseBody=response.getBody().asString();
					System.out.println("Response is:"+responseBody);
						
		
			
			
	}
		@DataProvider(name="survey")
		String [][] getEmpData() throws IOException{
			
			//String path=UtilityD2.getTableArray("C:/Users/ramya/workspace1/Webservicesapi/src/test/java/register1.xls");
			String path="C:/Users/ramya/workspace1/Restassured/src/test/java/den2.xlsx";

			//String path="C:/Users/ramya/Desktop/register.xls";


			int rownum=UtilityD3.getRowCount(path, "Sheet1");
			int colcount=UtilityD3.getCellCount(path, "Sheet1",1);
	        
			
			String empdata[][]=new String[rownum][colcount];
			for(int i=1;i<=rownum;i++){
				for(int j=0;j<colcount;j++){
					empdata[i-1][j]=UtilityD3.getCellData(path, "Sheet1", i, j);
				}
				
			}
			return empdata;
			
			
			
			
		}
	}


