package samplepackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver wd= new ChromeDriver();
		        
		        wd.get("https://parabank.parasoft.com/parabank/index.htm");
		        // WebDriver --- Interface
		        
		        String pageTitle = wd.getTitle();
		        System.out.println("The page title is " + pageTitle);
		        
//		         Interact the elemnt using Xpath)
		        
		        wd.findElement(By.xpath("//*[contains(text(),'Register')]")).click();
		      
		        String regurl = wd.getCurrentUrl();
		        System.out.println(regurl);
		        
		        String domcontentofthepage=wd.getPageSource();
		        System.out.println(domcontentofthepage);
		        
		        

	}

}
