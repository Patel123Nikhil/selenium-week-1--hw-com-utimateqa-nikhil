package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Edge";
    static  String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
      // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        // Get pge source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the email field
        WebElement emaiField = driver.findElement(By.name("user[email]"));
        //Type the email in email field
        emaiField.sendKeys("amrelisvarkundla@hotmail.com");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //Type the password in password field
        passwordField.sendKeys("garyadhar123");
        //Close the browser
        driver.quit();
    }



}
