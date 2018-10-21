$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Scheme.feature");
formatter.feature({
  "line": 1,
  "name": "User Applies for a scheme",
  "description": "",
  "id": "user-applies-for-a-scheme",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9033779000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user is able to select language from select language modal",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-select-language-from-select-language-modal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tear_up"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "lang \u0027English\u0027 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is able to select English language successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 6
    }
  ],
  "location": "SchemeStepdefs.lang_English_exists(String)"
});
formatter.result({
  "duration": 384714300,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_select_English_language_successfully()"
});
formatter.result({
  "duration": 61429800,
  "status": "passed"
});
formatter.after({
  "duration": 228200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify user is able to select state from select state modal",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-select-state-from-select-state-modal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "state \u0027Delhi\u0027 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User is able to select Delhi state successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi",
      "offset": 7
    }
  ],
  "location": "SchemeStepdefs.state_Delhi_exists(String)"
});
formatter.result({
  "duration": 1355035300,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_select_Delhi_state_successfully()"
});
formatter.result({
  "duration": 128701900,
  "status": "passed"
});
formatter.after({
  "duration": 59800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user is able to select district from select state modal",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-select-district-from-select-state-modal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "district \u0027Central Delhi\u0027 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User is able to select Central Delhi district successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Central Delhi",
      "offset": 10
    }
  ],
  "location": "SchemeStepdefs.district_Central_Delhi_exists(String)"
});
formatter.result({
  "duration": 201367400,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_select_Central_Delhi_district_successfully()"
});
formatter.result({
  "duration": 600089200,
  "status": "passed"
});
formatter.after({
  "duration": 95900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify user is able to select any category from category panel",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-select-any-category-from-category-panel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "category \u0027Women and Child Development\u0027 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User is able to select category successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Women and Child Development",
      "offset": 10
    }
  ],
  "location": "SchemeStepdefs.category_Women_and_Child_Development_exists(String)"
});
formatter.result({
  "duration": 3059697400,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_select_category_successfully()"
});
formatter.result({
  "duration": 87050600,
  "status": "passed"
});
formatter.after({
  "duration": 65100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify user is able to start the survey after selecting a scheme",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-start-the-survey-after-selecting-a-scheme",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "scheme \u0027Swadhar\u0027 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks on check Eligibility button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User fills phone number \u00279795868023\u0027 and password \u0027123456\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User is able to start the survey successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Swadhar",
      "offset": 8
    }
  ],
  "location": "SchemeStepdefs.scheme_Swadhar_exists(String)"
});
formatter.result({
  "duration": 1592518600,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_clicks_on_check_Eligibility_button()"
});
formatter.result({
  "duration": 14600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9795868023",
      "offset": 25
    },
    {
      "val": "123456",
      "offset": 51
    }
  ],
  "location": "SchemeStepdefs.user_fills_phone_number_and_password(String,String)"
});
formatter.result({
  "duration": 2360016000,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_start_the_survey_successfully()"
});
formatter.result({
  "duration": 3046450100,
  "status": "passed"
});
formatter.after({
  "duration": 62600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify user is able to apply for a scheme",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-to-apply-for-a-scheme",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user apply scheme for \u0027Myself\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user answers all the survey questions:",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 30
    },
    {
      "cells": [
        "Gender",
        "Female"
      ],
      "line": 31
    },
    {
      "cells": [
        "DOB",
        "8/18/1992"
      ],
      "line": 32
    },
    {
      "cells": [
        "Domicile",
        "Delhi"
      ],
      "line": 33
    },
    {
      "cells": [
        "Beneficiary abled",
        "Yes"
      ],
      "line": 34
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user is able to check eligibilty for user",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user is able to apply for a scheme successfully",
  "keyword": "And "
});
formatter.match({
  "location": "SchemeStepdefs.user_apply_scheme_for_Myself()"
});
formatter.result({
  "duration": 317309300,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_answers_all_the_survey_questions(DataTable)"
});
formatter.result({
  "duration": 7974861200,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_check_eligibilty_for_user()"
});
formatter.result({
  "duration": 29664900,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_apply_for_a_scheme_successfully()"
});
formatter.result({
  "duration": 5128387700,
  "status": "passed"
});
formatter.after({
  "duration": 62000,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify user is able signout of the application",
  "description": "",
  "id": "user-applies-for-a-scheme;verify-user-is-able-signout-of-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@tearDown"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "User clicks on Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User is able to signout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SchemeStepdefs.user_clicks_on_Logout_button()"
});
formatter.result({
  "duration": 2169898600,
  "status": "passed"
});
formatter.match({
  "location": "SchemeStepdefs.user_is_able_to_signout_successfully()"
});
formatter.result({
  "duration": 2044064400,
  "status": "passed"
});
formatter.after({
  "duration": 42500,
  "status": "passed"
});
formatter.after({
  "duration": 2237705300,
  "status": "passed"
});
});