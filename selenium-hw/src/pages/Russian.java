package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Russian extends headers {

	public Russian(WebDriver driver) {
		super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
 }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button")
    private WebElement search;
	
	public void clicksearch() {
		search.click(); 
    }
	
	@FindBy(name = "q")
    private WebElement field;
	
	public void enter_word(String word) {
		field.sendKeys(word); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")
    private WebElement find;
	
	public void clickfind() {
		find.click(); 
    }

	public String get_result() {
		return driver.getCurrentUrl();
    }
}
