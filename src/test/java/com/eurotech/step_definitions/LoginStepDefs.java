package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTestLast.xls","Test Data");
    List<Map<String, String>> dataList = excelUtil.getDataList();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginAsTeacher();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(2);
        String actualText= dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));

    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

       loginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {

        loginPage.loginAsDeveloper();

    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String username, String password) {
//        System.out.println("username "+username);
//        System.out.println("password "+password);
        loginPage.login(username,password);
    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) {
        BrowserUtils.waitFor(1);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(user));
    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
        BrowserUtils.waitFor(2);
        loginPage.getDisapperingWarningMessage(expectedMessage);

//            String actualMessage = Driver.get().findElement(By.id("loginpage-input-email")).getAttribute("validationMessage");
//            Assert.assertEquals(expectedMessage,actualMessage);
//            System.out.println(actualMessage);
        }



    @When("The user enters {string} and row number {int}")
    public void theUserEntersAndRowNumberRowNumber(String sheetName, Integer rowNUmber) {


        loginPage.login(dataList.get(rowNUmber).get("Username"),dataList.get(rowNUmber).get("Password"));


    }


    @Then("The welcome message contains excel {int}")
    public void the_welcome_message_contains_excel(Integer rowNumber) {
        BrowserUtils.waitFor(1);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(dataList.get(rowNumber).get("Name")));
    }


    @And("The user set data")
    public void theUserSetData() {
        excelUtil.setCellData("Microsoft",5,3);
    }
}
