package com.vmware.ui.constants;

/**
 * ID constants class. Naming convention is the constant name should start with
 * ID if the element is identified by the id, or LABEL if it is identified by
 * it's label etc.,
 */
public class IDConstants {

   /**** LoginPage ***/
   public static final String ID_LOGIN_BUTTON = "loginButton";
   public static final String ID_USER = "usernameTextInput";
   public static final String ID_PASSWORD = "passwordTextInput";
   

   /**** VnasHomePage ***/
   public static final String ID_VSPHERE_VNAS = "TreeNodeItem_vsphere.vnas.navigator";
   public static final String ID_CLUSTER_NAV = "TreeNodeItem_vsphere.vnas.navigator.clusterMgmtTree";
   public static final String ID_ACCESSMGMT = "TreeNodeItem_vsphere.vnas.clustermgmt.accessMgmt";
   
   /**** AccessMgmtPage  ***/
   public static final String ID_CREATE = "className=ActionButton";
   public static final String ID_EDIT = "className=ActionButton[1]";
   public static final String ID_DELETE = "className=ActionButton[2]";
   public static final String ID_SELECT = "accessZoneAdvancedDataGrid";
   public static final String ID_CANCELBUTTON = "CANCEL";
   public static final String ID_OKBUTTON = "OK";
   
   
   /*** Create accesszone page ***/
   public static final String ID_NAME = "zoneNameTextInput";
   public static final String ID_NEXT = "next";
   public static final String ID_ADD = "className=ActionButton";
   public static final String ID_FINISH = "finish";
   
   public static final String ID_ONE = "displayGroup[0]";
   public static final String ID_HOONEXT = "displayGroup[1]";
   public static final String ID_DIALOG = "tiwoDialog";
  
   /*** Create user mapping rule ***/
   public static final String ID_SELECTRULE = "operationComboBox";
   public static final String ID_REPLACE = "replaceFromUserButton";
   public static final String ID_USRRADIOBUTTON = "usersRadioButton";
   public static final String ID_GROUPRADIOBUTTON = "groupsRadioButton";
   public static final String ID_SIDSRRADIOBUTTON = "sidsRadioButton";
   public static final String ID_SEARCH = "searchButton";
   public static final String ID_SEARCHRESULT = "sidsAdvancedDataGrid";
   public static final String ID_SELECTUSRBTN = "selectUserButton";
  
   public static final String ID_SELECTUSR = "appendFromUserButton";
   public static final String ID_APPEND = "appendUserCheckBox";
   public static final String ID_APPENDGROUP = "appendGroupCheckBox";
   public static final String ID_APPENDSUP = "appendSupplementGroupCheckBox";
   public static final String ID_APPENDUSR = "appendUseDefaultUserCheckBox";
   
   public static final String ID_SAVEBUTTON = "saveMappingRuleButton";
   public static final String ID_USR = "usersRadioButton";
   public static final String ID_SELNAME = "textDisplay";
   public static final String ID_SELBTN = "selectUserButton";
   public static final String ID_SETTING = "accessZoneButtonBar";
   
   /*** smb shares  ***/
   public static final String ID_ALLSHARE = "useAllSMBShares";
   public static final String ID_NOSHARE = "useNoSMBShares";
   public static final String ID_MANUALLY = "manuallySelect";
   public static final String ID_ADDSMBSHARE = "className=ActionButton[1]";
   public static final String ID_ADDDATAGRID = "smbShareTable";
   public static final String ID_POPUPDIALOG = "dialogPopup";
   
}

