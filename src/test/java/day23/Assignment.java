package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Assignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://candymapper.com/");

	//	driver.findElement(By.cssSelector("div#bs-2")).click();
		
	//	driver.findElement(By.cssSelector("div.widget widget-about widget-about-about-1")).click();
		
		driver.findElement(By.cssSelector("div[data-typography=\"NavAlpha\"]")).click();
	}

}
		