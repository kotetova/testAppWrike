package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;
import java.util.stream.Collectors;

public class HomePage extends Page {

    public HomePage(WebDriver driver){
        super(driver);
    }

    By emailButton = By.xpath("/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button");
    By emailAddress = By.xpath("//*[@id=\"modal-pro\"]/form/label[1]/input");
    By submitButton = By.xpath("//*[@id=\"modal-pro\"]/form/label[2]/button");

    int len = 5;
    String alphString =  "abcdefhijkprstuvwx";
    String genString = new Random().ints
                (len, 0, alphString.length())
                .mapToObj(i -> "" + alphString.charAt(i))
                .collect(Collectors.joining());

    public HomePage enterEmail(String maskAlp){
        click(emailButton);
        sendKey(emailAddress, genString + maskAlp);
        return this;
    }
    public HomePage goToSurveyPage(){
        click(submitButton);
        return this;
    }


}
