package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserNavigation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\banus\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();// to maximize browser screen
		d.get("https://google.com");
		System.out.println(d.getTitle());
		d.navigate().to("https://rahulshettyacademy.com");		
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.getTitle());
		d.navigate().forward();
		System.out.println(d.getTitle());
	}
}
