import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.ElementOption
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.NoSuchElementException
import java.util.List
import io.appium.java_client.touch.TapOptions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.Keys as Keys
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException


Mobile.tapAtPosition(142, 481, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 10, FailureHandling.OPTIONAL)

AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

String excelFilePath = 'C:/Users/I1675/Downloads/Split_Pay_Automation.xlsx'

boolean defaultOptionClicked = false;

try {
	
    FileInputStream fis = new FileInputStream(excelFilePath)

    Workbook workbook = new XSSFWorkbook(fis)

    for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
        Sheet sheet = workbook.getSheetAt(sheetIndex)

        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex)

            if (row == null) {
                continue
            }
//change the path when its run in another local system
	
	String currentlyEmp = row.getCell(0).getStringCellValue()
	
	String occType = row.getCell(1).getStringCellValue()
		
		String businessType = row.getCell(2).getStringCellValue()
	
		String empName = row.getCell(3).getStringCellValue()
	
		String indType = row.getCell(4).getStringCellValue()
	
		String secType = row.getCell(5).getStringCellValue()
	
		String jobType = row.getCell(6).getStringCellValue()
	
		String jobTitles = row.getCell(7).getStringCellValue()
		
		String levelEdu = row.getCell(9).getStringCellValue()
		
		String mentionedOccup = row.getCell(24).getStringCellValue()
		
		Cell basicincomeCell = row.getCell(10)
		
		Cell fixedallowanceCell = row.getCell(11)
		
		Cell variableallowanceCell = row.getCell(12)
		
		Cell expenseAmt = row.getCell(14)
		
		Cell pensionerInc = row.getCell(19)
		
		Cell rentPensioner = row.getCell(20)
		
		Cell divPensioner = row.getCell(21)
		
		Cell othPensioner = row.getCell(22)
		
		Cell rentexpPensioner = row.getCell(23)
		
		Cell otherRent = row.getCell(25)
		
		Cell incDividend = row.getCell(26)
		
		Cell incOther = row.getCell(27)
		
		Cell expRent = row.getCell(28)
		
		
		System.out.println((((((((('Row ' + (rowIndex + 1)) + ': occType=') + occType) + ', basicincomeCell=') + basicincomeCell) +
			', fixedallowanceCell=') + fixedallowanceCell) + ', variableallowanceCell=') + variableallowanceCell)
		
		if ((basicincomeCell == null) || (fixedallowanceCell == null) || (variableallowanceCell == null))  {
				System.out.println('Error: Null cell found in row ' + (rowIndex + 1))

				continue
			}
			
						double basicIncome = basicincomeCell.getNumericCellValue()
			
						double fixedAlowance = fixedallowanceCell.getNumericCellValue()
			
						double variableAlowance = variableallowanceCell.getNumericCellValue()
						
						double expenseAmount = expenseAmt.getNumericCellValue()
						
						double penIncome = pensionerInc.getNumericCellValue()
						
						double rentPen = rentPensioner.getNumericCellValue()
						
						double dividendPen = divPensioner.getNumericCellValue()
						
						double othersPen = othPensioner.getNumericCellValue()
						
						double rentexpPen = rentexpPensioner.getNumericCellValue()
						
						double otherRentUnemp = otherRent.getNumericCellValue()
						
						double dividendUnemp = incDividend.getNumericCellValue()
						
						double incotherUnemp = incOther.getNumericCellValue()
						
						double exprentUnemp = expRent.getNumericCellValue()
						
						
			try {
			
			Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0)
			
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept  Continue_1(1)'), 0)
			
			Mobile.waitForElementPresent(findTestObject('Split_Pay/androidx.recyclerview.widget.RecyclerView_List_CurrentlyEmp'),
				30, FailureHandling.OPTIONAL)
			
	        Mobile.delay(15, FailureHandling.OPTIONAL)
			
			//Are you currently Employed?
			
			List<MobileElement> options = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			System.out.println("Number of options found: " + options.size())
			
			for (MobileElement option : options) {
				
				String optionText = option.getText().trim()
				System.out.println("Option text: " + optionText)
			}

			boolean optionFound = false;
			
			for (MobileElement option : options) {
				
				String optionText = option.getText().trim()
				System.out.println("Option text: " + optionText)
								
				// Check if the optionText matches "Yes" or "No"
				if (optionText.contains(currentlyEmp)) 
				{
					String radioButtonXPath = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", currentlyEmp)
					MobileElement radioButton = driver.findElementByXPath(radioButtonXPath)
					radioButton.click()
					optionFound = true
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Current_Emp'), 0)
					System.out.println(('Success: Currently Employed \'' + currentlyEmp) + '\' is selected')
					executeSalaried(driver, occType, businessType, empName, indType, secType, jobType, jobTitles, levelEdu, basicIncome, fixedAlowance, variableAlowance, expenseAmount)
					break;	
				}
				
				if (!optionFound) {
					
					String radioButtonXPath0 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", currentlyEmp)
					MobileElement radioButton0 = driver.findElementByXPath(radioButtonXPath0)
					radioButton0.click()
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Current_Emp'), 0)
					System.out.println(('Success: Currently Employed \'' + currentlyEmp) + '\' is selected')
					Mobile.delay(5)
					
					if (occType.equals("Pensioner")) {
						
						Mobile.tap(findTestObject("Split_Pay/android.widget.RadioButton_Pensioner"), 5)
						
						executePensioner(penIncome, rentPen, dividendPen, othersPen, rentexpPen)
								
					}
					else if (occType.equals("Unemployed")) {
						
						Mobile.tap(findTestObject("Split_Pay/android.widget.RadioButton_Unemployed"), 5)
						
						executeUnemployed(mentionedOccup, otherRentUnemp, dividendUnemp, incotherUnemp, exprentUnemp)
						
					}
					
					break;
					
				}
				
			}
			
			}
			catch (StaleElementReferenceException e) {
				System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())
		
				continue
			}
			
		catch (NoSuchElementException e) {
			System.out.println('NoSuchElementException occurred: ' + e.getMessage())
	
			continue
		}
			}
		}
	}
	
	catch (IOException e) {
		e.printStackTrace()
	}
	
