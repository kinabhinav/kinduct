package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileBodyCompPage {
	
	@Test
	public void addentry(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		//add entry
		
		w.isElementHiddenNow(".//*[@id='tab_body_composition']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='tab_body_composition']/div[1]/a")).click();
		
		//Body weight Actual
		
		w.isElementHiddenNow(".//*[@id='body_weight']", driver);
		
		driver.findElement(By.xpath(".//*[@id='body_weight']")).sendKeys("220");
		
		//Body weight Goal
		
		w.isElementHiddenNow(".//*[@id='body_weight_goal']", driver);
		
		driver.findElement(By.xpath(".//*[@id='body_weight_goal']")).sendKeys("230");
		
		//Body Fat Actual
		
		w.isElementHiddenNow(".//*[@id='body_fat']", driver);
		
		driver.findElement(By.xpath(".//*[@id='body_fat']")).sendKeys("13");
		
		//Body Fat Goal
		
		w.isElementHiddenNow(".//*[@id='body_fat_goal']", driver);
		
		driver.findElement(By.xpath(".//*[@id='body_fat_goal']")).sendKeys("11");
		
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
	}

}
