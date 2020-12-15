# My-Store-Automation
This repository contains code for testing My Store website.
Application URL - http://automationpractice.com/index.php
A Cucumber Based Framework is used for automation. Page Factory Model
with Selenium & Java is used for implementation of automation code. As part of testing five user stories have been implemented. The test execution reports
are generated and is available for analysis.

* `Features` - Cover the test scenarios for the user stories.
* `StepDefinitions` - Cover the step definitions for each feature file and common steps.
* `Runner` - Runner class for executing the whole code is available here (TestRunner.java). This file needs to be run 
for viewing the results.
* `Pages` - Obtains the elements in each page.
* `Actions` - Includes the actions performed in each page.

## Test Execution Details

### Reports
**1. Directory: reports/pretty-cucumber**
* For viewing detailed analysis of cucumber based execution.

**2. Directory: reports/cucumber-reports**
* For viewing simple report of cucumber based execution.

### Screenshots
**1. Directory: screenshots**
* For screenshots of User story 5.

### Test Execution Settings
**1. Directory: src/test/resources/application.properties**
   * Application and subpage URLs are available.
   * Tests are run in 'Headless' mode. This can be modified here by setting the value as 'false'.

**2. Directory: src/test/java/runner/TestRunner.java**   
   * The user stories that needs to be executed are specified inside `tags`.
   * The user stories can be modified in the `tags` section.