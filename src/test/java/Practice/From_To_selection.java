package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class From_To_selection {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	       
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//li//a[@value=\"BLR\"]")).click();
	       driver.findElement(By.xpath("//li//a[@value=\"MAA\"]")).click();
	       
	}

}
