package demo;

import org.testng.annotations.Test;

import com.vmware.ui.common.UITestBase;
import com.vmware.ui.pages.LoginPage;

public class LoginTest extends UITestBase {
	
	   @Test(groups = "High")
	   public void loginTest() throws Exception {
	      LoginPage lp = new LoginPage();
	      lp.Login("root", "ca$hc0w");
	   }
}
