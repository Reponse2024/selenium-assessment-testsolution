package alert;

import base.BaseTests;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.AlertsFramesWindowsPage;
import pages.DemoSiteTab;

import java.util.Set;

public class AlertTest extends BaseTests {
    @Test
    public void testSimpleAlert() {
        String originalWindow = driver.getWindowHandle();

        DemoSiteTab demoSiteTab = homePage.clickDemoSiteTab();

        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        AlertsFramesWindowsPage alertsFramesWindowsPage = demoSiteTab.clickAlertsFramesWindowsCard();
        AlertPage alertPage = alertsFramesWindowsPage.clickAlertsLink();

        alertPage.clickAlertOne();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "You clicked a button");
        alert.accept();
    }
}
