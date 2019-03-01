package adminPortal.Workflow

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

import adminPortal.Pages.LoginPage as login
import calvaryCCH.Base.BasePage
import calvaryCCH.Base.LocatorsAdminPortal as LocatorsA
import calvaryCCH.Base.LocatorsMainSite as LocatorsM
import calvaryCCH.Pages.HomePage as mainHome
import adminPortal.Pages.Homepage as home
import adminPortal.Pages.CaliforniaIssuePage as ci

public class HomePageWorkflow {

	public static def loginToAdmin(String username, String password){
		login.loginToApplication(username, password)
	}
	public static def saveContentCaliforniaIssue(String contentText){
		home.ClickPageIntros()
		ci.editCaliforniaIssue()

		WebUI.switchToFrame(LocatorsA.switch_to_frame(),5)
		BasePage.clearText(LocatorsA.Content_CI())
		WebUI.focus(LocatorsA.Content_CI())
		BasePage.setText(LocatorsA.Content_CI(), contentText)
		WebUI.switchToDefaultContent()
		ci.saveCaliforniaIssue()
	}
	public static def verifyContentCaliforniaIssue(String contentText){

		WebUI.verifyElementText(LocatorsM.california_issues_text(),contentText)
	}
}
