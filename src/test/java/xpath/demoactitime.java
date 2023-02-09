package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoactitime {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@id,'u')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@onclick,'openHelpAndSupportMenu(event)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'aboutPopupCloseButtonId')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'logoutLink')]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
