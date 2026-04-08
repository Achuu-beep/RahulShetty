package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Assignment1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://the-internet.herokuapp.com/nested_frames");
	       
	       driver.manage().window().maximize();
	       
	       
	       //System.out.println(driver.findElements(By.tagName("frame")).size());
	       
	       //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
	       driver.switchTo().frame("frame-top");
	       
	       //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
	       driver.switchTo().frame("frame-middle");

	       System.out.println(driver.findElement(By.id("content")).getText());
	       
	       
	       
	       driver.quit();
	}

}
