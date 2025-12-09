package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickableLinks {
    private WebDriver driver;
    private By linkToClick = By.linkText("Read More");

    public ClickableLinks(WebDriver driver){
        this.driver = driver;
    }
    public void getReadMorePage(){
        driver.findElement(linkToClick ).click();
    }
}