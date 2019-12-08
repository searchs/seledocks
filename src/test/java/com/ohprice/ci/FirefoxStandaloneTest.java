package com.ohprice.ci;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxStandaloneTest {


    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:4444/wd/hub");
//        DesiredCapabilities capa = DesiredCapabilities.chrome();
        FirefoxOptions capa = new FirefoxOptions();
        System.out.println(capa.getBrowserName());
//        Remote WebDriver
        RemoteWebDriver driver = new RemoteWebDriver(url, capa);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.get("https://www.yahoo.com");
        System.out.println(driver.getTitle());
        driver.get("https://www.ohprice.com");
        System.out.println(driver.getTitle());


    }
}
