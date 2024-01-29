package day3Selenium.byClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.redbus.in/?gclid=Cj0KCQiAwP6sBhDAARIsAPfK_wZvEnuOKW7QROQawgMkGcUm33b_lmOAbv_wZKd5pe7RlKJPFH0Z76waAgVaEALw_wcB");
		By el1 = By.xpath("//*[@id=\"src\"]");
		wd.findElement(el1).sendKeys("bangalore");
		By el2 = By.xpath("//*[@id=\"dest\"]");
		wd.findElement(el2).sendKeys("Kolkata");
	}

}
