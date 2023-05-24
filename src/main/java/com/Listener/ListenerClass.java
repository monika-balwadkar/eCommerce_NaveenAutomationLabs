package com.Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.extentManager.ExtentManager;

import Resources.BaseClass;

public class ListenerClass extends ExtentManager implements ITestListener 
{
	
	 public void onTestStart(ITestResult result)
	 {
		 test=extent.createTest(result.getName());
	 }
	 
	 public void onTestSuccess(ITestResult result) 
	 {
		 if (result.getStatus() == ITestResult.SUCCESS) 
		 {
			   test.log(Status.PASS, "Test case passed is" + result.getName());
		 }
	 }
	 
	 public void onTestFailure(ITestResult result)
	 {
		  if (result.getStatus() == ITestResult.FAILURE)
		  {
			  test.log(Status.FAIL, "Test CASE Failed is " + result.getName()); 
			  test.log(Status.FAIL, "Test CASE Failed is " + result.getThrowable()); //To throw excpetion

			  String screenshotPath = BaseClass.screenShot(BaseClass.driver, result.getName()); 

			  test.addScreenCaptureFromPath(screenshotPath); //Adding screenshot inside report//To add name in extent report
		  	}
	 }
	 
	 public void onTestSkipped(ITestResult result)
	 {
		   if (result.getStatus() == ITestResult.SKIP) 
		   {
			   test.log(Status.SKIP, "test case skipped is" + result.getName());
		   }
	 }
}