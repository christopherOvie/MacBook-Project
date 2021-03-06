package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyMacbookProPage {

	 @FindBy(how=How.XPATH, using ="//button[contains(text(),'15-inch')]")
	 public static WebElement int15InchTextField;
	 
	 @FindBy(how = How.XPATH, using = "//h2[contains(text(),'15-inch MacBook Pro')]")
	 public static WebElement int15InchMacBookPro ;
	 
	 @FindBy(how = How.CSS, using = ".mac3 > .icon-c")
	 public static WebElement int15inchMacBookTouchBar;
	 
	 //css=.as-selected:nth-child(2) .as-swatch
}
