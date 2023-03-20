package introduction;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/loginpagePractise");
		d.findElement(By.xpath("//a[contains(text(),'Free Access')]")).click();
		//switch parent to child
		Set<String> window=d.getWindowHandles(); //contains [parentid,child id]
		// to switch to child id
		 Iterator<String> it = window.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 //switch to child
		 d.switchTo().window(childId);
		 String mail=d.findElement(By.xpath("(//p[@class='im-para red'])[1]")).getText().split("at")[1].trim().split(" ")[0];
		 d.switchTo().window(parentId);
		 d.findElement(By.id("username")).sendKeys(mail);

	}

}
