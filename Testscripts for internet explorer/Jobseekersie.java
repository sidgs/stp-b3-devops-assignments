package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Jobseekersie {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.sidgs.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#DrpDwnMn0-hwd1label")).click();
		
		
		
		Thread.sleep(3500);
		
		
		
		

	}

}
