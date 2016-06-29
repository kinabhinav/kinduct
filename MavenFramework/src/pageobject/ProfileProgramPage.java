package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileProgramPage {
	
	@Test
	public void clear_filter(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//log
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table']/thead/tr/th[1]/div/div[2]/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table']/thead/tr/th[1]/div/div[2]/span[2]")).click();
		
		//text
		
		w.isElementHiddenNow(".//*[@id='text_filter']", driver);
		
		driver.findElement(By.xpath(".//*[@id='text_filter']")).sendKeys("Test");
		
		//Apply filter
		
		w.isElementHiddenNow("html/body/div[3]/div/div/div[3]/div/div/a[1]", driver);
		
		driver.findElement(By.xpath("html/body/div[3]/div/div/div[3]/div/div/a[1]")).click();
		
		//clear filter
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table_clear_filters']", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table_clear_filters']")).click();
		
	}
	
	@Test
	public void log(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//log
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[1]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[1]/span")).click();
		
		//show program list
		
		w.isElementHiddenNow(".//*[@id='backlink_list']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='backlink_list']/span[2]")).click();
		
	}
	
	@Test
	public void view(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//log
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[2]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[2]/span")).click();
		
		//show program list
		
		w.isElementHiddenNow(".//*[@id='backlink']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='backlink']/span[2]")).click();
		
	}
	
	@Test
	public void edit(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//log
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[3]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[3]/span")).click();
		
		//show program list
		
		w.isElementHiddenNow(".//*[@id='backlink']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='backlink']/span[2]")).click();
		
	}
	
	

}
