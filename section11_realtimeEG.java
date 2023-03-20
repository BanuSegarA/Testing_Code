package introduction;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class section11_realtimeEG {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Q.link count in the page ie anchor tag
		System.out.println(d.findElements(By.tagName("a")).size());
		//Q.link in footer section - here limit the driver only to footer
		//footerdriver will limit the window size to footer size
		WebElement footerdriver=d.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Q. need link of footer 1st column
		WebElement col=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int count=col.findElements(By.tagName("a")).size();
		//Q.click on each link and check if the pages are opening
		for(int i=0;i<count;i++)
		{
			String links=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//clicks the link
			col.findElements(By.tagName("a")).get(i).sendKeys(links);
		}
			//click back button then click next link and so on (OR)
			//hold ctrl and click which will open link in different tabs (optimized one)
			//Q.Display child titles
			Set<String> title=d.getWindowHandles();
			Iterator<String>it=title.iterator();
			while(it.hasNext())
			{
				d.switchTo().window(it.next());
				System.out.println(d.getTitle());
			}	
	}
}