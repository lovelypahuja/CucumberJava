package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDev {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:9222");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	}

}
