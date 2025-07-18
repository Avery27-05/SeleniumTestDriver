package day25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	X-path Axes 

		-->we can navigate throughout the dom like top to bottom and bottom to top 
		and find the element on the web page 
		type of Xpath
		-->'
		WebDriver driver = new ChromeDriver();
		
		
	*/	

		WebDriver driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/");
		driver.get("https://jquery.com/");
		driver.manage().window().maximize();

		
	}

}
