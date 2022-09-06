#language: es


Característica: Registro de informacion del negocio en Reworth
  Yo como propietario de un comercio,
  Necesito registrar la informacion de mi negocio
  Para completar el proceso de creacion de mi cuenta en Reworth


  @Todos
  @Registro
  @RegistroDatosNegocio
  @AP
  @Regresion
  @TC-MER-15
    @Este
  Esquema del escenario: Diligencia datos del negocio, sin completar informacion obligatoria
    Dado que "el comercio" se encuentra ingresando la informacion de su negocio, como parte de la creacion de su cuenta en Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta | nombre_propietario   | celular_propietario   |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         | <nombre_propietario> | <celular_propietario> |
    Cuando diligencia la informacion de su negocio, sin completar informacion obligatoria
      | nombre_negocio   | categoria_negocio   | tipo_negocio   | web_negocio   | direccion_negocio   |
      | <nombre_negocio> | <categoria_negocio> | <tipo_negocio> | <web_negocio> | <direccion_negocio> |
    Entonces deberia indicarse "deshabilitado" la opcion "Continuar", para dar continuidad al proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta | nombre_propietario | celular_propietario | nombre_negocio | categoria_negocio | tipo_negocio  | web_negocio            | direccion_negocio                                |
      | yesenia.v+{###}@reworth.co | Cali1989*    | Yesenia Villamil   | 3128816682          | QA Automation  | Software          | Ecommerce     | www.qautomation.com.co | Cra. 100 #5-169, Cali, Valle del Cauca, Colombia |
      #| yesenia.v+{###}@reworth.co | Cali1989*    | Yesenia Villamil   | 3128816682          | QA Automation  | Software          | Tienda | www.qautomation.com.co | Cra. 100 #5-169, Cali, Valle del Cauca, Colombia |

  @Todos
  @Registro
  @RegistroDatosNegocio
  @AP
  @Regresion
  @TC-MER-16
  Esquema del escenario: Diligencia datos del negocio, sin cumplir con los formatos
    Dado que "el comercio" se encuentra ingresando la informacion de su negocio, como parte de la creacion de su cuenta en Reworth
      | correo_cuenta   | clave_cuenta   | terminos_cuenta | nombre_propietario   | celular_propietario   |
      | <correo_cuenta> | <clave_cuenta> | acuerdo         | <nombre_propietario> | <celular_propietario> |
    Cuando diligencia la informacion de su negocio, sin cumplir con los formatos
      | nombre_negocio   | categoria_negocio   | tipo_negocio   | web_negocio   | direccion_negocio   |
      | <nombre_negocio> | <categoria_negocio> | <tipo_negocio> | <web_negocio> | <direccion_negocio> |
    Entonces no deberia permitir la opcion para continuar con el proceso

    Ejemplos:
      | correo_cuenta              | clave_cuenta | nombre_propietario | celular_propietario | nombre_negocio | categoria_negocio | tipo_negocio  | web_negocio            | direccion_negocio                                |
      | yesenia.v+{###}@reworth.co | Cali1989*    | Yesenia Villamil   | 3128816682          | QA Automation  | Software          | Ecommerce     | wwwwww.qautomationcomco | Cra. 100 #5-169, Cali, Valle del Cauca, Colombia |