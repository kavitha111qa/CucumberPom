$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kavitha/eclipse-workspace/CucumberPom/src/main/java/com/qa/feature/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free Crm Home page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepsDef.user_opens_browser()"
});
formatter.result({
  "duration": 9192532218,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 297133054,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 8583360498,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDef.validate_homepage_title()"
});
formatter.result({
  "duration": 114369378,
  "status": "passed"
});
});