package day21;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
/*
 Test Case 
 1) launch browser (chrome)
 2) open URL https://demo.opencart.com/
 3) Validate tilte should be "Your Store"
 4) close browser
 */

class FirstTestCase {

	public static void main(String[] args) {
		// 1) launch browser
		
	  //  ChromeDriver driver = new ChromeDriver();
	    WebDriver driver = new ChromeDriver();
	   
		
//	    // 2) Open URl https://demo.opencart.com/
//	    driver.get("https://demo.opencart.com/");
//	    driver.get("https://candymapper.com/");
	    
	 //   driver.get(" https://www.demoblaze.com/");
	    driver.get("https://the-internet.herokuapp.com/");
//	    driver.get("https://demo.opencart.com/");
//	    // 3) Validate title should be "Your Store"
	    String act_title = driver .getTitle();
	    if(act_title.equals("STORE"))
	    {
	    	System.out.println("Test Passed ...");
	 
	    }
	    else {
	    	System.out.println("Test Failed ...");
	    }
	    
	    
	    // 4) close browser
	    driver.close();
	    
	    

	}

}
