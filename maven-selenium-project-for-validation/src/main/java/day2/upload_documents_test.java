package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_documents_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
			        wd.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
			        Thread.sleep(3000);
			        wd.findElement(By.xpath("//input[@name=\"userfile\"]")).sendKeys("C:\\Users\\phaldar\\Documents\\apt2-functional-testing\\maven-selenium-project-for-validation\\src\\main\\java\\day2\\tested_file_for_upload");
			        Thread.sleep(3000);

	}

}
