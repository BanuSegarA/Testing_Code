package introduction;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locatorsample {
	public static void main(String[] args) throws InterruptedException {
		// invoke browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// to syn selenium and HTML response
		driver.get("https://rahulshettyacademy.com/locatorspractice/");// hit url
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");// id locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");// name locator
		driver.findElement(By.className("signInBtn")).click();//classname locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());// css using classname	
		driver.findElement(By.linkText("Forgot your password?")).click();// link text
		Thread.sleep(2000);// waits 2 sec for page view change, refer code line 24
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Banu");// xpath generic
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("banu.segar.ac.in");// css generic
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();// xpath using index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("lunu@gmail.com");// css using index	
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");// xpath using parent tag
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();// css using classname, throws ElementClickInterceptedException 
		//bcz the page s changing view from one view to another to avoid this use thred.slepp()
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());// css using parent tag
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click() ;// customized parent child
		Thread.sleep(1000);// to handle ElementClickInterceptedException
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");//css using id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//css using regex
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();// css using id
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//xpath using regex
	}
}



































