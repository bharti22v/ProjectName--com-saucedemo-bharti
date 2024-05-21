package comsaucedemo1;


/**
 * Project-4- ProjectName : com-saucedemo
 *  BaseUrl = https://www.saucedemo.com/
 *  1. Setup Chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current url.
 *  5. Print the page source.
 *  6. Enter the email to email field.
 *  7. Enter the password to password field.
 *  8. Click on Login Button.
 *  9. Print the current url.
 *  10. Navigate to baseUrl
 *  11. Refresh the page.
 *  12. Close the browser.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComSaucedemo {

    //1. Setup Chrome Browser
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        //2. Open Url
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("Current url: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        //6. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("prime123@gmail.com");

        //7. Enter the password to password field.
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Prime321");

        //8. Click on Login Button.
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //9. Print the current url.
        System.out.println("Current url: " + driver.getCurrentUrl());

        //10. Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.close();

    }
}

