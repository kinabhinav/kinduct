package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
	public void Program(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Tom Brady
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[2]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
	}

}
