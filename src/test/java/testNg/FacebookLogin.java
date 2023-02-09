package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookLogin {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@xyz.com");
	  driver.findElement(By.id("pass")).sendKeys("0123");
	  driver.findElement(By.name("login")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
