//Parameterization code is here

package StepsDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multipleSteps {
		    WebDriver driver;
		    @DataProvider(name = "test-data")
		    public Object[][] dataProvFunc() {
		        return new Object[][] { { "LoadRunner", "Chennai" }, { "LoadRunner1", "Chennai1" },
		                { "LoadRunner2", "Chennai2" }, { "test123", "pwd123" } };
		    }
		    @BeforeMethod
		    public void setUp() {
		        System.out.println("Start test");
		        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); //for the driver only for the downgraded version of selenium

		   	 driver = new ChromeDriver();
		        String url = "https://demo.opencart.com/index.php?route=account/login&language=en-gb";
		        driver.get(url);
		        driver.manage().window().maximize();
		    }
		    @Test(dataProvider = "test-data")
		    public void search(String keyWord1, String keyWord2) throws InterruptedException {
		        WebElement txtBox = driver.findElement(By.name("email"));
		        txtBox.sendKeys(keyWord1);
		        WebElement txtBox1 = driver.findElement(By.name("password"));
		        // Reporter.log("Keyword entered is : " +keyWord1+ " " +keyWord2);
		        // txtBox.s
		        	Thread.sleep(2000);
		        	        txtBox1.sendKeys(keyWord2);
		        	    }
		       @AfterMethod
		         public void burnDown() {
		        	   driver.quit();
		        	    }

}
