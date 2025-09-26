package Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_test {

	public static void main(String[] args) {
		//Create the driver object
		WebDriver Driver = new FirefoxDriver();
		
		//Create a Webdriverwait object
		WebDriverWait wait = new WebDriverWait(Driver, Duration. ofSeconds(10));
		//Open the page
		Driver.get("https://training-support.net/");
		//Verify using the page title
		System.out.println ("page title is "+ Driver.getTitle());
		
		
		
		//Close the browser
		Driver.quit();
	

	}

}
