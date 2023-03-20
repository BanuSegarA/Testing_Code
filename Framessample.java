package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framessample {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("http://jqueryui.com/droppable/");
		// to find number of iframe tags
		System.out.println(d.findElements(By.tagName("iframe")).size());
		d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a=new Actions(d);
		WebElement src=d.findElement(By.id("draggable"));
		WebElement target=d.findElement(By.id("droppable"));
		a.dragAndDrop(src, target).build().perform();
		// to switch ctrl from frames to normal page
		d.switchTo().defaultContent();
	}
}
