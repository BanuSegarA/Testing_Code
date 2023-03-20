package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");//hit url
		WebElement staticdd=d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//findelement return WebElemnt and that is stored in staticdd
		Select dropdown=new Select(staticdd);// Pass webelement to select class
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());	
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");//using value field from inspect element 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		d.findElement(By.id("divpaxinfo")).click();// select dropdown
		Thread.sleep(2000);// to handle syn issue
		int i=1;
		while(i<5) {
		d.findElement(By.id("hrefIncAdt")).click();//click '+' icon
		i++;
		}
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());
		d.findElement(By.id("btnclosepaxoption")).click();// click done button		
	}
}