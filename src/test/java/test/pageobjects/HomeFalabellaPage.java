package test.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import java.util.List;


@DefaultUrl ("https://www.falabella.com/falabella-cl")

public class HomeFalabellaPage extends PageObject {


	//button menu
	@FindBy (id="testId-HamburgerBtn-toggle")
	public WebElementFacade btnMenu;




	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}



	//list menu
	@FindBy (xpath="//div[@class='FirstLevelCategories-module_categoryTitle__1PTiQ']")
	public List<WebElementFacade> listMenu;

	//list ´submenu
	@FindBy (xpath="//div[@class='SecondLevelCategories-module_secondLevelMenuContainer__3ZDAW']//a[@rel='noreferrer noopener']")
	public  List<WebElementFacade> listSubmenu;

	//barra de busqueda
	@FindBy (id="testId-SearchBar-Input")
	public WebElementFacade lbBarraBusqueda;

	//popup

	@FindBy (xpath = "//div[@data-wrapper='MO-Popup']")
	public WebElementFacade popup;

	//button cerrar

	@FindBy (className="dy-lb-close")
	public WebElementFacade btnCerrar;

	//Accion cerrar popup
	public void cerrarPopUp(){
		if(popup.isVisible()){
			btnCerrar.click();
		}
	}


	public void clickValueLista(String menu,List<WebElementFacade> elemento ){
		for(int i=0; i<elemento.size();i++){
			if(elemento.get(i).getText().equals(menu)){
				elemento.get(i).click();
			}
		}


	}


	public void clickSubMenu(String submenu ){
		for(int i=0; i<listSubmenu.size();i++){
			if(listSubmenu.get(i).getText().equals(submenu)){
				listSubmenu.get(i).click();
			}
		}

	}

	public void maximizarPantalla(){
		getDriver().manage().window().maximize();
	}
}
