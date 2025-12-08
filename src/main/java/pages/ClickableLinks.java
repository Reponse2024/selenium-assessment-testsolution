package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickableLinks {
    private WebDriver driver;
    private By clicks = By.linkText("Read More");

    public ClickableLinks(WebDriver driver){
        this.driver = driver;
    }
    public void setEnrollButton(){
        driver.findElement(clicks).click();
    }
}