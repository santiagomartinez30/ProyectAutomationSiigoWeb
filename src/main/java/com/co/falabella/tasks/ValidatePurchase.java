package com.co.falabella.tasks;

import com.co.falabella.models.ArticlesModel;
import com.co.falabella.utils.Calculate;
import com.co.falabella.utils.FomatValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.falabella.enums.Keys.KEY1;
import static com.co.falabella.userinterfaces.DispatchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidatePurchase implements Task {
    private final ArticlesModel article;
    private final long priceArticleWithOutFormat;

    public ValidatePurchase(ArticlesModel articles) {
        this.article = articles;
        this.priceArticleWithOutFormat = theActorInTheSpotlight().recall(KEY1.value());
    }

    public static ValidatePurchase successfulOf(ArticlesModel article) {
        return instrumented(ValidatePurchase.class, article);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String priceIndividualArticle = FomatValue.longValue(priceArticleWithOutFormat);
        String priceTotalArticle = FomatValue.longValue(Calculate.totalValueArticle(priceArticleWithOutFormat, Integer.parseInt(article.getAmount())));
        actor.attemptsTo(
                Ensure.that(OUTPUT_TEXT_NAME_ARTICLE).text().isEqualTo(article.getName()),
                Ensure.that(OUTPUT_TEXT_AMOUNT_ARTICLES).text().contains(article.getAmount()),
                Ensure.that(OUTPUT_TEXT_INDIVIDUAL_PRICE_ARTICLE).text().contains(priceIndividualArticle),
                Ensure.that(OUTPUT_TEXT_TOTAL_PRICE_ARTICLE).text().contains(priceTotalArticle)
        );
    }
}
