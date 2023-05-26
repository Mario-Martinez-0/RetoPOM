package is.demo.serenity.steps;

import is.demo.serenity.pagesObjects.PedidosPageObjects;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PedidosSteps {
    @Page
    PedidosPageObjects pedidosPageObjects;
    @Step("Seleccionar un pedido")
    public void seleccionarPedido() {
        pedidosPageObjects.pedido.click();
    }
}
