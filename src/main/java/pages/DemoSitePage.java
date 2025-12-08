package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSitePage extends BasePage {
    private By alertsFramesLink= By.linkText("Alerts, Frame & Windows");
    private WebElement alertsFramesWindowsLink;

    public DemoSitePage(WebDriver driver) {
        super(driver);
    }
    public AlertsCategoryPage clickAlertsFramesWindowsLink() {
        clickElement(alertsFramesWindowsLink);
        return new AlertsCategoryPage(driver);
    }

    private void clickElement(WebElement alertsFramesWindowsLink) {

    }
}