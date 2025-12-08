package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**AlertsCategoryPage - Shows different alert options*/
public class AlertsCategoryPage extends BasePage {

    // Locator for "Alerts" link
    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    public AlertsCategoryPage(WebDriver driver) {
        super(driver);
    }
    public AlertsPage clickAlertsLink() {
        clickElement(alertsLink);
        return new AlertsPage(driver);
    }
}