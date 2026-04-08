package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Passenger {

	public static void main(String[] args) throws Exception {

		//Validating adult passenger field
		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("divpaxinfo")).click();
	       
	       Thread.sleep(Duration.ofSeconds(10));
	       
	       
	       //increasing adult
	       for(int i=1;i<4;i++){
	    	   
	    	   
	    	  driver.findElement(By.id("hrefIncAdt")).click();
	    	   
	       }
	       
	      System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
	      
	      //decreasing adult
	      for(int i=1;i<3;i++){
	    	   
	    	   
	    	  driver.findElement(By.id("hrefDecAdt")).click();
	    	   
	       }
	      
	      System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 

	}

}
