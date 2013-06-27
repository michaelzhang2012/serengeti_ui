package com.vmware.qe.asg.testsuite.ui.test;

import org.testng.annotations.Test;

import com.vmware.qe.asg.framework.ui.UITestBase;
import com.vmware.qe.asg.framework.ui.system.LoginPage;

public class LoginTest extends UITestBase {
	
	   @Test(groups = "High")
	   public void loginTest() throws Exception {
	      LoginPage lp = new LoginPage();
	      lp.Login("root", "ca$hc0w");
	   }
}
