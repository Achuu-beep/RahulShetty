package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggetion {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("autosuggest")).sendKeys("indi");
	       
	       Thread.sleep(1000);
	       
	       List<WebElement> options=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
	       
	       for(WebElement option:options){
	    	   
	    	   if(option.getText().equalsIgnoreCase("India")) {
	    		   
	    		   option.click();
	    		   String selectedValue = driver.findElement(By.id("autosuggest")).getAttribute("value");
	    		   System.out.println(selectedValue);
	    		   break;
	    		   
	    	   }
	    	   
	    }
	       
	}
	
	

}
