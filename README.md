╔══════════════════════════════════════════════════════════════════════════════════════════════════╗
                                INSTALACIÓN Y EJECUCIÓN DEL PROYECTO
╚══════════════════════════════════════════════════════════════════════════════════════════════════╝

✎__________CONSIDERACIONES__________

Antes de instalar y ejecutar el proyecto es necesario contar con los siguientes programas instalados:
	
	1. Maven: https://maven.apache.org/download.cgi
	2. JDK: https://www.oracle.com/java/technologies/downloads/
	3. Visual Studio Code: https://code.visualstudio.com/
	4. TomCat: https://tomcat-apache-org.translate.goog/download-90.cgi?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc
	5. Git: https://git-scm.com/downloads
	6. MySQL: https://www.mysql.com

NOTA: En el caso de este proyecto las versiones utilizadas de Git y Visual Studio Code no se requiere de una versión especifica o necesaria.

Pero para los demás las versiones son:

	● Maven - versión 3.9.9
	● JDK - versión 24.0.1
	● TomCat - versión 9.0.104
	● MySQL - versión 8.3.0

▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
                                               MAVEN
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

✎__________AGREGAR MAVEN EN WINDOWS__________

1. Primero debe descargarse Maven desde la página oficial colocado en el enlace anterior o copiarlo de la carpeta "PROGRAMAS"

2. El archivo descargado debe ser un archivo zip con la carpeta bin

3. Descomprimir el archivo y colocarlo en alguna ruta o carpeta fácil de acceder: Disco Local, una carpeta, etc

4. Una vez colocado el archivo en la ruta, buscar en el explorador de windows las variables de entorno del sistema

5. Dentro de la ventana dar click en "variables de entorno"

6. En la nueva ventana dentro de "variables del sistema" dar click en "Nuevo" y crear la variable "M2_HOME" y colocar la ruta del programa Maven (C:\Maven, esta ruta puede cambiar dependiendo de donde lo guardes) y guardar

7. En la ventana "variables de usuario" dar click en la variable "path" y crear una nueva ruta y colocar: %M2_HOME%\bin

8. Después guardar todos los cambios y abrir una terminal cmd y colocar: mvn -v



▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
                                                JDK
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

✎__________AGREGAR JDK EN WINDOWS__________

1. En el caso del JDK es similar a la instalación de Maven, sin embargo primero debemos instalarlo en el equipo.

2. Procedemos a descargar un .exe para instalarlo, por lo general la ruta de instalación es: C:\Program Files\Java\jdk-24, aunque esto puede variar, para ello al momento de instalar el JDK verifica que ruta se le asigna y copiala para no perderla.

3. Realizamos los puntos 5, 6, 7 y 8 de la instalación de Maven, pero con ciertas modificaciones.

4. En el caso del punto 6: En la nueva ventana dentro de "variables del sistema" dar click en "Nuevo" y crear la variable JAVA_HOME y colocar la ruta del programa JDK (C:\Program Files\Java\jdk-24, puede cambiar) y guardar.

5. En el caso del punto 7: En la ventana "variables de usuario" dar click en la variable "path" y crear una nueva ruta y colocar: %JAVA_HOME%\bin

6. En el caso del punto 8: Después guardar todos los cambios y abrir una terminal cmd y colocar: java -version (Y despues) javac -version



▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
                                               TOMCAT
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

✎__________AGREGAR TOMCAT EN WINDOWS__________

1. Si aún no lo tienes instalado, descarga la versión adecuada de Apache Tomcat y extráela en una ubicación como C:\Tomcat.

2. Presiona Win + R, escribe sysdm.cpl y presiona Enter y ve a la pestaña Opciones avanzadas y haz clic en "Variables de entorno".

3. En la sección Variables del sistema, haz lo siguiente:

	● Agregar CATALINA_HOME:
	
		• Haz clic en Nuevo.
		• En Nombre de la variable, escribe CATALINA_HOME.
		• En Valor de la variable, ingresa la ruta donde extrajiste Tomcat (por ejemplo, C:\Tomcat).
		• Presiona Aceptar.

4. Para que los comandos de Tomcat funcionen en cualquier ubicación de la terminal:

	● Busca la variable Path en Variables del sistema y selecciona Editar.
	● Haz clic en Nuevo y agrega C:\Tomcat\bin.
	● Guarda los cambios presionando Aceptar en todas las ventanas.

5. Abre una terminal (Win + X → Símbolo del sistema o PowerShell).

	● Escribe echo %CATALINA_HOME% y presiona Enter. Debería mostrar la ruta de Tomcat.
	● Para verificar Path, ejecuta catalina.bat run. Si Tomcat inicia correctamente, la configuración está lista.


▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
                                                GIT
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

TUTORIAL: https://www.youtube.com/watch?v=jdXKwLNUfmg

✎__________CONFIGURACIÓN__________

git config --global user.name <NombreDeUsuario>
git config --global user.email <email>

✎__________CLONAR REPOSITORIOS__________

git clone <URL>

NOTA: Para trabajar de forma remota se aconseja crear una carpeta donde sera clonado el repositorio o especificar donde se debe crear.

✎__________GUARDAR CAMBIOS__________

git init
git add .
git commit -m "Descripción de los cambios"
git push origin main

NOTA: Si otra persona ya realizo cambios en el repositorio remoto primero debes integrar dichos cambios con los comandos:

git checkout main
git pull

Esto para evitar errores al momento de trabajar con el proyecto y guardar los nuevos cambios.


▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
											   MYSQL
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

✎__________INSTALACIÓN__________

1. Dentro de la carpeta de PROGRAMAS buscar el archivo "MYSQL.zip".
2. Descomprimirlo  y seguir los pasos de instalación

NOTA: Asegurarse que MYSQL trabaje con el puerto 3306 y al usuario y contraseña colocar: root y 1234.

▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂
							 EXTENSIONES DE VISUAL STUDIO CODE Y EXTRAS
▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂

● Extension Pack for Java
● Live Server
● Image Preview
● GitLens
● Error lens
● Better Comments
● Community Server Connectors
● GitHub Desktop: https://desktop.github.com/download/

╔══════════════════════════════════════════════════════════════════════════════════════════════════╗

╚══════════════════════════════════════════════════════════════════════════════════════════════════╝