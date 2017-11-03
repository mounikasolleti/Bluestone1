package com.bluestone.test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.BlueStonePage;
import com.bluestone.page.OnlineJewelleryPage;

@Listeners(com.bluestone.generic.ListenersTest.class)
public class ProductTest extends BaseTest
{
     @Test
     public void testProduct()
     {
    	 
    	 String un=ExcelData.getData(path, "sheet1", 1, 0);
    	 String pw=ExcelData.getData(path, "sheet1", 1, 1);
    	 String btitle=ExcelData.getData(path, "sheet1", 1, 2);
    	 String product=ExcelData.getData(path, "sheet1", 1, 3);
    	 
    	 OnlineJewelleryPage oj=new OnlineJewelleryPage(driver);
    	 BlueStonePage bp=new BlueStonePage(driver);
    	 
    	 oj.clickOnLogin();
    	 oj.enterEmailId(un);
    	 oj.enterPasswordTb(pw);
    	 oj.clickOnLoginBtn();
    	 oj.enterProductSearch(product);
    	 bp.verifyingTitle(btitle);
     }
     
}
