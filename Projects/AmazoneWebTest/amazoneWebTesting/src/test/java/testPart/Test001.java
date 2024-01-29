package testPart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RequiredPackages.pageClassLibrery;

import org.testng.annotations.BeforeTest;

public class Test001 {
  pageClassLibrery page = new pageClassLibrery();
  WebDriver driver = new ChromeDriver();
  @BeforeTest
  public void init() {
	  page.InitDriver(driver);
  }
  @Test
  public void TestCase1() {
	  page.launchApp("https://www.amazon.in/");
	  page.TypeSomthing("//*[@id=\"twotabsearchtextbox\"]", "makbook air m1");
	  page.clickOn("//*[@id=\"nav-search-submit-button\"]");
	  page.getAllPrice("[class=\"a-price-whole\"]");
	  page.getMinVal();
  }
}
