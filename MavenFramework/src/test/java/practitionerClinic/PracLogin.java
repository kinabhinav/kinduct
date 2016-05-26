package practitionerClinic;

import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracLogin {
	
	public  WebDriver driver;  
	public boolean wait(String xpath) {
	    turnOffImplicitWaits();
	    boolean result = ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)).apply(driver);
	    turnOnImplicitWaits();
	    return result;
	}
	
	public boolean isElementHiddenNow(String xpath) 
	{
		 turnOffImplicitWaits();
		    boolean result = ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)).apply(driver);
		    turnOnImplicitWaits();
		    return result;
	}

	private void turnOffImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	private void turnOnImplicitWaits() {
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
		
		
		@Test
		public  void login() throws Exception
		{
			driver = new FirefoxDriver(); 
	/*	File src =  new File("/Users/abhatnagar/phantomjs-2.1.1-macosx/bin/phantomjs") ;
			 
			System.setProperty ("phantomjs.binary.path", src.getAbsolutePath());
			   // String binary = System.getProperty("phantomjs.binary");

			driver = new PhantomJSDriver();  //*[@id="users"]/tbody/tr[5]/td[5]/a[3]/span[1]
		*/	
			
			driver.get("https://qa9.kinductdev.com/login");
			
			driver.manage().window().maximize();
			//driver.manage().window().setPosition(new Point(0,0));
			//driver.manage().window().setSize(new Dimension(1024,768));
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
			
			
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
			
			isElementHiddenNow(".//*[@id='login_form']/div[3]/div/button");
			
			//Login button
			
			
			
			driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
			
			
			
		//	WebElement Image = driver.findElement(By.xpath(".//*[@id='link_83356']"));
			
			//Point point = Image.getLocation();
			
			//int xcord = point.getX();
			
			//System.out.println(xcord);
			//int ycord = point.getY();
			//System.out.println(ycord);
			
			((JavascriptExecutor)driver).executeScript("71", 413);
			
			//wait(".//*[@id='link_83356']");
			
			isElementHiddenNow(".//*[@id='org_chart']/ul/li/ul/li[11]/a");
			
			//Kinduct Clinic
			
			//driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
			
			driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[11]/a")).click();
			
			//Demo Practitioner
			
			WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]"));
			
			////*[@id="users"]/tbody/tr[5]/td[5]/a[3]/span[1]
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
			
			//(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")));
	        isElementHiddenNow(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]");

			driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")).click();
			
			/*
			Status s = new Status();
			
			s.statusTitle(1,5,driver,"Kinduct Clinic - Home");
		
		
			*/
			
			
			
					
			
		}


}
