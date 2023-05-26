package is.demo.serenity.steps;

import is.demo.serenity.pagesObjects.EditarPedidoPageObjects;
import is.demo.serenity.utils.NombreEmpleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class EditarPedidoSteps {
    @Page
    EditarPedidoPageObjects editarPedidoPageObjects;

    @Step("Clic en seleccionar Empleado")
    public void clicSeleccionarEmpleado() {
        editarPedidoPageObjects.selectEmpleado.click();
    }

    @Step("Seleccionar un Empledo aleatorio")
    public void  seleccionarEmpleadoAleatorio() throws InterruptedException {
        int tamanoArreglomes = editarPedidoPageObjects.listEmpleado.size();
        Random random = new Random();
        int empleado = random.nextInt(tamanoArreglomes);
        WebElement empleadoElement = editarPedidoPageObjects.listEmpleado.get(empleado);
        String nombreempleadoAleatorio = empleadoElement.getText();
        editarPedidoPageObjects.listEmpleado.get(empleado).click();

        NombreEmpleado.guardarNombreEmpleado(nombreempleadoAleatorio);

    }

    @Step("Clic en guardar")
    public void clicGuardar() {
        editarPedidoPageObjects.buttonGuardar.click();
    }


}
