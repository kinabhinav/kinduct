package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
	public void Program(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Program
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[2]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
	}
	public void Notes(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Notes
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[14]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[14]/a")).click();
		
	}
	
	public void Resource(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Notes
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[13]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[13]/a")).click();
		
	}
	
	public void Information(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[12]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[12]/a")).click();
		
	}
	public void OneRepMax(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[11]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[11]/a")).click();
		
	}
	
	public void BodyComp(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[10]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[10]/a")).click();
		
	}
	
	public void Supplement(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[9]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[9]/a")).click();
		
	}
	
	public void Medical(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[8]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[8]/a")).click();
		
	}
	public void Journals(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[7]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[7]/a")).click();
		
	}
	
	public void Assessments(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[6]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
	}
	
	public void Stats(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[5]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
	}
	public void Alerts(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[4]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[4]/a")).click();
		
	}
	
	public void Metrics(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Information
		
		w.isElementHiddenNow(".//*[@id='profile_tabs']/li[3]/a",driver);
		driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[3]/a")).click();
		
	}
	
public void dynamicR(WebDriver driver)
	
	{
		
		WaitForElement w = new WaitForElement();
		
		//Analytics
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[4]/a/span[1]",driver);
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[4]/a/span[1]")).click();
		
		//Dynamic reporting
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[4]/ul/li[2]/ul/li[2]/a",driver);
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[4]/ul/li[2]/ul/li[2]/a")).click();
		
		
		
	}
	
	
}
