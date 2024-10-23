package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class D01_registerStepDef {
    //the selenium click on the start selling button to create an account
    P01_register register=new P01_register();
    @Given("the user click on star selling")
    public void user_go_to_register_page()
    {
//        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(5000));
//        wait.until(ExpectedConditions.visibilityOf(register.chat()));
        register.start_selling().click();

    }
    //the selenium open the start selling and make handel multiples windows to go the next page and create an account by enter valid data in all fields
    @When("the user go to the get started page")
    public void the_user_go_to_the_get_started_page() throws InterruptedException {
        Set<String> alltabs=Hooks.driver.getWindowHandles();
        String tab_1=(String) alltabs.toArray()[0];
        String tab2=(String) alltabs.toArray()[1];
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tab2);
        register.full_name().sendKeys("ahmed aboelsoud");
        register.mobile_number().sendKeys("01114860541");
        register.email().sendKeys("ahmedaboelsoud289@gmail.com");
        register.password().sendKeys("Ahmed*2682000#");
        register.icon_eye().click();
        Thread.sleep(1000);
        register.create_account().click();
    }
    //here the selenium go to the set up page to continue the register
    @And("the user go to the set up your stroe page")
    public void the_user_go_to_the_set_up_your_stroe_page()
    {
        register.store_name().sendKeys("maghraby store");
        //using dropdown list to select the cuncurncy
        register.cuncurncy_county().click();
        Select select=new Select(register.cuncurncy_county());
        select.selectByVisibleText("Egypt");
        register.cuncurncy_saympol().click();
        Select sel=new Select(register.cuncurncy_saympol());
        sel.selectByVisibleText("EGP");
        register.next().click();
    }
    //here the selenium go to the set up page to continue the register by fill all fields with valid data
    @And("the user add address store")
    public void the_user_add_address_store()
    {
        register.store_address().sendKeys("my store in qena in naqada and have mutiiiiii");
        register.citey().sendKeys("cairo");
        register.state().sendKeys("done");
        register.zip().sendKeys("123456");
        register.next1().click();
    }
    //here the same steps the selenium go to the set up page to continue the register
    @And("the user compeletion the store")
    public void the_user_compeletion_the_store()
    {
        register.type().click();
        Select select=new Select(register.type());
        select.selectByIndex(1);
        register.category().click();
        Select se=new Select(register.category());
        se.selectByIndex(3);
        register.descriptions().sendKeys("this perfum store is so nice");
        register.finish_up().click();
    }
    //the selenium is assert that registration is done successfully
    @Then("the user go to the home page")
    public void the_user_go_to_the_home_page()
    {
        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOf(register.success_signup()));
        SoftAssert sof=new SoftAssert();
        sof.assertTrue(register.success_signup().getText().contains("login"),"the message not appear");
        System.out.println(register.success_signup().getText());
    }

    ////////////data provider
//    @DataProvider(name="provider")
//    String [][] give_invaliddata()
//    {
//        String data [][]={
//                {"ahmed","0111123456","ahmedaboelsoud285@gmail.com","sdfd2@fds"},
//        };
//        return data;
//    }
//here try to check invalid scenario like this steps
    @When("the user go to the set up your stroe page and enter exist email")
    public void enter_exist_email()
    {
        Set<String> alltabs=Hooks.driver.getWindowHandles();
        String tab_1=(String) alltabs.toArray()[0];
        String tab2=(String) alltabs.toArray()[1];
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tab2);

register.full_name().sendKeys("ahmed");
register.mobile_number().sendKeys("0122334354");
register.email().sendKeys("ahmedaboelsoud285@gmail.com");
register.password().sendKeys("3244dgsdf1@");
register.create_account().click();

    }
    //and check that error message is appear
    @Then("error message is displayed")
    public void error_message_is_displayed() throws InterruptedException {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.error_messge().getText().contains("Email already exists"),"not founded");
    Hooks.driver.navigate().refresh();
    register.signin().click();//check the sigin oage is displayed
Thread.sleep(1000);
        Hooks.driver.navigate().back();
        Thread.sleep(1000);
    }

}
