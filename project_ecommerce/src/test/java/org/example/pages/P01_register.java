package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.logging.Handler;

public class P01_register {
    public WebElement chat()
    {
        return Hooks.driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
    }
    //this locate the  start_selling button
    public WebElement start_selling()
    {
        return Hooks.driver.findElement(By.cssSelector("section.banner.style--two.plugins:nth-child(5) div.container-fluid div.row.align-items-center.home-banner div.col-lg-6.order-1.order-lg-0:nth-child(1) div.banner-content div.banner-btn-group a:nth-child(1) > button.primary-btn.wow.fadeInUp.animated.animated"));
    }
    //this locate the name field
    public WebElement full_name()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/div/app-signup/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/div[1]/input"));
    }
    //this locate the mobile number field
    public WebElement mobile_number()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/div/app-signup/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/div[2]/div/input"));
    }
    //this locate the email field
    public WebElement email()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/div/app-signup/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/div[3]/div/input"));
    }
    //this locate the password field
    public WebElement password()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/div/app-signup/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/div[4]/div/input"));
    }
    //this locate the create account button
    public WebElement create_account()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/div/app-signup/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/button"));
    }
    //this locate the store name
    public WebElement store_name()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
    }
    //this locate the cuncurncy_country dropdown
    public WebElement cuncurncy_county()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
    }
    //this locate the cuncurncy_saympol dropdown
    public WebElement cuncurncy_saympol()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/select[1]"));
    }
    //this locate the next button
    public WebElement next()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
    }
    //yhis locate the store_address
    public WebElement store_address()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/textarea[1]"));
    }
    //yhis locate the city filed
    public WebElement citey ()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    }
    //yhis locate the state filed
    public WebElement state()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/input[1]"));
    }
    //yhis locate the zip filed
    public WebElement zip()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/input[1]"));
    }
    //this locate the button next
    public WebElement next1()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
    }
    // theis locate te type dropdown
public WebElement type()
{
    return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]"));
}
//this locate the category
    public WebElement category()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[2]"));
    }
    //locate the description field
    public WebElement descriptions()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/textarea[1]"));
    }
    //this locate the button of finsh up
    public WebElement finish_up()
    {
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/div[1]/div[1]/app-signup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
    }
    //this is locate the succsss of complete the register
    public WebElement success_signup()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"btn btn-primary\"]"));
    }
    //this locate the error message that must display when there are existing already password
    public WebElement error_messge()
    {
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Email already exists')]"));
    }
    //this is locate the icon eye to check is display the password
public WebElement icon_eye()
{
    return Hooks.driver.findElement(By.xpath("//i[contains(text(),'visibility')]"));
}
//this is locate the sigin in start selling page to check the page of the sign in this page is displayed
public WebElement signin()
{
    return Hooks.driver.findElement(By.xpath("//strong[contains(text(),'Signin')]"));
}

}
