package day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 Assignment 
 launch browser 
 open URl https://demo.nopcommerce.com/
 validate title should be "nopCommerce demo store"
 close Page
 */



public class SecondTestCase {

	public static void main(String[] args) {
		// launch browser 
		WebDriver driver = new ChromeDriver();
		
		//Open URL 
		driver.get("https://demo.nopcommerce.com/");
		
		// Validate Title should be "nopCommerce demo store"
	    String act_title = driver .getTitle();
	    if(act_title.equals("nopCommerce demo store. Home page title"))
	    {
	    	System.out.println("Test Passed ...");
	 
	    }
	    else {
	    	System.out.println("Test Failed ...");
	    }
		//Close Page 
	    driver.close();
	    
		

	}

}
