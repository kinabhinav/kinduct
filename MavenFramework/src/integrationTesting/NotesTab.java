package integrationTesting;

import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.Organizations;
import pageobject.PatriotsHome;
import pageobject.ProfileNotesPage;
import pageobject.ProfilePage;
import pageobject.ProfileProgramPage;

public class NotesTab {
	
	@Test
	public void notes() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileNotesPage pp = new ProfileNotesPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Notes(login.driver);
			
			//pp.addnote(login.driver);
			
			//pp.addnote_Cancel(login.driver);
			
			pp.delete(login.driver);
			
			//pp.edit(login.driver);
		}

}
