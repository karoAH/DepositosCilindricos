# Depósitos Cilíndricos (JavaFX + MVC + Maven)

Aplicación de escritorio en **Java 26** y **JavaFX** organizada bajo el patrón **Modelo–Vista–Controlador (MVC)** con estructura estándar de **Maven** y pruebas unitarias con **JUnit 5** para calcular el área total y el volumen de depósitos cilíndricos a partir del radio o diámetro y la altura.

## Datos académicos
* **Institución:** CBTis No. 182 "José Vasconcelos"
* **Docente:** Profr. Ing. Jaime Peregrino Moreno
* **Autoras:** Karen Jacqueline Guillén Ramírez (`karoAH`) y Alexandra Marisol Jacobo Herrera

## Estructura del proyecto
* `pom.xml`: configuración de Maven, dependencias de JavaFX 26 y JUnit 5.
* `src/main/java/org/ejemplos/depositos/modelo/Cilindro.java`: modelo con cálculos geométricos de área y volumen.
* `src/main/java/org/ejemplos/depositos/controlador/DepositosController.java`: controlador de eventos, validaciones y actualización de la interfaz.
* `src/main/java/org/ejemplos/depositos/DepositosApp.java`: clase principal que inicializa la escena JavaFX.
* `src/main/resources/org/ejemplos/depositos/vista/DepositosView.fxml`: diseño de la interfaz gráfica.
* `src/test/java/org/ejemplos/depositos/modelo/CilindroTest.java`: pruebas unitarias con JUnit 5.

## Ejecución con Maven
* **Ejecutar pruebas:** `mvn test`
* **Ejecutar aplicación JavaFX:** `mvn javafx:run`
