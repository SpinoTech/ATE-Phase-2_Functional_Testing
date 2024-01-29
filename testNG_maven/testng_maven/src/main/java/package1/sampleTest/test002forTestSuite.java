package package1.sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test002forTestSuite {
	  static WebDriver wd = new ChromeDriver();
  @Test
  public void fn1() {
	  wd.get("https://demo.opencart.com/");
	  wd.findElement(By.xpath("(//*[contains(text(),'My Account')])[1]")).click();
	  wd.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]")).click();
  }
  
	    @Test(priority = 1)
	    public void teststep1() throws InterruptedException {
	        wd.get("https://jqueryui.com/");
	        Thread.sleep(2000);
	    }
	    @Test(priority = 2)
	    public void teststep2() throws InterruptedException {
	        wd.findElement(By.xpath("/html/body/header/section/nav/div/ul[2]/li[1]/a")).click();
	        Thread.sleep(2000);
	    }
	    	@Test(priority = 3)
	    	    public void teststep3() {
	    	        String res = wd.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/h1")).getText();
	    	        System.out.println(res + "Retrived data");
	    	    }


}
