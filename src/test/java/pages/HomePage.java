package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	  
	@FindBy(how = How.LINK_TEXT, using = "Buy iPhone XR")
	 public static WebElement BuyiPhoneXR;
	
	@FindBy(how = How.LINK_TEXT, using = "Buy iPhone XS")
	 public static WebElement BuyiPhoneXS;
	
	@FindBy(how = How.LINK_TEXT, using = "iPhone XR")
	 public static WebElement iPhoneXR;
	
	@FindBy(how = How.LINK_TEXT, using = "iPhone XS")
	 public static WebElement iPhoneXS;
	
	@FindBy(how = How.LINK_TEXT, using = "iPhone Pro")
	 public static WebElement iPhonePro;
	
	
	
	public void click_Buy_iPhone_XR(){
		BuyiPhoneXR.click();	
	}
	public void click_Buy_iPhone_XS(){
		BuyiPhoneXS.click();
	}
	public void click__iPhone_XR(){
		iPhoneXR.click();
}
	public void click__iPhone_XS(){
		iPhoneXS.click();
}
	
	public void click__iPhone_Pro(){
		 iPhonePro.click();
}

}	