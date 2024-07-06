AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver();

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping_Mofinans.xlsx', 'Sheet1', true);

// Change the path when it's run on another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
    String currentlyEmp = excelData.getValue('Currently_Employed', row);
    try {
        Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0);
        Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0);
        Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0);
        Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_4'), 0);
        Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Accept  Continue_1(1)'), 0);
        
        Mobile.waitForElementPresent(findTestObject('Split_Pay/androidx.recyclerview.widget.RecyclerView_List_CurrentlyEmp'), 30, FailureHandling.OPTIONAL);
        
        Mobile.delay(30, FailureHandling.OPTIONAL);
        
        // Fetching options using refined XPath
        List<MobileElement> options = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView");
        
        System.out.println("Number of options found: " + options.size());
        
        boolean optionFound = false;
        
        for (MobileElement option : options) {
            String optionText = option.getText().trim();
            System.out.println("Option text: " + optionText);
            // Check if the optionText matches "Yes" or "No"
            if (optionText.equalsIgnoreCase("Yes") || optionText.equalsIgnoreCase("No")) {
                option.click();
                optionFound = true;
                System.out.println("Success: Occupation '" + optionText + "' is selected");
                break;
            }
        }
        
        // If neither "Yes" nor "No" option was found
        if (!optionFound) {
            System.out.println("Neither 'Yes' nor 'No' option found");
        }
    } catch (StaleElementReferenceException e) {
        System.out.println("StaleElementReferenceException occurred: " + e.getMessage());
        continue;
    } catch (NoSuchElementException e) {
        System.out.println("NoSuchElementException occurred: " + e.getMessage());
        continue;
    } 
}
