# 🦾 Automatización de pruebas de Reworth 🦾

Este proyecto Gradle se diseño para la ejecución de las pruebas automatizadas de los flujos relacionados con el portal Merchant de Reworth:

## ⚙️ Ambientes ⚙️

*  Desarrollo

    + https://dev.reworth.app/login
	
*  Pruebas

    + https://sandbox.reworth.app/login

Cobertura de flujos:
-registro (Inicio y Onbourding)


## 📋 Pre-requisitos 📋

1. Java 8
2. Git
3. IntelliJ IDEA
4. Gradle, se adminte **únicamente** la siguiente version: 
	+ gradle-4.9-all.zip
5. Navegador Instalado (tipo de navegador donde se ejecutaran las pruebas)

## 🛠️ Paquetes 🛠️

* **features**: Los escenarios y sus casos de prueba en lenguaje Gherkin (Dado-Cuando-Entonces)con narrativa declarativa en términos de negocio.
* **runners**: Clases que permiten ejecutar los features y su equivalente tecnico StepDefinitions.
* **setups**: Clases de preparacion y configuracion que se activan al inicio, durante y finalizando un caso de prueba
* **stepdefinitions**: Clases que traducen tecnicamente los escenarios de los features, orquestando y delegando los pasos necesarios que satisfacen los enunciados Gherkin, a traves de tareas (tasks) o preguntas (questions).
* **tasks**: Clases que describen las actividades que el actor realizara sobre el sistema al interpretar un caso de prueba.
* **questions**: Clases que evaluaran el comportamiento debido o esperado posterior a las actividades de un actor en un caso de prueba,a traves de validaciones y/o verificaciones
* **userinterfaces**: Clases que representan la vista de usuario(pantalla/formulario),que contienen los elementos con los que interactuara directa o indirectamente el actor durante el caso de prueba.
 * **interactions**: Clases que contienen las actividades de bajo nivel que requiere el actor para interactuar con el sistema.
* **models**: Contiene la representación de los objetos de negocio identificacdos y sus caracteristicas.
* **utils**: Funciones transversales y utilitarias al proceso o logica de negocio que se despliega en la ejecucion/implementacion de un caso de prueba. 
* **constans**: Contiene un grupo de constantes agrupadas por clase que representan un comportamiento.


## 📦 Instalación 📦

* **Clonar Proyecto**: Para la instalacción se debe clonar el repositorio _**templates-automatizacion**_ ubicado en el espacio de trabajo _**GITHUB**_ a través del siguiente comando: 

```
git clone git@github.com:reworthrewards/test-aut-web-Merchant.git
```

* **Ejecución Local**: 

	
	+ **Comando de Ejecución:** Para ejecutar las pruebas localmente se pueden ejecutar de diferentes formas, a continuación se muestran algunas de las formas de ejecución: 

		- **Ejecución de todos los test**

		```
		gradle clean test 
		```

		- **Ejecución de un test particular**

		```
		gradle clean test --tests "co.reworth.merchant.testautmerchant.test.automation.runners.features.MerchantRunner"
		```

		- **Ejecución con tags**

		```
		gradle clean test -Dcucumber.options="--tags @Regresion" 
		```

**NOTA**: 

##  ✒️ Autores ✒️
* **Equipo de pruebas** - **Reworth**