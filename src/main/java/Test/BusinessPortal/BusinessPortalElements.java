package Test.BusinessPortal;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusinessPortalElements {
	
	public static WebElement element = null; 
	public static Point coordinates = null; 
	//public static Robot robot = new Robot(); 
	
	public static WebElement LogInUsername(WebDriver driver) {
		element = driver.findElement(By.name("username"));   
		return element; 
	}
	public static WebElement LogInPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element; 
	}
	public static WebElement LogInSubmitBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='_3Yr7O']")); 
		return element; 
	}
	
	public static WebElement Ping(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(.,'Ping')]"));      
		return element;
	}
	
}
