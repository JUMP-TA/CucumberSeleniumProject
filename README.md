Example Projects from the Cucumber Selenium training

This repo contains 4 folders.  The two examples we went over in the course are CucumberExample and SeleniumExample

The folder WEBPAGE contains two HTML files that you are going to test.  You can host these pages by navigating to them in your sonsole and starting a simple web server application such as 
- jwebserver
- python -m http.server
- Live Server vs code extension
- etc.

The folder CucumberSeleniumExample is a project whose POM XML contains the repositiories necessary to turn Cucumber feature files into Selenium tests.  
Try it yoruself by converting the following User Stories into Gherkin feature files, then implementing them in a step definition file
- As a User, I should be able to enter my username and password and be redirected to the success page
- As a User, I should not be able to log in if my my username and password are not valid
- As a User, I should not be able to be redirected to the success page if the username or password fields are blank
