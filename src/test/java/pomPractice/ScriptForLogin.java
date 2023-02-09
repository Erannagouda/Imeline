package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForLogin {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login=new LoginPage(driver);
		
		login.getPasswordTF().sendKeys("manager");
		login.getUsernameTF().sendKeys("admin");
		login.getLoginbutton().click();
	}

}
