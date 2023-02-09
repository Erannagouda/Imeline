package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSources {
	
	public GoogleSources(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	
	@FindBy(xpath = "//input[@class=\"gLFyf\"]")
	private WebElement searchTF;
	
	@FindBy(xpath = "(//input[@value=\"Google Search\"])[2]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//h3[text()=\"Eranna Kadadi - Wikipedia\"]")
	private WebElement thirdlink;


	public WebElement getSearchbutton() {
		return searchbutton;
	}


	public WebElement getThirdlink() {
		return thirdlink;
	}


	public WebElement getSearchTF() {
		return searchTF;
	}

	
	
	
	
}