private void executeSalaried(AppiumDriver driver, String occType, String businessType, String empName, String indType, String secType, String jobType, String jobTitles, String levelEdu, double basicIncome, double fixedAlowance, double variableAlowance, double expenseAmount) {			
			
			
			Mobile.delay(3)
			
			//Tapping on Employment Status
			
			List<MobileElement> options1 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option1 : options1) {
				String optionText1 = option1.getText().trim()
				System.out.println("Option text: " + optionText1)			
				
				}
				
			boolean optionFound1 = false;
				
			for (MobileElement option1 : options1) {
				String optionText1 = option1.getText().trim()
				System.out.println("Option text: " + optionText1)
				if(optionText1.equalsIgnoreCase(occType)) {
					String radiobuttonXPath = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", occType)
					MobileElement radioButtonOption = driver.findElementByXPath(radiobuttonXPath)
					radioButtonOption.click()
					optionFound1 = true
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Emp_Status'), 0)
					System.out.println(('Success: Employment Status \'' + occType) + '\' is selected')
					break;	
				}
				
				if (!optionFound1) {
					System.out.println("option is not found in Employment Status");
				}
			}
			
			//Tapping on Type of Company
			
			Mobile.delay(2)	
			
			List<MobileElement> options2 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option2 : options2) {
				String optionText2 = option2.getText().trim()
				System.out.println("Option text: " + optionText2)				
			}
			
			boolean optionFound2 = false
			
			for (MobileElement option2 : options2) {
				
				String optionText2 = option2.getText().trim()
				System.out.println("Option text: " + optionText2)
				if(optionText2.equalsIgnoreCase(businessType)) {
					String radiobuttonXPath1 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", businessType)
					MobileElement radioButtonOption1 = driver.findElementByXPath(radiobuttonXPath1)
					radioButtonOption1.click()
					optionFound2 = true
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Type_Of_Company'), 0)
					System.out.println(('Success: Type of company \'' + businessType) + '\' is selected')
					break;
					
				}
				
			}
			
			//Entering on Employer Name
			
			Mobile.delay(5)
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - Start Typing Company Name'), empName, 0)
			System.out.println(('Success: Employer Name \'' + empName) + '\' is entered')
			Mobile.pressBack()
			Mobile.hideKeyboard()
			Mobile.delay(5)
			Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button_Next_Name_Of_Emp'), 10)
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Name_Of_Emp'), 5)
			
			//Tapping Industry
			
			Mobile.delay(3)
			
			Mobile.scrollToText(indType, FailureHandling.OPTIONAL)
			
			Mobile.delay(3)
			
			List<MobileElement> options3 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option3 : options3) {
				String optionText3 = option3.getText().trim()
				System.out.println("Option text: " + optionText3)
			}
			
			boolean optionFound3 = false
			
			for (MobileElement option3 : options3) {
				String optionText3 = option3.getText().trim()
				System.out.println("Option text: " + optionText3)
				
				if(optionText3.equalsIgnoreCase(indType)) {
					String radiobuttonXPath2 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", indType)
					MobileElement radioButton2 = driver.findElementByXPath(radiobuttonXPath2)
					Mobile.delay(2)
					Mobile.scrollToText(indType, FailureHandling.OPTIONAL)
					Mobile.delay(1)
					radioButton2.click()
					optionFound3 = true
					System.out.println(('Success: Industry \'' + indType) + '\' is selected')
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Industry'), 5)
					break;					
				}
			}
			
			//Tapping Sector
			
			Mobile.delay(3)
			
			Mobile.scrollToText(secType, FailureHandling.OPTIONAL)
			
			Mobile.delay(3)
			
			List<MobileElement> options4 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option4 : options4) {
				String optionText4 = option4.getText().trim()
				System.out.println("Option text: " + optionText4)
			}
			
			boolean optionFound4 = false
			
			for (MobileElement option4 : options4) {
				String optionText4 = option4.getText().trim()
				System.out.println("Option text: " + optionText4)
				
				if(optionText4.equalsIgnoreCase(secType)) {
					String radioButtonXPath3 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", secType)
					MobileElement radioButton3 = driver.findElementByXPath(radioButtonXPath3)
					Mobile.scrollToText(secType, FailureHandling.OPTIONAL)
					Mobile.delay(1)
					radioButton3.click()
					optionFound4 = true
					System.out.println(('Success: Sector \'' + secType) + '\' is selected')
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Sector'), 5)
					break;
				}
			}
			
			//Tapping JobType
			
			Mobile.delay(3)
			
			Mobile.scrollToText(jobType, FailureHandling.OPTIONAL)
			
			Mobile.delay(3)
			
			List<MobileElement> options5 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option5 : options5) {
				String optionText5 = option5.getText().trim()
				System.out.println("Option text: " + optionText5)
			}
			
			boolean optionFound5 = false
			
			for (MobileElement option5 : options5) {
				String optionText5 = option5.getText().trim()
				System.out.println("Option text: " + optionText5)
				
				if(optionText5.equalsIgnoreCase(jobType)) {
					String radioButtonXPath4 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", jobType)
					MobileElement radioButton4 = driver.findElementByXPath(radioButtonXPath4)
					radioButton4.click()
					optionFound5 = true
					System.out.println(('Success: JobType \'' + jobType) + '\' is selected')
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Job_Type'), 5)
					break;
				}
			}
			
			//Tapping JobTitle
			
			Mobile.delay(3)
			
			Mobile.scrollToText(jobTitles, FailureHandling.OPTIONAL)
			
			Mobile.delay(3)
			
			List<MobileElement> options6 = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView")
			
			for (MobileElement option6 : options6) {
				String optionText6 = option6.getText().trim()
				System.out.println("Option text: " + optionText6)
			}
			
			boolean optionFound6 = false
			
			for (MobileElement option6 : options6) {
				String optionText6 = option6.getText().trim()
				System.out.println("Option text: " + optionText6)
				
				if(optionText6.equalsIgnoreCase(jobTitles)) {
					String radioButtonXPath5 = String.format("//android.widget.TextView[@text='%s']/../android.widget.RadioButton", jobTitles)
					MobileElement radioButton5 = driver.findElementByXPath(radioButtonXPath5)
					Mobile.scrollToText(jobTitles, FailureHandling.OPTIONAL)
					Mobile.delay(1)
					radioButton5.click()
					optionFound6 = true
					System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')
					Mobile.delay(2)
					Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Job_Title'), 5)
					break;
				}
			}
		
			//Entering Years of Occupation and selecting
			
			Mobile.delay(5)
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - Years in Occupation'), '7', 0)
			Mobile.pressBack()
			Mobile.hideKeyboard()
			Mobile.delay(5)
			Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button_Next_Years_In_Occupation'), 10)
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Years_In_Occupation'), 5)
			
			//Tapping Level of Education
			
			Mobile.delay(3)
			Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Level_Of_Edu'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Next_Level_of_Edu'), 5)
			
			//Entering Income
			
			
			Mobile.delay(5)
			
			if(occType.equals("Employed Contractual") || occType.equals("Employed Full Time") || occType.equals("Employed Part Time")) {
				
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Basic_Income'), 5)			
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Basic_Income'), String.valueOf(basicIncome), 5)
			System.out.println(('Success: JobTitle \'' + basicIncome) + '\' is selected')
			
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Fixed_Allowance'), 5)
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Fixed_Allowance'), String.valueOf(fixedAlowance), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(2)
			Mobile.scrollToText("Variable allowances")
			Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.EditText - 0.0_Variable_Allowance'), 10)
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Variable_Allowance'), 5)
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Variable_Allowance'), String.valueOf(variableAlowance), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(2)
			Mobile.scrollToText("Expenses")
			Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.EditText - 0.0_Expenses'), 10)
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Expenses'), 5)
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Expenses'), String.valueOf(expenseAmount), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.scrollToText("Rent(If any)")
			Mobile.delay(2)
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Monthly_Income'), 5)
			
			}	
			
			if (occType.equals('Self employed No Permit') || occType.equals('Self employed With Permit')) {
			
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Salary_Income'), 5)			
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Salary_Income'), String.valueOf(basicIncome), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(2)
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Business_Expenses'), 5)			
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Business_Expenses'), String.valueOf(basicIncome), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(2)
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_HouseHold_Exp'), 5)			
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_HouseHold_Exp'), String.valueOf(basicIncome), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(2)	
			Mobile.clearText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Rent_Exp'), 5)			
			Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - 0.0_Rent_Exp'), String.valueOf(basicIncome), 5)
			Mobile.hideKeyboard(FailureHandling.OPTIONAL)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Self_Emp'), 5)	
			}
		
}					
			
