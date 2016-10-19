package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Servicessafari {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.safari.driver", "drivers\\SafariDriver.safariextz");
			
			WebDriver driver = new SafariDriver();
			
	        driver.get("http://www.sidgs.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("#DrpDwnMn0-hwd3label")).click();
			
			Thread.sleep(3500);
		

	}

}
