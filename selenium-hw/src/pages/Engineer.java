package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Engineer {
	
	public WebDriver driver;
	
	public Engineer(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }

	public String get_result() {
		return driver.getCurrentUrl();
    }
}
