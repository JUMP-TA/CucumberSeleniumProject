Feature: Is it Friday?
	We would like to know if the weekend starts today
	
	Scenario Outline: Today is or is not Friday
		Given today is "<day>"
		When I ask whether it's Friday yet
		Then I should be told "<answer>"
		
	Examples:
		| day				| answer |
		| Thursday	| No 		 |
		| Friday		| Yes! 	 |
		| anyday		| No  	 |