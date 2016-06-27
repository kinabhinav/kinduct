package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class FAQBuilderPage {
	
	@Test
	public void CreateFAQText(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='create-faq']", driver);
		
		driver.findElement(By.xpath(".//*[@id='create-faq']")).click();
		
		w.isElementHiddenNow(".//*[@id='question']", driver);
		
		driver.findElement(By.xpath(".//*[@id='question']")).sendKeys("This is to test FAQ Builder text only");
		
		w.isElementHiddenNow(".//*[@id='answer']", driver);
		
		driver.findElement(By.xpath(".//*[@id='answer']")).sendKeys("This is to test FAQ Builder text only Answer textbox");
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[9]/div/span/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[9]/div/span/button")).click();
	}

	@Test
	public void CreateFAQVideo(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='create-faq']", driver);
		
		driver.findElement(By.xpath(".//*[@id='create-faq']")).click();
		
		w.isElementHiddenNow(".//*[@id='question']", driver);
		
		driver.findElement(By.xpath(".//*[@id='question']")).sendKeys("This is to test FAQ Builder Video");
		
		w.isElementHiddenNow(".//*[@id='answer']", driver);
		
		driver.findElement(By.xpath(".//*[@id='answer']")).click();
		
		//Add video
		w.isElementHiddenNow(".//*[@id='select-video']", driver);
		
		driver.findElement(By.xpath(".//*[@id='select-video']")).sendKeys("/Users/abhatnagar/Downloads/plank.mp4");
		
		//Condition  
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[5]/div/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/button")).click();
		
		
		//
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[5]/div/div/ul/li[3]/a/label/input", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/ul/li[3]/a/label/input")).click();
		//
		w.isElementHiddenNow(".//*[@id='faq-form']/div[5]/div/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/button")).click();
		
		//Procedure 
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[7]/div/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();
		
		
		//
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[7]/div/div/ul/li[3]/a/label/input", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/ul/li[3]/a/label/input")).click();
		//
		w.isElementHiddenNow(".//*[@id='faq-form']/div[7]/div/div/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[9]/div/span/button", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[9]/div/span/button")).click();
	}
	
	@Test
	public void CreateFAQCancel(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='create-faq']", driver);
		
		driver.findElement(By.xpath(".//*[@id='create-faq']")).click();
		
		w.isElementHiddenNow(".//*[@id='question']", driver);
		
		driver.findElement(By.xpath(".//*[@id='question']")).sendKeys("This is to test FAQ Builder text only");
		
		w.isElementHiddenNow(".//*[@id='answer']", driver);
		
		driver.findElement(By.xpath(".//*[@id='answer']")).sendKeys("This is to test FAQ Builder text only Answer textbox");
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='faq-form']/div[9]/div/span/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-form']/div[9]/div/span/a")).click();
	}
	
	@Test
	public void SearchFAQ(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='faq-search-term']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("This is to test FAQ Builder text only");
		
		//click search
		w.isElementHiddenNow(".//*[@id='faq-list-search']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-list-search']")).click();
		
		//
		
		w.isElementHiddenNow(".//*[@id='faq-list']/tbody/tr[1]/td[1]/a[1]", driver);
		
		String search = driver.findElement(By.xpath(".//*[@id='faq-list']/tbody/tr[1]/td[1]/a[1]")).getText();
		
		Assert.assertEquals("This is to test FAQ Builder text only", search);
		
	}
	@Test
	public void ClearSearchFAQ(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='faq-search-term']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("This is to test FAQ Builder text only");
		
		//click Clear search
		w.isElementHiddenNow(".//*[@id='faq-search-clear']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-search-clear']")).click();
		
		//
		
		w.isElementHiddenNow(".//*[@id='faq-search-term']", driver);
		
		String search = driver.findElement(By.xpath(".//*[@id='faq-search-term']")).getText();
		
		Assert.assertEquals("", search);
		
	}
	@Test
	public void DeleteFAQ(WebDriver driver)
	
	{
		WaitForElement w = new WaitForElement();
		
		w.isElementHiddenNow(".//*[@id='faq-search-term']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("This is to test FAQ Builder text only");
		
		//click Clear search
		w.isElementHiddenNow(".//*[@id='faq-search-clear']", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-search-clear']")).click();
		
		//delete
		
		w.isElementHiddenNow(".//*[@id='faq-list']/tbody/tr[1]/td[6]/a/span", driver);
		
		driver.findElement(By.xpath(".//*[@id='faq-list']/tbody/tr[1]/td[6]/a/span")).click();
		
		driver.switchTo().alert().accept();
		
		w.isElementHiddenNow(".//*[@id='create-faq']",driver);
		
		Boolean flag = driver.findElement(By.xpath(".//*[@id='create-faq']")).isDisplayed();
		
		Assert.assertTrue(flag);
		

	}
}
