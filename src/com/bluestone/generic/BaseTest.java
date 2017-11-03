package com.bluestone.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
   public static WebDriver driver=null;
  
   //to open the browser
   @BeforeMethod
   public void preConditions()
   {
	   System.setProperty(CHROME_KEY, CHROME_VALUE);
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.bluestone.com/");
   }
   
   //to close the browser
   @AfterMethod
   public void postConditions()
   {
	   driver.close();
   }
   
   
}
