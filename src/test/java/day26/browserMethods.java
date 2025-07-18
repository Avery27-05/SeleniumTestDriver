package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {

	public static void main(String[] args) throws InterruptedException{
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.findElement( By.xpath("OrangeHRM, Inc")).click();
			Thread.sleep(5000);
			driver.close();//close single browser window when ever the driver is focused
		 //	driver.quit();//close all the browser window 
			
	}

}
