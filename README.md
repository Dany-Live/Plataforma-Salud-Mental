****************************************************************************************************
////////////////////////////////INSTALACIÓN Y EJECUCIÓN DEL PROYECTO////////////////////////////////
****************************************************************************************************

----------CONSIDERACIONES----------

* Antes de instalar y ejecutar el proyecto es necesario contar con los siguientes programas instalados:
	
	1. Maven: https://maven.apache.org/download.cgi
	2. JDK: https://www.oracle.com/java/technologies/downloads/
	3. Visual Studio Code: https://code.visualstudio.com/
	4. TomCat: https://tomcat-apache-org.translate.goog/download-90.cgi?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc
	5. Git: https://git-scm.com/downloads

NOTA: En el caso de este proyecto las versiones utilizadas en el caso de Git y Visual Studio Code no se requiere de una versión especifica o necesaria.
Pero para los demás las versiones son:
	* Maven - versión 3.9.9
	* JDK - versión 24.0.1
	* TomCat - versión 9.0.104

----------------------------------------------------------------------------------------------------
///////////////////////////////////////////////MAVEN////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

----------AGREGAR MAVEN EN WINDOWS----------

1. Primero debe descargarse Maven desde la página oficial colocado en el enlace anterior.
2. El archivo descargado debe ser un archivo zip con la carpeta bin
3. Descomprimir el archivo y colocarlo en alguna ruta o carpeta fácil de acceder: Disco Local, una carpeta, etc.
4. Una vez colocado el archivo en la ruta, buscar en el explorador de windows las variables de entorno del sistema.
5. Dentro de la ventana dar click en "variables de entorno".
6. En la nueva ventana dentro de "variables del sistema" dar click en "Nuevo" y crear la variable M2_HOME y colocar la ruta del programa Maven y guardar.
7. En la ventana "variables de usuario" dar click en la variable "path" y crear una nueva ruta y colocar: %M2_HOME%\bin
8. Después guardar todos los cambios y abrir una terminal cmd y colocar: mvn -v

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////JDK/////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

1. En el caso del JDK es similar a la instalación de Maven, sin embargo primero debemos instalarlo en el equipo.
2. Procedemos a descargar un .exe para instalarlo, por lo general la ruta de instalación es: C:\Program Files\Java\jdk-24, aunque esto puede variar, para ello al momento de instalar el JDK verifica que ruta se le asigna y copiala para no perderla.
3. Realizamos los puntos 5, 6, 7 y 8 de la instalación de Maven, pero con ciertas modificaciones.
4. En el caso del punto 6: En la nueva ventana dentro de "variables del sistema" dar click en "Nuevo" y crear la variable JAVA_HOME y colocar la ruta del programa Maven y guardar.
5. En el caso del punto 7: En la ventana "variables de usuario" dar click en la variable "path" y crear una nueva ruta y colocar: %JAVA_HOME%\bin
6. En el caso del punto 8: Después guardar todos los cambios y abrir una terminal cmd y colocar: java -version (Y despues) javac -version

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------
///////////////////////////////////////////////TOMCAT///////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

1. Solo basta con descargar el archivo zip, descomprimirlo y colocarlo en alguna ruta conocida o fácil de recordar.

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////GIT/////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------

TUTORIAL: https://www.youtube.com/watch?v=jdXKwLNUfmg

*******************************************CONFIGURACIÓN********************************************

git config --global user.name <NombreDeUsuario>
git config --global user.email <email>


****************************************CLONAR REPOSITORIOS*****************************************

git clone <URL>
NOTA: Para trabajar de forma remota se aconseja crear una carpeta donde sera clonado el repositorio


******************************************GUARDAR CAMBIOS*******************************************

git init
git add .
git commit -m "Descripción de los cambios"
git push origin main

----------------------------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////////////////////////
----------------------------------------------------------------------------------------------------
