package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsFramesWindowsPage {
    private WebDriver driver;
    private By alertsLink = By.cssSelector(".element-list.collapse.show ul #item-1");

    public AlertsFramesWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public AlertPage clickAlertsLink() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(alertsLink));
        driver.findElement(alertsLink).click();
        return new AlertPage(driver);
    }
}
