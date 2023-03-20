package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();// move to src dropdown
		d.findElement(By.xpath("//a[@value='BLR']")).click();// select src place i.e BLR
		Thread.sleep(2000);// to swith from src to dest selection
		//d.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// select dest with index
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//// select dest without index
	}
}
