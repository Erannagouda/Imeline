package pomPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleResults {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		GoogleSources login=new GoogleSources(driver);
		Thread.sleep(2000);
		login.getSearchTF().sendKeys("Eranna");
		login.getSearchbutton().click();
		login.getThirdlink();
		
		
		
	}

}
