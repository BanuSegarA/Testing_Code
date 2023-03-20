package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class checkbox {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\banus\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}
}