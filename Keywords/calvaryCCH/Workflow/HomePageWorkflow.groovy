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
import calvaryCCH.Base.BasePage
import calvaryCCH.Base.LocatorsMainSite as Locators
import calvaryCCH.Workflow.CommonPageWorkflow as menu
import internal.GlobalVariable

public class HomePageWorkflow {

	public static def menuLinkClickable(){
		menu.menuLinkClickable()
	}

	public static def basketLinkClickable(){
		WebUI.verifyElementClickable(Locators.basket_link())
		WebUI.verifyElementClickable(Locators.basket_checkout_link())
	}

	public static def articleLinkClickable(){
		WebUI.verifyElementClickable(Locators.california_issues_link())
		WebUI.verifyElementClickable(Locators.marriage_family_link())
		WebUI.verifyElementClickable(Locators.parental_rights_link())
	}

	public static def imageLinkClickable(){
		WebUI.verifyElementClickable(Locators.practicle_tools_image())
		WebUI.verifyElementClickable(Locators.take_action_image())
		WebUI.verifyElementClickable(Locators.connect_fpp_image())
	}

	public static def currentNewsEventClickable(){

		WebUI.verifyElementClickable(Locators.Current_News_Event())
	}
}
