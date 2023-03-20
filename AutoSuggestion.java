package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		d.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options=d.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//list of autosuggested <li> webelements returned from findElements
		for(WebElement opt:options)
		{
			if(opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();// click the crt option and break loop
				break;
			}
		}
	}

}
