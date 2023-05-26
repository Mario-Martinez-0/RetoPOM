package is.demo.serenity.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TableroPageObjects extends PageObject {
    @FindBy(how = How.XPATH, using = "//h1[text()='Dashboard']")
    public WebElementFacade labelDashboard;
}
