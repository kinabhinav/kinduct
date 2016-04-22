package patientClinic;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

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
	
	 
			(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
	

	}
	
	
	@Test
	public  void login() throws Exception
	{
		 driver = new FirefoxDriver();
		
		
		
		driver.get("https://qa3.kinductdev.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
		
		wait(".//*[@id='login_form']/div[3]/div/button");
		
		//Login button
		
		driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
		
		wait(".//*[@id='link_83356']");
		
		//Kinduct Clinic
		
		driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
		
		wait(".//*[@id='link_83356']");
		
		//patient
		
		driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[12]/td[5]/a[3]/span[1]")).click();
		
		//wait(driver,".//*[@id='users']/tbody/tr[12]/td[5]/a[3]/span[1]");
		//boolean flag = false;
		
		if (driver.getTitle().equalsIgnoreCase("Kinduct Clinic - Home")) {
			
			
		  Excel e = new Excel();
			
			e.excel(1,5,"PASS");
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excel(1,2,"FAIL");
			
		}
		//Assert.assertTrue(flag, "Patient Login");
		
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[1]/a")).click();
		
		
				
		
	}

}
