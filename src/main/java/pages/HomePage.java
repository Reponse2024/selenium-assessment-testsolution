package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WindowHelper;

import java.time.Duration;

public class HomePage extends BasePage{
    private WebDriver driver;
    private By readMoreLink = By.partialLinkText("Read More");
    private By demoSite= By.linkText ("Demo Site");
    private WebElement demoSiteLink;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public ClickableLinks clickEnrollYourselfButton() {
        driver.findElement(By.linkText("ENROLL YOURSELF")).click();
        return new ClickableLinks(driver);
    }
    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public FormPage clickEnrollYourself(){
     WebElement element= driver.findElement(By.cssSelector(".col.col-sm-6.col-md-7"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});",element);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element.getText());
        element.click();
     return new FormPage(driver);
    }
    public SeleniumTrainingPage clickReadMore(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'})",driver.findElement(readMoreLink));
        driver.findElement(readMoreLink).click();
        return new SeleniumTrainingPage(driver);
    }
    public KeysPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeysPage(driver);
    }
    public DemoSiteTab clickDemoSiteTab(){
        clickLink("DEMO SITE");
        return new DemoSiteTab(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}



