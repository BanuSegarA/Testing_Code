package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_booking {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		WebElement ele=d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		//WebElement ele=d.findElement(By.xpath("//select[@class='valid']"));
		Select drop=new Select(ele);
		// select static dropdown using index
		drop.selectByIndex(3);
		//static dropdown using text
		drop.selectByVisibleText("INR");
		drop.selectByValue("AED");
		d.findElement(By.xpath("//div[@class='paxinfo']")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<4)
		{
			d.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
			i++;
		}
		d.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();// done button
		//Check Box
		d.findElement(By.xpath("//input[contains(@name,'friendsand')]")).click();
		
	}
}
