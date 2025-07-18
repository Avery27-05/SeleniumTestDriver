package day29;


import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAuthenticatedPopup {
/*
 * Authenticated Pop-up
 * normally we were working on real time environment if you're able to access real application until 
    you provide your user-name and password 
 * we can't use switch command and explicit waits in it.
 * so we pass the user-name and password we have to pass along with the URL that process is called Injection process
 * we inject userr-name and password inside the this URL itself then we can avoid that particular authenticated popup so we cannot handle directly but we can skip it we can avoid it 
 * 
 * import java.time.Duration;

    https://the-internet.herokuapp.com/basic_auth
-- https://username:password@the-internet.herokuapp.com/basic_auth

e.g., https://admin:admin@the-internet.herokuapp.com/basic_auth
 */
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		

	}

}
//Assignment 
//
