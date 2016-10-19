package componentsdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Services3opera {

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
		
		WebElement mou = driver.findElement(By.xpath("//a[4]/div/div/p"));
		
		a.moveToElement(mou).build().perform();
		
		driver.findElement(By.linkText("Professioal Services")).click();
		
		Thread.sleep(3500);

	}

}
