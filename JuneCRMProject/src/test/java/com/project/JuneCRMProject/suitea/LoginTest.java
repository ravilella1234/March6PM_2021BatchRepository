package com.project.JuneCRMProject.suitea;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.project.JuneCRMProject.BaseClass.BaseTest;

public class LoginTest extends BaseTest
{
  
  @Test
  public void f() 
  {
	  System.out.println("iam f Test...");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Iam afterTest");
  }

}
