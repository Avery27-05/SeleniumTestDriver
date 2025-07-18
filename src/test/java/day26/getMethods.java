package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	/*
	 * get methods 
	 * conditional methods
	 * browser methods
	 * Navigational method
	 * wait methods  
	 * 
	 * get methods-->we can access these method through webdriver instance geturl()-
	 * open the url on the browser getTitle()- return title of the page
	 * getCurrentUrl()-return the source code of the page 
	 * getPageSource- return source code of the page
	 * getWindowHandle()-return ID of the single browser window 
	 * getWindowHandles()- return ID's of multiple browser windows
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// geturl()- open the url on the browser
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000); // sleep methods 
		
//
//		// getTitle()- return title of the page
//		System.out.println(driver.getTitle());
//		
//
//
//		//getCurrentUrl()-return the source code of the page 
//	    System.out.print(driver.getCurrentUrl());
//		
//		//getPageSource- return the source code of the page
//		System.out.println(driver.getPageSource());
//		
//	
//		//getWindowHandle()-return ID of the single browser window 
//        String id=driver.getWindowHandle();
//        System.out.println("Window ID : "+id);
		
		//getWindowHandles()- return ID's of multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> ids =driver.getWindowHandles();
        System.out.println("Windows ID's : "+ids);
 
	}

}
