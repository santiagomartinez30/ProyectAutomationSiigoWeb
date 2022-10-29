package com.co.falabella.tasks;

import com.co.falabella.models.ArticlesModel;
import com.co.falabella.utils.GetValueLong;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.co.falabella.enums.Keys.KEY1;
import static com.co.falabella.userinterfaces.HomePageFalabella.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchArticle implements Task {

    private final ArticlesModel articlesModel;

    public SearchArticle(ArticlesModel articlesModel) {
        this.articlesModel = articlesModel;
    }

    public static SearchArticle withName(ArticlesModel articlesModel) {
        return instrumented(SearchArticle.class, articlesModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(articlesModel.getName()).into(INPUT_SEARCH_ARTICLE),
                Click.on(BTN_SEARCH)
        );
        actor.remember((KEY1).value(), GetValueLong.ofaString(OUTPUT_TEXT_PRICE_FIRST_CARD_ARTICLE.resolveFor(actor).getText()));
        actor.attemptsTo(
                Click.on(CARD_FIRST_ARTICLE)
        );
    }
}
