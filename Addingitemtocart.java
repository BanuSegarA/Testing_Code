package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingitemtocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//creating obj for chrome driver
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(5));
		int j=0;
		String[] item= {"Brocolli","Cucumber","Beetroot","Walnuts"};
		d.manage().window().maximize();// to maximize browser screen
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Get all the 
		List <WebElement> product=d.findElements(By.cssSelector("h4.product-name"));
		List l=Arrays.asList(item);
		Thread.sleep(2000);
		for(int i=0;i<product.size();i++)
		{
			String[] fullname=product.get(i).getText().split("-");
			String name=fullname[0].trim();
			if(l.contains(name))
			{
				j++;
				d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==item.length)
					break; 
			}
		}
		d.findElement(By.xpath("//a[@class=\"cart-icon\"]/img")).click();
		d.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']//button")).click();
		d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		d.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(d.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}
}
