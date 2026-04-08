package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_actions {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	       
	       driver.manage().window().maximize();
	       
	       Actions act=new Actions(driver);
	       
	       //search using ENTER key
	       
	      driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Broco");
	      act.sendKeys(Keys.ENTER).perform();
	      
	      

	      //select text and delete(cntl+A then delete)
	      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
	      
	      
	      //entering in capitals
	      act.keyDown(Keys.SHIFT).sendKeys("caul").keyUp(Keys.SHIFT).perform();
	      
	      
	      //copy & paste
	      
	      
	      
	      Thread.sleep(1000);
	      
	      
	      //navigate through TAB key
	      Thread.sleep(1000);

	      for(int i=0;i<5;i++){
	      act.sendKeys(Keys.TAB).perform();
	      
	      
	      }
	      
	      
	     driver.quit(); 
	       
	
	}

}
