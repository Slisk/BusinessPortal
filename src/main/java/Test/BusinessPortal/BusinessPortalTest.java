package Test.BusinessPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusinessPortalTest {
    	
    	WebDriver driver = new ChromeDriver(); 
    	JavascriptExecutor jse = (JavascriptExecutor)driver; 
    	BusinessPortalDescriptionOfTest BT = new BusinessPortalDescriptionOfTest(); 
    	
    	@BeforeSuite 
    	public void getBrowser() {
    		String browser = "https://stage-retailer-portal.urb-it.com/"; 
    		driver.get(browser); 
    		Reporter.log("Browser launched");
    		driver.manage().window().maximize();
    	}
    	@AfterSuite
    	public void closeBrowser() {
    		driver.close();
    		driver.quit();
    	}
    	@BeforeTest 
    	public void timeToWait() {
    		try {
    			Thread.sleep(10000);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    	@AfterTest 
    	public void timeToWait2() {
    		try {
    			Thread.sleep(5000);
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    	
    	@Test
    	public void testLogIn() {
    		BusinessPortalDescriptionOfTest.LogInUsernameTest(driver); 
    		BusinessPortalDescriptionOfTest.LogInPasswordTest(driver); 
    		BusinessPortalDescriptionOfTest.LogInSubmitBtnTest(driver); 
    		Reporter.log("Log-in successfull"); 
    	}
    	
    	@Test
    	public void clickOnPingInFooter() {
    		System.out.println("Check if sms is being sent out for paid ping order");
    		BusinessPortalDescriptionOfTest.clickPing(driver); 
    		Reporter.log("SMS sent away, succesfully"); 
     	}
    
}
