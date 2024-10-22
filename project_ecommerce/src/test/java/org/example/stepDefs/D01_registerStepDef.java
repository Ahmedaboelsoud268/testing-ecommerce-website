package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.P01_register;

public class D01_registerStepDef {
    P01_register register=new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page()
    {
        System.out.println("Please complete the CAPTCHA manually, then press Enter to continue.");
        try {
            System.in.read(); // Wait for user to press Enter
        } catch (Exception e) {
            e.printStackTrace();
        }
        register.registerlink().click();
    }
}
