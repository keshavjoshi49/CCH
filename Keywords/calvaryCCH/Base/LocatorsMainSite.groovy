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

public class LocatorsMainSite {

	//Side Navigation
	//Menu clicks
	static def home_link(){findTestObject('MainSite/CommonPage/Home_Link')}
	static def about_link(){findTestObject('MainSite/CommonPage/About_Link')}
	static def contact_link(){findTestObject('MainSite/CommonPage/Contact_Link')}
	static def links_link(){findTestObject('MainSite/CommonPage/Links_Link')}
	static def store_link(){findTestObject('MainSite/CommonPage/Store_Link')}
	static def take_action_link(){findTestObject('MainSite/CommonPage/Take Action_Link')}

	// Topics links

	static def California_issues_link(){findTestObject('MainSite/CommonPage/California_Issues_Link')}
	static def Marriage_family_link(){findTestObject('MainSite/CommonPage/Marriage_Family_Link')}
	static def Parental_rights_link(){findTestObject('MainSite/CommonPage/Parental_Rights_Link')}
	static def Sanctity_life_link(){findTestObject('MainSite/CommonPage/Sanctity_Life_Link')}

	// Information Links

	static def Current_News_Event_link(){findTestObject('MainSite/CommonPage/Current_News_Event_Link')}
	static def practicle_tools_link(){findTestObject('MainSite/CommonPage/Practicle_Tools_Link')}
	static def connect_fpp_link(){findTestObject('MainSite/CommonPage/Connect_Fpp_Link')}

	//Home Page
	//****************************************//

	//Basket Links
	static def basket_link(){findTestObject('MainSite/HomePage/Basket_Link')}
	static def basket_checkout_link(){findTestObject('MainSite/HomePage/Basket_Checkout_Link')}

	//Article Links
	static def california_issues_link(){findTestObject('MainSite/HomePage/California_Issues_Link')}
	static def marriage_family_link(){findTestObject('MainSite/HomePage/Marriage_Family_Link')}
	static def parental_rights_link(){findTestObject('MainSite/HomePage/Parental_Rights_Link')}
	static def sanctity_life_link(){findTestObject('MainSite/HomePage/Sanctity_Life_Link')}

	//Article links text
	static def california_issues_text(){findTestObject('MainSite/HomePage/California_Issues_text')}
	
	//Image Links

	static def practicle_tools_image(){findTestObject('MainSite/HomePage/Practicle_Tools_Image')}
	static def take_action_image(){findTestObject('MainSite/HomePage/Take_Action_Image')}
	static def connect_fpp_image(){findTestObject('MainSite/HomePage/Connect_Fpp_Image')}

	//Current News and Events
	static def Current_News_Event(){findTestObject('MainSite/HomePage/Current_News_Event_Link')}
	//**************************************//
	// ABOUT PAGE



}
