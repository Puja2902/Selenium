package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");

		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Puja");

		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Sharma");

		driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("9198670175");

		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("puja123@gmail.com");

		driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("sonari");

		driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("jsr");

		driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("jharkhand");

		driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("jharkhand");

		Select select = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[2]/Select[1]")));

		select.selectByVisibleText("INDIA");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("puja2902");

		driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("1223a");

		driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("1223a");

		driver.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
