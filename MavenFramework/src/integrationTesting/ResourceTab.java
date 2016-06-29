package integrationTesting;

import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.Organizations;
import pageobject.PatriotsHome;
import pageobject.ProfileAssessmentPage;
import pageobject.ProfileBodyCompPage;
import pageobject.ProfileJournalsPage;
import pageobject.ProfileMedicalPage;
import pageobject.ProfileNotesPage;
import pageobject.ProfilePage;
import pageobject.ProfileResourcePage;
import pageobject.ProfileSupplementPage;

public class ResourceTab {
	
	//@Test
	public void notes() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileResourcePage pp = new ProfileResourcePage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Resource(login.driver);
			
			pp.addresource_cancel(login.driver);
			
			//pp.addresource(login.driver);
			
			//pp.addnote_Cancel(login.driver);
			
			pp.delete(login.driver);
			
			//pp.edit(login.driver);
		}
	
	//@Test
	public void BodyComp() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileBodyCompPage pp = new ProfileBodyCompPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.BodyComp(login.driver);
			
			pp.addentry(login.driver);
			
			
		}
	
	//@Test
	public void Supplement() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileSupplementPage pp = new ProfileSupplementPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Supplement(login.driver);
			
			pp.assignsupplement(login.driver);
			
			
		}
	
	//@Test
	public void Medical() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileMedicalPage pp = new ProfileMedicalPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Medical(login.driver);
			
			pp.addentry(login.driver);
			pp.editentry(login.driver);
			pp.view(login.driver);
			pp.delete(login.driver);
			
			
			
		}
	
	//@Test
	public void Journal() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileJournalsPage pp = new ProfileJournalsPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Journals(login.driver);
			
			pp.addentry(login.driver);
			
			
			
		}
	@Test
	public void Assessment() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileAssessmentPage pp = new ProfileAssessmentPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Assessments(login.driver);
			
			pp.createnewscreen(login.driver);
			
			
			
		}

}
