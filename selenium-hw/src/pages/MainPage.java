package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends headers {
	
	public MainPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/section/div/div[1]/section/div/div/div/div[3]/a")
    private WebElement engineer;
	
	public void engineer() {
		engineer.click();
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[9]/a")
    private WebElement check;
	
	public void check_lang() {
		check.click(); 
    }
	
	public void get(String url) {
		driver.navigate().to(url);
}
}
