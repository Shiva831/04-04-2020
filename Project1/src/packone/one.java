package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver,", "C:\\Users\\HP\\Downloads\\Firefox Setup 33.0.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("qwdnkqjw")).sendKeys("sdcds");

	}
}
