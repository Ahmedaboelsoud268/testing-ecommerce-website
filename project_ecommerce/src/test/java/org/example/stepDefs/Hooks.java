package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //navigate to url
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public static void quitDriver() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
    }
}
