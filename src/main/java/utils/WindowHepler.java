package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHepler {
    public WebDriver driver;
    public WindowHepler (WebDriver driver){
        this.driver=driver;
    }
   public void switchToNewTab(String originalTab){
       Set<String> allTabs = driver.getWindowHandles();

       for(String tab : allTabs){
           if(!tab.equals(originalTab)){
               driver.switchTo().window(tab);
               break;
           }
       }

   }
}
