package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoSiteTab {
    private WebDriver driver;
    private By alertsFramesWindowsCard = By.cssSelector(".card.mt-4.top-card:nth-child(3)");

    public DemoSiteTab(WebDriver driver) {
        this.driver = driver;
    }
    public AlertsFramesWindowsPage clickAlertsFramesWindowsCard() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(alertsFramesWindowsCard));
        driver.findElement(alertsFramesWindowsCard).click();
        return new AlertsFramesWindowsPage(driver);
    }
    public AlertPage clickAlertPage(){
        driver.get("https://demoqa.com/alerts");
        return new AlertPage(driver);
    }
}
