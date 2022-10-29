package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailArticlePage {
    public static final Target BTN_ADD_TO_BAG = Target.the("add to bag button").located(By.id("buttonForCustomers"));

    private DetailArticlePage() {
    }
}
