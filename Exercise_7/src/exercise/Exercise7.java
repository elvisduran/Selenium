package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//I get the page
		//Step 2
		driver.get("http://toolsqa.com/automation-practice-form");
		
		//Step 3
		WebElement combo = driver.findElement(By.name("selenium_commands"));
		Select items = new Select(combo);

		 // Step 4 
		//Select the option and desselect it
		items.selectByIndex(0); 
		Thread.sleep(4000);
		 items.deselectByIndex(0);
		 
		 // Step 5 
		 //Select the option and desselect it by text
		 items.selectByVisibleText("Navigation Commands");
		 Thread.sleep(4000);
		 items.deselectByVisibleText("Navigation Commands");
		 
		 
		 // Step 6
		 //I get the list of element on my combo
		 List<WebElement> listItems = items.getOptions();
		 int intCount = listItems.size();
		 
		 for(int i =0; i < intCount ; i++)
		 {
			 // Get the Text Value 
			 String strText = items.getOptions().get(i).getText();
		 
			 System.out.println(strText);
		 
			 // Selecting all by index, in this case, I select all
			 items.selectByIndex(i);
			 
		 }
		 Thread.sleep(4000);
		 // Step 7 
		 //Deselect the items
		 items.deselectAll();
		 //Step 8
		 // Close the page
		 driver.close();
	}

}
