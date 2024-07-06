import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.channels.SelectableChannel as SelectableChannel
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@123')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003130')

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(4, FailureHandling.OPTIONAL)

WebDriver driver = DriverFactory.getWebDriver()

String excelFilePath = 'C:/Users/I1675/Downloads/New folder (4)/Income_BNPL.xlsx'

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
            
            String occType = row.getCell(0).getStringCellValue()

            Cell basicIncomeCell = row.getCell(1)

            Cell fixedAllowanceCell = row.getCell(2)

            Cell variableAllowanceCell = row.getCell(5)

            Cell industryAllowanceCell = row.getCell(11)

            Cell salaryAllowanceCell = row.getCell(17)

            Cell businessExpensesCell = row.getCell(14)

            Cell otherIncomeCell = row.getCell(24)
			
			Cell dividendCell = row.getCell(20)
			
			Cell rentalCell = row.getCell(19)
			
			Cell otherCell = row.getCell(21)	

            System.out.println((((((((('Row ' + (rowIndex + 1)) + ': occType=') + occType) + ', basicIncomeCell=') + basicIncomeCell) + 
                ', fixedAllowanceCell=') + fixedAllowanceCell) + ', variableAllowanceCell=') + variableAllowanceCell)

            if ((((((basicIncomeCell == null) || (fixedAllowanceCell == null)) || (variableAllowanceCell == null)) || (industryAllowanceCell == 
            null)) || (businessExpensesCell == null)) || (otherIncomeCell == null) || (dividendCell == null) || (rentalCell == null) || (otherCell == null)) {
                System.out.println('Error: Null cell found in row ' + (rowIndex + 1))

                continue
            }
            
            double basicIncome = basicIncomeCell.getNumericCellValue()

            double fixedAlowance = fixedAllowanceCell.getNumericCellValue()

            double variableAlowance = variableAllowanceCell.getNumericCellValue()

            double industryAverage = industryAllowanceCell.getNumericCellValue()

            double salaryAlowance = salaryAllowanceCell.getNumericCellValue()

            double businessExpenses = businessExpensesCell.getNumericCellValue()

            double otherIncome = otherIncomeCell.getNumericCellValue()
			
			double dividendIncome = dividendCell.getNumericCellValue()
			
			double rentalIncome = dividendCell.getNumericCellValue()
			
			double other = otherCell.getNumericCellValue()

            try {
				
                WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                    FailureHandling.OPTIONAL)

                WebUI.delay(2)

                List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

                boolean optionFound = false

                for (WebElement option : options) {
                    if (option.getText().contains(occType)) {
                        option.click()
                        optionFound = true
                        System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
                        break;
                    }
                }
                
                if (!optionFound) {
					
					WebUI.refresh(FailureHandling.OPTIONAL)			
						
					//driver.findElement(By.xpath("//span[text()='Employed Contractual']")).click()
					
					//driver.findElement(By.xpath("//mat-option/span[text()='Employed Full Time']")).click()
					
					
					WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'),
						5, FailureHandling.OPTIONAL)
					
					WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'))
					
					WebUI.delay(3)
					
					WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))
					
					WebUI.delay(1)
					
					List<WebElement> options2 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

                    for (WebElement currentOption : options2) {
                        if (currentOption.getText().contains(occType)) {
                            currentOption.click()
                            System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
							
                        }
                    }
					
                }
                
                if ((occType.equals('Employed Contractual') || occType.equals('Employed Full Time')) || occType.equals('Employed Part Time')) {
					
                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Basic_Salary'), 
                        String.valueOf(basicIncome))

                    System.out.println(('Success: Basic Income \'' + basicIncome) + '\'')

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Fixed_alowance'), 
                        String.valueOf(fixedAlowance))

                    System.out.println(('Success: Fixed Alowance \'' + fixedAlowance) + '\'')

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Variable_Alowance'), 
                        String.valueOf(variableAlowance))

                    System.out.println(('Success: Variable Alowance \'' + variableAlowance) + '\'')

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/Back_Button_next to save'))

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                        5, FailureHandling.OPTIONAL)
				
                }
                
                if (occType.equals('Self employed No Permit') || occType.equals('Self employed With Permit')) {
                    
					WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Industry_Average'), 
                        String.valueOf(industryAverage))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Salary_Income'), 
                        String.valueOf(salaryAlowance))

                    WebUI.delay(1)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Self_Emp'))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Business_Expenses'), 
                        String.valueOf(businessExpenses))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Other_Income'), 
                        String.valueOf(otherIncome))

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/Text_Rent_IfAny'), 
                        5)
					
					WebUI.delay(2)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_button_next_toSave'))
					
					WebUI.delay(1)
					
                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_Income_page'), 
                        6, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_Income_page'))
					
					WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'),
						5, FailureHandling.OPTIONAL)
					
                }
				
				if(occType.equals("Pensioner") || occType.equals("Unemployed")) {
					
					WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'))
					
					WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Dividend'), 
                        String.valueOf(dividendIncome))
					
					WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Rental_Income'),
						String.valueOf(rentalIncome))
					
					WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/textbox_Other'),
						String.valueOf(other))
					
					WebUI.delay(2)
					
					WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/Pensioner_Back_Button'))		
				
					WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'),
						5, FailureHandling.OPTIONAL)
					
					
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

