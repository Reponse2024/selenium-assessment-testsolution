package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    WebDriver driver;
    private By options= By.linkText("0. ISTQB Introduction");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getOption(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List <WebElement> selectedOptions =findDropdownElement().getAllSelectedOptions();
        return selectedOptions.stream().map(elem->elem.getText()).collect(Collectors.toList());
    }

    public Select findDropdownElement(){

        return new Select(driver.findElement(options));

    }

    public class FileUploadPage {
        private WebDriver driver;
        private By inputField=By.id("file-upload");
        private By uploadButton = By.id("file-submit");
        private By uploadedFiles= By.id("uploaded-files");
    }
}
