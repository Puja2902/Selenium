package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Puja");

		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sharma");

		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("puj@gmail.com");

		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123ps");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("puj@gmail.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		selectValueFromDropDown(day, "10");
		selectValueFromDropDown(month, "Mar");
		selectValueFromDropDown(year, "1962");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

		driver.findElement(By.xpath("//div//child::button[1]")).submit();

		driver.close();

	}

	public static void selectValueFromDropDown(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}
