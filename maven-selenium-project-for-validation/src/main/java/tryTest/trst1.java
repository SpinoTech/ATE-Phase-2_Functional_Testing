package tryTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trst1 {

	public static void main(String[] args) throws InterruptedException {
            WebDriver wd = new ChromeDriver();
            	wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.16.1");
            	        String value1 = wd.findElement(By.xpath("(//*[contains(text(),'Categories')])[1]")).getText();
            	        System.out.println("Extracted value:" + " " + value1);
            	        Thread.sleep(3000);
            	        ArrayList el = (ArrayList) wd.findElements(By.tagName("a"));
            	        int countlinks = el.size();
            	        System.out.println("Total number of elements are :" + countlinks);
            	        // Get all the link names
            	        for (int i = 0; i <= countlinks; i++) {
            	            String result = ((WebElement) el.get(i)).getText();
            	            System.out.println(result);
            	        }


	}

}
