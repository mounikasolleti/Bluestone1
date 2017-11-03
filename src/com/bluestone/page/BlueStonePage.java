package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class BlueStonePage extends BasePage
{
	public BlueStonePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	 public void verifyingTitle(String bTitle)
	 {
		 verifyTitle(bTitle);
	 }
}
