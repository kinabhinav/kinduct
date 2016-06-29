package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SurveyAdditionalInfo {
	
	@Test
	public void Finish(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
			
		//Finish
		
		w.isElementHiddenNow(".//*[@id='content']/article/header/div/a[4]/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[4]/span")).click();
		
	}

}
