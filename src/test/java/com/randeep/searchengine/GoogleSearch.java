package com.randeep.searchengine;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Randeep on 20/06/2017.
 */
public class GoogleSearch extends TestBase {

    @Test
    public void init() throws InterruptedException {
        driver.get(GOOGLE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
