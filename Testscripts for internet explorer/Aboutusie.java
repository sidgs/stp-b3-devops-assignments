package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Aboutusie {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.internetexplorer.driver", "drivers\\IEDriverServerdriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.sidgs.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#DrpDwnMn0-hwd4label")).click();
		
		Thread.sleep(3500);

	}

}
