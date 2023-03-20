package introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();//used to set browser behaviour
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.manage().window().maximize();//Maximize browser
		d.manage().deleteAllCookies();//To delete cookies
//		d.manage().deleteCookieNamed("text");//To delete specific cookies
		//d.manage().addCookie("text");
		d.get("https://en.wikipedia.org/wiki/All_Is_Well_(2015_film)");
		Thread.sleep(1000);
		//ScreenShot
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(src,new File("C:\\Users\\banus\\pic.png"));
	}
}