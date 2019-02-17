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
import calvaryCCH.Base.BasePage

public class Locators {

	//Home Page
	static def home_link(){findTestObject('HomePage/Home_Link')}
	static def about_link(){findTestObject('HomePage/About_Link')}
	static def contact_link(){findTestObject('HomePage/Contact_Link')}
	static def links_link(){findTestObject('HomePage/Links_Link')}
	static def store_link(){findTestObject('HomePage/Store_Link')}
	static def take_action_link(){findTestObject('HomePage/Take Action_Link')}
	
	//Basket Links
	static def basket_link(){findTestObject('HomePage/Basket_Link')}
	static def basket_checkout_link(){findTestObject('HomePage/Basket_Checkout_Link')}

	//Article Links
	static def california_issues_link(){findTestObject('HomePage/California_Issues_Link')}
	static def marriage_family_link(){findTestObject('HomePage/Marriage_Family_Link')}
	static def parental_rights_link(){findTestObject('HomePage/Parental_Rights_Link')}
	static def sanctity_life_link(){findTestObject('HomePage/Sanctity_Life_Link')}
	
	//Image Links
	
	static def practicle_tools_image(){findTestObject('HomePage/Practicle_Tools_Image')}
	static def take_action_image(){findTestObject('HomePage/Take_Action_Image')}
	static def connect_fpp_image(){findTestObject('HomePage/Connect_Fpp_Image')}
}
