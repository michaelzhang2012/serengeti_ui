package com.vmware.ui.constants;

public class TestConstants {

   // Login messages
   public static final String LOGIN_WRONG_USERNAME_PASSWORD =
         "Cannot complete login. Cannot complete authentication.";

   public static final String DEFAULT_ONE_SECOND = "1000";


   public static final String DEFAULT_TIMEOUT_ZERO_SECOND = "1000";
   public static final String DEFAULT_TIMEOUT_FIVE_SECONDS = "5000";
   public static final String DEFAULT_TIMEOUT_ONE_SECOND = "1000";
   public static final String DEFAULT_TIMEOUT_ONE_MINUTE = "60000";

   public static final long DEFAULT_TIMEOUT_ONE_MSECOND_LONG_VALUE = new Long(
         "1000").longValue();
   public static final long DEFAULT_ONE_SECOND_LONG_VALUE = new Long(
         DEFAULT_ONE_SECOND).longValue();
   public static final long DEFAULT_TIMEOUT_FIVE_SECONDS_LONG_VALUE = new Long(
         DEFAULT_TIMEOUT_FIVE_SECONDS).longValue();
   public static final long DEFAULT_TIMEOUT_ONE_SECOND_LONG_VALUE = new Long(
         DEFAULT_TIMEOUT_ONE_SECOND).longValue();
   public static final long DEFAULT_TIMEOUT_TWO_SECONDS_LONG_VALUE = new Long(
         "2000").longValue();
   public static final long DEFAULT_TIMEOUT_ZERO_SECOND_LONG_VALUE = new Long(
         DEFAULT_TIMEOUT_ZERO_SECOND).longValue();
   public static final long DEFAULT_TIMEOUT_SIX_SECOND_LONG_VALUE = new Long(
         "6000").longValue();
   public static final long DEFAULT_TIMEOUT_FIFTEEN_SECONDS_LONG_VALUE =
         new Long("15000").longValue();
   public static final long DEFAULT_TIMEOUT_ONE_MINUTE_LONG_VALUE = new Long(
         "60000").longValue();
   public static final long DEFAULT_TIMEOUT_TWO_MINUTE_LONG_VALUE = new Long(
         "120000").longValue();
   public static final long DEFAULT_TIMEOUT_THREE_MINUTE_LONG_VALUE = new Long(
         "180000").longValue();
   public static final long DEFAULT_TIMEOUT_FIVE_MINUTE_LONG_VALUE = new Long(
         "300000").longValue();
   public static final long DEFAULT_TIMEOUT_TEN_MINUTE_LONG_VALUE = new Long(
         "600000").longValue();
   public static final long DEFAULT_TIMEOUT_FIFTEEN_MINUTE_LONG_VALUE =
         new Long("900000").longValue();
   public static final long DEFAULT_TIME_TWENTY_FIVE_MINUTE_LONG_VALUE =
         new Long("1500000").longValue();
   public static final long DEFAULT_TIMEOUT_THIRTY_MINUTE_LONG_VALUE =
         new Long("1800000").longValue();
   //TODO We should fix the time out doesn't match what we say it is
   public static final int DEFAULT_TIMEOUT = 60000;

   // use for smoke test
   public static String adminFirstName = "admin";
   public static String adminLastName = "aurora";
   public static String adminPhone = "01059846501";
   public static String licenseKey = "J52EJ-83H43-M8311-083H6-9TJ3A";
   public static String companyName = "VMware";
   public static String aboutURL = "http://www.vmware.com";
   public static String supportURL = "http://www.vmware.com";
   public static String smtpServerName = "10.37.8.37";
   public static String smtpServerPort = "25";
   public static String senderEmail = "Lirong.mao@emc.com";
   public static String emailSubPrefix = "[Data Director]";
   public static String rbName = "SmokeTestRb";
   public static String rbDes = "SmokeTestRbDes";
   public static String rbDataStorage = "150";
   public static String rbBackupStorage = "90";
   public static String rbStorageAlpha = "20";
   public static String orgName = "SmokeTestOrg";
   public static String orgDes = "SmokeTestOrgDes";
   public static String orgAdminName = "b@b.com";
   public static String orgAdminFirstName = "b";
   public static String orgAdminLastName = "b";
   public static String orgAdminPasswd = "password";
   public static String orgAdminPhone = "1234567890";
   public static String dbgName = "SmokeTestDbg";
   public static String dbgDes = "SmokeTestDbgDes";
   public static String dbgPriority = "High";
   public static String dbgDataStorage = "100";
   public static String dbgBackupStorage = "50";
   public static String dbgStorageAlpha = "80";
   public static String dbName = "SmokeTestDb";
   public static String dbDes = "SmokeTestDbDes";
   public static String dbType = "vPostgres";
   public static String dbTemplate = "vPostgres SUSE";
   public static String dbDataStorage = "5";
   public static String dbBackupStorage = "5";
   public static String dbEncoding = "LATIN1";
   public static String dbOwnerName = "sjy";
   public static String dbOwnerPasswd = "123";
   public static String dbDataStorageUpdate = "5";
   public static String dbBackupStorageUpdate = "5";
   public static String cmsVcNetworkFQDN = "cms-vc-test2.aurorasvt.com";
   public static String ldapVcNetworkFQDN = "ldap-vc-test2.aurorasvt.com";
}
