package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {
    @FindBy(id = "alertButton")
    private WebElement alertButton;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    public void clickAlertButton() {
        clickElement(alertButton);
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public boolean isOnAlertsPage() {
        return getCurrentUrl().contains("alerts");
    }
}