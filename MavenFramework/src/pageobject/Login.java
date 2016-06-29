package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	public WebDriver driver;
	@Test
	public void login()
		{
			System.setProperty("webdriver.chrome.driver", "/Users/abhatnagar/Downloads/chromedriver2");
		
			driver = new ChromeDriver();
			WaitForElement w = new WaitForElement();
			driver.get("https://qa9.kinductdev.com/login");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id='username']")).clear();
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
			
			driver.findElement(By.xpath(".//*[@id='password']")).clear();
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
			
			w.isElementHiddenNow(".//*[@id='login_form']/div[3]/div/button", driver);
			
			//Login button
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("javascript:window.scrollBy(250,350)");
			driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
			
		}
	
	

}
