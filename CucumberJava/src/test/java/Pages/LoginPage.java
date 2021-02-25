package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
By txt_username = By.id("name");
By txt_password = By.id("password");
By txt_login_btn = By.id("login");

public void enterUsername(String username) {
	driver.findElement(txt_username).sendKeys(username);
	}

public void EnterPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}

public void loginBtn() {
	driver.findElement(txt_login_btn).click();
	
}
 
}

