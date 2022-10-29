package com.co.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;


import static com.co.falabella.userinterfaces.ChromeBrowserPage.FIRST_ITEM_LINK;
import static com.co.falabella.userinterfaces.ChromeBrowserPage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToPageFalabella implements Task {
    private final String namePage;

    public GoToPageFalabella(String namePage) {
        this.namePage = namePage;
    }

    public static GoToPageFalabella by(String namePage) {
        return instrumented(GoToPageFalabella.class, namePage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(namePage).into(INPUT_SEARCH).thenHit(Keys.ENTER),
                JavaScriptClick.on(FIRST_ITEM_LINK.of(namePage))

        );
    }
}
