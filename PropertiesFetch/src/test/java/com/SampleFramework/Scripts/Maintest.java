package com.SampleFramework.Scripts;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maintest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd;
		
		Properties p = new Properties();
		
		FileReader browserInfo1 = new FileReader("./SampleFramework_Testdata/browserInfo.properties");
		
		p.load(browserInfo1);
		
		if(p.getProperty("browser1").equals("firefox")) {
			wd = new FirefoxDriver();
			wd.get("https://www.google.com/");
		} else {
			wd = new ChromeDriver();
			wd.get("https://www.google.com/");
		}

	}

}
