package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditProtocol {
	
@Test(priority=1)
	
	public void edit_protocol() throws Exception
	
	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		//Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();

		
		//Protocol Name  
		
		login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a")).click();
		
		//Edit 
		
		login.wait(" .//*[@id='content']/article/header/div/a[4]");
		
		login.driver.findElement(By.xpath(" .//*[@id='content']/article/header/div/a[4]")).click();
		
		//Name  
		
		
		login.wait(".//*[@id='workout_name']");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_name']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='workout_name']")).sendKeys("EDIT Protocol Test");
		
		//Save
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
	}
}
