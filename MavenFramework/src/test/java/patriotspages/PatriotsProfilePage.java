package patriotspages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PatriotsProfilePage {
	public WaitForElement w= new WaitForElement();

	@Test
public void CreateTrainingProgram() throws Exception 
	
	{
	
		WebDriver driver = new FirefoxDriver();
	
	driver.get("https://qa9.kinductdev.com/login");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
	
	w.isElementHiddenNow(".//*[@id='login_form']/div[3]/div/button", driver);
	
	//Login button
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("javascript:window.scrollBy(250,350)");
	driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
	
	
	
	
	w.isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[11]/a",driver);
	driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[11]/a")).click();
	
	
	w.isElementHiddenNow(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]", driver);
	//patient
	WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(250,350)");
	driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[2]/td[5]/a[3]/span[1]")).click();
	
	
	w.isElementHiddenNow(".//*[@id='content-container']/section/section/article/div/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[2]",driver);
	driver.findElement(By.xpath(".//*[@id='content-container']/section/section/article/div/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div[2]")).click();
	
	
		//Performance	
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]",driver);
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		//Training
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a",driver);
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Create  
	
		w.isElementHiddenNow(".//*[@id='createDropdown']",driver);
		driver.findElement(By.xpath(".//*[@id='createDropdown']")).click();
		
		//Program Template
		
		w.isElementHiddenNow(".//*[@id='content']/header/div[1]/div/ul/li[1]/a",driver);
		driver.findElement(By.xpath(".//*[@id='content']/header/div[1]/div/ul/li[1]/a")).click();
		
		//  Template name 
		
		w.isElementHiddenNow(".//*[@id='template_name']",driver);
		driver.findElement(By.xpath(".//*[@id='template_name']")).sendKeys("Test Training Program");
		
		//Add workout
		
		w.isElementHiddenNow(".//*[@id='schedule']/tbody/tr/td[1]/div/div/a[1]",driver);
		driver.findElement(By.xpath(".//*[@id='schedule']/tbody/tr/td[1]/div/div/a[1]")).click();
		
		//WOrkout Name 
		
		w.isElementHiddenNow(".//*[@id='modal-body']/article/div[2]/div[1]/div[1]/div/input",driver);
		driver.findElement(By.xpath(".//*[@id='modal-body']/article/div[2]/div[1]/div[1]/div/input")).sendKeys("Plank Workout");
		Thread.sleep(2000);
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']",driver);
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
		Thread.sleep(2000);
		//Add Section 
		
		w.isElementHiddenNow(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/div/a",driver);
		driver.findElement(By.xpath(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/div/a")).click();
		
		//Section Name  
		w.isElementHiddenNow(".//*[@id='modal-body']/article/div[2]/div[1]/div/input",driver);
		driver.findElement(By.xpath(".//*[@id='modal-body']/article/div[2]/div[1]/div/input")).sendKeys("Plank ");
		
		Thread.sleep(2000);
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']",driver);
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		Thread.sleep(1000);
		
		//
		
		w.isElementHiddenNow(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/ul/li/div[1]/div/div/span/span",driver);
		driver.findElement(By.xpath(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/ul/li/div[1]/div/div/span/span")).click();
		
		//Edit Exercise   
		
		w.isElementHiddenNow(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/ul/li/div[1]/div/div/ul/li[2]/a",driver);
		driver.findElement(By.xpath(".//*[@id='schedule']/tbody/tr/td[1]/div/ul/li/div[2]/ul/li/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		// 
		
		w.isElementHiddenNow(".//*[@id='text_perf_three_point_lunge']",driver);
		driver.findElement(By.xpath(".//*[@id='text_perf_three_point_lunge']")).click();
		Thread.sleep(1000);
		
		//add exercise
		
		w.isElementHiddenNow(".//*[@id='modal-video-overlay']/div/div[2]/div[2]/a[2]",driver);
		driver.findElement(By.xpath(".//*[@id='modal-video-overlay']/div/div[2]/div[2]/a[2]")).click();
		
		Thread.sleep(1000);
		
		//Save 
		
		w.isElementHiddenNow(".//*[@id='modal-save']",driver);
		driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		Thread.sleep(1000);
		//Save 
		
		w.isElementHiddenNow(".//*[@id='save']/span[2]",driver);
		driver.findElement(By.xpath(".//*[@id='save']/span[2]")).click();
		
		//Assign  
		
		w.isElementHiddenNow(".//*[@id='training_program_list']/tbody/tr[1]/td[5]/a[1]/span[1]",driver);
		driver.findElement(By.xpath(".//*[@id='training_program_list']/tbody/tr[1]/td[5]/a[1]/span[1]")).click();
		
		//Select 
		
		w.isElementHiddenNow( ".//*[@id='select_link']",driver);
		driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		//Tom Brady  
		
		w.isElementHiddenNow( ".//*[@id='user_vm7lb6rt6ggo5575']",driver);
		driver.findElement(By.xpath(".//*[@id='user_vm7lb6rt6ggo5575']")).click();
		
		//Select Button
		
		w.isElementHiddenNow( ".//*[@id='multi_select_user']/div/div/div[3]/button",driver);
		driver.findElement(By.xpath(" .//*[@id='multi_select_user']/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		//Date 
		
		w.isElementHiddenNow(".//*[@id='start_date']",driver);
		driver.findElement(By.xpath(".//*[@id='start_date']")).click();
		
		//
		w.isElementHiddenNow("html/body/div[3]/div[1]/table/tbody/tr[3]/td[1]",driver);
		driver.findElement(By.xpath("html/body/div[3]/div[1]/table/tbody/tr[3]/td[1]")).click();
		
		Thread.sleep(1000);
		//MOnday  
		
		w.isElementHiddenNow( ".//*[@id='schedule-form']/div[5]/div/label[2]/input",driver);
		driver.findElement(By.xpath(" .//*[@id='schedule-form']/div[5]/div/label[2]/input")).click();
		
		//Tuesday
		
		w.isElementHiddenNow( ".//*[@id='schedule-form']/div[5]/div/label[3]/input",driver);
		driver.findElement(By.xpath(" .//*[@id='schedule-form']/div[5]/div/label[3]/input")).click();
		
		//Wednesday  
		
		w.isElementHiddenNow( ".//*[@id='schedule-form']/div[5]/div/label[4]/input",driver);
		driver.findElement(By.xpath(" .//*[@id='schedule-form']/div[5]/div/label[4]/input")).click();
		
		//Generate Program 
		
		w.isElementHiddenNow( ".//*[@id='submit-button']",driver);
		driver.findElement(By.xpath(".//*[@id='submit-button']")).click();
		
		// Send Program 
		
		w.isElementHiddenNow( ".//*[@id='save']",driver);
		driver.findElement(By.xpath(".//*[@id='save']")).click();
		
	}
}
