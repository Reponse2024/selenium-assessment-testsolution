package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowHelper {
    public static WebDriver driver;
    public WindowHelper (WebDriver driver){
        this.driver=driver;
    }

    public static void switchToNewTab(String originalTab){
       Set<String> allTabs = driver.getWindowHandles();

       for(String tab : allTabs){
           if(!tab.equals(originalTab)){
               driver.switchTo().window(tab);
               break;
           }
       }
   }
    public static String getCurrentWindowHandle() {
        return driver.getWindowHandle();
    }
    public void switchToWindow(String originalTab) {
        driver.switchTo().window(originalTab);
    }
    public ArrayList<String> getAllWindowHandles() {
        Set<String> windowHandles = driver.getWindowHandles();
        return new ArrayList<>(windowHandles);
    }
    public void switchToWindowByIndex(int index) {
        ArrayList<String> windows = getAllWindowHandles();
        if (index < windows.size()) {
            driver.switchTo().window(windows.get(index));
        }
    }
    public void closeCurrentAndSwitchTo(String originalTab) {
        driver.close();
        driver.switchTo().window(originalTab);
    }
}
