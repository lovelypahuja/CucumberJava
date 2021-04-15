package SeleniumSessions;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com");
	
java.util.List<WebElement> ALLURLs= driver.findElements(By.tagName("a"));
System.out.println("all urls are " +ALLURLs);
String url="";

Iterator <WebElement> iterator= ALLURLs.iterator();
while (iterator.hasNext()){
	url=iterator.next().getText();
	System.out.println(url);
}

	}

}
