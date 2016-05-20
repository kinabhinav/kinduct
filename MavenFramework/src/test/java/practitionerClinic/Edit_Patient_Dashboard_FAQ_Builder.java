package practitionerClinic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Edit_Patient_Dashboard_FAQ_Builder {
	
	//@Test(priority=1)

	//public void create_faq_builder_Patient() throws Exception

	public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		//JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
	    //js1.executeScript("javascript:window.scrollBy(250,350)");
		
		
		//Create FAQ
		
		login.wait(".//*[@id='create-faq']");
		
		login.driver.findElement(By.xpath(".//*[@id='create-faq']")).click();

		Alert alert = login.driver.switchTo().alert();
		alert.accept();
		
		//Question
		
		login.wait(".//*[@id='question']");
		
		login.driver.findElement(By.xpath(".//*[@id='question']")).sendKeys("CREATE FAQ from EPD with condition");
		
		//Answer 

		login.wait(".//*[@id='answer']");
		
		login.driver.findElement(By.xpath(".//*[@id='answer']")).sendKeys("This is to test the functionality of CREATE FAQ in EPD");
		
		
		
		//new video  
		
		//login.wait(".//*[@id='select-video']");
		
		//login.driver.findElement(By.xpath(".//*[@id='select-video']")).sendKeys("C:\\Selenium\\Chest.mp4");


		
		//CONDITIONS
		
		login.wait(".//*[@id='faq-form']/div[6]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/button")).click();
		
		//Search condition
		
		//login.wait(".//*[@id='faq-form']/div[6]/div/div/ul/li[1]/div/input");
		
		//login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/ul/li[1]/div/input")).sendKeys("Dislocated Elbow");

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[6]/div/div/ul/li[5]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/ul/li[5]/a/label/input")).click();
		
		//WebElement form= login.driver.findElement(By.id("faq-form"));
		//login.driver.switchTo().frame(form);

		
		//CONDITIONS
		
		login.wait(".//*[@id='faq-form']/div[6]/div/div/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/button")).click();

		/*
		//Physiotherapy
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/ul/li[2]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/ul/li[2]/a/label/input")).click();


		//Physiotherapy
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();
		
		//Procedure
		
		login.wait(".//*[@id='faq-form']/div[8]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[8]/div/div/button")).click();

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[8]/div/div/ul/li[2]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[8]/div/div/ul/li[2]/a/label/input")).click();


		//Procedure
		
		//login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
				
		//login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();
		
*/
		JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
	    js2.executeScript("javascript:window.scrollBy(250,-350)");
			
		JavascriptExecutor js3 = (JavascriptExecutor) login.driver;
	    js3.executeScript("javascript:window.scrollBy(250,-350)");
		//Save
		
		login.wait(".//*[@id='faq-form']/div[10]/div/span/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[10]/div/span/button")).click();

		//login.driver.close();
		
	}	

	@Test(priority=2,dependsOnMethods={"create_faq_builder_Patient"})

	public void assign_faq_builder() throws Exception

	//public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		
		// Reset Body part
		
		login.wait(".//*[@id='reset-body-part']");
		
		login.driver.findElement(By.xpath(".//*[@id='reset-body-part']")).click();;
		
		
		//Select Body part
		
		login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/button")).click();
		
		//select Elbow
		login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/ul/li[4]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/ul/li[4]/a/label/input")).click();
		
		login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/button")).click();
		
		//Select condition
		
		WebElement cond = login.driver.findElement(By.xpath(".//*[@id='single-condition']"));
		Select condition= new Select(cond);
		
		condition.selectByValue("dislocated_elbow");
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
	    js1.executeScript("javascript:window.scrollBy(250,350)");
		
		JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
	    js2.executeScript("javascript:window.scrollBy(250,350)");
		
		//FAQ
		
		login.wait(".//*[@id='filtered-faqs']/div/a/span");
		
		login.driver.findElement(By.xpath(".//*[@id='filtered-faqs']/div/a/span")).click();
		
		//
		
		login.wait(".//*[@id='modal-title']");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='modal-title']")).getText();
		
		Boolean flag;
		
		if(text.equalsIgnoreCase("CREATE FAQ from EPD with condition"))
		{
			flag=true;
			Assert.assertTrue(flag);
		}
		else
		{
			flag=false;
			Assert.assertTrue(flag);
			
		}
		
		login.driver.close();
	}
	
	@Test(priority=3)

	public void EPD_FAQ_Builder_Cancel_button() throws Exception

	//public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
	    js1.executeScript("javascript:window.scrollBy(250,350)");
		
		
		//Create FAQ
		
		login.wait(".//*[@id='create-faq']");
		
		login.driver.findElement(By.xpath(".//*[@id='create-faq']")).click();

		Alert alert = login.driver.switchTo().alert();
		alert.accept();
		
		JavascriptExecutor js4 = (JavascriptExecutor) login.driver;
	    js4.executeScript("javascript:window.scrollBy(250,350)");
		
		//Cancel
		
		login.wait(".//*[@id='question']");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[10]/div/span/a")).click();
		
	}


	}


