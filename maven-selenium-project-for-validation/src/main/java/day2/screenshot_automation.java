package day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_automation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.16.1");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			        Files.copy(src, new File("C:\\Users\\phaldar\\Documents\\apt2-functional-testing\\maven-selenium-project-for-validation\\src\\main\\java\\day2\\screenshotOfTheWebsite.png"));

	}

}
