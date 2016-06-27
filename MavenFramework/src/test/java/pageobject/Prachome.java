package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Prachome {
	@Test
	public void homepage()
	
	{
		Login login = new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
	}
	
	public void searchPatient(WebDriver driver)
	
		{
			WaitForElement w = new WaitForElement();
			
			//Search patient
			
			w.isElementHiddenNow(".//*[@id='user-search-term']",driver);
			
			driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("Demo Patient1");
			
		}
	
	public void Surveys(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Search patient
		
		//communication
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]",driver);
				
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
				
		//message center
				
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a",driver);
						
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a")).click();

	}
	public void FAQBuilder(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Search patient
		
		//Resources
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]",driver);
				
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
				
		//FAQ Builder
				
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a",driver);
						
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();

	}
	
	public void ProtocolPage(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Rehab 
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]",driver);
		
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
				
		//Protocols
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a",driver);
		
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();

	}
	
public void Message(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Communication
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]",driver);
		
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
				
		//Message
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a",driver);
		
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();

	}
	

}
