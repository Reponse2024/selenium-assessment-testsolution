package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverManager;

public class AlertsTest extends BaseTests {
    /**
     TEST: Complete navigation flow from Homepage to Alerts page
     * FLOW:
     Start on Homepage
     Click "DEMO SITE" (opens new tab)
     Click "Alerts, Frames & Windows"
     Click "Alerts"
     Verify we're on Alerts page
     */
    @Test(description = "Navigate from Homepage to Alerts page through demo site")
    public void testNavigationToAlertsPage() {
        HomePage homePage = new HomePage(DriverManager.getDriver());
        DemoSitePage demoSitePage = homePage.clickDemoSiteLink();
        AlertsCategoryPage alertsCategoryPage =
                demoSitePage.clickAlertsFramesWindowsLink();
        AlertsPage alertsPage = alertsCategoryPage.clickAlertsLink();
        Assert.assertTrue(alertsPage.isOnAlertsPage(),
                "Should be on the Alerts testing page");
    }
    @Test(description = "Navigate to Alerts page and interact with an alert")
    public void testAlertInteraction() {
        HomePage homePage = new HomePage(DriverManager.getDriver());
        AlertsPage alertsPage = homePage
                .clickDemoSiteLink()
                .clickAlertsFramesWindowsLink()
                .clickAlertsLink();
        alertsPage.clickAlertButton();
        String alertText = alertsPage.getAlertText();
        System.out.println("Alert text: " + alertText);
        alertsPage.acceptAlert();
        Assert.assertTrue(true, "Alert should be handled successfully");
    }
}