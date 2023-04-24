<h1>COMANDOS CMD</h1>

- Un comando CMD (Command) es una herramienta de línea de comandos que se utiliza en sistemas operativos Microsoft Windows para interactuar con el sistema y realizar tareas administrativas. Con los comandos CMD, los usuarios pueden realizar diversas operaciones, como crear, modificar o eliminar archivos, ejecutar programas, administrar discos, configurar la red y muchas otras tareas.

- Los comandos CMD se ingresan en una ventana de línea de comandos o en el Símbolo del sistema de Windows. Para acceder al Símbolo del sistema, presiona las teclas "Windows + R" en tu teclado y escribe "cmd" en la ventana que se abre. Luego presiona "Enter" y se abrirá la ventana de línea de comandos.

- Hay muchos comandos CMD diferentes, y cada uno tiene su propia sintaxis y opciones.


<h1>EJEMPLOS</h1>

- ##### COMANDO EN CMD PARA OCULTAR QUE SE MUESTRE EL COMANDO A LA HORA DE EJECUTAR UN SCRIPT

<pre><code>
@ECHO OFF
</code></pre>

- ##### SUPONIENDO QUE TENGO UN ARCHIVO.TXT Y QUIERO BUSCAR EN SU CONTENIDO UN TEXTO "LIBRO". CUAL ES EL COMANDO CMD PARA REALIZAR DICHA ACCION.

<pre><code>
FIND /I "LIBRO" ARCHIVO.TXT
</code></pre>

- ##### SUPONIENDO QUE TENGO LOS SIGUIENTES ARCHIVOS: 1.TXT, 2.TXT, 3.TXT Y QUIERO BUSCAR EN TODOS ESOS ARCHIVOS UN TEXTO "LIBRO". CUAL ES EL COMANDO CMD PARA REALIZAR DICHA ACCION.

<pre><code>
FIND /I "LIBRO" "?.TXT"
</code></pre>

- ##### HACER UN SCRIPT QUE ME PERMITE CREAR EL SIGUIENTE ARBOL DE CARPETAS.  DEBE INDICAR TAMBIEN EL COMANDO QUE DIBUJA EL ARBOL

<pre>
C:\ALUMNOUTP
├───A
├───B
└───C
    ├───C1
    ├───C2
    │   └───C2_1
    └───C3
</pre>
	
<pre>
<code>
@ECHO OFF
CD \
MKDIR ALUMNOUTP
CD ALUMNOUTP
MKDIR A B C
CD C
MKDIR C1 C2 C3
CD C3
ECHO. > ARCHIVO.TXT
CD ..
CD C2
MKDIR C2_1
CD /
TREE ALUMNOUTP
</code>
</pre>

- ##### CUAL ES EL COMANDO PARA CREAR UN ARCHIVO EN BLANCO

<pre><code>
ECHO. > ARCHIVO.TXT
</code></pre>

- ##### SUPONIENDO QUE TENGO UN DICCIONARIO INGLES/ESPAÑOL EN DICCIONARIO.TXT Y DESEO BUSCAR LA PALABRA "BOOK". 

<pre><code>
FIND "BOOK" < DICCIONARIO.TXT
</code></pre>

- ##### HACER UN SCRIPT CMD QUE ME LISTE LOS ARCHIVOS DE UN DIRECTORIO Y SUS SUBDIRECTORIOS, USANDO UN COMANDO BUCLE FOR

<pre>
<code>
@ECHO OFF
TITLE PROGRAMA CMD
CLS
FOR /R %%X IN (*.TXT) DO (
  ECHO %%X
)
PAUSE
</code>
</pre>

- ##### HACER UN SCRIPT CMD QUE ME LISTE LOS ARCHIVOS DE UN DIRECTORIO Y SUS SUBDIRECTORIOS Y COPIARA DICHOS ARCHIVOS A OTRO DIRECTORIO, USANDO UN COMANDO BUCLE FOR

