package componentscheck;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;


public class Testngforfirefox {
  
  
@BeforeMethod
  public void launchBrowser() {

      WebDriver driver = new FirefoxDriver();
	  
      driver.manage().window().maximize();
  
}

  
@AfterMethod
	public void closeBrowser() throws Exception {
 
    WebDriver driver = new FirefoxDriver();

     Thread.sleep(5000);
     
      driver.close();
  
}
  
@Test
     
public void Jobseekers(){
 
 
     WebDriver driver = new FirefoxDriver();
     
      driver.get("http://www.sidgs.com/");
  
      driver.manage().window().maximize();
	
      driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd1label']")).click();
		

     
  }
  
@Test
     
     
 public void Employers(){

	  
	  WebDriver driver = new FirefoxDriver();
	  
                  driver.get("http://www.sidgs.com/");

	          driver.manage().window().maximize();
	
                  driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd2label']")).click();



	  
	  
  }
  
@Test
   
      
 public void services(){

	    WebDriver driver  = new FirefoxDriver();
            driver.get("http://www.sidgs.com/");

            driver.manage().window().maximize();

	    driver.findElement(By.cssSelector("#DrpDwnMn0-hwd3label")).click();

  }
 
 @Test
       
  public void AboutUs(){

	    WebDriver driver  = new FirefoxDriver();
	
	    driver.get("http://www.sidgs.com/");

	    driver.manage().window().maximize();

	    driver.findElement(By.xpath("//p[@id='DrpDwnMn0-hwd4label']")).click();

		
  }
    
  
}
