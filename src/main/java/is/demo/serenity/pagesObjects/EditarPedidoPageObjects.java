package is.demo.serenity.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class EditarPedidoPageObjects extends PageObject {

    @FindBy(how = How.ID,using = "s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID")
    public WebElementFacade selectEmpleado;
    @FindBy(how = How.XPATH,using = "//li[@class = 'select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElementFacade> listEmpleado;
    @FindBy(how = How.XPATH,using = "//i[@class = 'fa fa-check-circle text-purple']")
    public WebElementFacade buttonGuardar;

}
