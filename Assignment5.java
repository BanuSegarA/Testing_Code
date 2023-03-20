package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		//creating obj for chrome driver
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.partialLinkText("Nested Frames")).click();
		Thread.sleep(1000);	
		d.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		System.out.println(d.findElement(By.id("content")).getText());
	}
}