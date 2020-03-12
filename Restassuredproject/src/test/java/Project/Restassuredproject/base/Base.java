package Project.Restassuredproject.base;

import java.util.logging.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
    public static RequestSpecification httpRequest;
    public static Response response;
    public String surveyId="3633";
    public String currentUserId="564";
    ExtentHtmlReporter htmlReporter=null;
	ExtentReports extent=null;
    /*
    public Logger logger;
    
      @Beforetest
      logger=Logger.getLogger("surveyAPI");
    PropertyConfigurator.configure("log4j.properties");
    logger.setLevel(Level.DEBUG);
    
    */
}
