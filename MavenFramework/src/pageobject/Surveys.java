package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Surveys {
	
	public void createsurveyButton(WebDriver driver)
	
		{
			WaitForElement w = new WaitForElement();
			
			w.isElementHiddenNow(".//*[@id='content']/article/header/div/a/span", driver);
			
			driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a/span")).click();
			
		
		}
	
	public void copysurveySave(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[2]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[2]/span")).click();
		
		w.isElementHiddenNow(".//*[@id='submit_button']/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_button']/span")).click();
		
	
	}
	
	public void copysurveyCancel(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[2]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[2]/span")).click();
		
		w.isElementHiddenNow(".//*[@id='content']/article/header/div/a[1]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]/span")).click();
		
	
	}
	
	public void AssignSurveySave(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//Assign  
		

		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span",driver);
		
		driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span")).click();
		
		//Select Recipient  
		
		w.isElementHiddenNow(".//*[@id='select_link']",driver);
		
		driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		//Patient 1  
		
		w.isElementHiddenNow(".//*[@id='user_v6nieof8rsdlhpuw']",driver);
		
		driver.findElement(By.xpath(".//*[@id='user_v6nieof8rsdlhpuw']")).click();
		
		//Select
		
		w.isElementHiddenNow(".//*[@id='multi_select_user']/div/div/div[3]/button",driver);
		
		driver.findElement(By.xpath(".//*[@id='multi_select_user']/div/div/div[3]/button")).click();
		
		Thread.sleep(5000);	
		//Save 
		w.isElementHiddenNow(".//*[@id='submit_button']/span",driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_button']/span")).click();

	
	}
	
	public void AssignSurveyCancel(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//Assign  
		

		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span",driver);
		
		driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span")).click();
		
		//Cancel
		
		w.isElementHiddenNow(".//*[@id='survey_assign_form']/div[6]/div/a[2]/span",driver);
		
		driver.findElement(By.xpath(".//*[@id='survey_assign_form']/div[6]/div/a[2]/span")).click();

	}
	
}
