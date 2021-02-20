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

WebUI.openBrowser('http://52.187.13.67/RecomApp/Default.aspx')

WebUI.navigateToUrl('http://52.187.13.67/RecomApp/Default.aspx')

WebUI.setText(findTestObject('99 All/username'), 'com001')

WebUI.setEncryptedText(findTestObject('99 All/password'), 'pycBWYkBdz+DVJF5JmK6Mw==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('99 All/sign In'))

WebUI.delay(5)

WebUI.refresh()

WebUI.setText(findTestObject('99 All/filter'), 'Komitmen Korespondensi')

WebUI.delay(1)

WebUI.click(findTestObject('1 Komitmen Audit/1 1'))

WebUI.click(findTestObject('1 Komitmen Audit/View/Page_/span_Add New Record'))

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/1 Nama Komitmen'), 'Katalon Minion')

WebUI.setText(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/1 Nomor Surat'), '61288821')

WebUI.setText(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/2 Subject'), 'CcSubjek')

WebUI.setText(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/3 Sender'), 'Xender')

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/2 Short Description'), 'Testing Automation')

WebUI.setText(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/4 Tanggal Surat'), '5/19/2021')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/4 Tanggal Surat'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/5 Tanggal Surat Diterima'), '5/30/2021')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/5 Tanggal Surat Diterima'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/10 Compliance Supervisior'), 'UComSpv001')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('1 Komitmen Audit/View/Page_/10 Compliance Supervisior'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/9 Responsible Supervisor'), 'UBusSpv001')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('1 Komitmen Audit/View/Page_/9 Responsible Supervisor'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/8 Responsible Business User'), 'UBus001')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('1 Komitmen Audit/View/Page_/8 Responsible Business User'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/13 Legal Basis'), 'Basis Legal')

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/14 Penalti'), 'Free Kick')

WebUI.scrollToElement(findTestObject('1 Komitmen Audit/View/Page_/15 Attach'), 0)

WebUI.uploadFile(findTestObject('1 Komitmen Audit/View/Page_/15 Attach'), 'D:\\antivirus.png')

WebUI.setText(findTestObject('1 Komitmen Audit/View/Page_/16 Template Reminder'), 'Komitmen Korespondensi templet')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('1 Komitmen Audit/View/Page_/16 Template Reminder'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2 Komitmen Data Regulator/1 View/6 Target Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('4 Komitmen Korespondensi (undone Bug Stopper)/1 View/6 Today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('99 All/Submit'))

WebUI.delay(5)

