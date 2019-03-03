package integrationTest.Workflow

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
import adminPortal.Pages.PageIntrosPage as page

public class HomePageWorkflow {

	public static def loginToAdmin(String username, String password){
		login.loginToApplication(username, password)
	}
	// California Issue text validation on home page.
	public static def saveContentCaliforniaIssue(String contentText){
		home.ClickPageIntros()
		page.editCaliforniaIssue()
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

	// Marriage family text validation on home page
	public static def saveContentMarriageFamily(String contentText){
		home.ClickPageIntros()
		page.editMarriageFamily()
		WebUI.switchToFrame(LocatorsA.switch_to_frame(),5)
		BasePage.clearText(LocatorsA.Content_CI())
		WebUI.focus(LocatorsA.Content_CI())
		BasePage.setText(LocatorsA.Content_CI(), contentText)
		WebUI.switchToDefaultContent()
		ci.saveCaliforniaIssue()
	}
	
	public static def verifyContentMarriageFamily(String contentText){
		
		WebUI.verifyElementText(LocatorsM.marriage_family_text(),contentText)
	}
	
	//Parental rights text validation on home page
	public static def saveContentParentalRights(String contentText){
		home.ClickPageIntros()
		page.editParentalRights()()
		WebUI.switchToFrame(LocatorsA.switch_to_frame(),5)
		BasePage.clearText(LocatorsA.Content_CI())
		WebUI.focus(LocatorsA.Content_CI())
		BasePage.setText(LocatorsA.Content_CI(), contentText)
		WebUI.switchToDefaultContent()
		ci.saveCaliforniaIssue()
	}
	
	public static def verifyContentParentalRights(String contentText){
		
		WebUI.verifyElementText(LocatorsM.parental_rights_link(),contentText)
	}
	
	//Sanctity life text validation on home page
	public static def saveContentSanctityLife(String contentText){
		home.ClickPageIntros()
		page.editSanctityLife()
		WebUI.switchToFrame(LocatorsA.switch_to_frame(),5)
		BasePage.clearText(LocatorsA.Content_CI())
		WebUI.focus(LocatorsA.Content_CI())
		BasePage.setText(LocatorsA.Content_CI(), contentText)
		WebUI.switchToDefaultContent()
		ci.saveCaliforniaIssue()
	}
	
	public static def verifyContentSanctityLife(String contentText){
		
		WebUI.verifyElementText(LocatorsM.sanctity_life_text(),contentText)
	}
}
