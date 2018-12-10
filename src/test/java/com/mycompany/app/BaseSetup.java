package com.mycompany.app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseSetup {

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\70.0.3538.110\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://wrike.com/");
    }

    public void switchToWindow(int numberWindow) {
        String handle = driver.getWindowHandles()
                .toArray()[numberWindow].toString();
        driver.switchTo().window(handle);
    }

    @AfterClass
    public static void pageClose() {
        driver.quit();
    }
}
