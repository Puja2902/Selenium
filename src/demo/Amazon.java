package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.cssSelector("i.hm-icon")).click();

		driver.findElement(By.partialLinkText("Echo & Alexa")).click();

		driver.findElement(By.partialLinkText("Echo Dot")).click();

		String title = driver.findElement(By.cssSelector("span#productTitle")).getText();

		System.out.println(title);

		if (title.contains("Echo Dot")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.close();

	}

}
