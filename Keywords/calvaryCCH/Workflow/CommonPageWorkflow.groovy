package calvaryCCH.Workflow

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
import calvaryCCH.Base.LocatorsMainSite as Locators
import calvaryCCH.Base.BasePage

public class CommonPageWorkflow {

	public static def menuLinkClickable(){

		WebUI.verifyElementClickable(Locators.home_link())
		WebUI.verifyElementClickable(Locators.about_link())
		WebUI.verifyElementClickable(Locators.contact_link())
		WebUI.verifyElementClickable(Locators.store_link())
		WebUI.verifyElementClickable(Locators.links_link())
		WebUI.verifyElementClickable(Locators.take_action_link())
	}

	public static def topicLinkClickable(){
		WebUI.verifyElementClickable(Locators.California_issues_link())
		WebUI.verifyElementClickable(Locators.Marriage_family_link())
		WebUI.verifyElementClickable(Locators.Parental_rights_link())
		WebUI.verifyElementClickable(Locators.Sanctity_life_link())
	}

	public static def InformationLinkClickable(){

		WebUI.verifyElementClickable(Locators.Current_News_Event_link())
		WebUI.verifyElementClickable(Locators.practicle_tools_link())
		WebUI.verifyElementClickable(Locators.connect_fpp_link())
	}
}
