package day26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		//Get() Methods

//		// getTitle()- return title of the page
//		System.out.println(driver.getTitle());
//		
//		//getCurrentUrl()-return the source code of the page 
//	    System.out.print(driver.getCurrentUrl());
//	    
//	    //getPageSource- return the source code of the page
//	  	System.out.println(driver.getPageSource());
//	  	
//		//getWindowHandle()-return ID of the single browser window 
//        String id=driver.getWindowHandle();
//        System.out.println("Window ID : "+id);
//        
//		//getWindowHandles()- return ID's of multiple browser windows
//		driver.findElement(By.linkText("Udemy Courses")).click();
//        Set<String> ids =driver.getWindowHandles();
//        System.out.println("Windows ID's : "+ids);
        
        //Conditional Method
		
		//isDisplayed () Methods
//		
//		boolean logo =driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
//		System.out.println("Logo Is Displayed : "+logo);
//		
//		isEnabled() Methods
//		
//	    boolean status=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).isEnabled();
//   	    System.out.println("Input box is Enabled : "+status);
//
//	    driver.findElement(By.id("name")).sendKeys("Hello");
// 	    driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Gama");
//   	 
//   	    //isSelected() Methods
//   	    
//        WebElement male_rd=driver.findElement(By.xpath("//input[@id=\"male\"]"));
//		WebElement female_rd=driver.findElement(By.xpath("//input[@id=\"female\"]"));
//		
//		System.out.println("Before Selection..............");
//		System.out.println(male_rd.isSelected());//false
//		System.out.println(female_rd.isSelected());//false 
//		
//		System.out.println("After Selection................");
//		
//		male_rd.click();
//		female_rd.click();
//		System.out.println(male_rd.isSelected());//true
//		System.out.println(female_rd.isSelected());//false
		
		
//		boolean newletterstatus= driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
//		System.out.println("News letter checkbox status : "+newletterstatus);
		
		
		//browser() Methods 
		
		Thread.sleep(5000);
		driver.findElement( By.xpath("Blog")).click();
		Thread.sleep(5000);
		driver.close();//close single browser window when ever the driver is focused
		driver.quit();//close all the browser window 

		
		
		
		
		

	}

}
