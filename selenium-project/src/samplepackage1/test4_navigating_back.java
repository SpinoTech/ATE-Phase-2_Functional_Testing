package samplepackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4_navigating_back {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriver wd = new ChromeDriver();
			        
			        wd.manage().window().maximize();
			        
			        wd.get("https://parabank.parasoft.com/parabank/index.htm");
			        Thread.sleep(2000);
			        wd.navigate().back();
			        Thread.sleep(2000);
			        wd.navigate().forward();
			        wd.navigate().refresh();

	}

}