<pre>
<code>
@ECHO OFF
TITLE PROGRAMA CMD
CLS
FOR /R %%X IN (*.TXT) DO (
  COPY %%X C:\ARCHIVOSTXT\
)
PAUSE
</code>
</pre>

- ##### HACER UN SCRIPT CMD PARA GENERAR UNA SERIE NATURAL 1..10

<pre>
<code>
@ECHO OFF
TITLE PROGRAMA CMD
CLS
FOR %%I IN (1 2 3 4 5 6 7 8 9 10) DO (
  ECHO %%I
)
PAUSE
</code>
</pre>

- ##### HACER UN SCRIPT CMD PARA GENERAR 1000 ARCHIVOS EN BLANCO 1.TXT, 2.TXT, ... 1000.TXT

<pre>
<code>
@ECHO OFF
TITLE PROGRAMA CMD
REM SETLOCAL ENABLEDELAYEDEXPANSION
CLS
FOR /L %%I IN (1,1,1000) DO (
  ECHO. > %%I.TXT
)
PAUSE
</code>
</pre>

- ##### HACER UN PROGRAMA CMD QUE GENERE UN CONTADOR C = C + 1

<pre>
<code>
@ECHO OFF
TITLE PROGRAMA CMD
CLS
SETLOCAL ENABLEDELAYEDEXPANSION
SET C=0
FOR /L %%I IN (1,1,100) DO (
   SET /A C=!C!+1
   ECHO !C! 
)
PAUSE
</code>
</pre>

- ##### HACER UN SCRIPT CMD PARA MOSTRAR CUANTOS ARCHIVOS .TXT TENGO EN TODO EL SISTEMA.

<pre>
<code>
@ECHO OFF
SETLOCAL ENABLEDELAYEDEXPANSION
TITLE PROGRAMA CMD
CLS
SET C=0
FOR /R %%X IN (*.TXT) DO (
  SET /A C=!C!+1
)
ECHO CANTIDAD DE ARCHIVOS TXT: !C!
PAUSE
</code>
</pre>

<pre><code>
@ECHO OFF
TITLE PROGRAMA CMD
REM RECORRER UN ARCHIVO CON DATOS
FOR /F "DELIMS=" %%X IN (DATOS.TXT) DO (
   ECHO %%X
   TIMEOUT /T 1 > NUL
)
PAUSE


DATOS.TXT

A1;LUIS;23;1.72
A2;MIGUEL;24;1.67
A3;CARLOS;21;1.61
A4;CARMEN;22;1.60
A5;CARLOS;25;1.62
</code></pre>

- ##### HACER UN PROGRAMA EN CMD QUE BUSQUE TODOS LOS ARCHIVOS APUNTES.TXT Y LUEGO QUE CREE UN ARCHIVO CON LAS RUTAS DE TODOS LOS ARCHIVOS QUE ENCONTRO.

<code><pre>
@ECHO OFF
SETLOCAL ENABLEDELAYEDEXPANSION
TITLE PROGRAMA CMD
CLS
SET C=0
FOR /R %%X IN (APUNTES.TXT) DO (
  ECHO %%X >> RESUMEN.TXT
)
PAUSE
</code></pre>

- ##### HACER UN MENU CON LAS SIGUIENTES OPCIONES:

1. MOSTRAR TODOS LOS DATOS
2. MOSTRAR LA CANTIDAD ALUMNOS
3. BUSCAR UN ALUMNO POR SU CODIGO
4. BUSCAR UN NOMBRE QUE INICIE CON LA LETRA "C"
5. CREAR UN ARCHIVO APARTE DONDE CONTENGA TODOS LOS CARLOS QUE ENCUENTRE
6. SALIR

<code><pre>
DATOS.TXT

A1;LUIS;23;1.72
A2;MIGUEL;24;1.67
A3;CARLOS;21;1.61
A4;CARMEN;22;1.60
A5;CARLOS;25;1.62
</code></pre>