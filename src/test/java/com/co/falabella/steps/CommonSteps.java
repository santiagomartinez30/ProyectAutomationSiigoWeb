package com.co.falabella.steps;

import com.co.falabella.utils.Url;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CommonSteps {
    private final Url page = new Url();

    @Before
    public void prepareStage() {
        setTheStage(new OnlineCast());
        aNewActor().attemptsTo(Open.browserOn(page));
        getDriver().manage().window().maximize();
    }
}
