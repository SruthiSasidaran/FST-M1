package Project;



import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

	public class Activity1 {
	    // Driver Declaration
	    AndroidDriver driver;

	    // Set up method
	    @BeforeClass
	    public void setUp() throws MalformedURLException, URISyntaxException {
	        // Desired Capabilities
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setApp("C:/Users/SSruthi/.appium/ts-todo-list-v1");
	        options.noReset();

	        // Server Address
	        URL serverURL = new URI("http://localhost:4723").toURL();

	        // Driver Initialization
	        driver = new AndroidDriver(serverURL, options);
	        
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    }

	    // Test method
	    @Test
	    public void TestMethod() {
	    	System.out.println("smoke test");
	    	//Find and add button to add task to do the list
	    	//activity1
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/fab_new_task")).click();
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("Activity1");
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority")).click();
	    	wait.until1(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView@text=\"High\"]")));;
	        driver.findElement(AppiumBy.xpath("android.widget.TextView@text=\\\"High\\")).click();
	        driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();
	        
	        //activity2
	        driver.findElement(AppiumBy.id("com.app.todolist:id/fab_new_task")).click();
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("Activity2");
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority")).click();
	    	wait.until1(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView@text=\"Medium\"]")));
	        driver.findElement(AppiumBy.xpath("android.widget.TextView@text=\\\"Medium\\")).click();
	        driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();
	        
	        
	       //activity3
	        driver.findElement(AppiumBy.id("com.app.todolist:id/fab_new_task")).click();
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("Activity3");
	    	driver.findElement(AppiumBy.id("com.app.todolist:id/tv_new_task_priority")).click();
	    	wait.until1(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView@text=\"Low\"]")));
	        driver.findElement(AppiumBy.xpath("android.widget.TextView@text=\\\"Low\\")).click();
	        driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();
	    
	    //Assertion
	        List<WebElement> tasks = driver.findElements(AppiumBy.className("android.widget.checkbox"));
	        Assert.assertEquals(tasks.size(),3);
	        
	    }


	    // Tear down method
	    @AfterClass
	    public void tearDown() {
	        // Close the app
	        driver.quit();
	    }
	}





