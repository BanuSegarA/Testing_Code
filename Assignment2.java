package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//creating obj for chrome driver
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		d.findElement(By.xpath("//div/input[contains(@name,'name')]")).sendKeys("Banu");
		d.findElement(By.xpath("//*[@name='email']")).sendKeys("banu.gmail.com");
		d.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("1234567");
		d.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement ele=d.findElement(By.xpath("//div/select"));
		Select drop=new Select(ele);
		drop.selectByIndex(1);
		d.findElement(By.xpath("//div/div/following-sibling::div/label[text()='Employed']")).click();
		d.findElement(By.xpath("//input[@name='bday']")).sendKeys("06-04-1991");
		d.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.print(d.findElement(By.xpath("//div[contains(@class,'alert alert')]")).getText());
	}

}
