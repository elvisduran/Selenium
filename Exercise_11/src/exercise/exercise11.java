package exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        
		//STEP 2
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		//STEP 3
        driver.findElement(By.id("alert")).click();
        
        //STEP 4
        Alert windowAlert = driver.switchTo().alert();
      //STEP 5
        windowAlert.accept();
        driver.close();
	}

}
