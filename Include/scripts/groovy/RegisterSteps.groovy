import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class RegisterSteps {

	@Given('Open url')
	def open_url() {
		WebUI.openBrowser(GlobalVariable.WebUrl_2)
	}

	@When('^I enter (.+), (.+) and (.+)$')
	def i_enter_and(String name, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Name_name'), name)
		WebUI.setText(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Email_email'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Password_exampleInputPassword1'), password)
	}

	@Then('^I receive a successful notification \"([^\"]*)\"$')
	def i_receive_a_successful_notification_something(String value){
		WebUI.verifyElementPresent(findTestObject('Web/Page_ProtoCommerce/div_Success The Form has been submitted successfully'),0)
	}

	@And('^I check the check-box Check me out if you Love IceCreams$')
	def i_check_the_checkbox_something()  {
		WebUI.click(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Password_exampleCheck1'))
	}

	@And('^I select the item Female in the listbox$')
	def i_select_the_item_something_in_the_listbox()  {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Page_ProtoCommerce/select_Male                        Female'),
				'Female', true)
	}

	@And('^I choose the radio button Student$')
	def i_choose_the_radio_button_something() {
		WebUI.click(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Employment Status_inlineRadioOptions'))
	}

	@And('^I click submit button$')
	def i_click_submit_button() {
		WebUI.click(findTestObject('Object Repository/Web/Page_ProtoCommerce/input_Date of Birth_btn btn-success'))
	}
}