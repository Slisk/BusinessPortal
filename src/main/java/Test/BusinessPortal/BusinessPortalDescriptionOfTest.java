package Test.BusinessPortal;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class BusinessPortalDescriptionOfTest {
	public static WebElement element = null; 
	public static Point coordinates = null; 

	 
	public static WebElement LogInUsernameTest(WebDriver driver) {
		element = BusinessPortalElements.LogInUsername(driver);
		element.sendKeys("wayne@urbit.com"); 
		return element; 
	}
	public static WebElement LogInPasswordTest(WebDriver driver) {
		element = BusinessPortalElements.LogInPassword(driver); 
		element.sendKeys("Test2012");
		return element; 
	}
	public static WebElement LogInSubmitBtnTest(WebDriver driver) {
		element = BusinessPortalElements.LogInSubmitBtn(driver); 
		element.click();
		return element; 
	}
	
	public static WebElement clickPing(WebDriver driver) {
		
		element = BusinessPortalElements.Ping(driver);
		element.click(); 
		return element;  
	}

}
