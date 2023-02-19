package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().navigate().to("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.acceptCookies.click();
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Szukaj w Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not the same!", expectedTitle,actualTitle);

    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googleSearchPage.acceptCookies.click();
        googleSearchPage.searchBox.sendKeys(string+ Keys.ENTER);
    }
    @Then("user sees {string}  in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string+" - Szukaj w Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not the same!", expectedTitle,actualTitle);
    }



}
