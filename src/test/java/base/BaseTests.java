package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;
    protected WebDriver driver = new ChromeDriver();
        @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            goHome();
            homePage = new HomePage(driver);
        }
        @BeforeMethod
        public void goHome(){
            driver.get("https://toolsqa.com/");
            //driver.get("https://demoqa.com/");
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
}
