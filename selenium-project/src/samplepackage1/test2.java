package samplepackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
	
			WebDriver wd = new ChromeDriver();
			        
			        wd.get("https://parabank.parasoft.com/parabank/index.htm");
			        
			    //By.name("username")
			        // accept the user name as abcdefgh
			        wd.findElement(By.name("username")).clear();
			        
			        
			        wd.findElement(By.name("username")).sendKeys("gayatrimis1");
			        //wd.findElement(By.name("username")).clear();
			        wd.findElement(By.name("password")).sendKeys("Para@123One");
			        
			        //gayatrimis1
			        //Para@123One
			        
			        // click on login button
			        wd.findElement(By.xpath("//input[@type=\"submit\" and @class=\"button\" and @value=\"Log In\"]")).click();
			        

	}

}
