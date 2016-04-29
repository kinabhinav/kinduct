package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;



public class AddPatient {
	
	@Test(priority=1)
	public void addPatient() throws Exception
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Add Patient
		
		login.wait(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a")).click();
		
		//First Name  
		
		login.wait(".//*[@id='first_name']");
		
		login.driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("Mark");
		
		//Last Name  
		
		login.wait(".//*[@id='last_name']");
		
		login.driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("Taylor");
		
		//email
		
		login.wait(".//*[@id='email']");
		
		login.driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("info@kinduct.com");
		
		//Submit  
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//Add Patient button verification
		
		login.wait(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a");
		
		Boolean test = login.driver.findElement(By.xpath(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a")).isDisplayed();
		
		if (test.equals(true)) {
			
			
			  Excel e = new Excel();
				
				e.excel(13,16,"PASS");
				
				Assert.assertTrue(true);
				
				login.driver.quit();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(13,16,"FAIL");
				
				Assert.assertTrue(true);
				
				login.driver.quit();
				
			}
		

	}
	
	@Test(priority=2)
	public void addPatient_cancel_link() throws Exception
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Add Patient
		
		login.wait(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a")).click();
		
		//Cancel
		
		login.wait(".//*[@id='account_buttons']/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='account_buttons']/a[2]")).click();
		
		//Add Patient button verification
		
				login.wait(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a");
				
				Boolean test = login.driver.findElement(By.xpath(".//*[@id='content']/section/div[2]/div[1]/div[1]/div/div[1]/div/a")).isDisplayed();
				
				if (test.equals(true)) {
					
					
					  Excel e = new Excel();
						
						e.excel(17,20,"PASS");
						
						Assert.assertTrue(true);
						
						login.driver.quit();
						
					}
					else
					{
						Excel e = new Excel();
						
						e.excel(17,20,"FAIL");
						
						Assert.assertTrue(true);
						
						login.driver.quit();
						
					}
		
	}

}
