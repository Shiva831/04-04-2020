package TestNG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class test1 {
	public WebDriver driver;
	@org.testng.annotations.Test
	public void test(){
		driver.findElement(By.id("email")).sendKeys("shiva");
		driver.findElement(By.id("pass")).sendKeys("anffer");
	}
	
	
	@BeforeTest
	public void launchApp(){
		System.setProperty("webdriver.chrome.driver","F:\\Java Qshore\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
	}
	@AfterTest
	public void closeApp(){
		driver.close();
	}

	
}
