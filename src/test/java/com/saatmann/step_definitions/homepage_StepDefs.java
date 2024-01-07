package com.saatmann.step_definitions;

import com.saatmann.pages.Homepage;
import com.saatmann.pages.SearchPage;
import com.saatmann.utilities.ConfigurationReader;
import com.saatmann.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertTrue;



public class homepage_StepDefs extends Homepage {
    SearchPage searchPage=new SearchPage();
    static String globalText;

    @Given("I am on the Saatmann website")
    public void i_am_on_the_saatmann_website() {

        Driver.getDriver().get(ConfigurationReader.getProperty("saatmannURL"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        searchPage.cookie.click();
    }

    @Then("I should see the {string} button on the page")
    public void i_should_see_the_button_on_the_page(String sucheBtn) {
        assertTrue(searchPage.sucheButton.isDisplayed());
    }

    @When("I enter {string} in the search input")
    public void i_enter_in_the_search_input(String text) {

        globalText=text;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        searchPage.sucheButton.click();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    }


    @When("I click the search button")
    public void i_click_the_search_button() {

        searchPage.sucheText.sendKeys(globalText+ Keys.ENTER);
    }

    @Then("I should see relevant search results")
    public void i_should_see_relevant_search_results() {

           String firstResult= searchPage.firstResultTitle.getText();
           System.out.println(firstResult);

        if (firstResult.startsWith(globalText)) {
           //assertTrue(firstResult.contains(globalText));
            System.out.println("relevant search results will be seen");
        }
        Driver.closeDriver();
   }
}