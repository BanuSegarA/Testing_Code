package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scroll {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To scroll browser window
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,500)");
		// To scroll component / table inside browser window
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//handle table grid
		//Sum of all product price
		List<WebElement> prd=d.findElements(By.xpath("//div/table[@id='product']//td[4]"));
		int sum=0;
		for(int i=0;i<prd.size();i++)
		{
		sum+=Integer.parseInt(prd.get(i).getText());
		}
		System.out.println(sum);
		int total=Integer.parseInt(d.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	}
}