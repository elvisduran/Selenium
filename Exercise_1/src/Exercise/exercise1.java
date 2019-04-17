package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise1 {
	
	//the main method
	public static void main(String[] args) {
		//I create object to execute my code 
		exercise1 obj= new exercise1();
		// 
		obj.ExploreSelenium();
		
	}
	
	public void ExploreSelenium() {
		System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
		

		//Create an object for Manage Firefox
		WebDriver driver=new FirefoxDriver();
		//Store the URL on string Variable
		String url="http://store.demoqa.com/";
		//I go to the page
		driver.get(url);
		//store the result of title name in string variable
		String title= driver.getTitle();
		//take the length of the title
		int length=title.length();
		System.out.println("Title:"+ title);
		System.out.println("legth:"+ length);
		
		
		
		//Take the current page for comparing with the original page. 
		String currentURL=driver.getCurrentUrl();
		
		if (currentURL.equals(url))
		{
			System.out.println("Verification is OK");	
		}
		else
		{
			System.out.println("Something was wrong");
		}
		//Store the page source
		String page=driver.getPageSource();
		//take the length of the page		
		int lengthPage=page.length();
		
		System.out.println("Page legth:"+ lengthPage);
		
		// I close the firefox
		driver.close();
	}

}
