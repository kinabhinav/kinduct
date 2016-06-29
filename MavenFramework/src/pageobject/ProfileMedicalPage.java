package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProfileMedicalPage {
	
	@Test
	public void addentry(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//add entry
		
		w.isElementHiddenNow(".//*[@id='injury_log_list_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_log_list_wrapper']/div[1]/a")).click();
		
		
		//condition
		
		w.isElementHiddenNow(".//*[@id='condition']", driver);
		
		driver.findElement(By.xpath(".//*[@id='condition']")).click();
		
		//
		
		//condition
		
		w.isElementHiddenNow(".//*[@id='condition_panel']/div/div[1]/div[2]/span/div/div/div[4]/div", driver);
		
		driver.findElement(By.xpath(".//*[@id='condition_panel']/div/div[1]/div[2]/span/div/div/div[4]/div")).click();
		
		//open date
		
		w.isElementHiddenNow(".//*[@id='log_open_date']", driver);
		
		driver.findElement(By.xpath(".//*[@id='log_open_date']")).sendKeys("1");
		Thread.sleep(1000);
		
		//Save 
		w.isElementHiddenNow(".//*[@id='injury_report_form']/header/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_report_form']/header/div/button")).click();
		
	}
	
	@Test
	public void view(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//View entry
		
		w.isElementHiddenNow(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[1]/span[1]", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[1]/span[1]")).click();
		
		//Medical log list
		w.isElementHiddenNow(".//*[@id='injury_report_form']/header/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_report_form']/header/a")).click();
	}
	
	@Test
	public void editentry(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//Edit entry
		
		w.isElementHiddenNow(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[2]/span[1]", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[2]/span[1]")).click();
		
		Select sev = new Select(driver.findElement(By.xpath(".//*[@id='severity']")));
		
		sev.selectByIndex(4);
		
		
		//Save 
		w.isElementHiddenNow(".//*[@id='injury_report_form']/header/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_report_form']/header/div/button")).click();
	}
	
	@Test
	public void delete(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//View entry
		
		w.isElementHiddenNow(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[3]/span[1]", driver);
		
		driver.findElement(By.xpath(".//*[@id='injury_log_list']/tbody/tr[1]/td[6]/a[3]/span[1]")).click();
		
		Thread.sleep(1000);
		
		//Save
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
	}

}
