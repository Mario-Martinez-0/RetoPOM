package is.demo.serenity.steps;

import is.demo.serenity.pagesObjects.PedidosPageObjects;
import is.demo.serenity.utils.NombreEmpleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VerEmpledoSteps {

    @Page
    private PedidosPageObjects pedidosPageObjects;

    @Step
    public void validarCambioEmpleado() {

        String localizador =  pedidosPageObjects.empleado.replace("*", NombreEmpleado.nombreEmpleado);

        Assert.assertThat(

                pedidosPageObjects.getDriver().findElement(By.xpath(localizador)).isDisplayed(),
                Matchers.is(true)
        );
    }
}
