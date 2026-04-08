package Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_1 {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	       
	       driver.manage().window().maximize();
	       
	      String Parentwind=driver.getWindowHandle();

	       
	       driver.findElement(By.linkText("Top Deals")).click();
	       
	       Set<String> windowid=driver.getWindowHandles();
	       
	       for(String win:windowid){
	    	   
	    	   if(!win.equalsIgnoreCase(Parentwind)) {
	    		   
	    		   driver.switchTo().window(win);
	    		   break;
	    		   
	    	   }
	    	   
	       }
	       
	       Thread.sleep(1000);
	       
	       String month="6";
	       String day="12";
	       String year="2027";
	       String[] expectedList= {month,day,year};
	       
	       driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
	       driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
	       driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
	       
	       driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
	       
	       driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();

	       driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
	       
	       //validating date using assertion
	       
	       List<WebElement> actualList=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
	       
	       for(int i=0;i<actualList.size();i++){
	    	   
	    	   System.out.println(actualList.get(i).getAttribute("value"));
	    	   Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
	    	   
	       }
	       
	       
	       
	       
	       driver.quit();
	       
	}

}
