package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("Banu");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@value='Alert']")).click();
		//alert content
		System.out.print(d.switchTo().alert().getText());
		//alert contains ok button
		d.switchTo().alert().accept();
		//alert with cancel buttons
		d.findElement(By.xpath("//input[@value='Confirm']")).click();
		d.switchTo().alert().dismiss();		 
	}

}
