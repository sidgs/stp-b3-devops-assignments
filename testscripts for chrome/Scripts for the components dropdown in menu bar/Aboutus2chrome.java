package componentsdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aboutus2chrome {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
	     WebDriver driver  = new ChromeDriver();
			
	     driver.get("http://www.sidgs.com");
			
		 driver.manage().window().maximize();
		 
		 Actions a = new Actions(driver);

		 WebElement mou= driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd4bg']/p"));
			
		 a.moveToElement(mou).build().perform();
			
		 driver.findElement(By.linkText("Leadership")).click();
			
		Thread.sleep(3500);

	}

}
