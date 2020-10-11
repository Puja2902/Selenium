package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		boolean isEnabled = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isEnabled();

		boolean isDisplayed = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isSelected();

		if (isEnabled) {
			System.out.println("tag is enabled");
		} else {
			System.out.println("tag is disabled");
		}
		if (isDisplayed) {
			System.out.println("tag is displayed");
		} else {
			System.out.println("tag is displayed");
		}

	}

}
