package com.SampleFramework.Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	WebDriver wd;
	
	public void init2(WebDriver wd){
		this.wd =wd;
	}
	
	public void waitTime(WebDriver wd) throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void Maximize_Window(WebDriver wd) {
		wd.manage().window().maximize();
	}
	
	public void close_browser(WebDriver wd) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("invoking close_browser method");
		wd.quit();
	}
}
