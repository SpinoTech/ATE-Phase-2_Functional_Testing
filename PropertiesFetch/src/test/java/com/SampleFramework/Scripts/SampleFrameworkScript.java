package com.SampleFramework.Scripts;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import com.SampleFramework.Utilities.CommonMethods;
import com.SampleFramework.lib.SampleFrameworkLib;

public class SampleFrameworkScript {
	static WebDriver wd = new ChromeDriver();
	static SampleFrameworkLib obj;
	static CommonMethods obj1;
	Properties p;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Associate with libFile to call the respective methods
		obj = new SampleFrameworkLib();
		obj1 = new CommonMethods();
		
		obj.init1(wd);
		obj1.init2(wd);
		
		obj.App_Launch(wd);

		obj1.waitTime(wd);
		
		obj1.Maximize_Window(wd);
		
		obj.input_firstName(wd);
		
		obj.clickOnRegister(wd);
		
		//obj.validationMessage(wd);
		
		obj.captureScreen(wd);
		
		//obj1.close_browser(wd);
		
		//access CommonMethod
		
		//obj1.close_browser(wd);
		
	}
	
	

}
