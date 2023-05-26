#language:es
Característica: Inicio de sesion
  Yo como usuario quiero validar el
  inicio de sesion

  @InicioExitoso @Regresion
  Escenario: Inicio de sesion exitoso.
    Dado que el usuario abra el navegador en la url
    Cuando el usuario ingrese las credenciales
    Y da clic en iniciar sesion
    Entonces puede visualizar un mensaje Dashboard