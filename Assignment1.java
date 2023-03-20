package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		//creating obj for chrome driver
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();//check checkbox
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();//uncheck checkbox
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());// checkbox count
	}
}