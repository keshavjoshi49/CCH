package calvaryCCH.Base

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LocatorsAdminPortal {

	//Login Page elements
	static def emailAddress(){findTestObject('AdminPortal/LoginPage/input_email_address')}
	static def password(){findTestObject('AdminPortal/LoginPage/input_password')}
	static def submit_button(){findTestObject('AdminPortal/LoginPage/submit_button')}

	//********** Home Page elements start ******************

	static def page_intros_link(){findTestObject('AdminPortal/HomePage/link_page_intros')}
	static def logout_link(){findTestObject('AdminPortal/HomePage/link_logout')}

	//Edit Link of California Issue
	static def edit_california_issues_page(){findTestObject('AdminPortal/PageIntros/California_issue_page')}

	//********** Home Page elements End ******************

	// California issue edit mode
	static def switch_to_frame(){findTestObject('AdminPortal/PageIntros/CaliforniaIssue/frame')}
	static def save_california_issues_page(){findTestObject('AdminPortal/PageIntros/CaliforniaIssue/Save')}
	static def Content_CI(){findTestObject('AdminPortal/PageIntros/CaliforniaIssue/Content_Input')}
}





