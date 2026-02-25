package form;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FormPage;

public class FormTest extends BaseTests {
    @Test
    public void testEnrollYourselfLink(){
        FormPage formsPage = homePage.clickEnrollYourself();

        formsPage.fillFirstName("Reponse Irakoze");
        formsPage.fillLastName("Iduha");
        formsPage.fillEmail("reponseiduha777@gmail.com");
        formsPage.fillMobile("0785508162");
        formsPage.selectCountry("Rwanda");
        formsPage.fillCity("Kigali");
        formsPage.fillMessage("This is a test message");
        formsPage.fillCaptcha("3UOt");
        formsPage.clickSend();
    }
}