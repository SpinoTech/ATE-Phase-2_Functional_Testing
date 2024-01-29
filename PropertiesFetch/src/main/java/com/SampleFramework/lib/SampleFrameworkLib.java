package com.SampleFramework.lib;

import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class SampleFrameworkLib {
//write the core automation scripts for different steps in different methods
	
	WebDriver wd;
	
	String expTitle = "ParaBank | Register for Free Online Account Access";
	
	public void init1(WebDriver wd){
		this.wd =wd;
	}
	
	public void App_Launch(WebDriver wd) {
		//invoke app
		wd.get("https://parabank.parasoft.com/parabank/register.htm");
		
		String title = wd.getTitle();
//		System.out.println(title);
		if(expTitle.equals(title)) {
			System.out.println("Application launched successfully");
		}
	}
	
	public void input_firstName(WebDriver wd) throws IOException {
		
		Properties p1 = new Properties();
		Properties p2 = new Properties();
		
		FileReader f1 = new FileReader("./SampleFramework_OR/locators.properties");
		FileReader f2 = new FileReader("./SampleFramework_Testdata/testdata.properties");
		
		p1.load(f1);
		p2.load(f2);
		wd.findElement(By.xpath(p1.getProperty("Lfirstname"))).sendKeys(p2.getProperty("Tdfirstname"));
		
	}
	
	public void clickOnRegister(WebDriver wd) throws IOException {
		Properties p1 = new Properties();
		FileReader f1 = new FileReader("./SampleFramework_OR/locators.properties");
		
		p1.load(f1);
		
		if(wd.findElement(By.xpath(p1.getProperty("RegisterButton"))).isDisplayed()) {
			wd.findElement(By.xpath(p1.getProperty("RegisterButton"))).click();
		}	
		
		else {
			System.out.println("element is invalid");
		}
		
	}
	
	public void captureScreen(WebDriver wd) throws IOException {
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("./ScreenCaptures/img1.jpg"));
	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//
//	}

}
 