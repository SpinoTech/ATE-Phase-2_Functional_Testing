package pizzahut.com.pizzahut.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AlllibreriesPOM {
    WebDriver wd;
	
	public void init1(WebDriver wd){
		this.wd =wd;
	}
	public void App_Launch(WebDriver wd , String link) {
		wd.manage().window().maximize();
		//invoke app
		wd.get(link);
		
	}
	
	public void click( WebDriver wd , String loc) {
		wd.findElement(By.xpath(loc)).click();
	}
	
	public void typeAnything(WebDriver wd , String Xpath , String value) throws InterruptedException {
	    	wd.findElement(By.xpath(Xpath)).sendKeys(value);
	}
	
    public void typeAnythingAndEnter(WebDriver wd , String Xpath , String value) throws InterruptedException {
    	wd.findElement(By.xpath(Xpath)).sendKeys(value);
    	Thread.sleep(1000);
    	// Use Actions to perform Enter key press
        Actions actions = new Actions(wd);
        actions.sendKeys(wd.findElement(By.xpath(Xpath)), Keys.ENTER).build().perform();
    }
    
    public void validateURL(WebDriver wd , String text) {
    	Assert.assertTrue(wd.getCurrentUrl().contains(text), "URL does not contain 'deals'");
    }
    
    public void Displayed(WebDriver wd , String loc) {
    	Assert.assertTrue(wd.findElement(By.xpath(loc)).isDisplayed(), "it's not visible");
    }
    
    public void validateContainsSomthing(WebDriver wd , String loc , String text) {
    	Assert.assertTrue(wd.findElement(By.xpath(loc)).getText().contains(text), "Checkout button shows price");
    }
    
    public void radioSelected(WebDriver wd , String loc) {
    	 Assert.assertTrue(wd.findElement(By.xpath(loc)).isSelected(), "Online Payment radio button is not selected by default");
    }
    
    public void validateText(WebDriver wd , String loc , String val) {
    	 Assert.assertEquals(wd.findElement(By.xpath(loc)).getText(), val, "Error message does not match expected");
    }
}
