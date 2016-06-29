package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileResourcePage {
	
	@Test
	public void addresource(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//add resource
		
		w.isElementHiddenNow(".//*[@id='documents_table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='documents_table_wrapper']/div[1]/a")).click();
		
		//Note
		
		w.isElementHiddenNow(".//*[@id='title']", driver);
		
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("Automation test resource");
		
		//attachment  
		
		w.isElementHiddenNow(".//*[@id='document']", driver);
		
		driver.findElement(By.xpath(".//*[@id='document']")).sendKeys("/Users/abhatnagar/Documents/H.jpg");
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}
	
	@Test
	public void addresource_cancel(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//add resource
		
		w.isElementHiddenNow(".//*[@id='documents_table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='documents_table_wrapper']/div[1]/a")).click();
		
		Thread.sleep(1000);
		
		//Cancel
		
		w.isElementHiddenNow(".//*[@id='modal-close']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-close']")).click();
		
	}
	
	@Test
	public void delete(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//add resource
		
		w.isElementHiddenNow(".//*[@id='documents_table']/tbody/tr[1]/td[5]/a[2]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='documents_table']/tbody/tr[1]/td[5]/a[2]/span")).click();
		
		Thread.sleep(1000);
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}

}
