package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingBagPage {
    public static final Target OPTION_SELECT_PRODUCT_WARRANTY = Target.the("select product warranty option").located(By.xpath("//div[@class='doc-click-overlay']//div[@role='button' and contains(@class,'toggle-icon')]"));
    public static final Target OPTION_TYPE_WARRANTY = Target.the("type warranty option").located(By.xpath("//div[@id='test-id-InCart-inPDP-WarrantyOption']/button[1]"));
    public static final Target OPTION_INCREMENT_ARTICLE = Target.the("increment article option").located(By.id("testId-stepper-increment-btn"));
    public static final Target OUTPUT_TEXT_AMOUNT_ARTICLE = Target.the("amount article").located(By.xpath("//div[contains(@class,'product-count-value')]"));
    public static final Target BTN_VIEW_BAG_SHOPPING = Target.the("view bag shopping button").located(By.id("linkButton"));
    public static final Target BTN_GO_SHOPPING = Target.the("go shopping button").located(By.xpath("//button[contains(@class,'fb-btn-primary fb-btn-icon')]"));

    private ShoppingBagPage() {
    }
}
