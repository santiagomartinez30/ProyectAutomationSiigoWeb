package com.co.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.falabella.userinterfaces.ShoppingBagPage.BTN_GO_SHOPPING;
import static com.co.falabella.userinterfaces.ShoppingBagPage.BTN_VIEW_BAG_SHOPPING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToDispatch implements Task {
    public static GoToDispatch inScreen() {
        return instrumented(GoToDispatch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VIEW_BAG_SHOPPING),
                Click.on(BTN_GO_SHOPPING)
        );
    }
}
