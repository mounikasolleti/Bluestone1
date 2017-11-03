package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class OnlineJewelleryPage extends BasePage
{
	//declaration
	@FindBy(xpath="//span[.='Log In']")
	private WebElement loginBtn;
	 
	@FindBy(xpath="//input[@id='email-id']")
	private WebElement emailIdTb;
	 
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTb;
	  
	@FindBy(xpath="//input[@id='edit-login-account']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='search_query_top_elastic_search']")
	private WebElement productSearch;
	
	
    //constructor
	public OnlineJewelleryPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	//utilization
	public void clickOnLogin()
	{
		loginBtn.click();
	}
	
	public void enterEmailId(String un)
	{
		emailIdTb.sendKeys(un);
	}
	public void enterPasswordTb(String pw)
	{
		passwordTb.sendKeys(pw);
	}
	public void clickOnLoginBtn()
	{
		login.click();
	}
	
	public void enterProductSearch(String product)
	{
		productSearch.sendKeys(product);
	}
   
}
