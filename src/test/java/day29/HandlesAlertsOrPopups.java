package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAlertsOrPopups {
	/*
	 * JavaScript Alerts
	 * 1. normal Alerts--> they have only OK buttons
	 * 2. confirm Alerts--> they have two buttons (Ok and cancel)
	 * 3. Prompting Alerts-->they have one input box along with two buttons (Ok and cancel)
	 * 
	 * alerts are not WebElements and we are not inspect the buttons and input boxes
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
//		//1.Normal Alerts -only OK button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		
//		Thread.sleep(5000);
//		
//	    Alert myalerts = driver.switchTo().alert();
//	    System.out.println(myalerts.getText());
//	    myalerts.accept();    // ok button using accept methods
//	    
//	    //2.Confirmation ALerts -having two button (OK and Cancel)
//	    
//	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//	    
//	    Thread.sleep(5000);
//	    
//	    //Accept method --> Ok button
//	    driver.switchTo().alert().accept(); //close alert using OK buttons
//	    
//	    Alert myaccept = driver.switchTo().alert();
//	    System.out.println(myaccept.getText());
//	    myaccept.accept();    // ok button using accept methods
//	    
//	    //Dismiss Method --> Cancel Button
//	    
//	    driver.switchTo().alert().dismiss(); //close alert using Cancel buttons
//	    
//	    Alert myDismiss = driver.switchTo().alert();
//	    System.out.println(myDismiss.getText());
//	    myDismiss.dismiss();    // ok button using accept methods
	    
	    
	    //3.Prompt Alerts -having one input box and two button
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	    
	    Thread.sleep(5000);
	    Alert myPrompt= driver.switchTo().alert();
	    
	    
	    myPrompt.sendKeys("Welcome");
	    myPrompt.accept();
   
		
	}

}
