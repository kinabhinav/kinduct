package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileProgramPage {
	
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
		
		w.isElementHiddenNow(".//*[@id='backlink_list']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='backlink_list']/span[2]")).click();
		
	}
	
	@Test
	public void edit(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//log
		
		w.isElementHiddenNow(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[3]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='profile_programs_table']/tbody/tr[1]/td[4]/a[3]/span")).click();
		
		//show program list
		
		w.isElementHiddenNow(".//*[@id='backlink_list']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='backlink_list']/span[2]")).click();
		
	}
	
	

}
