package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.id("alertButton");

    public AlertsPage(WebDriver driverAlert) { //I can even call it driver, instead of driverAlert
        this.driver = driverAlert;
    }
    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }
    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }
}


