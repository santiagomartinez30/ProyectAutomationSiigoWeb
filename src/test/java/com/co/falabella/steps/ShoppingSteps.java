package com.co.falabella.steps;

import com.co.falabella.models.ArticlesModel;
import com.co.falabella.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.co.falabella.factories.ArticlesFactory.of;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingSteps {
    private ArticlesModel article;

    @Dado("que un {word} ingresa a la plataforma ecommerce de {word}")
    public void theUserGoToFalabellaEcommercePlatform(String nameActor, String namepage) {
        theActorCalled(nameActor).wasAbleTo(
                GoToPageFalabella.by(namepage)
        );
    }

    @Cuando("selecciona una {word} de sus interés")
    public void makeQueryAndSelectArticleOfYourInterest(String dataArticle) {
        article = of(dataArticle);
        theActorInTheSpotlight().attemptsTo(
                SearchArticle.withName(article),
                SelectArticleWanted.inDetailPage(),
                ConfigureExtendedWarrantyMoreQuantity.by(article),
                GoToDispatch.inScreen()
        );
    }

    @Entonces("el puede realizar la compra del articulo")
    public void heCanMakeThePurchaseOfArticle() {
        theActorInTheSpotlight().attemptsTo(
                ValidatePurchase.successfulOf(article)
        );
    }
}
