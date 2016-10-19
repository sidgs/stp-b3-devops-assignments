package componentsdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Servicesdropdown {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.sidgs.com/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement mou= driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd3bg']/p"));
		
		a.moveToElement(mou).build().perform();
		
		driver.findElement(By.linkText("Technology Services")).click();
		
		Thread.sleep(3500);
		
		

	}

}
