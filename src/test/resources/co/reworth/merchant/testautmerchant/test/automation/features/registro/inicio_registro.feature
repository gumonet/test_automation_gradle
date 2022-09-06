# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es


Característica: Inicio de registro de cuenta en Reworth
  Yo como propietario de un comercio,
  Necesito iniciar con la creación de mi cuenta en Reworth
  Para incrementar mis ventas y la frecuencia de compra en mi negocio


  @Todos
  @Registro
  @InicioRegistro
  @AP
  @Regresion
  @TC-MER-2
  Esquema del escenario: Diligenciar Inicio de registro, sin cumplir con los formatos
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando diligencia el inicio de su registro, sin cumplir con los formatos
      | correo_cuenta   | clave_cuenta   | terminos_cuenta |
      | <correo_cuenta> | <clave_cuenta> | acuerdo  |
    Entonces no deberia permitir la opcion para continuar con el proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta |
      | yesenia.v+{###}reworth.co  | Cali1989*    |
      | yesenia.v+{###}@reworth.co | Cali19*      |
      | yesenia.v+{###}@reworth.co | CALI198*     |
      | yesenia.v+{###}@reworth.co | Caliiii*     |
      | yesenia.v+{###}@reworth.co | Cali1989     |


  @Todos
  @Registro
  @InicioRegistro
  @HP
  @Regresion
  @TC-MER-3
  Esquema del escenario: Inicio de registro, exitoso
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando intenta iniciar con el registro de su cuenta
      | correo_cuenta   | clave_cuenta   | terminos_cuenta |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia mostrarse en pantalla "Cuéntanos más de ti"

    Ejemplos:
      | correo_cuenta              | clave_cuenta |
      | yesenia.v+{###}@reworth.co | Cali1989*    |


  @Todos
  @Registro
  @InicioRegistro
  @AP
  @Regresion
  @TC-MER-4
  Esquema del escenario: Intento de inicio de registro, con cuenta ya existente
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando intenta iniciar con el registro de su cuenta, con una cuenta ya existente
      | correo_cuenta   | clave_cuenta   | terminos_cuenta   |
      | <correo_cuenta> | <clave_cuenta> | <terminos_cuenta> |
    Entonces no deberia  realizarse la operacion, alertando "Verifica tu correo electrónico y contraseña e intenta de nuevo"

    Ejemplos:
      | correo_cuenta        | clave_cuenta | terminos_cuenta |
      | yesenia.v@reworth.co | Cali1989*    | acuerdo         |


  @Todos
  @Registro
  @InicioRegistro
  @AP
  @Regresion
  @TC-MER-5
  Esquema del escenario: Intento de inicio de registro, sin aceptar términos
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando intenta iniciar con el registro de su cuenta, sin estar de acuerdo con los términos y condiciones de Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta   |
      | <correo_cuenta> | <clave_cuenta> | desacuerdo        |
    Entonces no deberia  realizarse la operacion, indicando "Acepta nuestros términos y condiciones para continuar"

    Ejemplos:
      | correo_cuenta              | clave_cuenta |
      | yesenia.v+{###}@reworth.co | Cali1989*    |


  @Todos
  @Registro
  @InicioRegistro
  @AP
  @Regresion
  @TC-MER-6
  Esquema del escenario: Diligencia inicio de registro, sin completar información obligatoria
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando diligencia el inicio de su registro, sin completar información obligatoria
      | correo_cuenta   | clave_cuenta   |
      | <correo_cuenta> | <clave_cuenta> |
    Entonces no deberia permitir la opcion para continuar con el proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta |
      |                            |              |
      | yesenia.v+{###}@reworth.co |              |
      |                            | Cali1989*    |


  @Todos
  @Registro
  @InicioRegistro
  @HP
  @Regresion
  @TC-MER-7
  Esquema del escenario: Activar/desactivar visor de contraseña, exitoso
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando diligencia el inicio de su registro, activando/desactivando el visor de su clave
      | clave_cuenta   | visor_cuenta   |
      | <clave_cuenta> | <visor_cuenta> |
    Entonces deberia "<observarse>" la clave

    Ejemplos:
      | clave_cuenta | visor_cuenta | observarse |
      | Cali1989*    | activado     | leerse     |
      | Cali1989*    | desactivado  | ocultarse  |


  @Todos
  @Registro
  @InicioRegistro
  @HP
  @Regresion
  @TC-MER-8
  Escenario: Validar que direccione a login
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando se traslada para "Inicia sesión" de su cuenta
    Entonces deberia indicarse el inicio de sesion


  @Todos
  @Registro
  @InicioRegistro
  @HP
  @Regresion
  @TC-MER-9
  Escenario: Ir a contenido de Terminos y condiciones
    Dado que "el comercio" se encuentra iniciando el registro de su cuenta en Reworth
    Cuando se traslada hacia los términos y condiciones para el registro de su cuenta
      | enlace_pagina          | contenido_pagina                  |
      | Términos y condiciones | Términos y Condiciones \| REWORTH |
    Entonces deberia haberse trasladado al apartado de terminos y condiciones de Reworth

