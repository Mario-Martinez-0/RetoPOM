package is.demo.serenity.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PedidosPageObjects extends PageObject {
    @FindBy(how = How.XPATH,using = "(//a[@data-item-type = 'Demo.Northwind.Order'])[1]")
    public WebElementFacade pedido;

    public String empleado = "//div[contains(text(),'*')]";


}
