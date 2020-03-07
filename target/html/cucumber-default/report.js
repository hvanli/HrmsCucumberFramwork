$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addEmployee"
    }
  ]
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
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_PIM_and_Add_Employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee To HRMS",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i add firstName, middleName and last name",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_firstName_middleName_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click Create Login Details",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Create_Login_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter username-password-confirm password",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_enter_username_password_confirm_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i will see Personal Details",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_will_see_Personal_Details()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#empPic\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSI\u0027, ip: \u0027192.168.1.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\hvanl\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56700}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9195261bdc8d54e8f185a423ad4eb4de\n*** Element info: {Using\u003did, value\u003dempPic}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat com.hrms.steps.AddEmployeeSteps.i_will_see_Personal_Details(AddEmployeeSteps.java:60)\r\n\tat ✽.i will see Personal Details(file:src/test/resources/features/AddEmployee.feature:14)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
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
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_PIM_and_Add_Employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add New Employee To HRMS",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i add \"John\", \"S\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i will see Personal Details",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_will_see_Personal_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
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
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_PIM_and_Add_Employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Employee and Edit Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter user info and edit Personal details I see Successfully Saved",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName",
        "DLNum",
        "LicExpYear",
        "LicExpMonth",
        "LicExpDay",
        "SSNNumber",
        "Gender",
        "MaritalStatus",
        "Nationality",
        "DoB"
      ]
    },
    {
      "cells": [
        "Michael",
        "Mors",
        "OneLee",
        "TX123456",
        "2022",
        "Dec",
        "27",
        "123-456-4578",
        "Male",
        "Married",
        "Turkish",
        "1981-01-21"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_enter_user_info_and_edit_Personal_details_I_see_Successfully_Saved(DataTable)"
});
