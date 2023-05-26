package is.demo.serenity.steps;

import is.demo.serenity.pagesObjects.InicioSesionPageObjects;
import is.demo.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class InicioSesionSteps {

    @Page
    InicioSesionPageObjects inicioSesionPageObjects;

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Url");
        String url = data.get(0).get("Url");
        inicioSesionPageObjects.openUrl(url);
    }
    @Step("Ingresar usuario")
    public void ingresarUsuario() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "UsuarioClave");
        String usuario = data.get(0).get("Usuario");
        inicioSesionPageObjects.inputNombre.type(usuario);
    }
    @Step("Ingresar clave")
    public void ingresarClave() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "UsuarioClave");
        String clave = data.get(0).get("Clave");
        inicioSesionPageObjects.inputApellido.type(clave);
    }
    @Step("Clic en inicio sesion")
    public void clicinciosesion() {
        inicioSesionPageObjects.buttonInicioSesion.click();
    }

}
