package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		// I search the value B. Williamson from grid
		String cell = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[6]/td[1]")).getText();
		//Print the value
		System.out.println(cell);

		// Click on title name
		driver.findElement(By.xpath(".//*[@id=\"example\"]/thead/tr/th[1]")).click();        

		Thread.sleep(4000);
		//Click on title Start Date
		driver.findElement(By.xpath(".//*[@id=\"example\"]/thead/tr/th[5]")).click();        

	}

}
