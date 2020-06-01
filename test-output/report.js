$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_logintofreecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Log In To Free CRM scenario",
  "description": "",
  "id": "free-crm-login-feature;log-in-to-free-crm-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "page title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user types the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user again clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 9047462114,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.page_title_is_Free_CRM()"
});
formatter.result({
  "duration": 62567747,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 11765411995,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.user_types_the_username_and_password()"
});
formatter.result({
  "duration": 5578402224,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.user_again_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 139186881,
  "status": "passed"
});
formatter.match({
  "location": "LoginToFreeCRMStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 18221382,
  "status": "passed"
});
formatter.uri("02_selectmenufreecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Select Menu Feature",
  "description": "",
  "id": "free-crm-select-menu-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Select menu in Free CRM homepage",
  "description": "",
  "id": "free-crm-select-menu-feature;select-menu-in-free-crm-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the required \"\u003cMenu\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user lands on the contacts page",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "free-crm-select-menu-feature;select-menu-in-free-crm-homepage;",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 10,
      "id": "free-crm-select-menu-feature;select-menu-in-free-crm-homepage;;1"
    },
    {
      "cells": [
        "MenuName"
      ],
      "line": 11,
      "id": "free-crm-select-menu-feature;select-menu-in-free-crm-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Select menu in Free CRM homepage",
  "description": "",
  "id": "free-crm-select-menu-feature;select-menu-in-free-crm-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the required \"MenuName\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user lands on the contacts page",
  "keyword": "And "
});
formatter.match({
  "location": "NavigateToContactsPageStepDefinition.user_is_on_the_homepage()"
});
formatter.result({
  "duration": 23677859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MenuName",
      "offset": 29
    }
  ],
  "location": "NavigateToContactsPageStepDefinition.user_clicks_on_the_required_menu(String)"
});
formatter.result({
  "duration": 2004800815,
  "status": "passed"
});
formatter.match({
  "location": "NavigateToContactsPageStepDefinition.user_lands_on_the_contacts_page()"
});
formatter.result({
  "duration": 79163473,
  "status": "passed"
});
formatter.uri("03_createcontactsfreecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contact and Deal Feature",
  "description": "",
  "id": "free-crm-create-contact-and-deal-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Create contacts and deals in FreeCRM",
  "description": "",
  "id": "free-crm-create-contact-and-deal-feature;create-contacts-and-deals-in-freecrm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the contacts page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicks on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "fills the required \"\u003cName\u003e\" name and \"\u003cSurName\u003e\" surname",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on Save button",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "free-crm-create-contact-and-deal-feature;create-contacts-and-deals-in-freecrm;",
  "rows": [
    {
      "cells": [
        "Name",
        "",
        "SurName"
      ],
      "line": 11,
      "id": "free-crm-create-contact-and-deal-feature;create-contacts-and-deals-in-freecrm;;1"
    },
    {
      "cells": [
        "FirstName",
        "",
        "LastName"
      ],
      "line": 12,
      "id": "free-crm-create-contact-and-deal-feature;create-contacts-and-deals-in-freecrm;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Create contacts and deals in FreeCRM",
  "description": "",
  "id": "free-crm-create-contact-and-deal-feature;create-contacts-and-deals-in-freecrm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on the contacts page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicks on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "fills the required \"FirstName\" name and \"LastName\" surname",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateContactStepDefinition.user_is_on_the_contacts_page()"
});
formatter.result({
  "duration": 3123731814,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepDefinition.clicks_on_the_New_button()"
});
formatter.result({
  "duration": 472317142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FirstName",
      "offset": 20
    },
    {
      "val": "LastName",
      "offset": 41
    }
  ],
  "location": "CreateContactStepDefinition.fills_the_required_name_and_surname(String,String)"
});
formatter.result({
  "duration": 4987783821,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepDefinition.clicks_on_Save_button()"
});
formatter.result({
  "duration": 222289733,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "free-crm-create-contact-and-deal-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "new contact is created",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user clicks on Deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on the New link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters title, probability, amount and commission",
  "rows": [
    {
      "cells": [
        "Title",
        "Probability",
        "Amount",
        "Commission"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on Save button to create a deal",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDealsStepDefinition.new_contact_is_created()"
});
formatter.result({
  "duration": 3108260004,
  "status": "passed"
});
formatter.match({
  "location": "CreateDealsStepDefinition.user_clicks_on_Deals_link()"
});
formatter.result({
  "duration": 196216597,
  "status": "passed"
});
formatter.match({
  "location": "CreateDealsStepDefinition.user_clicks_on_the_New_link()"
});
formatter.result({
  "duration": 3228406193,
  "status": "passed"
});
formatter.match({
  "location": "CreateDealsStepDefinition.user_enters_title_probability_amount_and_commission(DataTable)"
});
formatter.result({
  "duration": 4022899597,
  "status": "passed"
});
formatter.match({
  "location": "CreateDealsStepDefinition.user_clicks_on_Save_button_to_create_a_deal()"
});
formatter.result({
  "duration": 134269948,
  "status": "passed"
});
});