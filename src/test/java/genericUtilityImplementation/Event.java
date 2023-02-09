package genericUtilityImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Event {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");

		String expected_title = "vtiger CRM 5 - Commercial Open Source CRM";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println("URL passed");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("Ragnor");
		driver.findElement(By.id("submitButton")).click();
		String expected_home = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actual_home = driver.getTitle();
		Assert.assertEquals(expected_home, actual_home);
		System.out.println("in home page");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "http://localhost:8888/index.php?action=index&module=Home");

		WebElement wb = driver.findElement(By.xpath("//select[@id=\"qccombo\"]"));
		Select select = new Select(wb);
		select.selectByValue("Events");
		System.out.println("new event selected");

		WebElement subjectTF = driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[1]"));
		System.out.println(1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value=arguments[1]", subjectTF, "Hello");
		System.out.println(2);

	}

}
