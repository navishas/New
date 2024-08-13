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

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@12345')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.delay(4, FailureHandling.OPTIONAL)

WebDriver driver = DriverFactory.getWebDriver()

String excelFilePath = 'C:/Users/I1675/Downloads/Income_BNPL01_LOS.xlsx'

boolean defaultOptionClicked = false

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
            
            String firstName = row.getCell(0).getStringCellValue( //getting the firstName row from excel
                )

            String lastName = row.getCell(1).getStringCellValue( //getting the lastName row from excel
                )

            String mobileNumber = row.getCell(2).getStringCellValue( //getting the mobile numbers row from excel
                )

            String nicId = row.getCell(3).getStringCellValue( //getting the nationalId row from excel
                )

            String occType = row.getCell(4).getStringCellValue()

            String businessType = row.getCell(5).getStringCellValue()

            String empType = row.getCell(6).getStringCellValue()

            String indType = row.getCell(7).getStringCellValue()

            String secType = row.getCell(8).getStringCellValue()

            String jobType = row.getCell(9).getStringCellValue()

            String jobTitles = row.getCell(10).getStringCellValue()

            Cell basicIncomeCell = row.getCell(13)

            Cell fixedAllowanceCell = row.getCell(14)

            Cell variableAllowanceCell = row.getCell(15)

            Cell otherCell = row.getCell(18)

            Cell salarySelfemp = row.getCell(19)

            Cell avgSelfEmp = row.getCell(20)

            Cell otherIncSelfEmp = row.getCell(21)
			
			Cell businessExpensesCell = row.getCell(22)

            Cell houseExpSelfEmp = row.getCell(23)

            Cell rentExpSelfEmp = row.getCell(24)

            Cell deductionSelfEmp = row.getCell(25)
			
			Cell dividendPensioner = row.getCell(26)
			
			Cell rentalIncome = row.getCell(27)
			
			Cell salaryIncomeCell = row.getCell(28)
			
			Cell otherIncomeCell = row.getCell(29)
			
			Cell rentalExpPens = row.getCell(30)
			
			Cell deductionsPens = row.getCell(31)
			
			Cell industryAllowanceCell = row.getCell(32)
			
            System.out.println((((((((('Row ' + (rowIndex + 1)) + ': occType=') + occType) + ', basicIncomeCell=') + basicIncomeCell) + 
                ', fixedAllowanceCell=') + fixedAllowanceCell) + ', variableAllowanceCell=') + variableAllowanceCell)

            if (((((((((basicIncomeCell == null) || (fixedAllowanceCell == null)) || (variableAllowanceCell == null)) || 
            (industryAllowanceCell == null)) || (businessExpensesCell == null)) || (otherIncomeCell == null)) || (dividendPensioner == 
            null)) || (rentalIncome == null)) || (otherCell == null)) {
                System.out.println('Error: Null cell found in row ' + (rowIndex + 1))

                continue
            }
            
            //double mobileNumber = mobileNoCell.getNumericCellValue()
			
            double basicIncome = basicIncomeCell.getNumericCellValue()

            double fixedAlowance = fixedAllowanceCell.getNumericCellValue()

            double variableAlowance = variableAllowanceCell.getNumericCellValue()

            double industryAverage = industryAllowanceCell.getNumericCellValue()
			
			double salaryIncome = salarySelfemp.getNumericCellValue()
			
			double averageBanking = avgSelfEmp.getNumericCellValue()
			
			double otherIncomeSelfEmp = otherIncSelfEmp.getNumericCellValue()
			
			double businessExpenses = businessExpensesCell.getNumericCellValue()
			
			double houseHoldExp = houseExpSelfEmp.getNumericCellValue()
			
			double rentSelfEmp = rentExpSelfEmp.getNumericCellValue()
			
			double deductions = deductionSelfEmp.getNumericCellValue()

            double dividendIncome = dividendPensioner.getNumericCellValue()

            double rentalIncomePensioner = rentalExpPens.getNumericCellValue()

            double other = otherCell.getNumericCellValue()
			
			

            try {
                WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'), 
                    20)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'))

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Register_BNPL'))

                WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Get Details From_firstName'), 
                    firstName)

                WebUI.delay(4)

                WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Last_Name'), lastName)

                WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_Gender'), 5)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Male'))

                WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Mobile_Number'), mobileNumber)

                WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_DOB'), 5)

                WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Date_Of_Birth'), '11 Jul 1982')

                WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_Marital Status'))

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Married'))

                WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Identifier_Selection'), 
                    0)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/Select_Identifier_Selection'))

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/Select_NIC'))

                WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_NIC'), nicId)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create Lead'))

                WebUI.delay(8, FailureHandling.OPTIONAL)

                WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'), 
                    5, FailureHandling.OPTIONAL)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'))

                WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'), 
                    5, FailureHandling.OPTIONAL)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'))

                WebUI.delay(10)

                WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Skip_Task_button'))

                WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                    10, FailureHandling.OPTIONAL)

                WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Scroll_to_emp'), 
                    5)

                WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                    FailureHandling.OPTIONAL)

                WebUI.delay(2)

                List<WebElement> options = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

                System.out.println('Number of options found: ' + options.size())

                boolean optionFound = false

                for (WebElement option : options) {
                    String optionText = option.getText().trim()

                    System.out.println('Option text: ' + optionText)

                    if (optionText.contains(occType)) {
                        option.click()

                        optionFound = true

                        System.out.println(('Success: Occupation \'' + occType) + '\' is selected')

                        executeSalaried(driver, occType, businessType, empType, indType, secType, jobType, jobTitles, basicIncome, 
                            fixedAlowance, variableAlowance, industryAverage, salaryAlowance, businessExpenses, otherIncome, 
                            dividendIncome, rentalIncome, other, salaryIncome, averageBanking, otherIncomeSelfEmp, houseHoldExp, 
                            rentSelfEmp, deductions //existing code excution are added in a seperate method excuteSalaried
                            )

                        //call this method when need to execute the existing code
                        break
                    }
                }
                
                if (!(optionFound)) {
                    WebUI.refresh(FailureHandling.OPTIONAL)

                    //driver.findElement(By.xpath("//span[text()='Employed Contractual']")).click()
                    //driver.findElement(By.xpath("//mat-option/span[text()='Employed Full Time']")).click()
                    WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'), 
                        5, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'))

                    WebUI.delay(3)

                    WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))

                    WebUI.delay(1)

                    List<WebElement> options2 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

                    for (WebElement currentOption : options2) {
                        if (currentOption.getText().contains(occType)) {
                            currentOption.click()

                            System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
                        }
                    }
                    
                    if (occType.equals('Pensioner') || occType.equals('Unemployed')) {
                        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'))

                        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Dividend'), String.valueOf(
                                dividendIncome))

                        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Rental_Income'), 
                            String.valueOf(rentalIncome))

                        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Other'), String.valueOf(
                                other))

                        WebUI.delay(2)

                        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Pensioner_Back_Button'))

                        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                            5, FailureHandling.OPTIONAL)
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
//WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Back_Button_next to save'))
//WebUI.refresh()

