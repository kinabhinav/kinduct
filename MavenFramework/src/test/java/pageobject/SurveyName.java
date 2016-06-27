package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SurveyName {

	@Test
	public void SaveSurveyName(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='name']", driver);
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Practitioner: Create Survey");
		
		w.isElementHiddenNow(".//*[@id='submit_button']", driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
	}
	@Test
	public void CancelSurveyName(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='name']", driver);
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Practitioner: Create Survey");
		
		//cancel
		
		w.isElementHiddenNow(".//*[@id='content']/article/header/div/a[1]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]/span")).click();
		
	}
}
