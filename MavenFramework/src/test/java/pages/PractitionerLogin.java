package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PractitionerLogin {
	
	public PractitionerLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public class practitionerLogin {
		 
	    WebDriver driver;
	 
	    By username = By.xpath(".//*[@id='username']");
	 
	    By password = By.xpath(".//*[@id='password']");
	 
	    By login = By.xpath(".//*[@id='login_form']/div[3]/div/button");
	 
	    //By kinductclinic = By.xpath(".//*[@id='link_83356']");
	    
	    //By practitoner = By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]");
	 
	    public practitionerLogin(WebDriver driver){
	 
	        this.driver = driver;
	 
	    }
	 
	    //Set user name in textbox
	 
	    public void setUserName(String strUserName){
	 
	        driver.findElement(username).sendKeys(strUserName);;
	 
	    }
	 
	     
	 
	    //Set password in password textbox
	 
	    public void setPassword(String strPassword){
	 
	         driver.findElement(password).sendKeys(strPassword);
	 
	    }
	 
	     
	 
	    //Click on login button
	 
	    public void clickLogin(){
	 
	            driver.findElement(login).click();
	 
	    }
	    
	  
	    
	    public void loginToclinic(String strUserName,String strPasword){
	    	 
	        //Fill user name
	 
	        this.setUserName(strUserName);
	 
	        //Fill password
	 
	        this.setPassword(strPasword);
	 
	        //Click Login button
	 
	        this.clickLogin();        
	 
	         
	 
	    }
	}

}
