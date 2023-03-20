package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To scroll browser window
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> row=d.findElements(By.xpath("//*[@class='table-display']/tbody/tr"));
		List<WebElement> col=d.findElements(By.xpath("//*[@class='table-display']/tbody/tr/th"));
		System.out.println("Row Count"+(row.size()-1));
		System.out.println("Column Count"+(col.size()));
		String content=d.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]")).getText();
		System.out.println(content);		
	}
}