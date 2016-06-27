package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Organizations {
	
	public WaitForElement w= new WaitForElement();
	
	public void PatientLogin(WebDriver driver)
	
		{
			//Login login = new Login();
			//WaitForElement w = new WaitForElement();
			//login.login();
			
			
			w.isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[8]/a", driver);
			driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[8]/a")).click();
			
			
			w.isElementHiddenNow(".//*[@id='users']/tbody/tr[4]/td[5]/a[3]/span[1]", driver);
			//patient
			WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[4]/td[5]/a[3]/span[1]"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
	        driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[4]/td[5]/a[3]/span[1]")).click();
		

		}
	
	public void PracLogin(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		
		
		w.isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[8]/a",driver);
		driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[8]/a")).click();
		
		
		w.isElementHiddenNow(".//*[@id='users']/tbody/tr[3]/td[5]/a[3]/span[1]", driver);
		//patient
		WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[3]/td[5]/a[3]/span[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[3]/td[5]/a[3]/span[1]")).click();
	

	}
	
public void Patriots(WebDriver driver)
	
	{
		
	
				
		w.isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[11]/a",driver);
		driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[11]/a")).click();
		
		
		w.isElementHiddenNow(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]", driver);
		//patient
		WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]")).click();
	

	}
	
	

}
