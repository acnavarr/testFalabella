package test.steps;

import org.openqa.selenium.Keys;
import test.pageobjects.HomeFalabellaPage;
import test.pageobjects.ResultadoBusquedaPage;


public class FalabellaSteps {
	HomeFalabellaPage homeFalabellaPage;
	ResultadoBusquedaPage resultadoBusquedaPage;
	public void abrirUrl() {
		homeFalabellaPage.open();
		homeFalabellaPage.open();
		homeFalabellaPage.maximizarPantalla();

	}

	public void buscarElemento(String elemento) {
		homeFalabellaPage.lbBarraBusqueda.click();
		homeFalabellaPage.lbBarraBusqueda.clear();
		homeFalabellaPage.lbBarraBusqueda.sendKeys(elemento);
		homeFalabellaPage.lbBarraBusqueda.sendKeys(Keys.RETURN);
	}


	public void buscarElementoPorMenuSubmenu(String menu,String subMenu) {

		homeFalabellaPage.btnMenu.click();
		homeFalabellaPage.clickValueLista(menu,homeFalabellaPage.listMenu);
		homeFalabellaPage.clickValueLista(subMenu,homeFalabellaPage.listSubmenu);
	}


	public void cerrarPopUps() {
		homeFalabellaPage.cerrarPopUp();
	}

	public void varificarListaMarca(String valor) {
		resultadoBusquedaPage.buscarValorEnResultados(valor,resultadoBusquedaPage.lbMarca);
	}
	public void varificarListaValores(String valor) {
		resultadoBusquedaPage.buscarValorEnResultados(valor,resultadoBusquedaPage.lbDescripcion);
	}


	public void filtrarPorMarca(String elemento) {

		resultadoBusquedaPage.scrollDown();
		resultadoBusquedaPage.lbBuscarMarca.click();
		resultadoBusquedaPage.lbBuscarMarca.clear();
		resultadoBusquedaPage.lbBuscarMarca.sendKeys(elemento);
		resultadoBusquedaPage.cbMarca.click();

	}

	public void verificarElementoEnCarrito(String valor) {
		resultadoBusquedaPage.buscarValorEnResultados(valor,resultadoBusquedaPage.lbDescripcion);
	}


}
