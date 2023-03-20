package introduction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class actionDemo {
	public static void main(String[] args) {
		//creating obj for chrome driver
		WebDriver d= new ChromeDriver();
		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://www.amazon.in/");
		//Mouse moveover using Action class
		Actions a=new Actions(d);
	}
}