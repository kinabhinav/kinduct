package integrationTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.FAQBuilderPage;
import pageobject.Login;
import pageobject.Organizations;
import pageobject.Prachome;
import pageobject.WaitForElement;

public class FAQBuilder {
	@Test(priority=1)
	public void textFAQ()
	{
		WaitForElement w = new WaitForElement();
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.CreateFAQText(login.driver);
		
		w.isElementHiddenNow(".//*[@id='success-alert']", login.driver);
		
		Boolean flag = login.driver.findElement(By.xpath(".//*[@id='success-alert']")).isDisplayed();
		
		Assert.assertTrue(flag);
		
		login.driver.close();
				
	}
	
	@Test(priority=2)
	public void VideoFAQ()
	{
		WaitForElement w = new WaitForElement();
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.CreateFAQVideo(login.driver);
		
		w.isElementHiddenNow(".//*[@id='success-alert']", login.driver);
		
		Boolean flag = login.driver.findElement(By.xpath(".//*[@id='success-alert']")).isDisplayed();
		
		Assert.assertTrue(flag);
		
		login.driver.close();
				
	}
	
	@Test(priority=3)
	public void CancelFAQ()
	{
		WaitForElement w = new WaitForElement();
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.CreateFAQCancel(login.driver);
		
		w.isElementHiddenNow(".//*[@id='create-faq']", login.driver);
		
		Boolean flag = login.driver.findElement(By.xpath(".//*[@id='create-faq']")).isDisplayed();
		
		Assert.assertTrue(flag);
		
		login.driver.close();
				
	}
	@Test(priority=4)
	public void SearchFAQ()
	{
		
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.SearchFAQ(login.driver);
		
		login.driver.close();
	}
	
	@Test(priority=5)
	public void ClearSearchFAQ()
	{
		
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.ClearSearchFAQ(login.driver);
		
		login.driver.close();
	}
	
	@Test(priority=6)
	public void DeleteSearchFAQ()
	{
		
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome prac = new Prachome();
		
		prac.FAQBuilder(login.driver);
		
		FAQBuilderPage faq = new FAQBuilderPage();
		
		faq.DeleteFAQ(login.driver);
		
		login.driver.close();
	}
	

}
