#language:es
Característica: Cambiar el nombre del empleado en una orden de compra
  Yo como usuario quiero cambiar el nombre del empleado de cuaquier orden de compra

  Antecedentes:
    Dado que el usuario abra el navegador en la url

  @Empleado @Regresion
  Escenario: Cambiar el nombre del empleado en una orden de compra con exito
    Cuando el usuario inicia sesion
    Y da clic en Ordenes abiertas da clic en cualquiera de las ordenes
    Y selecciona un empleado

    Entonces podra ver el empleado seleccionado en pantalla