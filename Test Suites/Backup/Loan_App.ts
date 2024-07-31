<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Loan_App</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>HUAWEI AUM-AL20 (Android 8.0.0)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>XUV3Y18823081393</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Backup/Loan_Application_Mobile</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>Admin_Profile</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Backup/Admin_Portal</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
