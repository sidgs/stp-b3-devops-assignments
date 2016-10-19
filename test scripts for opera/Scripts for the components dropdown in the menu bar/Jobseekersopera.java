package componentsdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Jobseekersopera {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		
        WebDriver driver  = new OperaDriver();
		
		driver.get("http://www.sidgs.com");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement mou = driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd1bg']/p"));
		
		a.moveToElement(mou).build().perform();
		
		driver.findElement(By.linkText("Overview")).click();
		
		Thread.sleep(3500);
		

	}

}
