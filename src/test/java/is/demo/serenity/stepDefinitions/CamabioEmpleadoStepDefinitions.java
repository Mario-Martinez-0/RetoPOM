package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CamabioStepDefinitions {

    @Steps
    InicioSesionSteps inicioSteps;
    @Steps
    VerEmpledoSteps verEmpledoSteps;
    @Steps
    PedidosSteps seleccionarPedidoSteps;
    @Steps
    EditarPedidoSteps seleccionarEmpleadoSteps;
    @Steps
    TableroSteps tableroSteps;

    @Cuando("el usuario inicia sesion")
    public void elUsuarioIniciaSesion() throws IOException {
        inicioSteps.ingresarUsuario();
        inicioSteps.ingresarClave();
        inicioSteps.clicinciosesion();
    }

    @Cuando("da clic en Ordenes abiertas da clic en cualquiera de las ordenes")
    public void daClicEnOrdenesAbiertasDaClicEnCualquieraDeLasOrdenes() {
        tableroSteps.clicenOrdenesAbiertas();
        seleccionarPedidoSteps.seleccionarPedido();
    }

     @Cuando("selecciona un empleado")
    public void seleccionaUnEmpleado() throws IOException, InterruptedException {
        seleccionarEmpleadoSteps.clicSeleccionarEmpleado();
        seleccionarEmpleadoSteps.seleccionarEmpleadoAleatorio();
        seleccionarEmpleadoSteps.clicGuardar();

    }

    @Entonces("podra ver el empleado seleccionado en pantalla")
    public void podraVerElEmpleadoSeleccionadoEnPantalla() {
        verEmpledoSteps.validarCambioEmpleado();
    }

}
