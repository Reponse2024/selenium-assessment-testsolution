package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By alert1= By.id("alertButton");

    public AlertPage(WebDriver driver){this.driver= driver;

    }
    public void clickAlertOne(){
        driver.findElement(alert1).click();
    }
}
