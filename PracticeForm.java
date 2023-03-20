package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");	
//		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Banu");// using id
//		driver.findElement(By.xpath("//input[starts-with(@id,'userName')]")).clear();// starts with
//		driver.findElement(By.xpath("//*[contains(@placeholder,'Name')]")).sendKeys("Deepi");// using contains
//		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("banu@gmail.com");
//		driver.findElement(By.xpath("//textarea[starts-with(@placeholder,'Current')]")).sendKeys("Coimbatore");
//		driver.findElement(By.xpath("//textarea[contains(@id,'permanent')]")).sendKeys("Heaven");
		
	}
}
