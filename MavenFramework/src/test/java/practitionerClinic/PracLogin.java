package practitionerClinic;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.kinduct.MavenFramework.Excel;

public class PracLogin {
	
	public  WebDriver driver;  
	public void wait(  String text)
		
		{
		
		 
				(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
		

		}
		
		
		@Test
		public  void login() throws Exception
		{
			 driver = new FirefoxDriver();
			
			//driver = new P
			
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
			
			//Demo Practitioner
			
			driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")).click();
		
			
			if (driver.getTitle().equalsIgnoreCase("Kinduct Clinic - Home")) {
				
				
			  Excel e = new Excel();
				
				e.excel(76,80,"PASS");
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(76,80,"FAIL");
				
			}
			//Assert.assertTrue(flag, "Patient Login");
			
			
			
			
					
			
		}


}
