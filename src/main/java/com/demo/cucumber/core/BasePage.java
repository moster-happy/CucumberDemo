package com.demo.cucumber.core;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    private WebDriverWait explicit;

    public static BasePage getBasePage() {
        return new BasePage();
    }

    public void openBrowser(WebDriver driver, String url) {
        driver.get(url);
    }

    public void setText(WebDriver driver, String locator, String text) {
        WebElement el = driver.findElement(By.xpath(locator));
        el.clear();
        el.sendKeys(text);
    }

    public void click(WebDriver driver, String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void verifyElementIsDisplayed(WebDriver driver, String locator) {
        List<WebElement> els = driver.findElements(By.xpath(locator));
        Boolean isDisplayed = false;
        if (els.size() > 0) {
            isDisplayed = true;
        }
        Assert.isTrue(isDisplayed, "Element is not displayed");
    }
}
