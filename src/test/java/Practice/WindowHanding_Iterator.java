package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHanding_Iterator {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.className("blinkingText")).click();
	       
	       Set<String> windowid=driver.getWindowHandles();
	       
	       Iterator<String> it=windowid.iterator();
	       
	       String Parent=it.next();//telling to move control to zero index
	       String child=it.next();//1st index
	       
	       driver.switchTo().window(child);
	       
	       System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	       
	       String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	       
	       driver.switchTo().window(Parent);
	    	driver.findElement(By.id("username")).sendKeys(emailid);

	}

}
