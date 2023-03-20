package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		//creating obj for chrome driver
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.xpath("//a[contains(text(),'Multiple')]")).click();
		Thread.sleep(1000);
		d.findElement(By.linkText("Click Here")).click();
		Set<String> window = d.getWindowHandles();
		Iterator<String> it= window.iterator();
		String parent=it.next();
		String child1=it.next();
		d.switchTo().window(child1);
		System.out.println(d.findElement(By.xpath("//h3")).getText());
		d.switchTo().window(parent);
		System.out.println(d.findElement(By.xpath("//h3")).getText());
	}
}
