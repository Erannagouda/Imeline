package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class AllLogins {
	WebDriver driver;
  
	 @Test(priority = 4)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
		  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@xyz.com");
		  driver.findElement(By.id("pass")).sendKeys("0123");
		  driver.findElement(By.name("login")).click();
	 }
	 
	 @Test(priority = 1,invocationCount = 2)
	  public void actitime() throws InterruptedException {
		  driver.get("https://demo.actitime.com/login.do");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(3000);   
	  }
	 
	 @Test(enabled = false)
	  public void twitter() {
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--disable-notifications");
		  driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
	 }
	 
	 @Test(priority = 2)
	  public void vtiger() throws InterruptedException {
		  driver.get("http://localhost:8888/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  driver.findElement(By.name("user_password")).sendKeys("Ragnor");
		  driver.findElement(By.id("submitButton")).click();
		  Thread.sleep(3000);
	 }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	 
	  
  }

}
