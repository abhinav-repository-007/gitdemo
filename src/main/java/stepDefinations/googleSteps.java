package stepDefinations;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSteps {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//  WebDriverManager.firefoxdriver().setup();
		//  WebDriverManager.edgedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    //	WebDriver driver = new FirefoxDriver();
		//  WebDriver driver = new EdgeDriver();
	    	//Thread.sleep(5000);
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    driver.get("https://www.google.com");
		    String title=   driver.getTitle();
		    System.out.println("title : "+ title);
		    driver.quit();
	    
	    
	}
}
