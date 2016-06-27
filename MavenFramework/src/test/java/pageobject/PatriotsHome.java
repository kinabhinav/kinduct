package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatriotsHome {
	
	public void Home(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Tom Brady
		
		w.isElementHiddenNow(".//*[@id='content-container']/section/section/article/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]",driver);
		driver.findElement(By.xpath(".//*[@id='content-container']/section/section/article/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]")).click();
		
	}

}
