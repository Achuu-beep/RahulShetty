package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.className("blinkingText")).click();
	       
	       String Parentwindow=driver.getWindowHandle();
	       
	       Set<String> windowid=driver.getWindowHandles();
	       
	       for(String wind:windowid){
	    	   
	    	   if(!wind.equals(Parentwindow)) {
	    		   
	    		   driver.switchTo().window(wind);
	    		   System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    		   
	    		  
	    	   }
	       }
	       
	       
	       //extracting the emailid from a string
	       String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	       
	       driver.switchTo().window(Parentwindow);
	    	driver.findElement(By.id("username")).sendKeys(emailid);

	       
	       
	       //driver.quit();
	}

}
