package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurveyPage extends Page {

    public SurveyPage (WebDriver driver){
        super(driver);
    }

    By surveyAnswer1 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button");
    By surveyAnswer2 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button");
    By surveyAnswer3 = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button");

    By surveySubmitButton = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button");
    By resendButton = By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button");
    By twitterButton = By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]");

    public SurveyPage setAnswer(){
        click(surveyAnswer1);
        click(surveyAnswer2);
        click(surveyAnswer3);
        click(surveySubmitButton);
        return this;
    }

    public SurveyPage resendMail(){
        click(resendButton);
        return this;
    }

    public SurveyPage goToTwitter(){
        click(twitterButton);
        return this;
    }


}
