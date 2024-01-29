package day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestionAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
        wd.get("https://www.google.co.in/");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("c programming");
        Thread.sleep(3000);
        
//        printing all the list
        List<WebElement> el =  wd.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
        for(int i=0;i<el.size();i++) {
        	System.out.println(((WebElement) el.get(i)).getText());
        }
//      for clicking one option
      wd.findElement(By.xpath("//*[@id=\"sBQTL\"]/div[1]")).click();
	}

}
