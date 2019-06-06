package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	  @FindBy(how = How.LINK_TEXT, using ="Support")
	  public static WebElement Support;
	  
	@FindBy(how = How.XPATH, using = "//a[@class='ac-gn-link ac-gn-link-music']")
	 public static WebElement Music;

	@FindBy(how = How.LINK_TEXT, using = "Tv")
	 public static WebElement Tv;
	
	
	@FindBy(how = How.XPATH, using = "a[@class='ac-gn-link ac-gn-link-iphone']")
	 public static WebElement iPhone;
	
	@FindBy(how = How.LINK_TEXT, using = "iPad")
	 public static WebElement iPad;
	
	@FindBy(how = How.XPATH, using = "a[@class='ac-gn-link ac-gn-link-mac']")
	 public static WebElement Mac;
	
	
	
	public void click_Support(){
		Support.click();
	}
	
	public void click_Music(){
		Music.click();
	}
	
	public void click_Tv(){
		Tv.click();
	}
	public void click_iPhone(){
		iPhone.click();
	}
	
	public void click_iPad(){
	iPad.click();
	}
	
	
	public void click_Mac(){
		Mac.click();
		}
}
