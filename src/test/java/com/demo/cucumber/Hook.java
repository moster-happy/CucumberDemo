package com.demo.cucumber;

import com.demo.cucumber.core.CommonConstant;
import com.demo.cucumber.drivers.DriverManagerFactory;
import com.demo.cucumber.drivers.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class Hook {
    private static WebDriver driver;
//    @Before
    public synchronized static WebDriver openAndQuitBrowser() {
        String browserName = System.getProperty("browser");

        if (driver == null) {

            try {
                if (browserName == null) {
                    browserName = System.getenv("BROWSER");
                    if (browserName == null) {
                        browserName = "chrome";
                    }
                }
                driver = new DriverManagerFactory().getManager(DriverType.CHROME).getDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(CommonConstant.TIME_OUT, TimeUnit.SECONDS);

            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        return driver;
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }

    public static void close() {
        try {
            if (driver != null) {
                openAndQuitBrowser().quit();
            }
        } catch (UnreachableBrowserException e) {
            System.out.println("Can not close the browser");
        }
    }

    @After
    public void cleanup() {
        close();
        System.out.println("After Suite");
    }
}
