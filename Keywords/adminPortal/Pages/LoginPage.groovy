package adminPortal.Pages

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

import calvaryCCH.Base.BasePage
import calvaryCCH.Base.LocatorsAdminPortal as Locators

public class LoginPage {

	public static email (String email){
		BasePage.setText(Locators.emailAddress(), email)
	}
	public static password (String password){
		BasePage.setText(Locators.password(), password)
	}
	public static submit(){
		BasePage.click(Locators.submit_button())
	}
	//Workflows
	public static loginToApplication(String username, String password) {
		LoginPage.email(username)
		LoginPage.password(password)
		LoginPage.submit()
		BasePage.waitForElement(Locators.logout_link())
	}
}
