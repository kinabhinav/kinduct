package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProtocolsPage {
	
	@Test
	public void ShareProtocol(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[3]/span",driver);
		
		driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[3]/span")).click();
	}

}
