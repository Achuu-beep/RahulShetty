package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_1 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://jqueryui.com/droppable/");
	       
	       driver.manage().window().maximize();
	       
	       //count no of frames in page
	       System.out.println(driver.findElements(By.tagName("iframe")).size());
	       
	       
	       driver.switchTo().frame(0);
	       WebElement src=driver.findElement(By.id("draggable"));
	       WebElement dest=driver.findElement(By.id("droppable"));
	       
	       Actions act=new Actions(driver);
	       act.dragAndDrop(src, dest).build().perform();
	       //driver.quit();
	       
	       
	       
	}

}
