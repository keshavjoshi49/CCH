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

import calvaryCCH.Base.BasePage
import calvaryCCH.Base.LocatorsAdminPortal as Locators
import internal.GlobalVariable



public class CaliforniaIssuePage {

	public static def editCaliforniaIssue(){
		BasePage.click(Locators.edit_california_issues_page())
	}

	//workflows

	public static def clickEditCaliforniaIssueLink(){
		CaliforniaIssuePage.editCaliforniaIssue()
		BasePage.waitForElement(Locators.save_california_issues_page())
	}
	public static def saveCaliforniaIssue(){
		BasePage.click(Locators.save_california_issues_page())
		BasePage.waitForElement(Locators.edit_california_issues_page())
	}
}