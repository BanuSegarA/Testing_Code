package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://admin.pscollege841.exam.ly");
		driver.findElement(By.id("emailAddress")).sendKeys("democollege@examly.in");
		driver.findElement(By.id("password")).sendKeys("examly@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@label='Login']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='ui-menuitem-icon icon icon-people white-icon ng-star-inserted']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		System.out.println("Done Mouse hover ");
		WebElement subele = driver.findElement(By.linkText("Students"));
		subele.click();
		
//		driver.get("https://payroll.razorpay.com/login?redirect=%2Fdashboard");
////		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("banu.segar@iamneo.ai");
////		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Miracle@123");
////		driver.findElement(By.cssSelector("button[type='submit']")).click();
////		driver.findElement(By.cssSelector("select[name='org-id']")).click();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("banu.segar@iamneo.ai");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saibaba");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//select[@name='org-id']")).click();
//		driver.findElement(By.xpath("//option[@value='78514']")).click();
////		driver.findElement(By.cssSelector("Attendance")).click();
////		driver.findElement(By.cssSelector("button.btn")).click();
		}
}
