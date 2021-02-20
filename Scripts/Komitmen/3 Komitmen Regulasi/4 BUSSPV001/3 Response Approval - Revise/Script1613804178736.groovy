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

WebUI.openBrowser('http://52.187.13.67/RecomApp/Default.aspx')

WebUI.navigateToUrl('http://52.187.13.67/RecomApp/Default.aspx')

WebUI.setText(findTestObject('99 All/username'), 'BusSpv001')

WebUI.setEncryptedText(findTestObject('99 All/password'), 'pycBWYkBdz+DVJF5JmK6Mw==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('99 All/sign In'))

WebUI.delay(5)

WebUI.refresh()

WebUI.setText(findTestObject('99 All/filter'), 'Komitmen Regulasi')

WebUI.delay(1)

WebUI.click(findTestObject('1 Komitmen Audit/2 2'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('1 Komitmen Audit/Response Approval/1 Detail'), 3)

WebUI.click(findTestObject('1 Komitmen Audit/Response Approval/1 Detail'))

WebUI.scrollToElement(findTestObject('1 Komitmen Audit/Response Approval/2 Remark'), 3)

WebUI.setText(findTestObject('1 Komitmen Audit/Response Approval/2 Remark'), 'Test Response Approval - Revise')

WebUI.click(findTestObject('1 Komitmen Audit/Approval/5 Revise'))

WebUI.delay(5)

