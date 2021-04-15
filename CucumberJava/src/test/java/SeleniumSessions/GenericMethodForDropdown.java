package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethodForDropdown {
	
	static WebDriver driver;

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Industry= By.id("Form_submitForm_Industry");
		By Country= By.id("Form_submitForm_Country");
		By NoOfEmployees= By.id("Form_submitForm_NoOfEmployees");
	
		/*
		 * Select select1 = new Select(driver.findElement(Industry));
		 * select1.selectByVisibleText("Education"); Select select2 = new
		 * Select(driver.findElement(Country)); select2.selectByVisibleText("India");
		 */
		/*
		 * doSelectByVisibleText(Industry,"Education");
		 * doSelectByVisibleText(Country,"India"); doSelectByIndex(NoOfEmployees,3);
		 * doSelectByValue(Industry,"Aerospace");
		 */
		
		SelectDropDownValue(Industry,Dropdown.INDEX.toString(), "5");
		SelectDropDownValue(Industry,Dropdown.VALUE.toString(), "Aerospace");
		SelectDropDownValue(Industry,Dropdown.VISIBLETEXT.toString(), "Healthcare");
		
		
	}
	public static void SelectDropDownValue(By locator, String Type,String value) {
		Select select = new Select(getElement(locator));
		switch (Type) {
		case "Index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
		System.out.println("please enter correct criteria.....");
		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String value) {
	Select select = new Select(getElement(locator));
	select.selectByVisibleText(value);
	}
	public static void doSelectByIndex(By locator, int Index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(Index);
	}

	public static void doSelectByValue(By locator, String value) {
	Select select = new Select(getElement(locator));
	select.selectByValue(value);
	}

}
