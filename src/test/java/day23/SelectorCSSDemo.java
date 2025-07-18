package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorCSSDemo {

	public static void main(String[] args) {
		
/*
  CSS selector          Representation/syntax
  tag id                -->tag#id
  tag class             -->tag.classname   ...  locate group of element bcoze class name is same for all the element or most of element 
  tag attribute         -->tag[attribute="value"]
  tag class attribute   -->tag.classname[attribute="value"] ...use this then it locate only single specific element 
 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();  //maximize the browser window 
		//1.  Tag and Id 
		
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone 15");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphones 15");
		
		//2. tag and class-name   -->tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("macbooks");
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("macbooks");
		
		//3.tag and attribute -->tag[attribute="value"]
		//  driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("battery");
		  
		  
		//4.  tag class attribute   -->tag.classname[attribute="value"]
		// driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("gama");
		 //driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("gama"); 
		

	}

}
