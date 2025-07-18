package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.demoblaze.com");
		driver.manage().window().maximize();
		
//		List<WebElement>links =driver.findElements(By.tagName("a"));
//	      System.out.println("Total number of Links :"+links.size());
//	    List<WebElement> images= driver.findElements(By.tagName("img"));
//          System.out.println("Total number of images :"+ images.size());
//          
          
          
//      	driver.findElement(By.linkText("Contact")).click();
          	driver.findElement(By.linkText("Nexus 6")).click();

 //           driver.findElement(By.partialLinkText("Nexus ")).click();

		
	}
}
