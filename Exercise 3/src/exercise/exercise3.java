package exercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");

		//Create an object for Manage Firefox
		WebDriver driver=new FirefoxDriver();
		
		//I get the page
		driver.get("http://toolsqa.com/automation-practice-form");
		//I seard the element called Firstname and send my name for write on page		
		WebElement elementName=driver.findElement(By.name("firstname")); 
		elementName.sendKeys("elvis");
		//I seard the element called Firstname and send my name for write on page		
		WebElement elementLocator=driver.findElement(By.name("lastname")); 
		elementLocator.sendKeys("Duran");		
	
		//I send the submit click
		driver.findElement(By.id("submit")).click();

	}

}
