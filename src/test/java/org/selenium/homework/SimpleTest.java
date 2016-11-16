package org.selenium.homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.selenium.homework.webdriver.WebDriverProvider.destroy;
import static org.selenium.homework.webdriver.WebDriverProvider.getWebDriver;

/**
 * Created by NIKOLAI on 16.11.2016.
 */
public class SimpleTest {
    final private String TEST_URL = "http://www.google.ru";

    @Test
    public void openGoogle() {
        getWebDriver().get(TEST_URL);
    }

    @AfterClass
    public void afterMethod(){
        getWebDriver().quit();
        destroy();
    }

}
