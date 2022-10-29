package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChromeBrowserPage {
    public static final Target INPUT_SEARCH = Target.the("texfield search").located(By.name("q"));
    public static final Target FIRST_ITEM_LINK = Target.the("link {0}").locatedBy("//div[@id='search']//a[@href='https://www.{0}.com.co/falabella-co']");

    private ChromeBrowserPage() {
    }
}
