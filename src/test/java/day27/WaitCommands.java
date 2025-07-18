package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		// Important for 

		//Synchronization problem --> speed of application is very slow and our execution is faster than our speed of our application 
		//
		//solve the problem --
		//we can control the execution speed of your automation test script
		
		// type of wait Commands
		//1.implicit wait 2.explicit/fluent wait 
		
		//sleep Commands 
		
		//two Exception
		//NoSuchElementException--Element is not present on the page Synchronization
		//ElementNotFoundException--Locator is incorrect
	
		//Advantage 
		//-->easy to use 
		//Disadvantage
		//If the time is not sufficient then you will get exception
		//It will wait for maximum time out. This will reduce the performance script 
		//Multiple times--write multiple time Thread.sleep() methods
		
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();

		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
		
		

	}

}
