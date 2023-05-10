package com.demo.cucumber.stepDefinition;

import com.demo.cucumber.WebKeywords.WebKeywords;
import com.demo.cucumber.utils.configs.ConfigSettings;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.annotation.Annotation;

public class BaseDef {
    protected WebKeywords action;
    private ConfigSettings configSettings;
    private com.demo.cucumber.drivers.DriverManager driverManager;
    public WebDriver getDriver() {
        return driverManager.getDriver();
    }

    public BaseDef() {
        action = new WebKeywords();
        configSettings = new ConfigSettings(System.getProperty("user.dir"));
    }

    @BeforeSuite
    public void before() {
        deleteFileFromDirectory();
//        AllureManager.setAllureEnvironmentInformation(configSettings.getBaseUrl(), "Chrome", "Product");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        action.openBrowser(configSettings.getBaseUrl());
    }

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    // Text attachments for allure
    @Attachment(value = "Form screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    // Text attachments for allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    // @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.print("I am in onTestFailure method " + getTestMethodName(iTestResult) + "failed");

        WebDriver driver = getDriver();

        // Allure ScreenshotRobot and SaveTestLog
        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }

        // Save a log on allure
        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
    }

    public void deleteFileFromDirectory() {
        //String user = System.getProperty("user home");   // user if data in your user profile
        //String filePath = user + "/Downloads/Test;
        String directory = "D:\\TrainingC5\\SauceDemo\\target\\allure-results"; // If download is in IDE project folder

        File file = new File(directory);
        String[] currentFiles;
        if (file.isDirectory()) {
            currentFiles = file.list();
            for (int i = 0; i < currentFiles.length; i++) {
                File myFile = new File(file, currentFiles[i]);
                myFile.delete();
            }
        }
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        action.closeBrowser(configSettings.getBaseUrl());
    }
}
