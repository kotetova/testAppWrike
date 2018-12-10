package com.mycompany.app;

import org.junit.*;
import org.openqa.selenium.*;
import pages.HomePage;
import pages.SurveyPage;

public class Tests extends BaseSetup
{
    @Test
    public void firstPage() throws WebDriverException{
        HomePage homePage = new HomePage(driver);
        String maskAlp = "+wpt@wriketask.qaa";
        homePage.enterEmail(maskAlp).goToSurveyPage();
    }

    @Test
    public void secondPage()throws WebDriverException {
        SurveyPage surveyPage = new SurveyPage(driver);
        surveyPage.setAnswer().resendMail().goToTwitter();

        try {
            switchToWindow(1);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://twitter.com/wrike");
        }   catch (Exception ex) {
            System.err.println(ex.getCause());
        }
     }
}
