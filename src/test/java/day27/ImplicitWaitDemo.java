package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		//Implicit Wait 
		// advantage 
		//Single Time / one statement 
		// it will not wait till maximum time if the element is avaible
		//applicable for all the element 
		//easy to use
		
		//Disadvantage 
		//If the time is sufficient they you will get execution 
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement( By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
		
		//driver.close(Duration.ofSeconds(10));
		
	}

}
