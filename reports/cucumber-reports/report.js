$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/CreateAccount.feature");
formatter.feature({
  "name": "Create Account page scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate error message while Creating an account with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \u0027\u003cinvalid_email\u003e\u0027 in Email address field",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Error message \u0027Invalid email address.\u0027 should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalid_email"
      ]
    },
    {
      "cells": [
        "abc"
      ]
    },
    {
      "cells": [
        "abc@xy"
      ]
    },
    {
      "cells": [
        "@abc"
      ]
    },
    {
      "cells": [
        "@abc.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate error message while Creating an account with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027abc\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message \u0027Invalid email address.\u0027 should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.errorMessageInvalidEmailAddressShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate error message while Creating an account with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027abc@xy\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message \u0027Invalid email address.\u0027 should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.errorMessageInvalidEmailAddressShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate error message while Creating an account with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027@abc\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message \u0027Invalid email address.\u0027 should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.errorMessageInvalidEmailAddressShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate error message while Creating an account with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027@abc.com\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message \u0027Invalid email address.\u0027 should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.errorMessageInvalidEmailAddressShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create an account without providing mandatory fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Below error messages are displayed",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.belowErrorMessagesAreDisplayed(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate Error message by providing invalid data in all the values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027\u003cFirst Name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027\u003cLast Name\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027\u003cPassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027\u003cAddress\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027\u003cCity\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u0027\u003cZip/Postal code\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Home Phone\u0027 with value \u0027\u003cHome Phone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u0027\u003cMobile Phone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Below error messages are displayed",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "lastname is invalid."
      ]
    },
    {
      "cells": [
        "firstname is invalid."
      ]
    },
    {
      "cells": [
        "passwd is invalid."
      ]
    },
    {
      "cells": [
        "address1 is invalid."
      ]
    },
    {
      "cells": [
        "postcode is invalid."
      ]
    },
    {
      "cells": [
        "city is invalid."
      ]
    },
    {
      "cells": [
        "phone is invalid."
      ]
    },
    {
      "cells": [
        "phone_mobile is invalid."
      ]
    },
    {
      "cells": [
        "The Zip/Postal code you\u0027ve entered is invalid. It must follow this format: 00000"
      ]
    },
    {
      "cells": [
        "This country requires you to choose a State."
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Password",
        "Address",
        "City",
        "Zip/Postal code",
        "Home Phone",
        "Mobile Phone"
      ]
    },
    {
      "cells": [
        "Ath!ra",
        "V!vek",
        "Pass",
        "$%^\u0026*(",
        "\"%^\u0026*(",
        "\"$%^\u0026*(",
        "ABCDBCNENN",
        "ABCDBCNENN"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Error message by providing invalid data in all the values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027Ath!ra\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027V!vek\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027Pass\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027$%^\u0026*(\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027\"%^\u0026*(\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u0027\"$%^\u0026*(\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Home Phone\u0027 with value \u0027ABCDBCNENN\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u0027ABCDBCNENN\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Below error messages are displayed",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.belowErrorMessagesAreDisplayed(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create an account by providing all the values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Title\u0027 with value \u0027\u003cTitle\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027\u003cFirst Name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027\u003cLast Name\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027\u003cPassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Date Of Birth\u0027 with value \u0027\u003cDate Of Birth\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Company\u0027 with value \u0027\u003cCompany\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027\u003cAddress\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027\u003cCity\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027State\u0027 with value \u0027\u003cState\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u0027\u003cZip/Postal code\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Country\u0027 with value \u0027\u003cCountry\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Additional Information\u0027 with value \u0027\u003cAdditional Information\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Home Phone\u0027 with value \u0027\u003cHome Phone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u0027\u003cMobile Phone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Address Alias\u0027 with value \u0027\u003cAddress Alias\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be navigated to \u0027My account\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "name": "Account name displayed is a combination of \u0027\u003cFirst Name\u003e\u0027 and \u0027\u003cLast Name\u003e\u0027",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Title",
        "First Name",
        "Last Name",
        "Password",
        "Date Of Birth",
        "Company",
        "Address",
        "City",
        "State",
        "Zip/Postal code",
        "Country",
        "Additional Information",
        "Home Phone",
        "Mobile Phone",
        "Address Alias"
      ]
    },
    {
      "cells": [
        "Mrs.",
        "Athira",
        "Vivek",
        "Password",
        "20/1/1980",
        "Answer Digital",
        "Grattan",
        "Leeds",
        "Alaska",
        "50011",
        "United States",
        "Looking for practice Automation",
        "9999999999",
        "9999999999",
        "Bradford, UK"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create an account by providing all the values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Title\u0027 with value \u0027Mrs.\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027Athira\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027Vivek\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027Password\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Date Of Birth\u0027 with value \u002720/1/1980\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Company\u0027 with value \u0027Answer Digital\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027Grattan\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027Leeds\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027State\u0027 with value \u0027Alaska\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u002750011\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Country\u0027 with value \u0027United States\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Additional Information\u0027 with value \u0027Looking for practice Automation\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Home Phone\u0027 with value \u00279999999999\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u00279999999999\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Address Alias\u0027 with value \u0027Bradford, UK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to \u0027My account\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iWillBeNavigatedToMyAccountPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account name displayed is a combination of \u0027Athira\u0027 and \u0027Vivek\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.accountNameDisplayedIsACombinationOfFirstNameAndLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create an account by providing only mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027\u003cFirst Name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027\u003cLast Name\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027\u003cPassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027\u003cAddress\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027\u003cCity\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027State\u0027 with value \u0027\u003cState\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u0027\u003cZip/Postal code\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Country\u0027 with value \u0027\u003cCountry\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u0027\u003cMobile Phone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be navigated to \u0027My account\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "name": "Account name displayed is a combination of \u0027\u003cFirst Name\u003e\u0027 and \u0027\u003cLast Name\u003e\u0027",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Password",
        "Address",
        "City",
        "Zip/Postal code",
        "State",
        "Country",
        "Mobile Phone"
      ]
    },
    {
      "cells": [
        "Athira",
        "Vivek",
        "Password",
        "Grattan",
        "Leeds",
        "50011",
        "Alaska",
        "United States",
        "9999999999"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create an account by providing only mandatory fields",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserStory4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Sign in\u0027 link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.clickOnSignInLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027valid\u0027 in Email address field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.enterEmailInEmailAddressField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Create an account\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027First Name\u0027 with value \u0027Athira\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Last Name\u0027 with value \u0027Vivek\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Password\u0027 with value \u0027Password\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Address\u0027 with value \u0027Grattan\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027City\u0027 with value \u0027Leeds\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027State\u0027 with value \u0027Alaska\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Zip/Postal code\u0027 with value \u002750011\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Country\u0027 with value \u0027United States\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill \u0027Mobile Phone\u0027 with value \u00279999999999\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iFillLastNameWithValueLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Register\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to \u0027My account\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.iWillBeNavigatedToMyAccountPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account name displayed is a combination of \u0027Athira\u0027 and \u0027Vivek\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CreateAccountSteps.accountNameDisplayedIsACombinationOfFirstNameAndLastName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/OurStores.feature");
formatter.feature({
  "name": "Our Stores page scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "See a store from West Palm Beach",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Our Stores\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StoresSteps.clickOnOurStores(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to scroll the map to see store near \u0027West Palm Beach\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StoresSteps.iShouldBeAbleToScrollTheMapToSeeStore(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StoresSteps.userShouldBeAbleToTakeScreenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/SearchResults.feature");
formatter.feature({
  "name": "Search Results page scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Summer Dress from Navigation menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hover over \u0027WOMEN\u0027 option from navigation menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SearchResultsSteps.hoverOverOptionFromNavigationMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sub navigation options are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SearchResultsSteps.subNavigationOptionsAreDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Hover over \u0027Women\u0027 and click \u0027Summer Dresses\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.hoverAndAddToCart(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Summer items are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SearchResultsSteps.summerItemsAreDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Change slider from Navigation menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Hover over \u0027Women\u0027 and click \u0027Summer Dresses\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.hoverAndAddToCart(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the \u0027Upper Limit\u0027 of slider to 20",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SearchResultsSteps.iChangeTheUpperLimitOfSliderTo(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search results are updated from \u0027$16.00 - $20.00\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SearchResultsSteps.searchResultsAreUpdated(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/ShoppingCart.feature");
formatter.feature({
  "name": "Shopping cart page scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \u0027Home\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Hover over \u0027Faded Short Sleeve T-shirts\u0027 and click \u0027Add to cart\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.hoverAndAddToCart(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Proceed to checkout\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.clickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An item with description name \u0027Faded Short Sleeve T-shirts\u0027 is available in Shopping cart summary",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.an_item_with_description_name_is_available_in_Shopping_cart_summary(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete an item present in the basket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory1"
    }
  ]
});
formatter.step({
  "name": "I am on \u0027ShoppingCart\u0027 page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.CommonSteps.iAmOnPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There is \u00271 Product\u0027 in cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.there_is_product_in_cart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete button should be displayed for the item \u0027Faded Short Sleeve T-shirts\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.button_should_be_displayed_for_the_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Delete button of the item \u0027Faded Short Sleeve T-shirts\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.click_on_button_of_the_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The shopping cart is empty",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.the_shopping_cart_is_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Banner displays the message \u0027Your shopping cart is empty.\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ShoppingCartSteps.banner_displays_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});