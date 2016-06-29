package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileNotesPage {
	
	@Test
	public void addnote(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//add note
		
		w.isElementHiddenNow(".//*[@id='notes_table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='notes_table_wrapper']/div[1]/a")).click();
		
		//Note
		
		w.isElementHiddenNow(".//*[@id='note']", driver);
		
		driver.findElement(By.xpath(".//*[@id='note']")).sendKeys("Automation test note");
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}
	
	@Test
	public void addnote_Cancel(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//add note
		
		w.isElementHiddenNow(".//*[@id='notes_table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='notes_table_wrapper']/div[1]/a")).click();
		
       
		
		//Note
		
		w.isElementHiddenNow(".//*[@id='note']", driver);
		
		driver.findElement(By.xpath(".//*[@id='note']")).sendKeys("test");

		
		//cancel
		
		w.isElementHiddenNow(".//*[@id='modal-close']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-close']")).click();
		
	}
	@Test
	public void edit(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Edit note
		
		w.isElementHiddenNow(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span")).click();
		
		//Note
		
		//w.isElementHiddenNow(".//*[@id='note']", driver);
		
		//driver.findElement(By.xpath(".//*[@id='note']")).clear();
		
		w.isElementHiddenNow(".//*[@id='note']", driver);
		
		driver.findElement(By.xpath(".//*[@id='note']")).sendKeys("Automation test note");
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}
	
	@Test
	public void delete(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//Edit note
		
		w.isElementHiddenNow(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[2]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[2]/span")).click();
		
		Thread.sleep(2000);
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}

}
