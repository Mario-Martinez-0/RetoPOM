package is.demo.serenity.steps;

import is.demo.serenity.pagesObjects.OrdenesAbiertasPageObjects;
import is.demo.serenity.pagesObjects.TableroPageObjects;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class TableroSteps {
    @Page
    TableroPageObjects tableroPageObjects;
    @Page
    OrdenesAbiertasPageObjects ordenesAbiertasPageObjects;

    @Step("Clic en Ordenes Abiertas Mas Informacion")
    public void clicenOrdenesAbiertas() {
        ordenesAbiertasPageObjects.buttonOrdenesAbiertas.click();
    }

    @Step
    public void validarMensaje(){

        Assert.assertThat(
                tableroPageObjects.labelDashboard.isDisplayed(),
                Matchers.is(true)
        );
    }
}
