package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**AlertsCategoryPage - Shows different alert options*/
public class AlertsCategoryPage extends BasePage {

    // Locator for "Alerts" link
    private By alertsLink = By.linkText("Alerts");

    public AlertsCategoryPage(WebDriver driver) {
        super(driver);
    }
    public AlertsPage clickAlertsLink() {
        driver.findElement(alertsLink).click();
        return new AlertsPage(driver);
    }
}