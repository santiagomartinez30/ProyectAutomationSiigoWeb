package com.co.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.falabella.userinterfaces.DetailArticlePage.BTN_ADD_TO_BAG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectArticleWanted implements Task {
    public static Performable inDetailPage() {
        return instrumented(SelectArticleWanted.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_TO_BAG)
        );
    }
}
