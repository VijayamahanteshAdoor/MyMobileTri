@FeatureTest

Feature: Test Hooks
Description: The purpose of this feature is to practices cucumumber 

	Background: this scenario runs before every Scenario
	Given user navigate to login page
	When user enters credential 
	Then user logged in

	Scenario: This scenario 1
	Given this is the first step
	When this is the second step
	Then this is the third step
	
	Scenario: This scenario 2
	Given this is the first step
	When this is the second step
	Then this is the third step
