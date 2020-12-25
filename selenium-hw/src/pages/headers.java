package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headers {
	
	public WebDriver driver;
	
	public headers(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[6]/section/div/div/div/ul/li[5]/a/div[2]")
    private WebElement bestpractices;
	
	public void clickbestpractices() {
		bestpractices.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div/div/div/div[2]/div/p/span/span/u/a")
    private WebElement ourownip;
	
	public void ourownip() {
		ourownip.click(); 
    }
	
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/ul/li[8]/a")
    private WebElement healthcare;
	
	public void healthcare() {
		healthcare.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[1]")
    private WebElement maxim;
	
	public void learnmore() { 
		Actions actions = new Actions(driver); 
		actions.moveToElement(maxim).perform();
    	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[2]/div/a")).click();
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/span[1]/a")
    private WebElement about;
	
	public void clickabout() {
    	Actions action1 = new Actions(driver);
    	action1.moveToElement(about).build().perform();
    }
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/div/ul[3]/li/ul/li[7]/a")
    private WebElement faq;
	
	public void faq() {
		faq.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")
    private WebElement global;
	
	public void clickglobal() {
		global.click(); 
    }
	
	public String get_result() {
		return driver.getCurrentUrl();
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a")
    private WebElement epam;
	
	public void clickepam() {
		epam.click(); 
    }
}
