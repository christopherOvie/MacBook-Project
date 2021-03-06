package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class macBookProPage {

	
	
	@FindBy(how = How.LINK_TEXT, using="Overview")
	  public static WebElement Overview;
	
	@FindBy(how = How.LINK_TEXT, using="macOS")
	  public static WebElement macOS;
	
	@FindBy(how = How.LINK_TEXT, using="Tech Specs")
	  public static WebElement TechSpecs;
	
	@FindBy(how = How.LINK_TEXT, using="Buy")
	  public static WebElement Buy;
	
	
	@FindBy(how = How.LINK_TEXT, using="MacBook Pro")
	  public static WebElement MacBookPro;

	
	 @FindBy(how = How.CSS, using =".mac3 > .icon-copy")
	 public static WebElement int15inchMacBookTouchBar;
	
	public void click_Overview(){
		Overview.click();	
	}
	public void click_macOS(){
		macOS.click();	
	}
	public void click_TechSpecs(){
		TechSpecs.click();	
	}
	public void click_Buy(){
	Buy.click();	
	}
	
	public void click_MacBookPro(){
		MacBookPro.click();
	}
	public void click_int15inchMacBookTouchBar(){
		int15inchMacBookTouchBar.click();	
		}
}
