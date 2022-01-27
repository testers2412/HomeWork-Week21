$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("saucedemoproducts.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4284206200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"Prime\", lastName \"Trainee\" and zipPostalCode \"HA9 7PU\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "searchsteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 137758100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "searchsteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 227690300,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 156894500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "searchsteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 236667500,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 2143427200,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 96404000,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iGoToCheckout()"
});
formatter.result({
  "duration": 124588400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime",
      "offset": 27
    },
    {
      "val": "Trainee",
      "offset": 45
    },
    {
      "val": "HA9 7PU",
      "offset": 73
    }
  ],
  "location": "searchsteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 369532700,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 110368700,
  "status": "passed"
});
formatter.match({
  "location": "searchsteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 107772800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "searchsteps.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 55491200,
  "status": "passed"
});
formatter.after({
  "duration": 753976300,
  "status": "passed"
});
});