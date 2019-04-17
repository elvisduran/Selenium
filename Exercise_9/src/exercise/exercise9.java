package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise9 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//STEP 2
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");

		//STEP 3
		String row = "6";
		String col = "1";
		
		// I search the value B. Williamson from grid
		String cell = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+row+"]/td["+col+"]")).getText();
		System.out.println(cell);
		
		//STEP 4
		
		String RowValue = "B. Williamson";
		//I found the combo for all rows filters
		WebElement combo = driver.findElement(By.name("example_length"));
		Select items = new Select(combo);
		//Select the max index for the values of the grids
		items.selectByIndex(items.getOptions().size()-1);
		
		//I found all the rows on grid
		WebElement tableProducts = driver.findElement(By.id("example"));
		List<WebElement> tableRows = tableProducts.findElements(By.tagName("tr"));
		//I count all the row
		int countList=tableRows.size();
		
		//I started to search the value on all the forst column
		for (int i=1;i<=countList-1;i++){
			String strValue = null;
			//take the values from the first column
			strValue = driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td[\"+1+\"]")).getText();
				//Compare if the value is the same 
				if(strValue.equalsIgnoreCase(RowValue)){
					// I found the values from anothers columns 
					for (int j=1;j<=6;j++){
						String sColumnValue= driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.println(sColumnValue);
					}
				break;
				}
			}
		
		driver.close();
		
	}

}
