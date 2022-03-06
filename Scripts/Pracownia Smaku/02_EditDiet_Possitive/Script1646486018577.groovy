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

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'))

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/city_Sopot'))

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/button_WybierzLowCarbDiet'))

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/calories_1500'))

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/button_Dodaj_EcoBox'))

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/EcoBox_Quantity'), '1')

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/button_NastepnyKrok'))

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/input_DniWeekendowe_Saturdays'))

WebUI.setText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/input_15DaysDiet'), '15')

WebUI.click(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/button_ZapiszZmiany'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_NameOfDiet'), 'Dieta Low Carb')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summarry_Meals'), '4 posiłki•')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Calories'), '1500')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Date'), '7.03.2022 - 25.03.2022')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Days'), '15')

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/summary_Additives'), 'Dodatki:')

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/summary_AdditivesType'), '1x WYMIENIAM PUDEŁKA PLASTIKOWE NA EKO')

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/summary_AdditivesPrice'), '105,00')

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/summary_DietQuantity'), '1')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_Price'), '1125,00')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_PricePerDay'), '75,00 zł / dzień')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summaryTitle_Podsumowanie'), 'Podsumowanie')

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/summary_SumaZamowienia'), 'Suma zamówienia')

WebUI.verifyElementText(findTestObject('02_PracowniaSmaku_EditDiet_Possitive/summary_SumaZamowieniaPrice'), '1230,00 zł')

WebUI.verifyElementPresent(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_PrzejdzDoPodsumowania'), 0)

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_PrzejdzDoPodsumowania'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'), 'Zmień dietę')

WebUI.verifyElementPresent(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'), 0)

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_ZmienDiete'))

WebUI.verifyElementText(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajKolejnaDiete'), 'Usuń dietę')

WebUI.verifyElementPresent(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajKolejnaDiete'), 0)

WebUI.verifyElementClickable(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_DodajKolejnaDiete'))

