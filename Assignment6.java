package introduction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("checkBoxOption3")).click();
		Thread.sleep(1000);
		String opt=d.findElement(By.xpath("//*[@value='option3']")).getText();
		WebElement sel=d.findElement(By.tagName("select"));
		Select dropdown=new Select(sel);
		dropdown.selectByVisibleText(opt);      
		d.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(opt);
		d.findElement(By.id("alertbtn")).click();
		String alrt=d.switchTo().alert().getText();
		String[] txt=alrt.split(",");
		String[] txt1=txt[0].split(" ");
		if(opt.equals(txt1[1]))
			System.out.println("Match");
		else
			System.out.println("NotMatch");
	}
}