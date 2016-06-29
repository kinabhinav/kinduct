package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileJournalsPage {

	
	@Test
	public void addentry(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//new journal entry
		
		w.isElementHiddenNow(".//*[@id='journal_form']/header/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='journal_form']/header/div[1]/a")).click();
		
		
		//Energy level
		
		w.isElementHiddenNow(".//*[@id='result17065']", driver);
		
		driver.findElement(By.xpath(".//*[@id='result17065']")).sendKeys("8");
		
		//Comments
		
		w.isElementHiddenNow(".//*[@id='comments']", driver);
		
		driver.findElement(By.xpath(".//*[@id='comments']")).sendKeys("Test reg");
		
		//Save
		
		w.isElementHiddenNow(".//*[@id='submit_button']", driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
	}
}
