$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Tv.feature");
formatter.feature({
  "name": "tv",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
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
  "name": "user login to flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileSteps.user_login_to_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "tv Purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.step({
  "name": "user search tv",
  "keyword": "When "
});
formatter.match({
  "location": "TvSteps.user_search_tv()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv class\u003d\"_4rR01T\"\u003e...\u003c/div\u003e is not clickable at point (655, 522). Other element would receive the click: \u003cdiv class\u003d\"_36HLxm col col-3-5\"\u003e...\u003c/div\u003e\n  (Session info: headless chrome\u003d107.0.5304.107)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-F4PMV4Q\u0027, ip: \u0027192.168.10.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60912}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: eb1b93919505ff5e5ac12d052df03836\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.flipkart.stepdefinition.TvSteps.user_search_tv(TvSteps.java:28)\r\n\tat ✽.user search tv(src/test/resources/Features/Tv.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user choose the tv",
  "keyword": "And "
});
formatter.match({
  "location": "TvSteps.user_choose_the_tv()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user doing payment by using UPI",
  "keyword": "And "
});
formatter.match({
  "location": "MobileSteps.user_doing_payment_by_using_UPI()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user receives confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileSteps.user_receives_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});