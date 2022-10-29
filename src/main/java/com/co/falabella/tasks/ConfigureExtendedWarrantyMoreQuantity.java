package com.co.falabella.tasks;

import com.co.falabella.models.ArticlesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.co.falabella.userinterfaces.ShoppingBagPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ConfigureExtendedWarrantyMoreQuantity implements Task {

    private final ArticlesModel article;

    public ConfigureExtendedWarrantyMoreQuantity(ArticlesModel article) {
        this.article = article;
    }

    public static ConfigureExtendedWarrantyMoreQuantity by(ArticlesModel article) {
        return instrumented(ConfigureExtendedWarrantyMoreQuantity.class, article);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_SELECT_PRODUCT_WARRANTY),
                Click.on(OPTION_TYPE_WARRANTY)
        );
        if (Boolean.FALSE.equals(Text.of(OUTPUT_TEXT_AMOUNT_ARTICLE.waitingForNoMoreThan(Duration.ofSeconds(10))).answeredBy(actor).equals(article.getAmount()))) {
            actor.attemptsTo(
                    WaitUntil.the(OPTION_INCREMENT_ARTICLE, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(OPTION_INCREMENT_ARTICLE)
            );
        }
    }
}
