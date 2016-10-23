package componentsdropdown;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;


public class Testngchromeforcomponents {
 
 
  @BeforeMethod
 
       public void launchBrowser() {

	 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
         WebDriver driver  = new ChromeDriver();

	  driver.manage().window().maximize();
  
}

 
 @AfterMethod
   
public void closeBrowser() throws Exception {

	  WebDriver driver = new ChromeDriver();

	  Thread.sleep(5000);
		  

  }
  
@Test
  
      public void Jobseekers(){
	
      WebDriver driver = new ChromeDriver();

      driver.get("http://www.sidgs.com/");

      Actions a = new Actions(driver);

      WebElement mou = driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd1label']"));

      a.moveToElement(mou).build().perform();

      driver.findElement(By.linkText("Overview")).click();

	  
  }

  @Test
  
       public void Services1(){
	  
         WebDriver driver = new ChromeDriver();
	  
         driver.get("http://www.sidgs.com/");
	 
         Actions a = new Actions(driver);

	 WebElement mou = driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd3label']"));

	 a.moveToElement(mou).build().perform();

	 driver.findElement(By.linkText("Technology Services")).click();


}
 
 @Test
  
      public void Services2(){
	 
      WebDriver driver = new ChromeDriver();

      driver.get("http://www.sidgs.com/");

      Actions a = new Actions(driver);

      WebElement mou = driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd3bg']/p"));
	
      a.moveToElement(mou).build().perform();

      driver.findElement(By.linkText("Agile Development")).click();

	  
  }
  
@Test
  
   public void Services3(){

	  WebDriver driver = new ChromeDriver();
	
          driver.get("http://www.sidgs.com/");
	 
          Actions a = new Actions(driver);

	  WebElement mou = driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd3bg']/p"));

	  a.moveToElement(mou).build().perform();

	  driver.findElement(By.linkText("Professional Services")).click();
 
 }

  @Test
     
  public void AboutUs1(){
	 
          WebDriver driver = new ChromeDriver();

	  driver.get("http://www.sidgs.com/");

	  Actions a = new Actions(driver);
	 
          WebElement mou = driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd4bg']/p"));

	  a.moveToElement(mou).build().perform();

	  driver.findElement(By.linkText("Why SIDGS")).click();

  }
 
 @Test
  
     public void AboutUs2(){

	  WebDriver driver = new ChromeDriver();

	  driver.get("http://www.sidgs.com/");

	  Actions a = new Actions(driver);

	  WebElement mou = driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd4label']"));

	  a.moveToElement(mou).build().perform();

	  driver.findElement(By.linkText("Leadership")).click();
 
 }
 
 @Test
  
     public void AboutUs3(){

	  WebDriver driver = new ChromeDriver();

	  driver.get("http://www.sidgs.com/");

	  Actions a = new Actions(driver);

	  WebElement mou = driver.findElement(By.xpath("//div[@id='DrpDwnMn0-hwd4bg']/p"));

	  a.moveToElement(mou).build().perform();

	  driver.findElement(By.linkText("Contact Us")).click();
 
 }

}
