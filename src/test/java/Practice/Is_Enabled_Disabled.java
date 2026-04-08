package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Enabled_Disabled {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       
	       
	       //note:if u select one way, then Ui shows disabled but selenium prints enabled because this method clicks & checks
	       //as a workaround we can use below code
	       
	       System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	       
	       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	       
	       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	       {
	    	   
	    	   System.out.println("its enabled");

	    	   Assert.assertTrue(true);
	       }
	       
	       else {
	    	   
	    	   Assert.assertTrue(false);
	       }
	}

}
