package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {

		
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("checkBoxOption1")).click();
	       Boolean status=driver.findElement(By.id("checkBoxOption1")).isSelected();

	       Assert.assertTrue(status);
		    Assert.assertEquals(status, true,"checkbox mismatch");
		    
		     
	       driver.findElement(By.id("checkBoxOption1")).click();
	       Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	       
	       
	       //How to get the Count of number of check boxes present in the page
	       
	       List<WebElement> option=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	       
	       System.out.println(option.size());
	       
	       driver.quit();
	       
	}

}
