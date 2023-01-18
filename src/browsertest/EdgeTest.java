package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";  // storing base url
        System.setProperty("webdriver.edge.drivers","src/drivers/msedgedriver.exe");  // setting webdriver
        WebDriver driver = new EdgeDriver(); // create object of edge webdriver
        driver.get(baseurl);  // method to invoke url
        driver.manage().window().maximize();  // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session

        String title = driver.getTitle();
        System.out.println("Title of page" +title ); // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url" +url);  // printing url
        String source = driver.getPageSource();
        System.out.println("Page source" +source); // printing page source

        WebElement UsernameField = driver.findElement(By.name("username")); // storing username/email
        UsernameField.sendKeys("Admin"); // sending key to email/username
        WebElement passwordField = driver.findElement(By.name("password")); // storing password
        passwordField.sendKeys("admin123"); // sending key to password

        driver.findElement(By.className("oxd-button")).click(); // clicking on login button
    }
}
