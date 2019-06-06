package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MacPage {

	
	
	@FindBy(how=How.LINK_TEXT, using="Compare")
	  public static WebElement Compare;
	
	@FindBy(how = How.LINK_TEXT, using="Mac")
	  public static WebElement iMac;

	@FindBy(how = How.CSS, using=".chapternav-item-macbook-pro .chapternav-icon")
	  public static WebElement MacBookPro;
	
	@FindBy(how = How.LINK_TEXT, using="Accessories")
	  public static WebElement Accessories;
	
	@FindBy(how = How.LINK_TEXT, using="MacBook Air")
	  public static WebElement MacBookAir;

	
	public void verify_Compare(){
		Compare.getText();
	}
	public void click_iMac(){
		iMac.click();
	}
	public void click_MacBookPro(){
		MacBookPro.click();	
	}
	public void click_Accessories(){
		Accessories.click();
	}
	
	public void click_MacBookAir(){
		MacBookAir.click();
	}

	
}
