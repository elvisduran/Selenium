package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//I get the page
		//Step 2
		driver.get("http://toolsqa.com/automation-practice-form");

		//Step 3
		WebElement combo = driver.findElement(By.id("continents"));
		Select items = new Select(combo);
		
		//Step 4
		//Selected by text
		items.selectByVisibleText("Europe");
		
		//Step 5
		//Selected by index
		items.selectByIndex(2);
		
		//Step 6
		// get the total count of element
		int intSize=items.getOptions().size();
		
		for (int i=0; i < intSize; i++)
		{
			//print the opcions
			System.out.println(items.getOptions().get(i).getText());
		}
		//select by index 
		items.selectByIndex(3);
		
		//Step 7
		driver.close();
	}

}
