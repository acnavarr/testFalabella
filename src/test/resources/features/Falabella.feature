@Regresion
Feature: busqueda de articulos en la pagina de falabella
  @CasoExitoso
  Scenario Outline: buscar elementos por marca.
    Given Ingresar a la URL
    When busco el elemento <termino> en falabella
    Then Verifico la busqueda de la marca <termino>
    Examples:
      | termino |
      | LG      |
      | SAMSUNG |

  @CasoExitoso
  Scenario Outline: buscar elementos por Menu y Submenu.
    Given Ingresar a la URL
    When busco el elemento por menu <menu> y submenu <submenu>
    Then Verifico la busqueda de los elementos <elemento>
    Examples:
      | menu       | submenu  |elemento|
      | Tecnología | Smart tv | Smart  |
      | Cocina y baño | Campanas | campana  |


  @CasoExitoso
  Scenario: buscar por filtros.
    Given Ingresar a la URL
    When busco el elemento tv en falabella
    And busco con filtro de marca Samsung
    Then Verifico la busqueda de la marca Samsung

  