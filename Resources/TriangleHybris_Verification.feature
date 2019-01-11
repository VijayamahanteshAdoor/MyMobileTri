@HybrisVerification

 Feature: Hybris Account Verification
 
 Background: App Hybris signin
 
 
 @Start
 Scenario: Successful Login with Valid Credentials
 Description : Verifying hybris login,Checking home page title
 
 Given Open app 
 When Navigate to sign in page
 And Enter username and Password
 And Click on SignIN button
 Then Verify Hybris Login 
 Then Display message Login Successfully 
 #Then Quit the App
  
 
 
 Scenario: Verify accounts tab 
 Description : Verifying accounts tab ,Checking Title,Card number,CT money ,Recent Tnx
 
 Given App is in home pillar
 When Switch to Accounts tab
 Then Verify accounts title
 Then Verify card title
 Then Verify four digit Card number
 Then Verify CT money balance
 Then Verify Recent Transactions header
 Then Verify Recent Transactions
 
 
 
 Scenario: Verify Offers page
 Description : Verify Offers page ,App has to display non expired offers list ,and open offers details page
 
 Given App is in Account pillar
 When Switch to Offers tab
 Then Verify offer title
 Then Verify offer available
 
 
 @End
 Scenario: Verify Message page
 Description : Verify Message page ,App has to display Inbox Messages and saved Messages
 
 Given App is in offers pillar
 When Swith to message pillar
 Then Verify message title
 Then Verify inbox title
 Then Verify saved messages title
 Then Verify inbox messages not available
 Then Verify saved messages available 


 