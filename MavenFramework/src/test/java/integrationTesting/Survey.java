package integrationTesting;

import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.Organizations;
import pageobject.Prachome;
import pageobject.SurveyAdditionalInfo;
import pageobject.SurveyName;
import pageobject.Surveys;

public class Survey {
	
/*	@Test
	public void createSurvey()
	
		{
			Login login = new Login();
			
			login.login();
			
			Organizations o = new Organizations();
			
			o.PracLogin(login.driver);
			
			Prachome p = new Prachome();
			
			p.Surveys(login.driver);
			
			Surveys s = new Surveys();
			
			s.createsurveyButton(login.driver);
			
			SurveyName sn = new SurveyName();
			
			sn.SaveSurveyName(login.driver);
			
			SurveyAdditionalInfo sa = new SurveyAdditionalInfo();
			
			sa.Finish(login.driver);
		
		}*/
	
	@Test
	public void AssignSurvey() throws Exception
	
		{
			Login login = new Login();
			
			login.login();
			
			Organizations o = new Organizations();
			
			o.PracLogin(login.driver);
			
			Prachome p = new Prachome();
			
			p.Surveys(login.driver);
			
			Surveys s = new Surveys();
			
			s.AssignSurveySave(login.driver);
			

		}

}
