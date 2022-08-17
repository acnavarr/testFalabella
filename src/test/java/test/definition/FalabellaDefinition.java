package test.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.steps.FalabellaSteps;

public class FalabellaDefinition {
	
	@Steps
	FalabellaSteps falabellaSteps;

	@Given("^Ingresar a la URL")
	public void ingresar_a_la_URL()  {
		falabellaSteps.abrirUrl();
	}

	@When("^busco el elemento (.*) en falabella")
	public void buscar_elemento(String elemento) {
		falabellaSteps.cerrarPopUps();
		falabellaSteps.buscarElemento(elemento);
	  
	}
	@When("^busco el elemento por menu (.*) y submenu (.*)")
	public void buscar_elemento_por_menu_submenu(String menu, String Submenu) {
		falabellaSteps.cerrarPopUps();
		falabellaSteps.buscarElementoPorMenuSubmenu(menu,Submenu);

	}


	@When("^busco con filtro de marca (.*)")
	public void filtrar_por_marca(String elemento) {
		falabellaSteps.filtrarPorMarca(elemento);
	}

	@Then("^Verifico la busqueda de la marca (.*)")
	public void Verifico_la_busqueda_de_la_marca(String marca) {
		falabellaSteps.varificarListaMarca(marca);
	}

	@Then("^Verifico la busqueda de los elementos (.*)")
	public void Verifico_la_busqueda_de_los_elementos(String elemento) {
		falabellaSteps.varificarListaValores(elemento);
	}


}
