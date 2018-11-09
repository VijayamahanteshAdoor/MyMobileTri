$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TriangleHybris_SignIn.feature");
formatter.feature({
  "line": 3,
  "name": "Hybris SignIn",
  "description": "",
  "id": "hybris-signin",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HybrisSignIn"
    }
  ]
});
formatter.before({
  "duration": 2386475,
  "status": "passed"
});
formatter.before({
  "duration": 23373233238,
  "status": "passed"
});
formatter.before({
  "duration": 85002,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "hybris-signin;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on SignIN button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify Hybris Login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Display message Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Quit the App",
  "keyword": "Then "
});
formatter.match({
  "location": "Triangle_HybrisLoginVerify.Open_app()"
});
});