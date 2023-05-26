package is.demo.serenity.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioSesionPageObjects extends PageObject {

    @FindBy(how = How.ID, using = "LoginPanel0_Username")
    public WebElementFacade inputNombre;
    @FindBy(how = How.ID, using = "LoginPanel0_Password")
    public WebElementFacade inputApellido;
    @FindBy(how = How.ID, using = "LoginPanel0_LoginButton")
    public WebElementFacade buttonInicioSesion;

}
