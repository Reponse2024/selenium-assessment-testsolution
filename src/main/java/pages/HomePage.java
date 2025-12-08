package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private WebDriver driver;
    private By readMoreLink = By.linkText("Read More");
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
        driver.findElement(By.linkText("ENROLL YOURSELF")).click();
        return new FormPage(driver);
    }
    public SeleniumTrainingPage clickReadMore(){
        driver.findElement(readMoreLink).click();
        return new SeleniumTrainingPage(driver);
    }
    public DemoSitePage clickDemoSite(){
        clickLink("Demo Site");
        return new DemoSitePage(driver);
    }
    public KeysPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeysPage(driver);
    }

    public DemoSitePage clickDemoSiteLink() {
        String originalWindow = windowHelper.getCurrentWindowHandle();
        clickLink("DEMO SITE");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        windowHelper.switchToNewWindow(originalWindow);
        return new DemoSitePage(driver);
    }


    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}



