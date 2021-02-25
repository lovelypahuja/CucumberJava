package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_POM {
	WebDriver driver=null; 
	
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
		

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web");
	   
	} 

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.EnterPassword(password);
		
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	    }


	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("it is displayed");
		driver.quit();
	   
	}

}
