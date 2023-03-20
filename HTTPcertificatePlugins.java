package introduction;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HTTPcertificatePlugins {

	public static void main(String[] args) {
		//creating obj for chrome driver
		//Chrome option is used to set behaviour i.e how the browser shld behave 
		ChromeOptions opt=new ChromeOptions();
		//Used to accept the certificate and proceed to actual website.
		opt.setAcceptInsecureCerts(true);
		//For firefox browser
		FirefoxOptions opt1=new FirefoxOptions();
		opt1.setAcceptInsecureCerts(true);
		WebDriver d=new ChromeDriver(opt);//used to set browser behaviour
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.get("https://expired.badssl.com/");
		System.out.println(d.getTitle());
		//Chrome to set proxies, plugins & paths in chrome
		//opt.addExtensions("path");
//		Proxy prox=new Proxy();
//		prox.setHttpProxy("proxystring i.e IPaddress");// use https ipaddress as proxy string
//		opt.setCapability("proxy",prox); // pass proxy obj here
		// For proxy refer: https://chromedriver.chromium.org/capabilities
	}
}