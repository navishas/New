Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping.xlsx', 'Sheet1', true)

boolean defaultOptionClicked = false;

for(int row = 1; row <= excelData.getRowNumbers(); row++) {
    String occType = excelData.getValue('Occupation_Type', row)

    try {
        // Click on the dropdown arrow only if it hasn't been clicked before
        if (!defaultOptionClicked) {
            WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))

            // Delay for options to load
            WebUI.delay(3)
        }

        List<WebElement> options = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span"))

        boolean optionFound = false

        for(WebElement option : options) {
            if (option.getText().contains(occType)) {
                option.click();
                optionFound = true
                System.out.println("Success: Occupation '" + occType + "' is selected")
                break;
            }
        }

        if(!optionFound && !defaultOptionClicked) {
            // Click on the default option only if it hasn't been clicked before
            driver.findElement(By.xpath("//mat-option/span[text()='Employed Full Time']")).click()
            defaultOptionClicked = true
            
            // Additional delay for the option to load
            WebUI.delay(2)

            // Click on another element to ensure dropdown arrow visibility
            driver.findElement(By.xpath("//body/app-root[1]/layout[1]/empty-layout[1]/div[1]/div[1]/app-view-workflow[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-dynamic-form-component[1]/mat-stepper[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/span[1]/span[1]")).click()

            // Click on the dropdown again to open it
            WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))

            // Delay for options to load
            WebUI.delay(2)
        }

        List<WebElement> options2 = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span"))
        for(WebElement currentOption : options2) {
            if(currentOption.getText().contains(occType)) {
                currentOption.click()
                System.out.println("Success: Occupation '" + occType + "' is selected")
                WebUI.delay(2)
                // Additional actions if needed
                break
            }
        }
    } catch(StaleElementReferenceException e) {
        System.out.println("StaleElementReferenceException occurred: " + e.getMessage())
        continue
    }
}
