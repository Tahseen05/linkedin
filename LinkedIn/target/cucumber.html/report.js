$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "To get connections details",
  "description": "",
  "id": "to-get-connections-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "to login into linked in account",
  "description": "",
  "id": "to-get-connections-details;to-login-into-linked-in-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": ": open url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": ": enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": sign in",
  "keyword": "And "
});
formatter.match({
  "location": "Login.open_url()"
});
formatter.result({
  "duration": 16420792300,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_username()"
});
formatter.result({
  "duration": 4026543900,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_password()"
});
formatter.result({
  "duration": 3189044200,
  "status": "passed"
});
formatter.match({
  "location": "Login.sign_in()"
});
formatter.result({
  "duration": 26183238000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "go to connections",
  "description": "",
  "id": "to-get-connections-details;go-to-connections",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Connections"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": ": open new tab",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": ": open connection url",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": ": click on connections",
  "keyword": "Then "
});
formatter.match({
  "location": "Connections.open_new_tab()"
});
formatter.result({
  "duration": 3253170000,
  "status": "passed"
});
formatter.match({
  "location": "Connections.open_connection_url()"
});
formatter.result({
  "duration": 11787939000,
  "status": "passed"
});
formatter.match({
  "location": "Connections.click_on_connections()"
});
formatter.result({
  "duration": 5176220900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "to fetch coonections details",
  "description": "",
  "id": "to-get-connections-details;to-fetch-coonections-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Fetch_Data"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": ": get connections url",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": ": read name",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": ": read designation",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": ": read company",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": ": write data",
  "keyword": "Then "
});
formatter.match({
  "location": "Connections.get_connections_url()"
});
formatter.result({
  "duration": 6242033800,
  "status": "passed"
});
formatter.match({
  "location": "Connections.read_name()"
});
formatter.result({
  "duration": 277169400,
  "status": "passed"
});
formatter.match({
  "location": "Connections.read_designation()"
});
formatter.result({
  "duration": 74962100,
  "status": "passed"
});
formatter.match({
  "location": "Connections.read_company()"
});
formatter.result({
  "duration": 46946700,
  "status": "passed"
});
formatter.match({
  "location": "Connections.write_data()"
});
formatter.result({
  "duration": 262639200,
  "status": "passed"
});
});