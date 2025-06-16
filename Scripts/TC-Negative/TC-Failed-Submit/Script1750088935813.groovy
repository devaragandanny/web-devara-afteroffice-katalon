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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.scrollToElement(findTestObject('Form Submit/Input-First-Name'), 3)

WebUI.setText(findTestObject('Form Submit/Input-First-Name'), 'Devara')

WebUI.setText(findTestObject('Form Submit/Input-Last-Name'), 'Gandanny')

WebUI.setText(findTestObject('Form Submit/Input-Email'), 'devaraehehehgmail.com')

WebUI.click(findTestObject('Form Submit/Gender-Male'))

WebUI.setText(findTestObject('Form Submit/Input-Number'), '081111')

WebUI.click(findTestObject('Form Submit/Input-DateofBirth'))

WebUI.sendKeys(findTestObject('Form Submit/Input-DateofBirth'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Form Submit/Input-DateofBirth'), '1999 September 09' + Keys.ENTER)

// Input Subject (Options)
WebUI.setText(findTestObject('Form Submit/Input-Subjects'), 'English')
WebUI.sendKeys(findTestObject('Form Submit/Input-Subjects'), 'English' + Keys.ENTER)

// Input Hobies (Options)
WebUI.click(findTestObject('Form Submit/Hobbies-Reading'))
// Upload Pictures
String filePath = 'C:\\Users\\USER\\OneDrive\\Pictures\\1.png'
WebUI.uploadFile(findTestObject('Form Submit/Input-UploadPicture'), filePath)

// Input Address
WebUI.setText(findTestObject('Form Submit/Input-CurrentAddress'), 'Jl.Jalan ke kota')

// Scroll Down the Page
WebUI.scrollToElement(findTestObject('Form Submit/Dropdown-State'), 2)

// Choose The State (Options)
WebUI.click(findTestObject('Form Submit/Dropdown-State'))
WebUI.click(findTestObject('Form Submit/Dropdown-State-Rajasthan'))

// Choose The City (Options)
WebUI.click(findTestObject('Form Submit/Dropdown-City'))
WebUI.click(findTestObject('Form Submit/Dropdown-City-Jaipur'))

// Click Submit
WebUI.click(findTestObject('Form Submit/Button-Submit'))

// Showing PopUP Submission
WebUI.verifyElementPresent(findTestObject('Form Submit/Popup-Succes'), 5)

// Close Browser
WebUI.closeBrowser()
