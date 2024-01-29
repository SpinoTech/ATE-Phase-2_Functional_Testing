package RequiredPackages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageClassLibrery {
	WebDriver driver;
	 List<Double> prices = new ArrayList<>();
	
	public void InitDriver(WebDriver driver) {
	    	this.driver = driver;
	 }
	
    public void launchApp(String url) {
    	driver.get(url);
    	System.out.println("The app is launched successfully");
    }
    public void TypeSomthing(String selector ,String value) {
    	driver.findElement(By.xpath(selector)).sendKeys(value);
    }
    public void clickOn(String selector) {
    	driver.findElement(By.xpath(selector)).click();
    }
    public void getAllPrice(String classname) {
         String itemClassName = "item-price";
         List<WebElement> priceElements = driver.findElements(By.className(itemClassName));
         for (WebElement priceElement : priceElements) {
             String priceText = priceElement.getText().replaceAll("[^\\d.]", ""); // Remove non-numeric characters
             if (!priceText.isEmpty()) {
                 double price = Double.parseDouble(priceText);
                 prices.add(price);
                 System.out.println(price);
             }
         }
    }
   public void getMinVal() {
	   Double mini=100000000000.00;
	   for(Double i:prices) {
		   if(i<mini)mini=i;
	   }
	   System.out.println("the minimum value is :");
	   System.out.println(mini);
    }
}
