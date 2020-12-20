package step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;
    @Given("^I am on the page \"How we do it\"$")					
    public void open_the_Chrome_and_launch_howwedoit() throws Throwable							
    {	
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");					
    	driver= new ChromeDriver();					
    	driver.manage().window().maximize();
    	driver.get("https://www.epam.com/how-we-do-it");					
    }		

    @When("^I click on Best practices plate$")			
    public void go_to_the_page1() throws Throwable 							
    {		
       driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[6]/section/div/div/div/ul/li[2]/a/div[2]")).click();
    }		

    @Then("^I should see the page$")					
    public void	open_article() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }				

    @When("^I click on words \"our own IP\"$")			
    public void go_to_the_page2() throws Throwable 							
    {		
       driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div/div/div/div[2]/div/p/span/span/u/a")).click();	
    }		

    @Then("^I go to the page SolutionHub$")					
    public void	open_solutionhub() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
    
    @Given("^I am on the page \"Our work\"$")					
    public void open_the_Chrome_and_launch_ourwork() throws Throwable							
    {	
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");					
    	driver= new ChromeDriver();					
    	driver.manage().window().maximize();
    	driver.get("https://www.epam.com/our-work");					
    }
    
    @When("^I click on \"Healthcare\"$")			
    public void go_to_the_page3_1() throws Throwable 							
    {		
       driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/ul/li[8]/a")).click();
    }
    
    @When("^I click on \"Learn more\"$")			
    public void go_to_the_page3_2() throws Throwable 							
    {	
    	Actions action = new Actions(driver);
    	WebElement element=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[1]"));
    	action.moveToElement(element).click().build().perform();
       driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div[2]/ul/li[2]/div[2]/div/a")).click();
    }
    
    @Then("^I go to the page about the solution for this customer$")					
    public void	open_solution_customer() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();	
    }
    
    @Given("I am on page \"Insights\"$")					
    public void open_the_Chrome_and_launch_insights() throws Throwable							
    {	
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");					
    	driver= new ChromeDriver();					
    	driver.manage().window().maximize();
    	driver.get("https://www.epam.com/insights");					
    }
    
    @When("^I click on \"<epam>\"$")			
    public void go_to_the_page4() throws Throwable 							
    {		
       driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a")).click();
    }		

    @Then("^I go to the main page$")					
    public void	go_home() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
    
    @Given("^I am on the main page$")
    public void open_the_Chrome_and_launch_mainpage() throws Throwable							
    {	
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");					
    	driver= new ChromeDriver();	
    	driver.manage().window().maximize();
    	driver.get("https://www.epam.com");	
    }
    
    @When("^I click on \"About\"$")			
    public void go_to_the_page5_1() throws Throwable 							
    {	
    	Actions action1 = new Actions(driver);
    	WebElement element1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/span[1]/a"));
    	action1.moveToElement(element1).build().perform();
    	Thread.sleep(2000);
    }
    
    @When("^I click on \"FAQ\"$")			
    public void go_to_the_page5_2() throws Throwable 							
    {	
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/div/ul[3]/li/ul/li[7]/a")).click();
    }
    
    @Then("^I go to the page with FAQ$")					
    public void	go_faq() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
    
    @When("^I click on Search button$")			
    public void go_to_the_page6_1() throws Throwable 							
    {	
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button")).click();
    }
    
    @When("^I search for \"Cucumber\"$")			
    public void go_to_the_page6_2() throws Throwable 							
    {	
    	driver.findElement(By.name("q")).sendKeys("cucumber");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
    }
    
    @Then("^I see list of aricles that have word \"cucumber\"$")					
    public void	found_cucumber() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
    
    @Given("^I changed site's language to russian$")			
    public void change_language() throws Throwable 							
    {	
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[9]/a")).click();
    	Thread.sleep(3000);
    }
    
    @When("^I search for \"ָהוÿ\"$")			
    public void go_to_the_page7() throws Throwable 							
    {	
    	driver.findElement(By.name("q")).sendKeys("טהוÿ");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
    }
    
    @Then("^I see list of aricles that have word \"ָהוÿ\"$")					
    public void	found_ideas() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
    
    @When("^I click on plate \"Engineer\"$")			
    public void go_to_the_page8() throws Throwable 							
    {	
    	Actions action2 = new Actions(driver);
    	WebElement element2=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[3]/section/div/div[1]/section/div/div/div/div[3]"));
    	action2.moveToElement(element2).click().build().perform();
    	WebElement element3=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[4]/section/div/div/blockquote/div/div[1]"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
    }
    
    @Then("^I see info about engineer$")					
    public void	cloud_develops() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	driver.quit();					
    }
}		
