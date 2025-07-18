package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * xpath is an address of the element;
 * DoM - Document Object Model 
 * 2 type of X-path
 * 1:Absolute xpath(Full Xpath -->e.g., /html/body/div[4]
 *     it reaches to root to main element 
 *     it use tags
 *     
 * 2:Relative Xpath(Partial -->e.g., //*[@id="dialog-notifications-warning"]
 * 
 * 
 * why relative Xpath is prefer 
 * differ b/w Absolute and relative 
 *  1.Absolute Xpath start with / (single)--->Represents the root node 
 *    Relative Xpath Star with // (Double)
 *  2. Absolute Xpath do not use attribute 
 *     relative Xpath works with attribute
 *  3.Absolute Xpath traverse through each node till it finds Elements
 *    Relative Xpath directly jump and find the element by using attribute 
 */

		// Relative X path 
		/*
		 * Automatically - Devtools,SelectorsHubs
		 * Manually (own X path)
		 *    ->//tagname[@attribute = 'value']
		 *    ->//*attribute= 'value'] 
		 *
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.get("https://www.google.com/");
		driver.get("https://jqueryui.com/");
		
	//  1.x-path with single attributes	
		
	//	driver.findElement(By.xpath("//*[@id=\"main\"]/typesense-minibar/form/input")).sendKeys("Download");
		
	//	2.x path with multiple attributes
	
	
	//	driver.findElement(By.xpath("//input[@name=\"s\"][@placeholder='Search']")).sendKeys("Down");
	
	//	3.X-path with and or operators
		
		//->//input[@name='s'and @placeholder='Search']
		//->//input[@name='s or @placeholder='Search']
		
		//->and operators
	//	driver .findElement(By.xpath("//input[@name='s'and @placeholder='Search']")).sendKeys("load");
		
		//->or operators
	//	driver .findElement(By.xpath("//input[@name='s'or @placeholder='Search']")).sendKeys("load");
		
		
	//  4.X path with inner text -->Syntax : text()

		//e.g., //a[text()='Demos']
		//e.g., //a[text()='Download']
		
	//	driver.findElement(By.xpath("//a[text()='Demos']")).click();
	//	driver.findElement(By.xpath("//a[text()='Download']")).click();
	//    boolean displayStatus=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
	 
	//    System.out.println(displayStatus);
	
		//--->getText() method      ---to capture text form web browser site 
		
	 //   String text=driver.findElement(By.xpath("//h3[text()='Interactions']")).getText();
 	//    System.out.println(text);
	    
   
	//  5.X-path with contains() methods  --->in contains method no need to provide the complete value of attribute .specify some partial value of attribute 
		
	    //-->  //input[contains(@placeholder,'Sea']
	//    driver.findElement(By.xpath("//input[contains(@placeholder,'arch')]")).sendKeys("Version");
		
		
	//  6.X-path with starts-with() method --
	    
	//   driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Version");
	
	//	7.X-path in handling Dynamic attribute --late 
		
	
		
		
		
	//  8.Chained X-path 	
	// e.g., //div[@id='logo-events']/a
		
		boolean status=driver.findElement(By.xpath("//div[@id='logo-events']/h2/a")).isDisplayed();
		System.out.println(status);
		
	}

}
