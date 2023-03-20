package introduction;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		//creating obj for chrome driver
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/loginpagePractise");
		d.findElement(By.xpath("//form//div[2]//input[1]")).sendKeys("rahulshettyacademy");
		d.findElement(By.xpath("//form//div[3]//input[1]")).sendKeys("learning");
		d.findElement(By.xpath("//input[@value=\"user\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.id("okayBtn")).click();
		//dropdown
		WebElement dd=d.findElement(By.xpath("//div//div//form//div[5]//select"));//findelement return WebElemnt and that is stored in staticdd
		Select dropdown=new Select(dd);// Pass webelement to select class
		dropdown.selectByVisibleText("Consultant");
		d.findElement(By.xpath("//span//input")).click();
		d.findElement(By.id("signInBtn")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Shop Name']")));
	    List <WebElement> produ=d.findElements(By.xpath("//button[@class='btn btn-info']"));
	    for(int i=0;i<produ.size();i++)
	    {
	    	produ.get(i).click();			
	    }
	    d.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}
}