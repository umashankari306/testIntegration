package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.text.spi.BreakIteratorProvider;
import java.util.Locale;

public class Seleniumproject {

    // public static void main(String[] args) {
    @Test

    public void test() {
        String switchCase=System.getProperty("browser");
        WebDriver driver=null;
        switch (switchCase){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();
                break;
            default:
                System.out.println("Pass valid switch case arg ");
        }

      //System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

    //WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
}
        //WebDriver.Navigation\
    //}


}
