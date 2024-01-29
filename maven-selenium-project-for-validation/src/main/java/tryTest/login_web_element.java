package tryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_web_element {

	public static void main(String[] args) {
			WebDriver wd = new ChromeDriver();
			        wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
			        WebElement unm = wd.findElement(By.id("input-email"));
			        WebElement pwd = wd.findElement(By.id("input-password"));
			        // WebElement lgin = wd.findElement(By.cssSelector("button.btn:nth-child(5)"));
			        // unm.sendKeys("123455");
			        if (unm.isDisplayed()) {
			            unm.sendKeys("123455");
			        } else {
			            System.out.println("Invalid element");
			        }
			        if (pwd.isDisplayed()) {
			            pwd.sendKeys("123455");
			        } else {
			            System.out.println("Invalid element");
			        }


	}

}
