package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdapterPage {
	@FindBy(how = How.XPATH, using = "h1[@class='materializer']")
	 public static WebElement USB_CtoUSBAdapter;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to Bag')]")
	 public static WebElement AddToBag;
	
	
	
	@FindBy(how = How.XPATH, using = "a[@class='localnav-title']")
	 public static WebElement Accessories ;
	
	
	
//	Select days = new Select(driver.findElement(By.id("days")));//select date of birth from dropdown
//	days.selectByIndex(4);
//	public void verify_USB_CtoUSBAdapter(){
//		USB_CtoUSBAdapter.getText();
//	}
	
	
	public void click_AddToBag(){
		AddToBag.click();	
	}
	
	public void verify_USB_CtoUSBAdapter(){
		USB_CtoUSBAdapter.getText();
	}
	
	public void verify_Accessories(){
		Accessories.getText();
	}
}
