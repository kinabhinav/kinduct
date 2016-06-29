package integrationTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.Organizations;
import pageobject.Prachome;
import pageobject.WaitForElement;

public class Shareprotocol {
	
	@Test(priority=1)
	public void share()
	{
		WaitForElement w = new WaitForElement();
		
		Login login= new Login();
		
		login.login();
		
		Organizations o = new Organizations();
		
		o.PracLogin(login.driver);
		
		Prachome home = new Prachome();
		
		home.ProtocolPage(login.driver);
		//Pre built protocol count  
		
		w.isElementHiddenNow(".//*[@id='prebuilt-workouts-tab']/a/span",login.driver);
		
		String count = login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a/span")).getText();
		
		
		int beforeVal = Integer.parseInt(count);
		
		System.out.println(beforeVal);
		//Share  
		//Thread.sleep(3000);
		w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[3]/span",login.driver);
		
		login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[3]/span")).click();
		
		//Pre built protocol count    "//span[@class='al
		
		//w.isElementHiddenNow("//span[@class='fa fa-fw fa-lg fa-files-o']",login.driver);
		
		//login.driver.findElement(By.xpath("//span[@class='fa fa-fw fa-lg fa-files-o']")).click();
		
		w.isElementHiddenNow(".//*[@id='prebuilt-workouts-tab']/a/span",login.driver);
		
		String count1 = login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a/span")).getText();
		 
		int afterVal = Integer.parseInt(count1);
		System.out.println(afterVal);
		}

}
