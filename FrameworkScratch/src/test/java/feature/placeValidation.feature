Feature: Validation Place API's

Scenario: Verify if place is succesfully adding

	Given Add Place Payload
	When user post HTTP "AddplaceAPI" request
	Then call success with 200
	And "status" in response body is "ok"
	And "scope" in response body is "App"