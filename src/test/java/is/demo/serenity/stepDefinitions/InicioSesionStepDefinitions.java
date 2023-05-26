package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.TableroSteps;
import is.demo.serenity.steps.InicioSesionSteps;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class InicioSesionStepDefinitions {

    @Steps
    InicioSesionSteps inicioSteps;
    @Steps
    TableroSteps dashboardSteps;

    @Dado("que el usuario abra el navegador en la url")
    public void queElUsuarioAbraElNavegadorEnLaUrl() throws IOException {
        inicioSteps.abrirUrl();
    }

    @Cuando("el usuario ingrese las credenciales")
    public void elUsuarioIngreseLasCredenciales() throws IOException {
        inicioSteps.ingresarUsuario();
        inicioSteps.ingresarClave();
    }

    @Cuando("da clic en iniciar sesion")
    public void daClicEnIniciarSesion() {
        inicioSteps.clicinciosesion();
    }

    @Entonces("puede visualizar un mensaje Dashboard")
    public void puedeVisualizarUnMensajeDashboard() {
        dashboardSteps.validarMensaje();
    }

}
