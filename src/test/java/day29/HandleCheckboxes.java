package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
	/*
	 * Checkboxes
	 * 
	 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1.Select Specific Checkboxes

	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. Select all the checkboxes
		
		List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
	//	2(1).simple For loop
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			
		//}
		//2(2).enhanced For loop
	//	for(WebElement checkbox:checkboxes) {
	//		checkbox.click();
	//	}
		
		//3.Select last 3 checkboxes
		//Starting Index= Total no.of checkboxes -how many checkboxes want to select
		//7-3=4(Starting index)
		
//		for (int i =4 ;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		//4. Select first 3 checkboxes
//		
//		for(int i =0;i<3;i++) {
//			checkboxes.get(i).click();
//		}
		
		//5.Unselect checkboxes if they are selected
		
//		for(int i =0;i<3;i++) {
//		checkboxes.get(i).click();
//	    }
//		
//		Thread.sleep(5000);
//
//		
//		for(int i =0;i<checkboxes.size();i++)
//		{	
//		if(checkboxes.get(i).isSelected()) {
//		checkboxes.get(i).click();   
//			}
		}
		
	}

}
