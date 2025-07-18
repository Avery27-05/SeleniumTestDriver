package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsDemo {
		
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
	//	driver.get("https://candymapper.com/");
	//	driver.get("https://demo.opencart.com/");
	//	driver.get("https://www.google.com/");
		driver.get("https://jqueryui.com/");
	//	driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		// Locator
		//1. Name
		driver.findElement(By.name("s")).sendKeys("gama");
		//2. Id
	//	boolean logoDisplayedStatus= driver.findElement(By.id("logo-events")).isDisplayed();
	//	System.out.print(logoDisplayedStatus);

//		//3.linktext and partial link test
//		driver.findElement(By.linkText("Demos")).click();
//	//	driver.findElement(By.partialLinkText("Supp")).click();
//
//		//4. Classname
//		
//       //  List<WebElement>headerLinks= (List<WebElement>) driver.findElements(By.className("dropdown"));
//	   //  System.out.println("Total number of header Links:"+headerLinks.size());
//	     
//	     List<WebElement>header= (List<WebElement>) driver.findElements(By.className("projects"));
//	     System.out.println("Total number of header Links:"+header.size());
//	    
//		 //5. Tagname
//	      List<WebElement>links =driver.findElements(By.tagName("a"));
//	      System.out.println("Total number of Links :"+links.size());
//	      List<WebElement> images= driver.findElements(By.tagName("img"));
//          System.out.println("Total number of images :"+ images.size());     	
//          
          /*
           : FindElement() : will locate single web element
                           ->Scanario 1 . Locator matching with single web element 
                                    findElement(loc)-->single Web element --WebElement
                                    findELements(loc)-->sinlge Wb element --List<WebElement
                           ->Scanario 2 . Locator matching with multi web element
                                    findElement(loc)--->single web element --WebElement
                                    findElements(loc)-->multiple web element --List <WebElement> 
                           ->>Scanario 3 .Locator is not matching with any elements
                                    findElement(loc)-->No Such Element Exception
                                    findElements(loc)-->will not throw any exception .Return 0              
           : FindElements() : will locate group of web element           
           */
	}


}