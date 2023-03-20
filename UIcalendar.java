package introduction;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UIcalendar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://www.path2usa.com/travel-companion/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(3000);
		d.findElement(By.xpath("//label[normalize-space()='Date of travel']")).click();
		while(true)
		{
			if(!d.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("August"))
			d.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			else
				break;
		}
		System.out.println(d.findElement(By.xpath("//span[@class='cur-month']")).getText());
		List<WebElement> day=d.findElements(By.xpath("//div[@class='dayContainer']/*[contains(@class,'flatpickr-day')]"));
		System.out.println(day.size());
		for(int i=0;i<day.size();i++)
		{
			String s=d.findElements(By.xpath("//div/span[contains(@class,'-day')]")).get(i).getText();
			System.out.println(s);
			if(s.equals("26"))
			{
				d.findElements(By.xpath("//div/span[contains(@class,'-day')]")).get(i).click();
				break;
			}
		}
	}
}