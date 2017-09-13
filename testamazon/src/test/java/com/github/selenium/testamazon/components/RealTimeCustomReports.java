package com.github.selenium.testamazon.components;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * Created by madhavareddy on 8/23/17.
 */
public class RealTimeCustomReports implements ITestListener{

    @Override
    public void onStart(ITestContext arg0)
    {
        System.out.println("Start Of Execution(TEST)->"+arg0.getName());
    }

    @Override
    public void onTestStart(ITestResult arg0)
    {
        System.out.println("Test started->"+arg0.getName());
    }

    @Override
    public void onTestSuccess(ITestResult arg0)
    {
        System.out.println("Test Pass->"+arg0.getName());
    }

    @Override

    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("Test Fail->"+arg0.getName());
    }

    @Override
    public void onTestSkipped(ITestResult arg0)
    {
        System.out.println("Test Skipped->"+arg0.getName());
    }

    @Override
    public void onFinish(ITestContext arg0)
    {
        System.out.println("End of execution(TEST)->"+arg0.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        // TODO Auto-generated method stub
    }

}
