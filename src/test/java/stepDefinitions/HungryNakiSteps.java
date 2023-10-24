package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoryPage;
import pages.ShopDetailsPage;
import pages.ShopPage;
import register.Driver;

public class HungryNakiSteps {

    private CategoryPage categoryPage;
    private ShopPage shopPage;
    private ShopDetailsPage shopDetailsPage;

    @Given("Mike on home page of hungrynaki mobile app")
    public void mike_on_home_page_of_hungrynaki_mobile_app() {
        categoryPage = new CategoryPage(Driver.getDriver());
    }
    @When("Mike select pizza category from home page")
    public void mike_select_pizza_category_from_home_page() {
        shopPage = categoryPage.selectPizzaCat();
    }
    @When("Mike select Pizzawala - Dhanmondi restraunt")
    public void mike_select_pizzawala_dhanmondi_restraunt() {
        shopDetailsPage = shopPage.selectPizzaShop();
    }
    @When("Mike select one pizza from the list")
    public void mike_select_one_pizza_from_the_list() {
        shopDetailsPage.clickAddPizza();
    }
    @Then("Mike see the login button")
    public void mike_see_the_login_button() {
        shopDetailsPage.clickLogin();
    }

}
