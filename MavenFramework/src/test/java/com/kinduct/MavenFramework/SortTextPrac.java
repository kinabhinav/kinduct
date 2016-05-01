package com.kinduct.MavenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import practitionerClinic.PracLogin;

public class SortTextPrac {
	public void sorttext(WebDriver login,String xpathsort,String xpathtext,int row1,int row2) throws Exception
	
	{
				
		
		
				(new WebDriverWait(login,15)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathsort)));
				login.findElement(By.xpath(xpathsort)).click();
		
		
				(new WebDriverWait(login,15)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathtext)));
				String before = login.findElement(By.xpath(xpathtext)).getText();
					
				System.out.println(before);
					
				//filer  	
				
			
				(new WebDriverWait(login,15)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathsort)));
				login.findElement(By.xpath(xpathsort)).click();
				
				
				(new WebDriverWait(login,15)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathtext)));
				String after = login.findElement(By.xpath(xpathtext)).getText();
				
				System.out.println(after);
				
				Boolean verification= false;
				
				if(after.equalsIgnoreCase(before))
				
				{
					 Excel e = new Excel();
						
						e.excel(row1,row2,"FAILED");
						 verification= true;
						Assert.assertFalse(verification);
						
						login.quit();
						
					}
					else
					{
						Excel e = new Excel();
						
						e.excel(row1,row2,"PASSED");
						
						Assert.assertFalse(verification);
						
						login.quit();
						
					
					
				}

	}

}
