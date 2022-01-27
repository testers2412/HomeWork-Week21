package com.soucedemo.steps;

import com.soucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchsteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
            new HomePage().enterUsername(username);
            new HomePage().enterPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String highToLow)  {
       new InventoryPage().sortTheProductsHighToLowPrice(highToLow);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().addHighestAndLowestPricedProductsToBasket();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
       new InventoryPage().clickOnCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String fName, String lName, String zip)  {
      new CheckOutInformationPage().enteringTheDetails(fName,lName,zip);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutInformationPage().clickOnContinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutOverViewPage().clickOnFinish();
    }



    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String message)  {
        new CheckOutCompletePage().verifyingMessage(message);
    }
}
