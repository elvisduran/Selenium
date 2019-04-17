package exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        
		//STEP 2
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(4000);
		//STEP 3
        driver.findElement(By.id("alert")).click();
        
        //STEP 4
        Alert windowAlert = driver.switchTo().alert();
        Thread.sleep(4000);
      //STEP 5
        windowAlert.accept();
        driver.close();
	}

}
