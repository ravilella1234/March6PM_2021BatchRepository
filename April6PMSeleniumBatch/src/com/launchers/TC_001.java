package com.launchers;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		windowMaximize();
		
		String title = getwindowTitle();
		System.out.println(title);
		
		String url = getApplicationUrl();
		System.out.println(url);
		
		delCookies();
				
		windowBack();
		
		Thread.sleep(5000);
		
		windowForword();
		
		Thread.sleep(5000);
		
		windowRefresh();
		
		closeBrowser();	
	}
}
