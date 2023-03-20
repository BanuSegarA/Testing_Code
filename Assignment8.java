package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://www.qaclickacademy.com/practice.php");
		d.findElement(By.xpath("//div/fieldset/input[@id='autocomplete']")).sendKeys("ind");
		Thread.sleep(1000);
		d.findElement(By.xpath("//div/fieldset/input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		d.findElement(By.xpath("//div/fieldset/input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		System.out.println(d.findElement(By.xpath("//div/fieldset/input[@id='autocomplete']")).getAttribute("value"));
	}
}