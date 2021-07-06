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

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center'))

WebUI.check(findTestObject('Web/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.sendKeys(findTestObject('Web/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), date)

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/textarea_Comment_comment'))

WebUI.sendKeys(findTestObject('Web/Page_CURA Healthcare Service/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Web/Page_CURA Healthcare Service/p_Please be informed that your appointment has been booked as following'), 
    0)

WebUI.click(findTestObject('Web/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), false)

