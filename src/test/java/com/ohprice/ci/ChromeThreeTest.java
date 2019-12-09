package com.ohprice.ci;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeThreeTest {


    //    public static void main(String[] args) throws MalformedURLException {
    @Test
    public void test_bbc() throws MalformedURLException {

        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capa = DesiredCapabilities.chrome();

//        Remote WebDriver
        RemoteWebDriver driver = new RemoteWebDriver(url, capa);
        driver.get("https://www.bbc.co.uk");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println("End of test: ChromeThreeTest");

    }
}
