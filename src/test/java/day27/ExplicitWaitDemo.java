package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	/*
	 * Before considering thr time we have to put certain condition.
	 * it will consider two things actually
	 * --> 1.Condition 
	 * --> 2.Time
	 * 
	 * two Step
	 *
	 *1. Declaration 
	 *2. Use
	 */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.manage().window().maximize();

        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // wait for the element to be visible
        WebElement username = mywait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))
        );
        // Now send keys
        username.sendKeys("Admin");

        WebElement password = mywait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))
            );
        // Now send keys
        password.sendKeys("admin123");
        
        WebElement loginbutton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));

        loginbutton.click();
    }
}

