package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chroem.driver" , "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        //Type the email in email field
        emailField.sendKeys("chnadrababu@gmail.com");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //Type the password in password field
        passwordField.sendKeys("barahhath123");
        //Close the browser
        driver.quit();


    }
}
