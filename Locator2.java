package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locator2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		String name="rahul";
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.id("inputUsername")).sendKeys(name);
		d.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		d.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);//wait for page transition, otherwise old page <p> tag gets loaded for next line of code.
		System.out.println(d.findElement(By.tagName("p")).getText());
		Assert.assertEquals(d.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(d.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");//Equality check using variable 
		d.findElement(By.xpath("//button[text()='Log Out']")).click();
		d.close();
	}
}







