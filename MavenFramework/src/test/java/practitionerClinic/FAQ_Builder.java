package practitionerClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FAQ_Builder {
	
@Test(priority=1)
	
	public void create_faq_builder() throws Exception
	
	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Resources
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
		
		
		//FAQ Builder
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();
	
		//Create FAQ
		
		login.wait(".//*[@id='create-faq']");
		
		login.driver.findElement(By.xpath(".//*[@id='create-faq']")).click();

		
		//Question
		
		login.wait(".//*[@id='question']");
		
		login.driver.findElement(By.xpath(".//*[@id='question']")).sendKeys("Test Question");
		
		//Answer 
	
		login.wait(".//*[@id='answer']");
		
		login.driver.findElement(By.xpath(".//*[@id='answer']")).sendKeys("This is to test the functionality of Answer textbox");
		
		
		
		//new video  
		
		//login.wait(".//*[@id='select-video']");
		
	//	login.driver.findElement(By.xpath(".//*[@id='select-video']")).sendKeys("/Users/abhatnagar/Documents/Selenium/Plank.mp4");


		
		//CONDITIONS
		
		login.wait(".//*[@id='faq-form']/div[5]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/button")).click();

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[5]/div/div/ul/li[2]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/ul/li[2]/a/label/input")).click();

	
		//CONDITIONS
		
		login.wait(".//*[@id='faq-form']/div[5]/div/div/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[5]/div/div/button")).click();

		
		//Physiotherapy
		
		login.wait(".//*[@id='faq-form']/div[6]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/button")).click();

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[6]/div/div/ul/li[2]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/ul/li[2]/a/label/input")).click();

	
		//Physiotherapy
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[6]/div/div/button")).click();
		
		//Procedure
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();

		//checkbox
		
		login.wait(".//*[@id='faq-form']/div[7]/div/div/ul/li[2]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/ul/li[2]/a/label/input")).click();

	
		//Procedure
		
		//login.wait(".//*[@id='faq-form']/div[7]/div/div/button");
				
		//login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[7]/div/div/button")).click();
		
		//
		login.wait(".//*[@id='faq-form']/div[8]/label");
		
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[8]/label")).click();
		

		//Save
		
		login.wait(".//*[@id='faq-form']/div[9]/div/span/button");
				
		login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[9]/div/span/button")).click();

		login.driver.close();
		
	}	
@Test(priority=2)

public void create_faq_builder_cancel_button() throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Resources
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
	
	
	//FAQ
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();

	//Create FAQ
	
	login.wait(".//*[@id='create-faq']");
	
	login.driver.findElement(By.xpath(".//*[@id='create-faq']")).click();

	
	//Cancel
	
	JavascriptExecutor js = (JavascriptExecutor) login.driver;
    js.executeScript("javascript:window.scrollBy(250,350)");
	
	login.wait(".//*[@id='faq-form']/div[9]/div/span/a");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-form']/div[9]/div/span/a")).click();
	
	login.driver.close();

	}

@Test(priority=3)

public void Search_faq_builder() throws Exception

//public static void main(String [] args) throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Resources
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
	
	
	//FAQ
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();

	//Search
	
	login.wait(".//*[@id='faq-search-term']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("Test Question");
	
	//Search button
	
	login.wait(".//*[@id='faq-list-search']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-list-search']")).click();
	
	//verification  
	
	login.wait(".//*[@id='faq-list']/tbody/tr/td[1]/a[1]");
	
	String text=login.driver.findElement(By.xpath(".//*[@id='faq-list']/tbody/tr/td[1]/a[1]")).getText();
	
	Boolean flag;
	
	flag=text.equalsIgnoreCase("Test Question");
	
	//System.out.println(flag);
	
	Status s= new Status();
	
	s.statusBooleanTrue(30, 33, login.driver,flag);
}

@Test(priority=4)

public void Search_Clear_faq_builder() throws Exception

//public static void main(String [] args) throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Resources
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
	
	
	//FAQ
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();

	//Search
	
	login.wait(".//*[@id='faq-search-term']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("Test Question");
	
	//Search button
	
	login.wait(".//*[@id='faq-list-search']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-list-search']")).click();
	
	//Search clear button
	
	login.wait(".//*[@id='faq-search-clear']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-search-clear']")).click();
	
	}

@Test(priority=5)

public void faq_builder_sort_Question() throws Exception

//public static void main(String[] args) throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Resources
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
	
	
	//FAQ Builder
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();
	
	//Question
	
	login.wait(".//*[@id='faq-list']/tbody/tr[2]/td[1]/a[1]");
	
	String beforetext= login.driver.findElement(By.xpath(".//*[@id='faq-list']/tbody/tr[2]/td[1]/a[1]")).getText();
	
	//sort
	
	login.wait(".//*[@id='faq-list_col_0_sort']/span");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-list_col_0_sort']/span")).click();
	
	//Question
	
	login.wait(".//*[@id='faq-list']/tbody/tr[2]/td[1]/a[1]");
	
	String aftertext= login.driver.findElement(By.xpath(".//*[@id='faq-list']/tbody/tr[2]/td[1]/a[1]")).getText();
	
	Boolean flag;
	
	flag= beforetext.equalsIgnoreCase(aftertext);
	
	Status s = new Status();
	
	s.statusBooleanFalse(350, 356, login.driver, flag);
	
}
}


/*

@Test(priority=5)

public void delete_faq_builder() throws Exception

//public static void main(String [] args) throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Resources
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/a/span[1]")).click();
	
	
	//FAQ
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[5]/ul/li[3]/a")).click();

	//Search
	
	login.wait(".//*[@id='faq-search-term']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-search-term']")).sendKeys("Test Question");
	
	//Search button
	
	login.wait(".//*[@id='faq-list-search']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-list-search']")).click();
	
	//Delete button
	
	login.wait(".//*[@id='faq-list-search']");
	
	login.driver.findElement(By.xpath(".//*[@id='faq-list-search']")).click();
	}

*/

