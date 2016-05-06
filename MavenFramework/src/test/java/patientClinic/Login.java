package patientClinic;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.kinduct.MavenFramework.Excel;

public class Login {
	public  WebDriver driver;  
	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isElementVisible(String xpath){
	    //return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
public void wait(  String text)
	
	{
	
	 
			(new WebDriverWait(driver,15)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
	

	}
	
	
	@Test
	public  void login() throws Exception
	{
		 driver = new FirefoxDriver();
		/*File src =  new File("/Users/abhatnagar/phantomjs-2.1.1-macosx/bin/phantomjs") ;
		 
		System.setProperty ("phantomjs.binary.path", src.getAbsolutePath());
		DesiredCapabilities caps = new DesiredCapabilities();
		driver = new PhantomJSDriver(caps);
		/*
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/abhatnagar/phantomjs-2.1.1-macosx/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver(caps);
*/
		driver.get("https://qa3.kinductdev.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='username']")).clear();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath(".//*[@id='password']")).clear();
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
		
		wait(".//*[@id='login_form']/div[3]/div/button");
		
		//Login button
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
		
		wait(".//*[@id='link_83356']");
		
		//Kinduct Clinic
		
		driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
		
		wait(".//*[@id='link_83356']");
		
		//patient
		WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[5]/td[5]/a[3]/span[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[5]/td[5]/a[3]/span[1]")).click();
		
				
		if (driver.getTitle().equalsIgnoreCase("Kinduct Clinic - Home")) {
			
			
		  Excel e = new Excel();
			
			e.excelpatient(1,5,"PASS");
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(1,2,"FAIL");
			
		}
		//Assert.assertTrue(flag, "Patient Login");
		
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[1]/a")).click();
		
		
				
		
	}

}
