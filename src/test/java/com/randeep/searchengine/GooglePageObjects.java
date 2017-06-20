package com.randeep.searchengine;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Randeep on 20/06/2017.
 */
public class GooglePageObjects {

    @FindBy(name = "q")
    private WebElement search;
    public WebElement search(){
        return search;
    }

}
