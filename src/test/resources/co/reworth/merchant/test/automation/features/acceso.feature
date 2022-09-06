#language: es

Característica: acceso al portal de merchant
  Como comercio
  quiero acceder al portal
  para administrar mis tiendas y recompensas

  @Acceso @HP @Regresion
  Esquema del escenario: Acceder al portal de comercio con credenciales validas
    Dado que "<usuario>" ingreso al portal de comercios de Reworth
    Cuando intenta acceder a su cuenta con credenciales validas
      | correo | clave |
      | <correo> | <clave> |
    Entonces deberia ver su cuenta iniciada
    Ejemplos:
      | usuario | correo                  | clave        |
      | Jhonatan | pruebas12345@yopmail.com | Pruebas12345* |
      | Jhonatan | pruebas12345@yopmail.com | Pruebas123 |

  @Acceso @AP @Regresion
  Esquema del escenario: Acceder al portal de comercio con credenciales no validas
    Dado que "<usuario>" ingreso al portal de comercios de Reworth
    Cuando intenta acceder a su cuenta con credenciales no validas
      | correo | clave |
      | <correo> | <clave> |
    Entonces no deberia permitir el acceso, mostrando "Datos incorrectos"
    Ejemplos:
      | usuario | correo                  | clave        |
      | Jhonatan | pruebas12345@yopmail.com | Pruebas123 |