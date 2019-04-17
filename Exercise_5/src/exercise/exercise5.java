package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//I get the page
		//Step 2
		driver.get("http://toolsqa.com/automation-practice-form");
		//Step 3
		// Found the options
 		List <WebElement> lstOptions = driver.findElements(By.name("sex"));
 		
 		//I check if the option female is selected
 		boolean bOpcion=lstOptions.get(1).isSelected();
 		// If dont selected
 		if (bOpcion==false)
 		{
 			//Click the option Female
 			lstOptions.get(1).click();
 		}
 		
		//Step 4
 		// I found the element an selected
 		driver.findElement(By.id("exp-2")).click();
 		
 		
		//Step 5
 		//I found the checks 
 		List<WebElement> lstChecks =driver.findElements(By.name("profession"));
 		//I search by every element and found by value
 		for (int i=0;i<lstChecks.size();i++)
 		{
 			if (lstChecks.get(i).getAttribute("value").toString().equals("Automation Tester"))
 			{
 				lstChecks.get(i).click();
 				break;
 			}
 		}
 		
		//Step 6
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		
 		
 		

	}

}
