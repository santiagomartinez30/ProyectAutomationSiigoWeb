package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageFalabella {

    public static final Target INPUT_SEARCH_ARTICLE = Target.the("textfield search article").located(By.id("testId-SearchBar-Input"));
    public static final Target BTN_SEARCH = Target.the("search button").located(By.className("SearchBar-module_searchBtnIcon__6KVum"));
    public static final Target CARD_FIRST_ARTICLE = Target.the("article card").located(By.xpath("//div[@id='testId-searchResults-products']/div[1]"));
    public static final Target OUTPUT_TEXT_PRICE_FIRST_CARD_ARTICLE = Target.the("price first card article").located(By.xpath("//div[@id='testId-searchResults-products']/div[1]//span[contains(@class,'copy5 primary')]"));

    private HomePageFalabella() {
    }
}
