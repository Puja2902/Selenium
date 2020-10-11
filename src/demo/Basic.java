package demo;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basic {

	public static void main(String[] args) {
		
		Map<String , Object> prefs = new HashMap<String , Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions option = new ChromeOptions();
		
		option.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
