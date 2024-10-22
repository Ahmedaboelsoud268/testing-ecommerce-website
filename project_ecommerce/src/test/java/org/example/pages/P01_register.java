package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.logging.Handler;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
    }
}
