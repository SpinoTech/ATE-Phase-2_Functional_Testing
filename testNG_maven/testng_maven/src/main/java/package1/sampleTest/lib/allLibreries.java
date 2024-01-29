package package1.sampleTest.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class allLibreries {
	WebDriver wd;
	
	public void init1(WebDriver wd){
		this.wd =wd;
	}
	
	public void App_Launch(WebDriver wd , String link) {
		//invoke app
		wd.get(link);
		String expTitle = "jQuery UI";
		
		String title = wd.getTitle();
		Assert.assertEquals(title, expTitle);
	}
	
	public void click( WebDriver wd , String loc) {
		wd.findElement(By.xpath(loc)).click();
	}
	
	public void getText(WebDriver wd , String loc) {
		 String res = wd.findElement(By.xpath(loc)).getText();
	        System.out.println(res + "Retrived data");
	}
	

}
