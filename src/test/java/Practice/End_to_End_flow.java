package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End_to_End_flow {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		   
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
	       WebDriverWait wait = new WebDriverWait(driver, 10);
	       
	       //select cities
	       
           driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	       
	       driver.findElement(By.xpath("//li//a[@value=\"BLR\"]")).click();


	       
	       WebElement blr=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li//a[@value=\"MAA\"]")));
	       //driver.findElement(By.xpath("//li//a[@value=\"AIP\"]")).click();
	       blr.click();
	       //select depart calender
	       driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-current-day")).click();
	       
	       //checking arrival calender is enabled/disabled
	       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	       {
	    	   
	    	   System.out.println("its disabled");

	    	   Assert.assertTrue(true);
	       }
	       
	       else {
	    	   
	    	   Assert.assertTrue(false);
	       }
	       
	       
	       //Selecting passenger
          driver.findElement(By.id("divpaxinfo")).click();
	       
	       Thread.sleep(Duration.ofSeconds(10));
	       
	       
	       //increasing adult
	       for(int i=1;i<4;i++){
	    	   
	    	   
	    	  driver.findElement(By.id("hrefIncAdt")).click();
	    	   
	       }
	       
	      System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
	    
	      
	      //selecting currency
	       WebElement dp= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	       
	       Select dropdown =new Select(dp);
	       dropdown.selectByIndex(1);
	       System.out.println(dropdown.getFirstSelectedOption().getText());
	       
	       
	       //clicking search button
	       //driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	       driver.findElement(By.cssSelector("input[value='Search']")).click();
	       
	       driver.quit();


	}

}
