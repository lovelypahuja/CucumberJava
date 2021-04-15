package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoitclass {


		

			 public WebDriver driver;


			@BeforeTest 
			public void websitemain()
			{
			    WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();


			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			    String URL = "http://www.megafileupload.com/";

			    driver.get(URL);
			}

		

			@Test
			public void uploadFile() throws Throwable{

			    driver.findElement(By.xpath(".//a[contains(@class,'slider-btn')]")).click();        
			    driver.findElement(By.xpath(".//*[@id='initialUploadSection']")).click();
			    Runtime.getRuntime().exec("E:\\Softwares\\Testing\\FileIUploadAutoit.exe");


			}

			@AfterTest
			public void quit(){

			    driver.quit();
	}

}
