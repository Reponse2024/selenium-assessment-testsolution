package navigation;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.SeleniumTrainingPage;

public class ClickableLinksTests extends BaseTests {
    @Test
    public void testReadMoreLink() {
        SeleniumTrainingPage getTrainingPage = homePage.clickReadMore();
    }
}

