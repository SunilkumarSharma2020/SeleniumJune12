package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	static WebDriver driver;
	
	public static void openBrowser() {
		driver = new ChromeDriver();
		}
	public static void maximizeBrowserWindow() {
		driver.manage().window().maximize();
		}
	public static void implementImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	public static void navigateToApp(String url) {
		driver.get(url);
		}
	public static void enterUserId(String loc,String locValue,String userId) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(userId);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(userId);	
		}
		}
	public static void enterPassword(String loc,String locValue,String password) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(password);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(password);	
		}
		}
	public static void clickButton(String loc,String locValue) {
		if(loc.equals("id")) {
		driver.findElement(By.id(locValue)).click();
		}
		else if(loc.equals("name")) {
		driver.findElement(By.name(locValue)).click();
		}
		}
	public static String getErrMsg(String locValue) {
		String msg = driver.findElement(By.cssSelector(locValue)).getText();
		return msg;
	}
	public static void closeApplication() {
		driver.close();
	}

}
