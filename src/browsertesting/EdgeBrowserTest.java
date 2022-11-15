package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver" , "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Get title of the page
        String title = driver.getTitle();
        System.out.println("Page of title is: " + title);
        // Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        //Type the email in email field
        emailField.sendKeys("chhaganmagan@yahoo.com");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //Type the password in password field
        passwordField.sendKeys("ehalohve123");
    }
}
