package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Homebutton {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.sidgs.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd0label']")).click();
		
		Thread.sleep(3500);
		
		

	}

}