private void executeSalaried(WebDriver driver, String occType, String businessType, String empType, String indType, String secType, String jobType, String jobTitles, double basicIncome, double fixedAlowance, double variableAlowance, double industryAverage, double salaryAlowance, double businessExpenses, double otherIncome, double dividendIncome, double rentalIncome, double other, double salaryIncome, double averageBanking, double otherIncomeSelfEmp, double houseHoldExp, double rentSelfEmp, double deductions) {
    if ((occType.equals('Employed Contractual') || occType.equals('Employed Full Time')) || occType.equals('Employed Part Time')) {
        WebUI.delay(5)

        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))

        List<WebElement> options0 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean bustypeFound = false

        for (WebElement option0 : options0) {
            if (option0.getText().contains(businessType)) {
                option0.click()

                bustypeFound = true

                System.out.println(('Success: Business Type \'' + businessType) + '\' is selected')

                break
            }
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'), FailureHandling.OPTIONAL)

        List<WebElement> options1 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean empFound = false

        for (WebElement option1 : options1) {
            if (option1.getText().contains(empType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option1)

                option1.click()

                empFound = true

                System.out.println(('Success: Employer \'' + empType) + '\' is selected')

                break
            }
        }
        
        if (!(empFound)) {
            System.out.println(('Error: emp \'' + empType) + '\' not found in Employer Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options2 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean indFound = false

        for (WebElement option2 : options2) {
            if (option2.getText().contains(indType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option2)

                option2.click()

                indFound = true

                System.out.println(('Success: Industry \'' + indType) + '\' is selected')

                break
            }
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))

        WebUI.delay(2)

        List<WebElement> options3 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean sectorFound = false

        for (WebElement option3 : options3) {
            if (option3.getText().contains(secType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option3)

                option3.click()

                sectorFound = true

                System.out.println(('Success: Sector \'' + secType) + '\' is selected')

                break
            }
        }
        
        if (!(sectorFound)) {
            System.out.println(('Error: Sector \'' + secType) + '\' not found in Sector Type dropdown')
        }
        
        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Year_of_Occupation'), '7')

        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))

        List<WebElement> options4 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean jobFound = false

        for (WebElement option4 : options4) {
            if (option4.getText().contains(jobType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option4)

                option4.click()

                jobFound = true

                System.out.println(('Success: JobType \'' + jobType) + '\' is selected')

                break
            }
        }
        
        if (!(indFound)) {
            System.out.println(('Error: JobType \'' + jobType) + '\' not found in Job Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))

        List<WebElement> options5 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean jobtitleFound = false

        for (WebElement option5 : options5) {
            if (option5.getText().contains(jobTitles)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option5)

                option5.click()

                jobtitleFound = true

                System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')

                break
            }
        }
        
        if (!(jobtitleFound)) {
            System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
        }
        
        WebUI.delay(5)

        WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 10)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Basic_Salary'), String.valueOf(basicIncome))

        System.out.println(('Success: Basic Income \'' + basicIncome) + '\'')

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Fixed_alowance'), String.valueOf(
                fixedAlowance))

        System.out.println(('Success: Fixed Alowance \'' + fixedAlowance) + '\'')

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Variable_Alowance'), String.valueOf(
                variableAlowance))

        System.out.println(('Success: Variable Alowance \'' + variableAlowance) + '\'')

        WebUI.delay(3)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'), 
            5, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))

        WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/input_scroll_To_Deductions'), 5)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'), 
            5)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))

        WebUI.delay(2, FailureHandling.OPTIONAL)

        WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'), 
            0)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'), 5, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

        WebUI.delay(10, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            5, FailureHandling.OPTIONAL)
    }
    
    if (occType.equals('Self employed No Permit') || occType.equals('Self employed With Permit')) {
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))

        List<WebElement> options00 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        System.out.println('Number of options found: ' + options00.size())

        for (WebElement option00 : options00) {
            String optionText00 = option00.getText().trim()

            System.out.println('Option text: ' + optionText00)
        }
        
        boolean bustypeFound = false

        for (WebElement option00 : options00) {
            String optionText00 = option00.getText().trim()

            System.out.println('Option text: ' + optionText00)

            if (optionText00.contains(businessType)) {
                option00.click()

                bustypeFound = true

                System.out.println(('Success: Business Type \'' + businessType) + '\' is selected')

                break
            }
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options002 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean indFound = false

        for (WebElement option002 : options002) {
            if (option002.getText().contains(indType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option002)

                option002.click()

                indFound = true

                System.out.println(('Success: Industry \'' + indType) + '\' is selected')

                break
            }
        }
        
        if (!(indFound)) {
            System.out.println(('Error: Industry \'' + indType) + '\' not found in Industry Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))

        WebUI.delay(2)

        List<WebElement> options003 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean sectorFound = false

        for (WebElement option003 : options003) {
            if (option003.getText().contains(secType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option003)

                option003.click()

                sectorFound = true

                System.out.println(('Success: Sector \'' + secType) + '\' is selected')

                break
            }
        }
        
        if (!(sectorFound)) {
            System.out.println(('Error: Sector \'' + secType) + '\' not found in Sector Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Years_in_Occupation'), '7')

        WebUI.delay(2)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))

        List<WebElement> options004 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean jobFound = false

        for (WebElement option004 : options004) {
            if (option004.getText().contains(jobType)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option004)

                option004.click()

                jobFound = true

                System.out.println(('Success: JobType \'' + jobType) + '\' is selected')

                break
            }
        }
        
        if (!(indFound)) {
            System.out.println(('Error: JobType \'' + jobType) + '\' not found in Job Type dropdown')
        }
        
        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_scroll_to_Job_Titles'), 5)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'), 
            10)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))

        List<WebElement> options005 = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option/span'))

        boolean jobtitleFound = false

        for (WebElement option005 : options005) {
            if (option005.getText().contains(jobTitles)) {
                    ((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option005)

                option005.click()

                jobtitleFound = true

                System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')

                break
            }
        }
        
        if (!(jobtitleFound)) {
            System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
        }
        
        WebUI.delay(4)

        WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 10)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'), 
            5, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

        WebUI.waitForElementVisible(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Salary_Income'), 10, 
            FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Salary_Income'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Salary_Income'), String.valueOf(salaryIncome))

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Average_Banking'), String.valueOf(
                averageBanking))

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Other_self_Emp'), String.valueOf(
                other))

        WebUI.scrollToPosition(1602, 900)

        WebUI.delay(2)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'), 
            5, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Business_Expenses'), 
            10, FailureHandling.OPTIONAL)

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Business_Expenses'), String.valueOf(
                businessExpenses))

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_houseHold_Expenses'), String.valueOf(
                houseHoldExp))

        WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Text_Rent_IfAny'), 5)

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Rent_Expenses_Self_Emp'), String.valueOf(rentSelfEmp))

        WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Deductions_self_Emp'), String.valueOf(
                deductions))

        WebUI.delay(2)

        WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/input_scroll_To_Deductions'), 5)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'), 
            5)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))

        WebUI.delay(2, FailureHandling.OPTIONAL)

        WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'), 
            0)

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'), 5, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

        WebUI.delay(10, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))

        WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            5, FailureHandling.OPTIONAL)
    }
}

