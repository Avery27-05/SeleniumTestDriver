package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

    /*
     * Handling alert using Explicit Wait
     * Note: You still use switchTo().alert() internally via ExpectedConditions
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Create WebDriverWait object
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the URL and maximize browser window
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // Click the button to trigger a simple alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        // Wait until alert is present and switch to it
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());

        // Print the alert text
        System.out.println("Alert text: " + myalert.getText());

        // Accept the alert
        myalert.accept();
    }
}
