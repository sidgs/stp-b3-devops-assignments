package componentscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jobseekerschrome {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.sidgs.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd1label']")).click();
		
		Thread.sleep(3500);

	}

}
