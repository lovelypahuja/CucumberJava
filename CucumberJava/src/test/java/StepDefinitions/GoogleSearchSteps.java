package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	@Given("User has opened browser")
	public void user_has_opened_browser() {
		System.out.println("step1 printed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  
	}

	@And("User is on Google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");
		System.out.println("step2 printed");
	    
	}

	@When("user enters text")
	public void user_enters_text() {
		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		System.out.println("step3 printed");
		
	  	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("step4 printed");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
		System.out.println("step5 printed");
	    
	}



}
