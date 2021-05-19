# prodigio

Este proyecto se encuentra desarrollado en java 8 bajo el framework springBoot. Para ejecución de proyecto previamente debe estar instalada la base de datos MySql en la ruta /prueba/src/main/resources encontrara el archivo application.properties al cual para que se ejecute el proyecto se le deben cambiar los valores a las propiedades

spring.datasource.username = root spring.datasource.password = qpalwosk10

usando respectivamente los valores configurados en el username y password de la base de datos del ambiente donde se va a ejecutar el proyecto.

en caso de que el servidor de base de datos de Mysql instalado en el ambiente donde se ejecutara el proyecto esté en un puerto diferente al 3306 se debe tener en cuenta que la el puerto debe ser cambiado de igual forma en la propiedad

spring.datasource.url = jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

De igual forma se debe crear en MySql la base de datos farmatodo CREATE DATABASE demo;

El proyecto corre por el puerto 8080

url : http://localhost:8080/swagger-ui.html
