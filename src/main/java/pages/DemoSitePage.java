package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoSitePage {
    private WebDriver driver;


public DemoSitePage(WebDriver driver){
    this.driver=driver;
}
public AlertsPage clickAlert(){
    driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3) > div > div.card-body > h5")).click();
    return new AlertsPage(driver);
}
}
