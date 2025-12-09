
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

    public class DriverManager {

        private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

        public static void initializeDriver(String browser) {
            WebDriver webDriver;

            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");
                webDriver = new ChromeDriver(options);
            } else {
                throw new IllegalArgumentException("Browser not supported: " + browser);
            }

            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

            driver.set(webDriver);
        }

        public static WebDriver getDriver() {
            return driver.get();
        }

        public static void quitDriver() {
            if (driver.get() != null) {
                driver.get().quit();
                driver.remove();
            }
        }
    }
