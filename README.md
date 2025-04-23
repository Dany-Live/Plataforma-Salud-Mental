
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
