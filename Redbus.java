package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// to syn selenium and HTML response
		d.get("https://www.redbus.in");
		//parent-child
		d.findElement(By.xpath("//div/input[@id='src']")).sendKeys("coi");
		Thread.sleep(2000);
		//findElements return list of web elements
		//NOTE: In xpath pass <li> to return webelement
		
		List <WebElement> op=d.findElements(By.xpath("//ul/li[@class='sub-city']"));
		for(WebElement option:op)
		{
			if(option.getText().equalsIgnoreCase("Pilamedu, Coimbatore"))
			{
				option.click();
				break;	
			}
		}
		d.findElement(By.xpath("//div/input[@id='dest']")).sendKeys("che");
		List <WebElement> opt=d.findElements(By.xpath("//ul/li[@class='sub-city']"));
		for(WebElement option:opt)
		{
			if(option.getText().equalsIgnoreCase("Velachery, Chennai"))
			{
				option.click();
				break;	
			}
		}
		d.findElement(By.xpath("//td[@class='current day']")).click();
		d.findElement(By.xpath("//button[contains(@class,'button')]")).click();
		//d.findElement(By.xpath("//span[text()='Primo Bus']")).click();
		//Thread.sleep(10000);
//		JavascriptExecutor js = (JavascriptExecutor)d;		 
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		List <WebElement> primo=d.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		
		Thread.sleep(3000);
//		d.findElement(By.xpath("//label[@title='SLEEPER']")).click();
//		d.findElement(By.xpath("//*[contains(@class,'gotIt')]")).click();
//		d.findElement(By.xpath("//*[text()='Single Seats']")).click();
//		d.findElement(By.xpath("//input[@id='bt_Single Seats']")).click();
		d.findElement(By.xpath("//*[text()='Ok, got it']")).click();		
		d.findElement(By.xpath("(//*[contains(@class,'view')])[3]")).click();
//		System.out.println("Webelement");
//		int i=0;
//		for(WebElement option:primo)
//		{
//			i++;
//			System.out.println(i+option.getText());			
//			if(option.getText().equalsIgnoreCase("LION Travels"))
//			{
//				System.out.println(d.findElement(By.xpath("(//div[@class='button view-seats fr'])[i]")).getText());
//				break;	
//			}
//		}
		Thread.sleep(2000);
		d.findElement(By.xpath("//canvas[contains(@data-type,'upper')]")).click();
//		System.out.println(d.findElement(By.xpath("//canvas[contains(@data-type,'upper')]")).getAttribute("class").contains("pointer"));
		Thread.sleep(1000);
		d.findElement(By.xpath("//div/span[text()='Pilamedu']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div/span[text()='Chengalpattu']")).click();
		d.findElement(By.xpath("//div/button[.='Proceed to book']")).click();		
	}
}