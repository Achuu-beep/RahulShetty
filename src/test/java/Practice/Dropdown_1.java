package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_1 {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       
	       //driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	       
	       WebElement dp= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	       
	       Select dropdown =new Select(dp);
	       dropdown.selectByIndex(3);
	       System.out.println(dropdown.getFirstSelectedOption().getText());
	       
	       Thread.sleep(Duration.ofNanos(2000));
	       dropdown.selectByValue("INR");
	       System.out.println(dropdown.getFirstSelectedOption().getText());
	       
	       dropdown.selectByVisibleText("AED");
	       System.out.println(dropdown.getFirstSelectedOption().getText());

	       
	       
	       
	       

	       
	}

}
