package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		//Create an object for Manage Firefox
		WebDriver driver= new FirefoxDriver();
		
		//I get the page
		driver.get("http://toolsqa.com/automation-practice-form");
		//I search by partial text and I did click
		driver.findElement(By.partialLinkText("Partial")).click();
		// I search and found by tag
		 String strName = driver.findElements(By.tagName("button")).toString();
		 //Print the text founded
		 System.out.println(strName);
		
		 // Click the link
		 driver.findElement(By.linkText("linkTest")).click();
		
	}

}
