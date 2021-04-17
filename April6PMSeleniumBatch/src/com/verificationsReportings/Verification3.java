package com.verificationsReportings;

import com.launchers.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Verification3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("Verification3");
		test.log(LogStatus.INFO, "Init the Properties files....");
				
		openBrowser("chromebrowser");
		test.log(LogStatus.INFO, "Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Opened the Url : " + childProp.getProperty("amazonurl"));
		
		windowMaximize();
		test.log(LogStatus.INFO, "Maximized the window....");
		
		String expectedLink = "Customer Service";
		
		if(!isLinkEqual(expectedLink))
			reportFailure("Both links are not equal....");
		else
			reportSuccess("Both links are equal....");
		
		report.endTest(test);
		report.flush();
	}
}
