package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MessagePage {
	
	@Test
	public void PostMessage(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='content']/article/header/div/a/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a/span[2]")).click();
		
		w.isElementHiddenNow(".//*[@id='select_link']", driver);
		
		driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		w.isElementHiddenNow(".//*[@id='user_v6nieof8rsdlhpuw']", driver);
		
		driver.findElement(By.xpath(".//*[@id='user_v6nieof8rsdlhpuw']")).click();
		
		w.isElementHiddenNow(".//*[@id='multi_select_user']/div/div/div[3]/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='multi_select_user']/div/div/div[3]/button")).click();
		
		w.isElementHiddenNow(".//*[@id='subject']", driver);
		
		driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("This is to test Message only");
		
		w.isElementHiddenNow(".//*[@id='answer']", driver);
		
		driver.findElement(By.xpath(".//*[@id='answer']")).sendKeys("This is to test Message text textbox");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
		
		//(new WebDriverWait(login.driver,10)).until(ExpectedConditions.elementToBeClickable(By.className("cke_show_borders")));
		
						
		driver.findElement(By.className("cke_show_borders")).sendKeys("Post a Message Test ");
		
		driver.switchTo().defaultContent();
		
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='submit_button']/span[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='submit_button']/span[2]")).click();
	}

}
