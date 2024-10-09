import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.Keys as Keys
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.MobileElement
import org.openqa.selenium.By
import com.kms.katalon.core.testobject.TestObject
import java.util.List
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.tapAtPosition(142, 481, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping_Mofinans.xlsx', 'Sheet1', 
    true)

//change the path when its run in another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
	
    String currentlyEmp = excelData.getValue('Currently_Employed', row)

	String occType = excelData.getValue('Occupation_Type', row)
	
	String businessType = excelData.getValue('Business_Type', row)

	String empType = excelData.getValue('Employer_Type', row)

	String indType = excelData.getValue('Industry_Type', row)

	String secType = excelData.getValue('Sector_Type', row)

	String jobType = excelData.getValue('Job_Type', row)

	String jobTitles = excelData.getValue('Job_Titles', row)
    
	try {
		
		Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 10, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)
		
		Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)
		
		Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)
		
		Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0)
		
		Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept Continue_1'), 0)
		
        Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Details_Currently_Employed_Yes'), 
            20, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.OPTIONAL)
		
		//Are you currently Employed?
		

        if (currentlyEmp.equals('Yes') || currentlyEmp.equals('No')) {
            if (currentlyEmp.equals('Yes')) {
                
				Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Details_Currently_Employed_Yes'), 0)

                System.out.println(('Success: Currently Employed \'' + currentlyEmp) + '\' is selected')
            } else if (currentlyEmp.equals('No')) {
                
				Mobile.tapAtPosition(90, 630, FailureHandling.STOP_ON_FAILURE)

                System.out.println(('Success: Occupation \'' + currentlyEmp) + '\' is selected')
            }
			else {
				System.out.println("Invalid option for 'Currently_Employed': " + currentlyEmp)
				continue; // Skip to the next iteration if the value is neither 'Yes' nor 'No'
			}
        } 

		/*/Mobile.delay(4, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Split_Pay/android.widget.Button_Emp_Details_Next'), 0, FailureHandling.STOP_ON_FAILURE)
		
		//Tapping Employment Status
		
			if(occType.equals("Employed Contractual") || occType.equals("Employed Full Time") || occType.equals("Employed Part Time") || occType.equals("Self Employed No Permit") || occType.equals("Self Employed No Permit")) {
				
				if(occType.equals("Employed Contractual")) {
					
					Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Emp_Contractual'), 0)
					System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
					
				}
				else if (occType.equals("Employed Full Time")) {
					
					
				
				}
				
				
			}

		WebUI.delay(2)

		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'), FailureHandling.OPTIONAL)

		List<WebElement> options1 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

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

		List<WebElement> options2 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

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
		
		if (!(indFound)) {
			System.out.println(('Error: Industry \'' + indType) + '\' not found in Industry Type dropdown')
		}
		
		WebUI.delay(2)

		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))

		WebUI.delay(2)

		List<WebElement> options3 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

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
		
		WebUI.delay(2)

		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))

		List<WebElement> options4 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

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

		List<WebElement> options5 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

		boolean jobtitleFound = false

		for (WebElement option5 : options5) {
			if (option5.getText().contains(jobTitles)) {
					((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option5)

				option5.click()

				jobtitleFound = true

				System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')

				//WebUI.refresh()

				break
			}
		}
		
		if (!(jobtitleFound)) {
			System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
		}/*/
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


