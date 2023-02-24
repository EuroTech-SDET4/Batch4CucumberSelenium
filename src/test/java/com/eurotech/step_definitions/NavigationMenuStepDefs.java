package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {

        System.out.println("I verified that Welcome text is there");

    }
    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {

        System.out.println("I navigate to Developers Menu");

    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {

        System.out.println("I verified that developers text is here ");
    }
    @Then("The user navigates to All Posts menu")
    public void the_user_navigates_to_all_posts_menu() {
        System.out.println("I navigate to All Posts Menu");
    }
    @Then("The user able to see All Posts text")
    public void the_user_able_to_see_all_posts_text() {
        System.out.println("I verified that All Posts text is here ");
    }
    @Then("The user navigates to My Account menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("I navigate to My Account Menu");
    }
    @Then("The user able to see Dashboard text")
    public void the_user_able_to_see_dashboard_text() {
        System.out.println("I verified that Dashboard text is here ");
    }


    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        dashboardPage.navigateToDashboardMenu(menuName);

    }

    @Then("The user should be able to see  header as {string}")
    public void theUserShouldBeAbleToSeeHeaderAs(String headerName) {
        BrowserUtils.waitFor(1);
      String actualHeader=  dashboardPage.getHeaderText(headerName);
      Assert.assertEquals("verify that header name is display",headerName,actualHeader);

    }


}
