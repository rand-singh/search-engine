package com.randeep.searchengine;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Randeep on 20/06/2017.
 */
public class TestBase {

    protected static WebDriver driver;

    public static final String GOOGLE = "https://www.google.co.uk";
    public static final String BING = "https://www.bing.co.uk";
    public static final String YAHOO = "https://uk.search.yahoo.com";

    GooglePageObjects googlePageObjects = PageFactory.initElements(driver, GooglePageObjects.class);

    @Before
    public void setUp(){
    }

    @BeforeClass
    public static void setUpBeforeClass(){
        String OS = System.getProperties().getProperty("os.name");
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
//        driver = new HtmlUnitDriver();
    }

    @AfterClass
    public static void tearDown(){
        if(driver != null){
            driver.close();
            driver.quit();
        }
    }

}
