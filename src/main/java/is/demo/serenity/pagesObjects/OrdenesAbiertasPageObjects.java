package is.demo.serenity.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrdenesAbiertasPageObjects extends PageObject {
    @FindBy(how = How.XPATH, using = "//a[@href= '/Northwind/Order?shippingState=0']")
    public WebElementFacade buttonOrdenesAbiertas;
}
