#language: es


Característica: Registro de datos personales del propietario en Reworth
  Yo como propietario de un comercio,
  Necesito registrar mi informacion personal y de contacto
  Para completar el proceso de creacion de mi cuenta en Reworth


  @Todos
  @Registro
  @RegistroDatosPersonales
  @AP
  @Regresion
  @TC-MER-12
  Esquema del escenario: Diligencia datos personales, sin completar información obligatoria
    Dado que "el comercio" se encuentra ingresando sus datos personales, como parte de la creacion de su cuenta en Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         |
    Cuando diligencia sus datos personales, sin completar información obligatoria
      | nombre_propietario   | celular_propietario   |
      | <nombre_propietario> | <celular_propietario> |
    Entonces deberia indicarse "deshabilitado" la opcion "Continuar", para dar continuidad al proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta |nombre_propietario | celular_propietario |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia           |                     |
      | yesenia.v+{###}@reworth.co | Cali1989*    |                   | 3125566             |
      | yesenia.v+{###}@reworth.co | Cali1989*    |                   |                     |


  @Todos
  @Registro
  @RegistroDatosPersonales
  @AP
  @Regresion
  @TC-MER-13
  Esquema del escenario: Diligencia datos personales, sin cumplir con los formatos
    Dado que "el comercio" se encuentra ingresando sus datos personales como parte de la creacion de su cuenta en Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         |
    Cuando diligencia sus datos personales, sin cumplir con el formato
      | nombre_propietario   | celular_propietario   |
      | <nombre_propietario> | <celular_propietario> |
    Entonces deberia indicarse "deshabilitado" la opcion "Continuar", para dar continuidad al proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta | nombre_propietario                        | celular_propietario  |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia                                   | 31288166825666565656 |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia                                   | 3128                 |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia                                   | -312881668           |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia                                   | 31288166.8           |
      | yesenia.v+{###}@reworth.co | Cali1989*    | /$#%&/#                                   | 3128816682           |
      | yesenia.v+{###}@reworth.co | Cali1989*    | Yesenia Lorena Villamil Cubillos Trujillo | 3128816682           |


  @Todos
  @Registro
  @RegistroDatosPersonales
  @HP
  @Regresion
  @TC-MER-14
  @Este
  Esquema del escenario: Ingreso de datos personales, Exitoso
    Dado que "el comercio" se encuentra ingresando sus datos personales como parte de la creacion de su cuenta en Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         |
    Cuando intenta registrar sus datos personales
      | nombre_propietario   | celular_propietario   |
      | <nombre_propietario> | <celular_propietario> |
    Entonces deberia mostrarse en pantalla "¿Cómo se llama tu negocio?"

    Ejemplos:
      | correo_cuenta              | clave_cuenta | nombre_propietario | celular_propietario |
      | yesenia.v+{###}@reworth.co | Cali1989*    | yesenia            | 3128816682          |