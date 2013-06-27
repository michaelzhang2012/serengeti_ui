package com.vmware.ui.pages;

import com.vmware.flexui.componentframework.controls.mx.Button;
import com.vmware.flexui.componentframework.controls.mx.TextInput;
import com.vmware.flexui.selenium.BrowserUtil;
import com.vmware.ui.constants.IDConstants;
import com.vmware.ui.constants.TestConstants;
import com.vmware.ui.common.TestLogger;

import static com.vmware.flexui.selenium.BrowserUtil.flashSelenium;
import static com.vmware.flexui.selenium.BrowserUtil.selenium;

public class LoginPage {
  private static final String BROWSER_TYPE_FIREFOX = "firefox";
  private static final String BROWSER_TYPE_IEXPLORE = "iexplore";
  private static final String CERTIFICATE_ERROR_TITLE_IE = "Certificate Error";
  private static final String TEXT_ID = "id";
  private static final String EQUALS_SIGN = "=";
  private static final String ID_OVERRIDE_CERT_LINK_BUTTON_IE = "overridelink";
 
  
  private static Button loginButton = new Button(IDConstants.ID_LOGIN_BUTTON, flashSelenium);
  private static TextInput user = new TextInput(IDConstants.ID_USER, flashSelenium);
  private static TextInput pass = new TextInput(IDConstants.ID_PASSWORD, flashSelenium);

  public static void setUserName(String userName) {
    user.type(userName,TestConstants.DEFAULT_TIMEOUT_ZERO_SECOND_LONG_VALUE);
  }

  public static void setPassword(String password) {
    pass.type(password, TestConstants.DEFAULT_TIMEOUT_ZERO_SECOND_LONG_VALUE);
  }

  public void Login(String userName, String password) throws Exception {
	checkCertificateErrorAndIgnore();
	
	//Thread.sleep(TestConstants.DEFAULT_TIMEOUT_ONE_MINUTE_LONG_VALUE);
	
	try {
	  setUserName(userName);
      setPassword(password);
      
      loginButton.click(TestConstants.DEFAULT_TIMEOUT_ZERO_SECOND_LONG_VALUE);
	}  catch (Exception e) {
		Thread.sleep(TestConstants.DEFAULT_TIMEOUT_FIVE_MINUTE_LONG_VALUE);
		setUserName(userName);
	    setPassword(password);
	      
	    loginButton.click(TestConstants.DEFAULT_TIMEOUT_ZERO_SECOND_LONG_VALUE);
	}
	
  }
  
  public static void checkCertificateErrorAndIgnore() {
      // Check if the title has Certificate Error and handle the
      // certificate warning by clicking on override link
      // Note: This is tested only with IE7 and IE8
      if (BrowserUtil.browser != null) {
         if (BrowserUtil.browser.toLowerCase().contains(
               BROWSER_TYPE_IEXPLORE.toLowerCase())) {
            TestLogger.info("Browser Type is " + BROWSER_TYPE_IEXPLORE);
            if (selenium.getTitle().contains(CERTIFICATE_ERROR_TITLE_IE)) {
               selenium.click(TEXT_ID + EQUALS_SIGN
                     + ID_OVERRIDE_CERT_LINK_BUTTON_IE);
               selenium.waitForPageToLoad("" + 60000);
            }
         } else if (BrowserUtil.browser.toLowerCase().contains(
               BROWSER_TYPE_FIREFOX.toLowerCase())) {
            TestLogger.info("Browser Type is " + BROWSER_TYPE_FIREFOX);
            //for firefox, use RCE plugin
         } else {
            TestLogger.info("Unsupported browser type set: " +BrowserUtil.browser);
         }
      } else {
         TestLogger.info("Browser instance is null in BrowserUtil");
      }
   }

}


