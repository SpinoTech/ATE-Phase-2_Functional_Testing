package samplepackage1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./TestData/testdata.properties");
		p.load(fis);
        
        wd.get("https://parabank.parasoft.com/parabank/index.htm");
        
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys(p.getProperty("uname"));
        	wd.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
        	        Thread.sleep(2000);
        	        
        	        wd.findElement(By.xpath("//input[@type=\"submit\" and @class=\"button\" and @value=\"Log In\"]")).click();
        	        String expTitle = "ParaBank | Accounts Overview";
        	        String actTitle = wd.getTitle();
        	        
        	        System.out.println("The title of the page:" + actTitle);
        	        
        	            
        	        if(expTitle.equals(actTitle)) {
        	            System.out.println("The user is successsfully loggedin");
        	        }
        	        else {
        	            System.out.println("Invalid user name and password");
        	        }
        	        

	}

}
