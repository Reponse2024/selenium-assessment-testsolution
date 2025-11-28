package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTest extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
    }
}
