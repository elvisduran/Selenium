package excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excercise10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        
        
		//STEP 2
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		//STEP 3 
        String windowhandle= driver.getWindowHandle();
        System.out.println(windowhandle);

		//STEP 4
        String label = "New Message Window";
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(.,'" + label + "')]")).click();
        
		//STEP 5
        Set<String> windowsHandles = driver.getWindowHandles();

		//STEP 6
        List<String> list = new ArrayList<String>(windowsHandles);
        String obj = list.get(1);
      	driver.switchTo().window(obj).close();
      	
        
        
	}

}
