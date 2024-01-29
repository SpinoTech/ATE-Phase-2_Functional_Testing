package pizzahut.com.pizzahut;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;

import pizzahut.com.pizzahut.lib.AlllibreriesPOM;
import pizzahut.utils.readDataFromExel;

public class pizzahut001 {
	static WebDriver wd = new ChromeDriver();
	static AlllibreriesPOM page = new AlllibreriesPOM();
	static String url = new readDataFromExel().getUrl();
	
     //	 for extended test report
	 ExtentTest test2; // Interface
     ExtentReports rep2; // class
    
  //	 for extended test report
  @BeforeTest
  public void test1() {
      rep2 = new ExtentReports(System.getProperty("user.dir") + "./Reports/testreport1.html");
      test2 = rep2.startTest("textNg_testing"); // trestNG class
   }

 
  @BeforeMethod
  public void setUp() {
	 page.init1(wd);
	  test2.log(LogStatus.PASS,"Web Driver Activated Successfully .");
	  
	  page.App_Launch(wd, url);
	  test2.log(LogStatus.PASS,"The PizzaHut app is successfully launched");
	  
	  
  }
  @Test
  public void testCases() throws InterruptedException {
//	  Thread.sleep(5000);  
//	  page.click(wd, "//*[@id=\"survicate-box\"]/div/div[2]/div[1]/div[1]/div[2]/button");
//	  test2.log(LogStatus.PASS,"Clossing the black color auto pop up screen.");
	  
	  page.typeAnythingAndEnter(wd, "//*[@id=\"app\"]/div/div[4]/div/div/div/div[2]/form/div/div[1]/input", "Lulu Mall");
	  test2.log(LogStatus.PASS,"Lulu Mall is typed successfull at the location search");
	  
	  Thread.sleep(7000);
	  page.validateURL(wd, "deals");
	  test2.log(LogStatus.PASS,"Validating the url contains deals");
	  
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[1]/div/a[3]/span");
	  Thread.sleep(1000);
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div/a[3]/div[3]/div/button");
	  test2.log(LogStatus.PASS,"Going to sides and adding any item that is below 200");
	  
	  page.Displayed(wd, "//*[@id=\"basket\"]/div[3]/div/div[1]");
	  page.validateContainsSomthing(wd, "//*[@id=\"basket\"]/div[3]/div/div[1]/div[2]", "179");
	  test2.log(LogStatus.PASS,"Validating that the product is added under Basket but checkout button price item is still now\n"
	  		+ "showing");
	  
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[1]/div/a[5]/span");
	  test2.log(LogStatus.PASS,"Navigating to the Drinks page");
	  
	  Thread.sleep(1000);
	  
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div/a[1]/div[3]/div/button");
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div/a[2]/div[3]/div/button");
	  test2.log(LogStatus.PASS,"Adding any two drinks so that total cart pricing is more than 200");
	  
	  page.click(wd, "//*[@id=\"app\"]/div/div[1]/div[2]/div/div[2]/div[3]/div/div/div/a/span[2]");
	  page.validateURL(wd,"checkout");
	  test2.log(LogStatus.PASS,"Clicking on the Checkout button and validating we are navigated to the checkout page");
	  
	  Thread.sleep(1000);
	  
	  // Scroll down to the end of the page
      JavascriptExecutor js = (JavascriptExecutor) wd;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
	  page.radioSelected(wd, "//*[@id=\'payment-method--razorpay\']");
	  test2.log(LogStatus.PASS,"Validating that the Online Payment radio button is selected by default");
	  
	  page.click(wd, "//*[@id=\"checkout-form\"]/div[4]/div[2]/label[3]");
	  test2.log(LogStatus.PASS, "Changing the Payment option to Cash");
	  
	  page.radioSelected(wd, "//*[@id=\"marketingOptIn\"]");
	  test2.log(LogStatus.PASS, "Validating that the I agree checkbox is checked by default");
	  
	// Scroll up to the start of the page
	  js.executeScript("window.scrollTo(0, 0);");
	  
	  page.typeAnything(wd, "//*[@id=\"checkout__name\"]", "parichay haldar");
	  page.typeAnything(wd, "//*[@id=\"checkout__phone\"]", "1234567890");
	  page.typeAnything(wd, "//*[@id=\"checkout__email\"]", "phaldarDummy@cisco.com");
	  test2.log(LogStatus.PASS, "Entering name, mobile, and email address");
	  
	  page.click(wd, "//*[@id=\"checkout-form\"]/div[3]/button");
	  test2.log(LogStatus.PASS, "Clicking on the Apply Gift Card link");
	  
	  Thread.sleep(1000);
	  
	  page.click(wd, "/html/body/div[7]/div/div/div/div/div[1]/div[1]/span");
	  test2.log(LogStatus.PASS, "A pop up should appear. Click on the Voucher");
	  
	  page.typeAnything(wd, "/html/body/div[7]/div/div/div/div/div[2]/form/input", "12345");
	  Thread.sleep(500);
	  page.click(wd, "/html/body/div[7]/div/div/div/div/div[2]/form/div[2]/button[1]");
	  test2.log(LogStatus.PASS, "Giving the Voucher code as 12345 and submit");
	  
	  Thread.sleep(1000);
	  
	  page.validateText(wd, "/html/body/div[7]/div/div/div/div/div[2]/form/div[2]/span","Sorry, we don’t currently support that coupon code.");
	  test2.log(LogStatus.PASS, "Validating successfully an error is coming that the number is incorrect");
	  
	  page.click(wd, "/html/body/div[7]/div/div/div/div/button");
	  test2.log(LogStatus.PASS, "Closing the voucher pop up");
	  
	  page.validateContainsSomthing(wd, "//*[@id=\"basket\"]/h2/span", "Basket");
	  test2.log(LogStatus.PASS, "The user again navigated to the Basket page.");
	  
	  
  }
  
  
  //	 for extended test report
  @AfterTest
	public void closeBrower() {
	     rep2.endTest(test2);
	     rep2.flush();
	     rep2.close();
	  }
  @AfterSuite
  public void closeDrive() {
	  wd.quit();
  }
}
