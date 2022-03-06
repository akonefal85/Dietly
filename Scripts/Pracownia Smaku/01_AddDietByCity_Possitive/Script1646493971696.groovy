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

WebUI.navigateToUrl('https://dietly.pl/')

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/CookieButton_OK'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/city_Gdynia'))

WebUI.waitForElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZamowOnline'), 7)

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZamowOnline'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_Wybierz'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/calories_1800'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_NastepnyKrok'))

WebUI.setText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/input_14DaysOfDiet'), '14')

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/div_Calendar'))

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajDoKoszyka'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_NameOfDiet'), 'ŚRÓDZIEMNOMORSKA•')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summarry_Meals'), '5P•')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Calories'), '1800 kcal')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Date'), '7.03.2022 - 22.03.2022')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Days'), '14 dni')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Price'), '1050,00 zł')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_PricePerDay'), '75,00 zł / dzień')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summaryTitle_Podsumowanie'), 'Podsumowanie')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_SumaZamowienia'), 'Suma zamówienia')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Price'), '1050,00 zł')

WebUI.verifyElementVisible(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_PrzejdzDoPodsumowania'))

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_PrzejdzDoPodsumowania'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'), 'Zmień dietę')

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_UsunDiete'), 'Usuń dietę')

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_UsunDiete'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajKolejnaDiete'), 'Dodaj kolejną dietę')

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajKolejnaDiete'))

