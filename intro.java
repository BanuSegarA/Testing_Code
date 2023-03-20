package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class intro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    System.out.println(driver.getTitle());
	    driver.getCurrentUrl();
	    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    //driver.quit(); // close all associated windows i.e multiple windows opened automatically
	    //driver.close(); - close only parent window i.e first opened page.
	}
}