private void executePensioner(double penIncome, double rentPen, double dividendPen, double othersPen, double rentexpPen) {
	
	Mobile.tap(findTestObject("Split_Pay/android.widget.Button_Next_Current_Emp"), 0)
	
	//Pension/Income
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Pensioner_Income"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Pensioner_Income"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Pensioner_Income"), String.valueOf(penIncome), 0)
	Mobile.hideKeyboard()
	
	//Other Rent(If any)
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Other_Pensioner"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Other_Pensioner"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Other_Pensioner"), String.valueOf(rentPen), 0)
	Mobile.hideKeyboard()
	
	//Dividend_Pensioner
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Pensioner"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Pensioner"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Pensioner"),String.valueOf(dividendPen) ,20)
	Mobile.hideKeyboard()
	
	//Others_Pensioner
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Pensioner"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Pensioner"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Pensioner"),String.valueOf(othersPen) ,20)
	Mobile.hideKeyboard()
	Mobile.delay(2)
	Mobile.scrollToText("Expenses")
	
	//Expenses Rent(If any)
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Pensioner"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Pensioner"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Pensioner"),String.valueOf(rentexpPen) ,20)
	Mobile.hideKeyboard()
	Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Pensioner_Next'), 5)
	
}

private executeUnemployed(String mentionedOccup, double otherRentUnemp, double dividendUnemp, double incotherUnemp, double exprentUnemp) {
	
	Mobile.tap(findTestObject("Split_Pay/android.widget.Button_Next_Current_Emp"), 0)
	
	//Mention Occupation textbox
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText_Occupation_Unemployed"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText_Occupation_Unemployed"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText_Occupation_Unemployed"), mentionedOccup, 0)
	Mobile.hideKeyboard()
	
	//Other Rent(If any)
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Unemployed"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Unemployed"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Unemployed"), String.valueOf(otherRentUnemp), 0)
	Mobile.hideKeyboard()
	
	//Dividend
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Unemployed"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Unemployed"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Dividend_Unemployed"), String.valueOf(dividendUnemp), 0)
	Mobile.hideKeyboard()
	
	//Others
	
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Unemployed"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Unemployed"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Others_Unemployed"), String.valueOf(incotherUnemp), 0)
	Mobile.hideKeyboard()
	
	//Rent Expenses
	
	Mobile.scrollToText("Expenses")
	Mobile.waitForElementPresent(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Unemployed"), 20)
	Mobile.clearText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Unemployed"), 0)
	Mobile.setText(findTestObject("Split_Pay/android.widget.EditText - 0.0_Rent_Exp_Unemployed"), String.valueOf(exprentUnemp), 0)
	Mobile.hideKeyboard()
	
	Mobile.tap(findTestObject("Split_Pay/android.widget.RadioButton_Unemployed"), 5)
	
}
