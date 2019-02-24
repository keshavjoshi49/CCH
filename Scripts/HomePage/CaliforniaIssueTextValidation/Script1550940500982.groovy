import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import calvaryCCH.Base.BasePage
import adminPortal.Workflow.ContentCaliforniaIssue as ci

//Login to admin portal
BasePage.lauchApplication(adminurl)
ci.loginToAdmin(username, password)

ci.saveContentCaliforniaIssue(contentText)












//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://dev54.calvarycch.org/admin_panel/index.php')
//
//WebUI.setText(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/input_Email address_email'), 
//    'nick@exodussw.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/input_Password_pass'), 
//    '8SQVv/p9jVTHLrggi8kCzw==')
//
//WebUI.click(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/input_Password_addd'))
//
//WebUI.click(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/span_Page Intros'))
//
//WebUI.click(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/b_California Issues'))
//
//WebUI.click(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/img'))
//
//WebUI.setText(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/body_This is testing'), 
//    '<p style="">This is testing</p>')
//
//WebUI.click(findTestObject('Object Repository/AdminPortal/Page_Faith and Public Policy  Admin/a_Save'))
//
//WebUI.closeBrowser()

