# language: es

Característica: Registro del nuevo empleado
  como empleado
  quiero ingresar a la pagina
  para registrarme


  @EscenarioSinValor
  Escenario: Registra nuevo empleado
    Dado  que un empleado accede a la web
    Cuando el agrega Admin , admin123 , Cristian , Manuel , Ramos , 011274 , Cramos , 011346 , 406578, 2023-07-01 , 407631 , 12345 , 1994-07-13 , 1022345678 , Cristian Manuel Ramos al formulario
    Entonces El Se Registra


  @EscenarioConValor
  Esquema del escenario: Registra nuevo empleado
    Dado  que un empleado accede a la web
    Cuando  el agrega
      |<nombreProducto>|<apellido>|
    Entonces El Se Registra1


    Ejemplos:
      |nombreProducto|apellido|
      |Cristian  |Ramos       |