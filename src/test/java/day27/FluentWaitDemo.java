package day27;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;
//import java.util.NoSuchElementException;
//import java.util.function.Function;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//public class FluentWaitDemo {
//
//	public static void main(String[] args)  throws InterruptedException{
//		try {
//
//		WebDriver driver = new ChromeDriver();
//		
//		//Fluent Wait Declaration
//		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
//		
//		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//
//		driver.manage().window().maximize();
//		
//		WebElement Username = mywait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//	       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
//		     }
//		});
//		Username.sendKeys("Admin");
//		WebElement Password = mywait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		     }
//		});
//
//		Password.sendKeys("admin123");
//        WebElement Username = mywait.until(d -> d.findElement(By.xpath("//input[@placeholder='Username']")));
//        Username.sendKeys("Admin");
//
//        WebElement Password = mywait.until(d -> d.findElement(By.xpath("//input[@placeholder='Password']")));
//        Password.sendKeys("admin123");
//
//        WebElement LoginBtn = mywait.until(d -> d.findElement(By.xpath("//button[@type='submit']")));
//        LoginBtn.click();
//
//		}
//		catch(Exception e){
//			System.out.println("❌ Exception Occurred: " + e.getMessage());
//			e.printStackTrace();
//		}
//		
//
//
//	}
//
//}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
    public static void main(String[] args) {

        try {
            // Set path to chromedriver.exe if not already in PATH
            // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);

            WebElement Username = mywait.until(d -> d.findElement(By.xpath("//input[@placeholder='Username']")));
            Username.sendKeys("Admin");

            WebElement Password = mywait.until(d -> d.findElement(By.xpath("//input[@placeholder='Password']")));
            Password.sendKeys("admin123");

            WebElement LoginBtn = mywait.until(d -> d.findElement(By.xpath("//button[@type='submit']")));
            LoginBtn.click();

            // Optionally close the driver
            // driver.quit();

        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

