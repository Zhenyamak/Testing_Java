package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SolutionHub {
	
	public WebDriver driver;
	
	public SolutionHub(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }

	public String get_result() {
		return driver.getCurrentUrl();
    }
}
