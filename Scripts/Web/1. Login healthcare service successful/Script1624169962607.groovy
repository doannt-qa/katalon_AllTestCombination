import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.WebUrl)

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/input_Username_username'))

WebUI.sendKeys(findTestObject('Web/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/input_Password_password'))

WebUI.sendKeys(findTestObject('Web/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Web/Page_CURA Healthcare Service/h2_Make Appointment'), 0)

