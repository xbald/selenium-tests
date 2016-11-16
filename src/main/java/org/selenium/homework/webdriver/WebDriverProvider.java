package org.selenium.homework.webdriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by NIKOLAI on 16.11.2016.
 */
public class WebDriverProvider {
    private static ThreadLocal<WebDriver> webDriverThreadLocal;

    static {
        webDriverThreadLocal = new ThreadLocal<>();
    }

    public static WebDriver getWebDriver() {
        //TODO read browser from tests.properties
        if (webDriverThreadLocal.get() == null) {
            Capabilities capabilities = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver.exe");
            final WebDriver chromeDriver = new ChromeDriver(capabilities);
            webDriverThreadLocal.set(chromeDriver);
        }
        return webDriverThreadLocal.get();
    }
}
