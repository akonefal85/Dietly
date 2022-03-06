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

WebUI.click(findTestObject('01_PracowniaSmaku_AddDiet_Possitive/button_UsunDiete'))

WebUI.verifyElementText(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Title'), 'Usuń dietę')

WebUI.verifyElementText(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Description'), 'Czy na pewno chcesz usunąć dietę z koszyka?')

WebUI.verifyElementVisible(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Button_Anuluj'))

WebUI.verifyElementClickable(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Button_Anuluj'))

WebUI.verifyElementVisible(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Button_UsunDiete'))

WebUI.verifyElementClickable(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Button_UsunDiete'))

WebUI.click(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/DeleteModal_Button_UsunDiete'))

WebUI.verifyElementText(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/PageOfSuccess_Description'), 'Wygląda na to, że nie masz żadnej diety w koszyku')

WebUI.verifyElementText(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/PageOfSuccess_DodajPierwszaDiete'), 'Dodaj pierwszą dietę')

WebUI.verifyElementVisible(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/PageOfSuccess_Button_DodajPierwszaDiete'))

WebUI.verifyElementClickable(findTestObject('03_PracowniaSmaku_DeleteDiet_Possitive/PageOfSuccess_Button_DodajPierwszaDiete'))

