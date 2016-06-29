package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileSupplementPage {
	
	@Test
	public void assignsupplement(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//assign supplement
		
		w.isElementHiddenNow(".//*[@id='supplements_table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='supplements_table_wrapper']/div[1]/a")).click();
		
		Thread.sleep(1000);
		
		//supplement
		
		w.isElementHiddenNow(".//*[@id='supplements_list_table']/tbody/tr[1]/td[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='supplements_list_table']/tbody/tr[1]/td[1]/a")).click();
		
		//assign 
		
		w.isElementHiddenNow(".//*[@id='content']/article/div/div/div/div[2]/div[1]/div[2]/a[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='content']/article/div/div/div/div[2]/div[1]/div[2]/a[2]")).click();
		
		//select recipient 
		
		w.isElementHiddenNow(".//*[@id='select_link']", driver);
		
		driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		Thread.sleep(1500);
		
		
		
		//Tom Brady   
		
		w.isElementHiddenNow(".//*[@id='user_vm7lb6rt6ggo5575']", driver);
		
		driver.findElement(By.xpath(".//*[@id='user_vm7lb6rt6ggo5575']")).click();
		
		//select 
		
		w.isElementHiddenNow(".//*[@id='multi_select_user']/div/div/div[3]/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='multi_select_user']/div/div/div[3]/button")).click();
		
		Thread.sleep(1500);
		
		//Start date  
		
		w.isElementHiddenNow(".//*[@id='start_date']", driver);
		
		driver.findElement(By.xpath(".//*[@id='start_date']")).sendKeys("2016-06-28");
		
		// image
		
		w.isElementHiddenNow(".//*[@id='supplement_image']", driver);
		
		driver.findElement(By.xpath(".//*[@id='supplement_image']")).click();
		
		//description
		
		w.isElementHiddenNow(".//*[@id='description_13']", driver);
		
		driver.findElement(By.xpath(".//*[@id='description_13']")).click();
		
		//Assign supplement  
		
		w.isElementHiddenNow(".//*[@id='submit_supplement_form']", driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_supplement_form']")).click();
		
		
		
		
	}

}
