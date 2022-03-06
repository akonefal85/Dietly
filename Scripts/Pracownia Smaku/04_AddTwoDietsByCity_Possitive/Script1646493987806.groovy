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

WebUI.callTestCase(findTestCase('Pracownia Smaku/01_AddDietByCity_Possitive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/button_DodajKolejnaDiete'))

WebUI.click(findTestObject('04_AddTwoDiets/button_Wybierz_VegeDiet'))

WebUI.click(findTestObject('04_AddTwoDiets/button_VegePlusFish'))

WebUI.click(findTestObject('04_AddTwoDiets/calories_2300'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_NastepnyKrok'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/Button_Minus'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/Button_Minus'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/Button_Minus'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/Button_Minus'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/Button_Minus'))

WebUI.click(findTestObject('Object Repository/04_AddTwoDiets/div_Calendar'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajDoKoszyka'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_SumaZamowienia'), 'Suma zamówienia')

WebUI.verifyElementText(findTestObject('04_AddTwoDiets/summary_Sum'), '1420,00 zł')

WebUI.closeBrowser()

