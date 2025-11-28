package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;
    private WebDriver driver = new ChromeDriver();

        @BeforeClass
        public void setUp() {

            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            goHome();
            homePage = new HomePage(driver);
        }
        @BeforeMethod
        public void goHome(){
            driver.get("https://toolsqa.com/");
            //homePage = new HomePage(driver);

        }
        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

//    private void clickLink(String linkText){
//        driver.findElement(By.linkText(linkText)).click();
//    }
}
