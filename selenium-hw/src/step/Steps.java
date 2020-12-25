package step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Engineer;
import pages.FAQ;
import pages.MainPage;
import pages.HowWeDoIt;
import pages.Insights;
import pages.OurWork;
import pages.Russian;
import pages.Search;
import pages.SolutionHub;
import pages.Article;
import pages.Healthcare;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;	

public class Steps {				

	public static WebDriver driver;
	public static MainPage main;
	public static Search search;
	public static Engineer engineer;
	public static FAQ faq;
	public static Russian ru;
	public static HowWeDoIt hwdi;
	public static Insights insights;
	public static SolutionHub sh;
	public static OurWork work;
	public static Article art;
	public static Healthcare hc;
	
	public void setup(String page) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(page);		
	}
	
	public void end() {
		driver.quit();
	}
	
    @Given("^I am on the page \"How we do it\"$")					
    public void launch_howwedoit() throws Throwable							
    {	
    	setup("https://www.epam.com/how-we-do-it");    	
    }		

    @When("^I click on Best practices plate$")			
    public void go_to_the_page1() throws Throwable 							
    {	
    	hwdi = new HowWeDoIt(driver);
    	hwdi.clickbestpractices();
    }		

    @Then("^I should see the page$")					
    public void	open_article() throws Throwable 							
    {	
    	art = new Article(driver);
    	Assert.assertEquals(art.get_result(), "https://www.epam.com/about/newsroom/in-the-news/2020/best-practices-for-a-post-pandemic-workplace");
    	driver.quit();					
    }				

    @When("^I click on words \"our own IP\"$")			
    public void go_to_the_page2() throws Throwable 							
    {		
    	hwdi = new HowWeDoIt(driver);
    	hwdi.ourownip();	
    }		

    @Then("^I go to the page SolutionHub$")					
    public void	open_solutionhub() throws Throwable 							
    {	
    	Thread.sleep(3000);
    	end();					
    }
    
    @Given("^I am on the page \"Our work\"$")					
    public void open_the_Chrome_and_launch_ourwork() throws Throwable							
    {	
    	setup("https://www.epam.com/our-work");					
    }
    
    @When("^I click on \"Healthcare\"$")			
    public void go_to_the_page3_1() throws Throwable 							
    {		
    	work = new OurWork(driver);
    	work.healthcare();
    }
    
    @When("^I click on \"Learn more\"$")			
    public void go_to_the_page3_2() throws Throwable 							
    {	
    	hc = new Healthcare(driver);
    	Thread.sleep(2000);
    	hc.learnmore();
    }
    
    @Then("^I go to the page about the solution for this customer$")					
    public void	open_solution_customer() throws Throwable 							
    {	
    	end();	
    }
    
    @Given("I am on page \"Insights\"$")					
    public void open_the_Chrome_and_launch_insights() throws Throwable							
    {	
    	setup("https://www.epam.com/insights");					
    }
    
    @When("^I click on \"<epam>\"$")			
    public void go_to_the_page4() throws Throwable 							
    {
    	insights = new Insights(driver);
        insights.clickepam();
    }		

    @Then("^I go to the main page$")					
    public void	go_home() throws Throwable 							
    {	
    	Thread.sleep(1000);
    	Assert.assertEquals(insights.get_result(), "https://www.epam.com/");    
    	end();					
    }
    
    @Given("^I am on the main page$")
    public void open_the_Chrome_and_launch_mainpage() throws Throwable							
    {	
    	setup("https://www.epam.com");
    	main = new MainPage(driver);
    }
    
    @When("^I click on \"About\"$")			
    public void go_to_the_page5_1() throws Throwable 							
    {	
    	main.clickabout();
    }
    
    @When("^I click on \"FAQ\"$")			
    public void go_to_the_page5_2() throws Throwable 							
    {	
    	Thread.sleep(1000);
    	main.faq();
    }
    
    @Then("^I go to the page with FAQ$")					
    public void	go_faq() throws Throwable 							
    {	
    	faq = new FAQ(driver);
    	Assert.assertEquals(faq.get_result(), "https://investors.epam.com/investors/faq");
    	driver.quit();					
    }
    
    @When("^I click on Search button$")			
    public void go_to_the_page6_1() throws Throwable 							
    {	
    	main.clicksearch();
    }
    
    @When("^I search for \"Cucumber\"$")			
    public void go_to_the_page6_2() throws Throwable 							
    {	
    	main.enter_word("Cucumber");
    	main.clickfind();
    }
    
    @Then("^I see list of aricles that have word \"cucumber\"$")					
    public void	found_cucumber() throws Throwable 							
    {	
    	search = new Search(driver);
    	Assert.assertEquals(search.get_result(), "https://www.epam.com/search?q=" + "Cucumber");
    	end();				
    }
    
    @Given("^I changed site's language to russian$")			
    public void change_language() throws Throwable 							
    {	
    	main = new MainPage(driver);
    	main.clickglobal();
    	Thread.sleep(1000);
    	main.check_lang();
    	Thread.sleep(1000);
    }
    
    @When("^I search for \"ָהוÿ\"$")			
    public void go_to_the_page7() throws Throwable 							
    {	
    	ru = new Russian(driver);
    	ru.clicksearch();
    	ru.enter_word("ָהוÿ");
    	ru.clickfind();
    }
    
    @Then("^I see list of aricles that have word \"ָהוÿ\"$")					
    public void	found_ideas() throws Throwable 							
    {	
    	search = new Search(driver);
    	Assert.assertEquals(search.get_result(), "https://www.epam-group.ru/search?q=%D0%98%D0%B4%D0%B5%D1%8F");
    	end();						
    }
    
    @When("^I click on plate \"Engineer\"$")			
    public void go_to_the_page8() throws Throwable 							
    {	
    	main = new MainPage(driver);
    	main.engineer();
    }
    
    @Then("^I see info about engineer$")					
    public void	cloud_develops() throws Throwable 							
    {	
    	engineer = new Engineer(driver);
    	Assert.assertEquals(engineer.get_result(), "https://www.epam.com/services/engineer");
    	driver.quit();			
    }
}		
