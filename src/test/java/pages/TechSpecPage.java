package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechSpecPage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MacBook Pro')]")
	 public static WebElement MacBookPro ;

	 @FindBy(how = How.CSS, using = "#13-inch-label")
	 public static WebElement int13inchLapTopTextField ;
	 
	 @FindBy(how = How.CSS, using = "#15-inch-label")
	 public static WebElement int15inchLapTopTextField ;
	 
	 
	 @FindBy(how = How.LINK_TEXT, using="Logic Pro X")
	  public static WebElement LogicProX;
	 
	 
	 @FindBy(how = How.LINK_TEXT, using="USB‑C to USB Adapter")
	  public static WebElement USBCtoUSBAdapter;
	 
	 @FindBy(how = How.XPATH, using = "a[@class='ac-ln-button']")
	 public static WebElement Buy ;
	 
	 @FindBy(how = How.CSS, using = "image-15-touchbar:nth-child(1)")
	 public static WebElement int15InchSilverLapTop ;
	
	 
	 @FindBy(how = How.CSS, using = ".large-12 > .violator")
	 public static WebElement int16GBMemoryInputField; 
	 

		public void verify_MacBookPro(){
			MacBookPro.getText();
		}
	 public void click_int13inchLapTopTextField (){
		 int13inchLapTopTextField .click();	
		}
	 
	 public void click_int15inchLapTopTextField(){
		 int15inchLapTopTextField.click();
		}
	 
	 public void click_LogicProX(){
		 LogicProX.click();
		}
	 public void click_USBCtoUSBAdapter(){
		 USBCtoUSBAdapter.click();
		 
		}
	 
	 
	 public void click_Buy(){
			Buy.click();
	 }	
	 
	 public void verify_int16GBMemoryInputField(){
		 int16GBMemoryInputField.isEnabled();
		}
	 public void click_FifteenInchSilverLapTop(){
		 int15InchSilverLapTop.click();
		}
}
