package maven_junit.testng_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import package1.sampleTest.lib.allLibreries;

public class textNg_testing {
	 static WebDriver wd = new ChromeDriver();
	 static allLibreries p1=new allLibreries();
	 
//	 for extended test report
	 ExtentTest test2; // Interface
     ExtentReports rep2; // class
     
//	 for extended test report
  @BeforeTest
   public void test1() {
       rep2 = new ExtentReports(System.getProperty("user.dir") + "./Reports/testreport1.html");
       test2 = rep2.startTest("textNg_testing"); // trestNG class
    }

     
  @Test
  public void f() {
	  p1.init1(wd);
      p1.App_Launch(wd,"https://jqueryui.com/");
      test2.log(LogStatus.PASS, "the website is visited passed report"); ///for logging the extend report 
      p1.click(wd, "/html/body/header/section/nav/div/ul[2]/li[1]/a");
      test2.log(LogStatus.PASS, "the handle is clicked passed report"); ///for logging the extend report 
      p1.getText(wd, "/html/body/div/div[2]/div/div/div[1]/h1");
      test2.log(LogStatus.PASS, "the get text is passed report"); ///for logging the extend report 
  }
  
//	 for extended test report
 @AfterTest
	public void closeBrower() {
	     rep2.endTest(test2);
	     rep2.flush();
	     rep2.close();
	  }

}
