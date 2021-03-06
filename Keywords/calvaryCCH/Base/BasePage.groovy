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

public class BasePage {

	public static def lauchApplication (String url) {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies()
		WebUI.navigateToUrl(url)
	}

	public static def clearText(TestObject object) {
		WebUI.clearText(object)
	}

	public static def setText(TestObject object,String value) {
		WebUI.setText(object,value)
	}
	public static def getText(TestObject object) {
		WebUI.getText(object)
	}

	public static def click(TestObject object) {
		WebUI.click(object)
	}

	public static def elementPreset(TestObject object){
		WebUI.verifyElementPresent(object, 5)
	}
	public static def waitForElement(TestObject object){
		WebUI.waitForElementPresent(object, 5)
	}
	public static def verifyTextPresent(TestObject object,String contentText){
		
	}
}


