package test.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ResultadoBusquedaPage extends PageObject {

	//label titulo marca

	@FindBy (xpath= "//b[contains(@class,'pod-title title-rebrand')]" )
	public List<WebElementFacade> lbMarca;

	//label descripcion

	@FindBy (xpath= "//*[contains(@id,'testId-pod-displaySubTitle')]" )
	public List<WebElementFacade> lbDescripcion;

	//campo busqueda marca

	@FindBy (id="testId-Multiselect-Marca")
	public WebElementFacade lbBuscarMarca;

	//checkbox Marca

	@FindBy (xpath = "(//button[@id='testId-Accordion-Marca']//..//span[contains(@class,'title1 primary')])[1]")
	public WebElementFacade cbMarca;

	//checkbox Marca

	@FindBy (xpath = "(//*[contains(@id,'testId-Pod-action')])[1]")
	public WebElementFacade agregarAlCarrito;

	//boton ir al carrito

	@FindBy (id="linkButton")
	public WebElementFacade btnCarrito;

	public void buscarValorEnResultados(String elemento, List<WebElementFacade> listaElementos ){
		for(int i=0; i<listaElementos.size();i++){
			assertThat(listaElementos.get(i).getText().toUpperCase(),containsString(elemento.toUpperCase()));
		}

	}

	public void scrollDown(){
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)");

	}


}
