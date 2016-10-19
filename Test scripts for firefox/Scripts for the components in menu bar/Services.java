package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Services {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver  = new FirefoxDriver();
			
			driver.get("http://www.sidgs.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd3bg']/p")).click();
			
			Thread.sleep(3500);
	}

}
