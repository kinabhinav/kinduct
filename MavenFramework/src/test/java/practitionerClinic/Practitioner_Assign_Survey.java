package practitionerClinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.WaitForElement;

public class Practitioner_Assign_Survey {

	
	WebDriver driver;
	
	

	
	@Test(priority=0)
	public  void assign_survey() throws Exception
	{

		

	 driver = new FirefoxDriver();
	 WaitForElement w= new WaitForElement();
		driver.get("https://qa9.kinductdev.com/login");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
		
		w.isElementHiddenNow(".//*[@id='login_form']/div[3]/div/button",driver);
		
		//Login button
		
		
		
		driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
		
		

		
		((JavascriptExecutor)driver).executeScript("71", 413);
		
		//wait(".//*[@id='link_83356']");
		
		w.isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[11]/a",driver);
		
		//Kinduct Clinic
		
		//driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
		
		driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[11]/a")).click();
		
		//Demo Practitioner
		
		WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]"));
		
		////*[@id="users"]/tbody/tr[5]/td[5]/a[3]/span[1]
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		
		//(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")));
        w.isElementHiddenNow(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]",driver);

		driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")).click();
		
		
		
		//communication
		
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]",driver);
				
		driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
				
				//message center
				
		w.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a",driver);
						
				driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a")).click();
				
				//Assign  
				

				w.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span",driver);
				
				driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span")).click();
				
				//driver.switchTo().activeElement();
				
				System.out.println("wind");
				
				//Select Recipient  
				
				w.isElementHiddenNow(".//*[@id='select_link']",driver);
				
				driver.findElement(By.xpath(".//*[@id='select_link']")).click();
				
				
				
				//Patient 1  
				
				w.isElementHiddenNow(".//*[@id='user_v6nieof8rsdlhpuw']",driver);
				
				driver.findElement(By.xpath(".//*[@id='user_v6nieof8rsdlhpuw']")).click();
				
				//Select
				
				w.isElementHiddenNow(".//*[@id='multi_select_user']/div/div/div[3]/button",driver);
				
				driver.findElement(By.xpath(".//*[@id='multi_select_user']/div/div/div[3]/button")).click();
				
				
				//login.driver.switchTo().defaultContent();
				
			
				//JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
		       // js1.executeScript("javascript:window.scrollBy(250,350)");
		        
		        System.out.println("Hello 123");
				Thread.sleep(5000);
				//Save 
				w.isElementHiddenNow(".//*[@id='submit_button']/span",driver);
				
				driver.findElement(By.xpath(".//*[@id='submit_button']/span")).click();
				
		
		
		}
}
