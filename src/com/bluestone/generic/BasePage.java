package com.bluestone.generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
  public WebDriver driver;
  public BasePage(WebDriver driver)
  {
	  this.driver=driver;
  }
  //to verify the title of the page
  public void verifyTitle(String eTitle)
  {
	  try
	  {
		  WebDriverWait wait=new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.titleIs(eTitle));
		  Reporter.log("Title is Matching:"+eTitle,true);
	  }
	  catch(Exception e)
	  {
		 Reporter.log("Title is not Matching"+eTitle,true); 
		 Assert.fail();
	  }
  }
  //to verify the elements
  public void verifyElementPresent(WebElement element)
  {
	  try
	  {
		  WebDriverWait wait=new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOf(element));
		  Reporter.log("Element is matching:"+element.getText(),true);
	  }
	  catch(Exception e)
	  {
		  Reporter.log("Element is not matching:"+element.getText(),true);
		  Assert.fail();
	  }
  }
}
