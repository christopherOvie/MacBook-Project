package step_Definitn;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MacPage;
import pages.TechSpecPage;
import pages.macBookProPage;

public class OrderStep_Definitn {
	public WebDriver driver;
	                          
	
	
	@Given("^the url 'https://www\\.apple\\.com/uk/'$")
	public void the_url_https_www_apple_com_uk() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");//initialise the WebDriver
		driver = new ChromeDriver();
	    driver.navigate().to("https://www.apple.com/uk/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("^I click on Mac link$")
	public void i_click_on_Mac_link() throws Throwable {
		MacPage page = PageFactory.initElements(driver, MacPage.class);
		page.click_iMac();
	}

	@Given("^I also click on MacBook Pro Icon$")
	public void i_also_click_on_MacBook_Pro_Icon() throws Throwable {
		MacPage page = PageFactory.initElements(driver, MacPage.class);
		page.click_MacBookPro();
	    
	}	
	
	
	@Given("^I click on the Tech Specs link$")
	public void i_click_on_the_Tech_Specs_link() throws Throwable {
		macBookProPage page = PageFactory.initElements(driver, macBookProPage.class);
	    page.click_TechSpecs();
	}
	
	//When I choose a MacBook Pro with the following features and accessories
	@When("^I choose a MacBook Pro with the following features and accessories$")
	public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable dt) throws Throwable {
		 //returns map object..map is interface and dt = object reference name
		//key type we are using(Column names Options and Specifications are String types)
	List<Map<String, String>> list = dt.asMaps(String.class, String.class); 
	for(int i =0; i<list.size(); i++){  //use forloop to parameterise it
	
		System.out.println(list.get(1).get("Options"));
		System.out.println(list.get(1).get("Specifications"));
		driver.findElement(By.cssSelector("input[class='form-choice form-choice-selector'][id='15-inch-label']")).click();//click 15 inch text box
	
		driver.findElement(By.cssSelector(".ac-ln-button")).click();// click buy to purchase
		
	    driver.findElement(By.xpath("//button[contains(.,'15-inch')]")).click();//
	    Thread.sleep(5000);
	    
	    	
	    	driver.findElement(By.cssSelector("#model-selection > bundle-selection > div.as-l-container.as-bundleselection-container > div.as-bundleselection-model.as-bundleselection-group3.as-bundleselection-modelactive > div.as-bundleselection-modelvariationsbox.row > div > div:nth-child(2) > div > bundle-selector > div.as-colorselector.colorOptions > fieldset > ul > li:nth-child(2) > label > span.as-swatch")).click();
	   	System.out.println("This is good test");//silver radio button
	    
	    driver.findElement(By.xpath("//div[@class='as-macbtr-options acc_MV932B/A rs-noAnimation as-bundleselection-modelshown']//span[@class='label'][contains(text(),'Select')]")).click();//click the select button
	
	    driver.findElement(By.cssSelector("form#configuration-form ")).click();
	
	
	   WebElement logicProXelement = driver.findElement(By.xpath("//div[contains(text(),'Logic Pro X')]"));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();", logicProXelement);  // clicking Login Pro X

	//driver.findElement(By.cssSelector("form#configuration-form div.as-configuration-category.as-configuration-categorypresoftware > div:nth-child(3) > div > div > fieldset > div > div:nth-child(2) > div > div > label > div > div")).click();
      
      
      
	driver.findElement(By.cssSelector("button[type='submit'][value='add-to-cart']")).click();//add to bag
	driver.findElement(By.cssSelector("button[data-autom*='usbCtousbGridGroup']")).click();  // add USB-C to USB Adapter
	
	driver.findElement(By.cssSelector("#summaryheader-form > div > span > button > span")).click();
    driver.findElement(By.id("shoppingCart.actions.checkout")).click();//click on checkout
    driver.close();
	}

	}
	@Then("^I can place an order for it\\.$")
	public void i_can_place_an_order_for_it() throws Throwable {
		//driver.findElement(By.id("shoppingCart.actions.checkout")).click(); 
	}

	@Given("^when I choose the following items:$")
	public void when_I_choose_the_following_items(DataTable arg1) throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@When("^I proceed to checkout$")
	public void i_proceed_to_checkout() throws Throwable {
	  
	}

	@Then("^a total price of £(\\d+)\\.(\\d+) will be displayed$")
	public void a_total_price_of_£_will_be_displayed(int arg1, int arg2) throws Throwable {

	}

}
