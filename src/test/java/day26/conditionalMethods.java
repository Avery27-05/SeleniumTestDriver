package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {
	/*
	 * Conditonal Methods -- access these commands through WebElement
 * 
 * isDisplayed() ---return  Boolean Value(T/F) --it will check the web Element is Display or not 
 * isEnabled()--- return Boolean Value (T/F)--- it will check the web element is enable or not 
 * isSelected() --return Boolean Value (T/F)--- this Method is specially we can use for radio buttons and checkboxes .
 * 	           -- It will check the Web Element is Selected or not 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.nopcommerce.com/register");
		//isDisplayed 
		
		//WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		//System.out.println("Logo is Displayed : "+logo.isDisplayed());
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Logo Is Displayed : "+logo);
		
		//isEnabled()---Perform some action on that element in web page. 
		//           ---Method especially used for input boxes .drop down, radio button and check boxes
		
		boolean status= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		
		System.out.println("Input Box is Enable : "+status);

		boolean status1= driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).isEnabled();
		
		System.out.println("Input Box is Enable : "+status1);
		
		// isSelected() methods --we can use to check the element is selected or not 
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection..............");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("After Selection................");
		
		male_rd.click();
	//	female_rd.click();
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		boolean newletterstatus= driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbox status : "+newletterstatus);
		
		
		
		

		
	}

}
