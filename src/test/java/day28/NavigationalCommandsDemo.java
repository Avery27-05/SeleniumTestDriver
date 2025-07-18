package day28;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommandsDemo {
/*
 * Navigation commands 
 * 1.navigation().to()
 * 2.navigation().back()
 * 3.navigation().forward()
 * 4.navigation().refresh()
 */
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
	//	driver.get("http://opensource-demo.orangehrmlive.com");
		/*
		 * normally using get() method. So,we will pass URL in String format 
		 * In get() method it will only URl in String format;
		 */
		/*
		 * When we call the navigate method they will call internally a get() method in it;
		 * it will accept URL in the string format & URL object format;
		 */
		
		// URL Object Format
		//URL myurl= new URL("http://opensource-demo.orangehrmlive.com/");
		
		//driver.navigate().to(myurl);
		driver.navigate().to("http://demo.nopcommerce.com/"); 
		driver.navigate().to("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println("Back URL String : "+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("Forward URL String : "+driver.getCurrentUrl());
		
		//Refresh or Reload page
		driver.navigate().refresh();
		
	}

}
