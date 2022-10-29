package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DispatchPage {
    public static final Target OUTPUT_TEXT_NAME_ARTICLE = Target.the("name article in purchase summary").located(By.className("fbra_orderSummary__itemProperty__name"));
    public static final Target OUTPUT_TEXT_AMOUNT_ARTICLES = Target.the("amount articles in purchase summary").located(By.xpath("//div[@class='fbra_test_orderSummary__quantity_and_sku prod']"));
    public static final Target OUTPUT_TEXT_INDIVIDUAL_PRICE_ARTICLE = Target.the("price individual article in purchase summary").located(By.className("fbra_orderSummary__itemPrice"));
    public static final Target OUTPUT_TEXT_TOTAL_PRICE_ARTICLE = Target.the("price total article in purchase summary").located(By.className("fbra_orderSummary__itemsTotalPrice"));

    private DispatchPage() {
    }
}
