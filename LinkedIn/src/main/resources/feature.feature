Feature: To get connections details
  

@Login
Scenario: to login into linked in account
Given : open url
Then : enter username
Then : enter password
And : sign in

@Connections
Scenario: go to connections
Given : open new tab
Then : open connection url
Then : click on connections

@Fetch_Data
Scenario: to fetch coonections details
Given : get connections url
Then : read name
Then : read designation
Then : read company 
Then : write data

  
