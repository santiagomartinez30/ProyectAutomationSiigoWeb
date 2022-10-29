# Descripción del proyecto 
Sistema de automatización de prueba (SAP) el cual verifica la funcionalidad de **compras** en la plataforma ecommerce de falabella https://www.falabella.com.co/falabella-co

# Pre-requisitos ⚙️
Tener instalado :
- [Maven](https://maven.apache.org/download.cgi) como gestor de dependencias 
- [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) para una correcta ejecución del proyecto

# Ejecutar escenario de prueba 🚀
El SAP encuentra configurado para ejecutarse en cualquier S.O (Windows, Linux, Mac os con procesador intel) con el navegador de su preferencia, por defecto se ejecutarán las pruebas en el navegador **chrome**; sin embargo, podrá utilizar el navegador de su preferencia lanzando alguno de los siguientes comandos desde este archivo readme o desde una terminal de comandos:

-  **Google chrome** `mvn clean verify -Dtest=*Runner`
-  **Mozilla firefox** `mvn clean verify -Dtest=*Runner -D"webdriver.driver"=firefox`

Para ejecutar el escenario de prueba bajo el modo headless simplemente en el archivo **serenity.conf** ubicado en la ruta _src/test/resources/serenity.conf, realice los siguientes ajuste:

Para navegador **Google chrome** cambié la propiedad true

    headless.mode = true

para navegador **Mozilla firefox** descomente el argumento
        
    args = ["-headless"]
        

# Visualizar reportes 📋
Para acceder a los reportes puede realizarlo dirigiéndose al apartado de SERENITY REPORTS el cual podra visualizar en consola al terminar la ejecución. Serenity proporciona dos tipos de reporte, uno completo y uno resumido

- **Reporte completo**: target/site/serenity/index.html
- **Reporte resumido:** target/site/serenity/serenity-summary.html




# Construido con 🛠️

* [Git](https://git-scm.com/downloads) para realizar el control de las versiones
* [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) como IDE de desarrollo
* [Java 11](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) version de Java para ejecutar el SAP
* [Serenity BDD](https://serenity-bdd.github.io/docs/guide/user_guide_intro) framework utilizado para la construcción del SAP
* [Screenplay](https://serenity-bdd.github.io/docs/screenplay/screenplay_fundamentals) patron de diseño utilizado en la construcción de la SAP
* [Cucumber](https://cucumber.io/)  herramienta encargada de transformar escenarios a lenguaje máquina
* [Gherkin](https://cucumber.io/docs/gherkin/) lenguaje en el cual están escritos los escenarios de prueba
* [Maven](https://maven.apache.org/download.cgi) como gestor de dependencias